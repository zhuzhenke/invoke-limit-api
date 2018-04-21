package com.method.invoke;

import com.amazon.commom.MarketPlace;
import com.method.invoke.base.BaseClient;
import com.method.invoke.base.BaseRequest;
import com.method.invoke.base.BaseResponse;
import com.method.invoke.callback.InvokeCallBack;

import java.io.Serializable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * 请求响应封装类
 *
 * @author zhuzhenke
 * @date 2018/03/20
 */
public class RequestCommand implements Serializable, Delayed {

    /**
     * 调用方函数
     */
    private BaseClient baseClient;

    /**
     * 站点
     */
    private MarketPlace marketPlace;

    /**
     * 结果
     */
    private BaseRequest baseRequest;

    /**
     * 结果
     */
    private volatile BaseResponse baseResponse;

    /**
     * 是否取消
     */
    private volatile boolean cancel;

    /**
     * 异常信息
     */
    private Exception exception;

    /**
     * 是否需要结果
     */
    private boolean noReply;

    /**
     * 超时控制
     */
    private CountDownLatch latch;

    /**
     * 用户自定义附件信息
     */
    private DefaultAttachment defaultAttachment;

    /**
     * 回调
     */
    private InvokeCallBack invokeCallBack;

    /**
     * 重试次数
     */
    private int tryTime = 0;

    /**
     * 下次执行计划
     */
    private NextInvokeProcessor nextInvokeProcessor;

    /**
     * 下次执行时间
     */
    private long nextInvokeTime;

    /**
     * 继续执行处理器
     */
    private ExceptionReInvokeProcessor exceptionReInvokeProcessor;
    /**
     * sellerId
     */
    private String sellerId;


    public RequestCommand() {
        this.latch = new CountDownLatch(1);
    }

    public void addTryTime() {
        tryTime++;
    }

    public int getTryTime() {
        return tryTime;
    }

    public DefaultAttachment getDefaultAttachment() {
        return defaultAttachment;
    }

    public void setDefaultAttachment(DefaultAttachment defaultAttachment) {
        this.defaultAttachment = defaultAttachment;
    }

    public BaseClient getBaseClient() {
        return baseClient;
    }

    public void setBaseClient(BaseClient baseClient) {
        this.baseClient = baseClient;
    }

    public BaseRequest getBaseRequest() {
        return baseRequest;
    }

    public void setBaseRequest(BaseRequest baseRequest) {
        if (baseRequest == null) {
            throw new RuntimeException("baseRequest can not be null");
        }
        this.baseRequest = baseRequest;
    }

    public BaseResponse getBaseResponse() {
        return baseResponse;
    }

    public void setBaseResponse(BaseResponse baseResponse) {
        this.baseResponse = baseResponse;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public InvokeCallBack getInvokeCallBack() {
        return invokeCallBack;
    }

    public void setInvokeCallBack(InvokeCallBack invokeCallBack) {
        this.invokeCallBack = invokeCallBack;
    }

    public CountDownLatch getLatch() {
        return latch;
    }

    public void setLatch(CountDownLatch latch) {
        this.latch = latch;
    }

    public boolean isNoReply() {
        return noReply;
    }

    public void setNoReply(boolean noReply) {
        this.noReply = noReply;
    }

    public MarketPlace getMarketPlace() {
        return marketPlace;
    }

    public void setMarketPlace(MarketPlace marketPlace) {
        if (marketPlace == null){
            throw new RuntimeException("marketPlace can not be null");
        }
        this.marketPlace = marketPlace;
    }

    public void countDown() {
        if (latch != null) {
            latch.countDown();
        }
    }

    public NextInvokeProcessor getNextInvokeProcessor() {
        return nextInvokeProcessor;
    }

    public void setNextInvokeProcessor(NextInvokeProcessor nextInvokeProcessor) {
        if (nextInvokeProcessor == null) {
            throw new RuntimeException("nextInvokeProcessor can not be null");
        }
        if (this.sellerId == null || "".equals(this.sellerId)) {
            throw new RuntimeException("sellerId can not be null");
        }
        //baseRequest should be setted before invoke setNextInvokeProcessor(nextInvokeProcessor)
        if (baseRequest == null) {
            throw new RuntimeException("baseRequest can not be null,baseRequest should be setted before invoke setNextInvokeProcessor(nextInvokeProcessor)");
        }
        this.nextInvokeProcessor = nextInvokeProcessor;
        nextInvokeTime = nextInvokeProcessor.getNextInvokeTimeMillis(baseRequest, sellerId);
    }


    public ExceptionReInvokeProcessor getExceptionReInvokeProcessor() {
        return exceptionReInvokeProcessor;
    }

    public void setExceptionReInvokeProcessor(ExceptionReInvokeProcessor exceptionReInvokeProcessor) {
        this.exceptionReInvokeProcessor = exceptionReInvokeProcessor;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * 获得下次执行时间间隔
     * 执行时间-当前时间
     *
     * @param unit TimeUnit
     * @return 返回时间差
     */
    @Override
    public long getDelay(TimeUnit unit) {
        if (this.nextInvokeProcessor != null) {
            return unit.convert(this.nextInvokeTime - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }
        return 0;
    }

    /**
     * 用于延迟队列内部比较排序   当前时间的延迟时间 - 比较对象的延迟时间
     *
     * @param o 比较对象
     * @return 排序先后
     */
    @Override
    public int compareTo(Delayed o) {
        return (int) (this.getDelay(TimeUnit.MILLISECONDS) - o.getDelay(TimeUnit.MILLISECONDS));
    }
}
