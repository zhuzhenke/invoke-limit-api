package com.amazon.domain.report;

import java.util.ArrayList;
import java.util.List;

/**
 * _GET_MERCHANT_LISTINGS_DATA_LITE_
 * 对应报文头的先后顺序
 * seller-sku	quantity	price	product-id
 *
 * @author zhuzhenke
 * @date 2018/03/26
 */
public class ReportResult_GET_MERCHANT_LISTINGS_DATA_LITE_ implements ResolveReportResult {

    private String sellerSku;
    private String quantity;
    private String price;
    private String productId;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getSellerSku() {
        return sellerSku;
    }

    public void setSellerSku(String sellerSku) {
        this.sellerSku = sellerSku;
    }

    @Override
    public List<Object> resolveResult(List<String> resultList) {
        List<Object> reportResultList = new ArrayList<Object>();
        if (resultList == null || resultList.size() <= 1) {
            return reportResultList;
        }
        for (int i = 1; i < resultList.size(); i++) {
            String[] strings = resultList.get(i).split("\t");
            ReportResult_GET_MERCHANT_LISTINGS_DATA_LITE_ object = new ReportResult_GET_MERCHANT_LISTINGS_DATA_LITE_();

            object.setSellerSku(strings[0]);
            object.setQuantity(strings[1]);
            object.setPrice(strings[2]);
            object.setProductId(strings[3]);

            reportResultList.add(object);
        }

        return reportResultList;
    }
}
