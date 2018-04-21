package com.method.invoke.base;

import com.amazon.commom.MarketPlace;
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
    public BaseResponse execute(BaseRequest baseRequest, MarketPlace marketPlace, String sellerId) throws Exception {
        RequestCommand requestCommand = new RequestCommand();
        requestCommand.setMarketPlace(marketPlace);
        requestCommand.setSellerId(sellerId);
        requestCommand.setBaseRequest(baseRequest);
        requestCommand.setNextInvokeProcessor(globalNextInvokeProcessor);
        requestCommand.setExceptionReInvokeProcessor(globalExceptionReInvokeProcessor);
        requestCommand.setBaseClient(this);

        SystemInvoke systemInvoke = DefaultSystemInvoke.getDefaultSystemInvoke();
        return systemInvoke.execute(requestCommand);
    }

    /**
     * 异步方法且使用全局重试处理器
     */
    public void execute(BaseRequest baseRequest, MarketPlace marketPlace, String sellerId, InvokeCallBack invokeCallBack, DefaultAttachment defaultAttachment) throws Exception {
        RequestCommand requestCommand = new RequestCommand();
        requestCommand.setMarketPlace(marketPlace);
        requestCommand.setSellerId(sellerId);
        requestCommand.setBaseRequest(baseRequest);
        requestCommand.setNextInvokeProcessor(globalNextInvokeProcessor);
        requestCommand.setExceptionReInvokeProcessor(globalExceptionReInvokeProcessor);
        requestCommand.setBaseClient(this);

        //设置回调
        requestCommand.setInvokeCallBack(invokeCallBack);
        requestCommand.setDefaultAttachment(defaultAttachment);

        SystemInvoke systemInvoke = DefaultSystemInvoke.getDefaultSystemInvoke();
        systemInvoke.execute(requestCommand);
    }

    /**
     * 同步方法且使用当前重试处理器
     */
    public BaseResponse execute(BaseRequest baseRequest, MarketPlace marketPlace, String sellerId, NextInvokeProcessor nextInvokeProcessor,
                                ExceptionReInvokeProcessor exceptionReInvokeProcessor) throws Exception {
        RequestCommand requestCommand = new RequestCommand();
        requestCommand.setMarketPlace(marketPlace);
        requestCommand.setSellerId(sellerId);
        requestCommand.setBaseRequest(baseRequest);
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
        requestCommand.setBaseClient(this);

        SystemInvoke systemInvoke = DefaultSystemInvoke.getDefaultSystemInvoke();
        return systemInvoke.execute(requestCommand);
    }

    /**
     * 异步方法且使用全局重试处理器
     */
    public void execute(BaseRequest baseRequest, MarketPlace marketPlace, String sellerId, InvokeCallBack invokeCallBack,
                        DefaultAttachment defaultAttachment, NextInvokeProcessor nextInvokeProcessor,
                        ExceptionReInvokeProcessor exceptionReInvokeProcessor) throws Exception {
        RequestCommand requestCommand = new RequestCommand();
        requestCommand.setMarketPlace(marketPlace);
        requestCommand.setSellerId(sellerId);
        requestCommand.setBaseRequest(baseRequest);
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
        requestCommand.setBaseClient(this);

        //设置回调
        requestCommand.setInvokeCallBack(invokeCallBack);
        requestCommand.setDefaultAttachment(defaultAttachment);

        SystemInvoke systemInvoke = DefaultSystemInvoke.getDefaultSystemInvoke();
        systemInvoke.execute(requestCommand);
    }

    /**
     * 用户内部实现
     *
     * @param baseRequest 请求类
     * @param marketPlace 站点
     * @return BaseResponse响应
     * @throws Exception 异常
     */
    public abstract BaseResponse executeInternal(BaseRequest baseRequest, MarketPlace marketPlace) throws Exception;

}
