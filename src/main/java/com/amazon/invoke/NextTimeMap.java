package com.amazon.invoke;

import java.util.HashMap;

/**
 * @author zhuzhenke
 * @date 2018/04/09
 */
public class NextTimeMap {
    /**
     * 使用限制时间
     * 参考:http://docs.developer.amazonservices.com/zh_CN/feeds/Feeds_SubmitFeed.html
     */
    private static HashMap<String, Long> nextTimeMap = new HashMap<String, Long>();

    public static Long get(String key) {
        return nextTimeMap.get(key);
    }

    public static Long get(String key, Long defaultValue) {
        Long value = nextTimeMap.get(key);
        if (value == null) {
            value = defaultValue;
        }
        return value;
    }

    static {

        //商品//com.amazonservices.mws.products.model
        nextTimeMap.put("GetCompetitivePricingForSKURequest", 2000L);
        nextTimeMap.put("GetCompetitivePricingForASINRequest", 2000L);
        nextTimeMap.put("GetLowestOfferListingsForASINRequest", 2000L);
        nextTimeMap.put("GetLowestOfferListingsForSKURequest", 2000L);
        nextTimeMap.put("GetMatchingProductForIdRequest", 1000L);
        nextTimeMap.put("GetMatchingProductRequest", 5000L);
        nextTimeMap.put("ListMatchingProductsRequest", 5000L);
        nextTimeMap.put("GetLowestPricedOffersForASINRequest", 2000L);//未知
        nextTimeMap.put("GetLowestPricedOffersForSKURequest", 2000L);//未知
        nextTimeMap.put("GetMyPriceForASINRequest", 2000L);
        nextTimeMap.put("GetMyPriceForSKURequest", 2000L);
        nextTimeMap.put("GetMyFeesEstimateRequest", 2000L);//未知
        nextTimeMap.put("GetProductCategoriesForSKURequest", 5000L);
        nextTimeMap.put("GetProductCategoriesForASINRequest", 5000L);
        nextTimeMap.put("GetServiceStatusRequest", 300000L);


        //报告//amazonaws.mws.model
        nextTimeMap.put("CancelFeedSubmissionsRequest", 45000L);
        nextTimeMap.put("CancelReportRequestsRequest", 45000L);
        nextTimeMap.put("GetFeedSubmissionCountRequest", 45000L);
        nextTimeMap.put("GetFeedSubmissionListByNextTokenRequest", 120000L);
        nextTimeMap.put("GetFeedSubmissionListRequest", 45000L);
        nextTimeMap.put("GetFeedSubmissionResultRequest", 60000L);
        nextTimeMap.put("GetReportCountRequest", 45000L);
        nextTimeMap.put("GetReportListByNextTokenRequest", 2000L);
        nextTimeMap.put("GetReportListRequest", 60000L);
        nextTimeMap.put("GetReportRequest", 60000L);
        nextTimeMap.put("GetReportRequestCountRequest", 45000L);
        nextTimeMap.put("GetReportRequestListByNextTokenRequest", 2000L);
        nextTimeMap.put("GetReportRequestListRequest", 45000L);
        nextTimeMap.put("GetReportScheduleCountRequest", 45000L);
        nextTimeMap.put("GetReportScheduleListByNextTokenRequest", 5000L);//未知:当前无法调用该操作，原因是 GetReportScheduleList 操作无法返回 100 个以上的结果。包含该操作以实现以后的兼容性
        nextTimeMap.put("GetReportScheduleListRequest", 45000L);
        nextTimeMap.put("ManageReportScheduleRequest", 45000L);
        nextTimeMap.put("RequestReportRequest", 60000L);
        nextTimeMap.put("SubmitFeedRequest", 120000L);
        nextTimeMap.put("UpdateReportAcknowledgementsRequest", 45000L);


        //com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model
        nextTimeMap.put("CancelFulfillmentOrderRequest", 500L);
        nextTimeMap.put("CreateFulfillmentOrderRequest", 500L);
        nextTimeMap.put("GetFulfillmentOrderRequest", 500L);
        nextTimeMap.put("GetFulfillmentPreviewRequest", 500L);
        nextTimeMap.put("GetPackageTrackingDetailsRequest", 500L);
        nextTimeMap.put("ListAllFulfillmentOrdersByNextTokenRequest", 500L);
        nextTimeMap.put("ListAllFulfillmentOrdersRequest", 500L);


        //com.amazonservices.mws.merchantfulfillment._2015_06_01.model
        nextTimeMap.put("CancelShipmentRequest", 2000L);//未知
        nextTimeMap.put("CreateShipmentRequest", 2000L);//未知
        nextTimeMap.put("GetEligibleShippingServicesRequest", 2000L);//未知
        nextTimeMap.put("GetShipmentRequest", 2000L);//未知


        //com.amazonservices.mws.orders._2013_09_01.model
        nextTimeMap.put("GetOrderRequest", 2000L);//未知
        nextTimeMap.put("ListOrderItemsByNextTokenRequest", 2000L);//未知
        nextTimeMap.put("ListOrderItemsRequest", 2000L);//未知
        nextTimeMap.put("ListOrdersByNextTokenRequest", 2000L);//未知
        nextTimeMap.put("ListOrdersRequest", 2000L);//未知


        //com.amazonservices.mws.sellers.model
        nextTimeMap.put("ListMarketplaceParticipationsByNextTokenRequest", 2000L);//未知
        nextTimeMap.put("ListMarketplaceParticipationsRequest", 2000L);//未知


        //com.amazonservices.mws.FulfillmentInventory._2010_10_01.model
        nextTimeMap.put("ListInventorySupplyByNextTokenRequest", 500L);
        nextTimeMap.put("ListInventorySupplyRequest", 500L);

    }
}
