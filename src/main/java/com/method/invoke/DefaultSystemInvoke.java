package com.method.invoke;


import com.method.invoke.base.BaseRequest;
import com.method.invoke.base.BaseResponse;
import com.method.invoke.exec.InvokeThreadFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.*;

/**
 * 默认的系统后台线程工作池
 *
 * @author zhuzhenke
 * @date 2018/03/20
 */
public class DefaultSystemInvoke implements SystemInvoke {
    private static final Logger logger = LoggerFactory.getLogger(DefaultSystemInvoke.class);
    private DelayQueue<RequestCommand> workQueue = new DelayQueue<RequestCommand>();
    //默认最大等待时间
    private static final int MAX_AWAIT_MILLI_SECONDS = 30 * 60 * 1000;

    private volatile boolean initExecutorServiceFlag = false;
    private ExecutorService executorService = null;

    public DefaultSystemInvoke() {

    }

    private void init() {
        synchronized (this) {
            if (!initExecutorServiceFlag) {
                executorService = Executors.newCachedThreadPool();
                executorService = new ThreadPoolExecutor(5, 50,
                        600L, TimeUnit.SECONDS,
                        new LinkedBlockingQueue<Runnable>(),
                        new InvokeThreadFactory(),
                        new ThreadPoolExecutor.AbortPolicy());
                initExecutorServiceFlag = true;
            }
        }
    }


    /**
     * 同步调用
     */
    @Override
    public BaseResponse execute(RequestCommand requestCommand) throws Exception {
        checkBaseRequest(requestCommand);
        if (requestCommand.getInvokeCallBack() != null) {
            requestCommand.setNoReply(true);
        }
        if (!initExecutorServiceFlag) {
            init();
        }

        requestCommand.setLatch(new CountDownLatch(1));
        putWorkerQueue(requestCommand);
        if (!requestCommand.isNoReply()) {
            requestCommand.getLatch().await(MAX_AWAIT_MILLI_SECONDS, TimeUnit.MILLISECONDS);
            checkException(requestCommand);
        }
        return requestCommand.getBaseResponse();
    }

    private RequestCommand createBaseQuest(BaseRequest baseRequest) {
        RequestCommand requestCommand = new RequestCommand();

        return requestCommand;
    }

    private void checkException(final RequestCommand requestCommand) throws Exception {
        if (requestCommand.getException() != null) {
            throw requestCommand.getException();
        }
    }

    /**
     * 线程池执行任务
     */
    private void doWork() {
        RequestCommand requestCommand = null;
        try {
            requestCommand = workQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return;
        }
        if (requestCommand == null || requestCommand.isCancel()) {
            return;
        }
        BaseResponse baseResponse = null;
        boolean finish = false;
        try {
            baseResponse = requestCommand.getBaseClient().execute(requestCommand.getBaseRequest(), requestCommand.getNextInvokeProcessor(), requestCommand.getExceptionReInvokeProcessor());
            finish = true;
        } catch (Exception e) {
            logger.error("businessClient({}).execute({}) error", requestCommand.getBaseClient().getClass(), requestCommand.getClass(), e);
            boolean reInvoke = requestCommand.getExceptionReInvokeProcessor().needReInvoke(e);
            if (reInvoke) {
                requestCommand.addTryTime();
                //重新设置下次执行时间
                requestCommand.setNextInvokeProcessor(requestCommand.getNextInvokeProcessor());
                putWorkerQueue(requestCommand);
            } else {
                finish = true;
                requestCommand.setException(e);
            }
        }
        if (finish) {
            if (requestCommand.getInvokeCallBack() != null) {
                try {
                    requestCommand.getInvokeCallBack().invokeResult(requestCommand.getBaseResponse(), requestCommand.getDefaultAttachment(), requestCommand.getException());
                } catch (Exception e) {
                    logger.error("InvokeCallBack({}).invokeResult({}) error", requestCommand.getInvokeCallBack().getClass(), requestCommand.getClass(), e);
                }
            } else {
                requestCommand.setBaseResponse(baseResponse);
                requestCommand.countDown();
            }
        }
    }

    /**
     * 系统级校验请求参数
     */
    private void checkBaseRequest(RequestCommand requestCommand) throws Exception {
        if (requestCommand == null) {
            throw new Exception("requestCommand can not be null");
        }
        if (requestCommand.getBaseClient() == null) {
            throw new Exception("businessClient can not be null");
        }
        if (requestCommand.getBaseRequest() == null) {
            throw new Exception("businessRequest can not be null");
        }
        if (requestCommand.getNextInvokeProcessor() == null) {
            throw new Exception("reTryInvoke can not be null");
        }
        if (requestCommand.getExceptionReInvokeProcessor() == null) {
            throw new Exception("reInvokeException can not be null");
        }
        //用户参数校验
        requestCommand.getBaseRequest().checkParams();
    }

    /**
     * 把任务放入线程池
     */
    private boolean putWorkerQueue(RequestCommand requestCommand) {
        boolean flag = workQueue.offer(requestCommand);
        if (flag) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    doWork();
                }
            });
        }
        return true;
    }
}
