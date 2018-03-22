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
    /**
     * 全局重试时间处理
     */
    private NextInvokeProcessor globalNextInvokeProcessor;
    /**
     * 全局异常重试处理器
     */
    private ExceptionReInvokeProcessor globalExceptionReInvokeProcessor;

    public void setGlobalExceptionReInvokeProcessor(ExceptionReInvokeProcessor globalExceptionReInvokeProcessor) {
        this.globalExceptionReInvokeProcessor = globalExceptionReInvokeProcessor;
    }

    public void setGlobalNextInvokeProcessor(NextInvokeProcessor globalNextInvokeProcessor) {
        this.globalNextInvokeProcessor = globalNextInvokeProcessor;
    }

    /**
     * 同步方法且使用全局重试处理器
     */
    public BaseResponse execute(BaseRequest baseRequest) throws Exception {
        RequestCommand requestCommand = new RequestCommand();
        requestCommand.setNextInvokeProcessor(globalNextInvokeProcessor);
        requestCommand.setExceptionReInvokeProcessor(globalExceptionReInvokeProcessor);
        requestCommand.setBaseRequest(baseRequest);
        requestCommand.setBaseClient(this);

        SystemInvoke systemInvoke = new DefaultSystemInvoke();
        return systemInvoke.execute(requestCommand);
    }

    /**
     * 异步方法且使用全局重试处理器
     */
    public void execute(BaseRequest baseRequest, InvokeCallBack invokeCallBack, DefaultAttachment defaultAttachment) throws Exception {
        RequestCommand requestCommand = new RequestCommand();
        requestCommand.setNextInvokeProcessor(globalNextInvokeProcessor);
        requestCommand.setExceptionReInvokeProcessor(globalExceptionReInvokeProcessor);
        requestCommand.setBaseRequest(baseRequest);
        requestCommand.setBaseClient(this);

        //设置回调
        requestCommand.setInvokeCallBack(invokeCallBack);
        requestCommand.setDefaultAttachment(defaultAttachment);

        SystemInvoke systemInvoke = new DefaultSystemInvoke();
        systemInvoke.execute(requestCommand);
    }

    /**
     * 同步方法且使用当前重试处理器
     */
    public BaseResponse execute(BaseRequest baseRequest, NextInvokeProcessor nextInvokeProcessor,
                                ExceptionReInvokeProcessor exceptionReInvokeProcessor) throws Exception {
        RequestCommand requestCommand = new RequestCommand();
        if (nextInvokeProcessor != null) {
            requestCommand.setNextInvokeProcessor(nextInvokeProcessor);
        } else {
            requestCommand.setNextInvokeProcessor(globalNextInvokeProcessor);
        }
        if (nextInvokeProcessor != null) {
            requestCommand.setExceptionReInvokeProcessor(exceptionReInvokeProcessor);
        } else {
            requestCommand.setExceptionReInvokeProcessor(globalExceptionReInvokeProcessor);
        }
        requestCommand.setBaseRequest(baseRequest);
        requestCommand.setBaseClient(this);

        SystemInvoke systemInvoke = new DefaultSystemInvoke();
        return systemInvoke.execute(requestCommand);
    }

    /**
     * 异步方法且使用全局重试处理器
     */
    public void execute(BaseRequest baseRequest, InvokeCallBack invokeCallBack,
                        DefaultAttachment defaultAttachment, NextInvokeProcessor nextInvokeProcessor,
                        ExceptionReInvokeProcessor exceptionReInvokeProcessor) throws Exception {
        RequestCommand requestCommand = new RequestCommand();
        if (nextInvokeProcessor != null) {
            requestCommand.setNextInvokeProcessor(nextInvokeProcessor);
        } else {
            requestCommand.setNextInvokeProcessor(globalNextInvokeProcessor);
        }
        if (nextInvokeProcessor != null) {
            requestCommand.setExceptionReInvokeProcessor(exceptionReInvokeProcessor);
        } else {
            requestCommand.setExceptionReInvokeProcessor(globalExceptionReInvokeProcessor);
        }
        requestCommand.setBaseRequest(baseRequest);
        requestCommand.setBaseClient(this);

        //设置回调
        requestCommand.setInvokeCallBack(invokeCallBack);
        requestCommand.setDefaultAttachment(defaultAttachment);

        SystemInvoke systemInvoke = new DefaultSystemInvoke();
        systemInvoke.execute(requestCommand);
    }

    public abstract BaseResponse executeInternal(BaseRequest baseRequest) throws Exception;

}
