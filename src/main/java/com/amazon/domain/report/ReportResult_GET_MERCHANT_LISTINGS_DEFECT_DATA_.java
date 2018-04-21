package com.amazon.domain.report;

import java.util.ArrayList;
import java.util.List;

/**
 * _GET_MERCHANT_LISTINGS_DEFECT_DATA_
 * 对应报文头的先后顺序
 * sku	product-name	asin	field-name	alert-type	current-value	last-updated	alert-name	status	explanation
 *
 * @author zhuzhenke
 * @date 2018/03/26
 */
public class ReportResult_GET_MERCHANT_LISTINGS_DEFECT_DATA_ implements ResolveReportResult {

    private String sku;
    private String productName;
    private String asin;
    private String fieldName;
    private String alertType;
    private String currentValue;
    private String lastUpdated;
    private String alertName;
    private String status;
    private String explanation;

    public String getAlertName() {
        return alertName;
    }

    public void setAlertName(String alertName) {
        this.alertName = alertName;
    }

    public String getAlertType() {
        return alertType;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public String getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public List<Object> resolveResult(List<String> resultList) {
        List<Object> reportResultList = new ArrayList<Object>();
        if (resultList == null || resultList.size() <= 1) {
            return reportResultList;
        }
        for (int i = 1; i < resultList.size(); i++) {
            String[] strings = resultList.get(i).split("\t");
            ReportResult_GET_MERCHANT_LISTINGS_DEFECT_DATA_ object = new ReportResult_GET_MERCHANT_LISTINGS_DEFECT_DATA_();

            object.setSku(strings[0]);
            object.setProductName(strings[1]);
            object.setAsin(strings[2]);
            object.setFieldName(strings[3]);
            object.setAlertType(strings[4]);
            object.setCurrentValue(strings[5]);
            object.setLastUpdated(strings[6]);
            object.setAlertName(strings[7]);
            object.setStatus(strings[8]);
            object.setExplanation(strings[9]);

            reportResultList.add(object);
        }

        return reportResultList;
    }
}
