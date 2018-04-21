package com.amazon.report;

import com.amazon.invoke.AmazonBaseResponse;

import java.util.List;

/**
 * @author zhuzhenke
 * @date 2018/03/23
 */
public class DisposableRequestReportResponse implements AmazonBaseResponse {

    /**
     * 亚马逊请求ID
     */
    private String reportRequestId;

    /**
     * 是否有结果集
     */
    private Boolean hasResult;

    /**
     * 报告ID
     */
    private String generatedReportId;

    /**
     * 报文响应结果集
     */
    private List<Object> reportResultList;

    public String getGeneratedReportId() {
        return generatedReportId;
    }

    public void setGeneratedReportId(String generatedReportId) {
        this.generatedReportId = generatedReportId;
    }

    public Boolean getHasResult() {
        return hasResult;
    }

    public void setHasResult(Boolean hasResult) {
        this.hasResult = hasResult;
    }

    public String getReportRequestId() {
        return reportRequestId;
    }

    public void setReportRequestId(String reportRequestId) {
        this.reportRequestId = reportRequestId;
    }

    public List<Object> getReportResultList() {
        return reportResultList;
    }

    public void setReportResultList(List<Object> reportResultList) {
        this.reportResultList = reportResultList;
    }
}
