package com.method.invoke.base;


import com.method.invoke.*;
import com.method.invoke.callback.InvokeCallBack;

/**
 * 基本请求执行客户端
 *
 * @author zhuzhenke
 * @date 2018/03/20
 */
public abstract class BaseClient {
    //重试时间处理
    NextInvokeProcessor nextInvokeProcessor;
    //异常重试处理器
    ExceptionReInvokeProcessor exceptionReInvokeProcessor;

    public void setExceptionReInvokeProcessor(ExceptionReInvokeProcessor exceptionReInvokeProcessor) {
        this.exceptionReInvokeProcessor = exceptionReInvokeProcessor;
    }

    public void setNextInvokeProcessor(NextInvokeProcessor nextInvokeProcessor) {
        this.nextInvokeProcessor = nextInvokeProcessor;
    }

    /**
     * 使用全局重试处理器
     */
    public BaseResponse execute(BaseRequest baseRequest) throws Exception {
        if (baseRequest.isSubmit()) {
            RequestCommand requestCommand = new RequestCommand();
            requestCommand.setNextInvokeProcessor(nextInvokeProcessor);
            requestCommand.setExceptionReInvokeProcessor(exceptionReInvokeProcessor);
            requestCommand.setBaseRequest(baseRequest);
            requestCommand.setBaseClient(this);

            SystemInvoke systemInvoke = new DefaultSystemInvoke();
            baseRequest.closeSubmit();
            return systemInvoke.execute(requestCommand);
        } else {
            return executeInternal(baseRequest);
        }
    }

    /**
     * 使用全局重试处理器
     */
    public void execute(BaseRequest baseRequest, InvokeCallBack invokeCallBack, DefaultAttachment defaultAttachment) throws Exception {
        if (baseRequest.isSubmit()) {
            RequestCommand requestCommand = new RequestCommand();
            requestCommand.setNextInvokeProcessor(nextInvokeProcessor);
            requestCommand.setExceptionReInvokeProcessor(exceptionReInvokeProcessor);
            requestCommand.setBaseRequest(baseRequest);
            requestCommand.setBaseClient(this);

            //设置回调
            requestCommand.setInvokeCallBack(invokeCallBack);
            requestCommand.setDefaultAttachment(defaultAttachment);

            SystemInvoke systemInvoke = new DefaultSystemInvoke();
            baseRequest.closeSubmit();
            systemInvoke.execute(requestCommand);
        } else {
            executeInternal(baseRequest);
        }
    }

    /**
     * 使用当前重试处理器
     */
    public BaseResponse execute(BaseRequest baseRequest, NextInvokeProcessor nextInvokeProcessor,
                                ExceptionReInvokeProcessor exceptionReInvokeProcessor) throws Exception {
        if (baseRequest.isSubmit()) {
            RequestCommand requestCommand = new RequestCommand();
            requestCommand.setNextInvokeProcessor(nextInvokeProcessor);
            requestCommand.setExceptionReInvokeProcessor(exceptionReInvokeProcessor);
            requestCommand.setBaseRequest(baseRequest);
            requestCommand.setBaseClient(this);

            SystemInvoke systemInvoke = new DefaultSystemInvoke();
            baseRequest.closeSubmit();
            return systemInvoke.execute(requestCommand);
        } else {
            return executeInternal(baseRequest);
        }
    }

    protected abstract BaseResponse executeInternal(BaseRequest baseRequest) throws Exception;

}
