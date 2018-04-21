package com.amazon.domain.report;

import java.util.ArrayList;
import java.util.List;

/**
 * _GET_FLAT_FILE_OPEN_LISTINGS_DATA_
 * 对应报文头的先后顺序
 * sku	asin	price	quantity
 *
 * @author zhuzhenke
 * @date 2018/03/26
 */
public class ReportResult_GET_FLAT_FILE_OPEN_LISTINGS_DATA_ implements ResolveReportResult {
    private String sku;
    private String asin;
    private String price;
    private String quantity;

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    @Override
    public List<Object> resolveResult(List<String> resultList) {
        List<Object> reportResultList = new ArrayList<Object>();
        if (resultList == null || resultList.size() <= 1) {
            return reportResultList;
        }
        for (int i = 1; i < resultList.size(); i++) {
            String[] strings = resultList.get(i).split("\t");
            ReportResult_GET_FLAT_FILE_OPEN_LISTINGS_DATA_ object = new ReportResult_GET_FLAT_FILE_OPEN_LISTINGS_DATA_();

            object.setSku(strings[0]);
            object.setAsin(strings[1]);
            object.setPrice(strings[2]);
            object.setQuantity(strings[3]);

            reportResultList.add(object);
        }

        return reportResultList;
    }
}
