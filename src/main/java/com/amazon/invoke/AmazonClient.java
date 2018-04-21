package com.amazon.invoke;

import com.amazon.commom.MarketPlace;
import com.amazon.commom.MarketplaceService;
import com.amazonaws.mws.MarketplaceWebServiceConfig;
import com.amazonaws.mws.model.*;
import com.amazonservices.mws.FulfillmentInventory._2010_10_01.model.ListInventorySupplyByNextTokenRequest;
import com.amazonservices.mws.FulfillmentInventory._2010_10_01.model.ListInventorySupplyRequest;
import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model.*;
import com.amazonservices.mws.merchantfulfillment._2015_06_01.model.CancelShipmentRequest;
import com.amazonservices.mws.merchantfulfillment._2015_06_01.model.CreateShipmentRequest;
import com.amazonservices.mws.merchantfulfillment._2015_06_01.model.GetEligibleShippingServicesRequest;
import com.amazonservices.mws.merchantfulfillment._2015_06_01.model.GetShipmentRequest;
import com.amazonservices.mws.orders._2013_09_01.model.*;
import com.amazonservices.mws.products.model.*;
import com.amazonservices.mws.sellers.model.ListMarketplaceParticipationsByNextTokenRequest;
import com.amazonservices.mws.sellers.model.ListMarketplaceParticipationsRequest;
import com.method.invoke.base.BaseClient;
import com.method.invoke.base.BaseRequest;
import com.method.invoke.base.BaseResponse;

/**
 * @author zhuzhenke
 * @date 2018/03/20
 */
public class AmazonClient extends BaseClient {

    private static AmazonClient amazonClient = new AmazonClient();

    private MarketplaceWebServiceConfig marketplaceWebServiceConfig = null;

    public MarketplaceWebServiceConfig getMarketplaceWebServiceConfig() {
        return marketplaceWebServiceConfig;
    }

    public void setMarketplaceWebServiceConfig(MarketplaceWebServiceConfig marketplaceWebServiceConfig) {
        this.marketplaceWebServiceConfig = marketplaceWebServiceConfig;
    }

    private AmazonClient() {
        setGlobalNextInvokeProcessor(new AmazonNextInvokeProcessor());
        setGlobalExceptionReInvokeProcessor(new AmazonExceptionReInvokeProcessor());
    }

    public static AmazonClient getAmazonClientInstance() {
        return amazonClient;
    }

    /**
     * 复用同一个client
     * 对于这里没有的amazon接口,可以在这里找到 https://developer.amazonservices.com.cn/
     */
    @Override
    public BaseResponse executeInternal(BaseRequest baseRequest, MarketPlace marketPlace) throws Exception {

        //com.amazonservices.mws.products.model
        if (baseRequest instanceof GetCompetitivePricingForASINRequest) {
            GetCompetitivePricingForASINRequest request = (GetCompetitivePricingForASINRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebServiceProducts(marketPlace).getCompetitivePricingForASIN(request);
        } else if (baseRequest instanceof GetCompetitivePricingForSKURequest) {
            GetCompetitivePricingForSKURequest request = (GetCompetitivePricingForSKURequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebServiceProducts(marketPlace).getCompetitivePricingForSKU(request);
        } else if (baseRequest instanceof GetLowestOfferListingsForASINRequest) {
            GetLowestOfferListingsForASINRequest request = (GetLowestOfferListingsForASINRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebServiceProducts(marketPlace).getLowestOfferListingsForASIN(request);
        } else if (baseRequest instanceof GetLowestOfferListingsForSKURequest) {
            GetLowestOfferListingsForSKURequest request = (GetLowestOfferListingsForSKURequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebServiceProducts(marketPlace).getLowestOfferListingsForSKU(request);
        } else if (baseRequest instanceof GetLowestPricedOffersForASINRequest) {
            GetLowestPricedOffersForASINRequest request = (GetLowestPricedOffersForASINRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebServiceProducts(marketPlace).getLowestPricedOffersForASIN(request);
        } else if (baseRequest instanceof GetLowestPricedOffersForSKURequest) {
            GetLowestPricedOffersForSKURequest request = (GetLowestPricedOffersForSKURequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebServiceProducts(marketPlace).getLowestPricedOffersForSKU(request);
        } else if (baseRequest instanceof GetMatchingProductForIdRequest) {
            GetMatchingProductForIdRequest request = (GetMatchingProductForIdRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebServiceProducts(marketPlace).getMatchingProductForId(request);
        } else if (baseRequest instanceof GetMatchingProductRequest) {
            GetMatchingProductRequest request = (GetMatchingProductRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebServiceProducts(marketPlace).getMatchingProduct(request);
        } else if (baseRequest instanceof GetMyFeesEstimateRequest) {
            GetMyFeesEstimateRequest request = (GetMyFeesEstimateRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebServiceProducts(marketPlace).getMyFeesEstimate(request);
        } else if (baseRequest instanceof GetMyPriceForASINRequest) {
            GetMyPriceForASINRequest request = (GetMyPriceForASINRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebServiceProducts(marketPlace).getMyPriceForASIN(request);
        } else if (baseRequest instanceof GetMyPriceForSKURequest) {
            //测试使用
            GetMyPriceForSKURequest request = (GetMyPriceForSKURequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebServiceProducts(marketPlace).getMyPriceForSKU(request);
        } else if (baseRequest instanceof GetProductCategoriesForASINRequest) {
            GetProductCategoriesForASINRequest request = (GetProductCategoriesForASINRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebServiceProducts(marketPlace).getProductCategoriesForASIN(request);
        } else if (baseRequest instanceof GetProductCategoriesForSKURequest) {
            GetProductCategoriesForSKURequest request = (GetProductCategoriesForSKURequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebServiceProducts(marketPlace).getProductCategoriesForSKU(request);
        } else if (baseRequest instanceof com.amazonservices.mws.products.model.GetServiceStatusRequest) {
            com.amazonservices.mws.products.model.GetServiceStatusRequest request = (com.amazonservices.mws.products.model.GetServiceStatusRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebServiceProducts(marketPlace).getServiceStatus(request);
        } else if (baseRequest instanceof ListMatchingProductsRequest) {
            ListMatchingProductsRequest request = (ListMatchingProductsRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebServiceProducts(marketPlace).listMatchingProducts(request);
        }

        //amazonaws.mws.model
        else if (baseRequest instanceof CancelFeedSubmissionsRequest) {
            CancelFeedSubmissionsRequest request = (CancelFeedSubmissionsRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebService(marketPlace, marketplaceWebServiceConfig).cancelFeedSubmissions(request);
        } else if (baseRequest instanceof CancelReportRequestsRequest) {
            CancelReportRequestsRequest request = (CancelReportRequestsRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebService(marketPlace, marketplaceWebServiceConfig).cancelReportRequests(request);
        } else if (baseRequest instanceof GetFeedSubmissionCountRequest) {
            GetFeedSubmissionCountRequest request = (GetFeedSubmissionCountRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebService(marketPlace, marketplaceWebServiceConfig).getFeedSubmissionCount(request);
        } else if (baseRequest instanceof GetFeedSubmissionListByNextTokenRequest) {
            GetFeedSubmissionListByNextTokenRequest request = (GetFeedSubmissionListByNextTokenRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebService(marketPlace, marketplaceWebServiceConfig).getFeedSubmissionListByNextToken(request);
        } else if (baseRequest instanceof GetFeedSubmissionListRequest) {
            GetFeedSubmissionListRequest request = (GetFeedSubmissionListRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebService(marketPlace, marketplaceWebServiceConfig).getFeedSubmissionList(request);
        } else if (baseRequest instanceof GetFeedSubmissionResultRequest) {
            GetFeedSubmissionResultRequest request = (GetFeedSubmissionResultRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebService(marketPlace, marketplaceWebServiceConfig).getFeedSubmissionResult(request);
        } else if (baseRequest instanceof GetReportCountRequest) {
            GetReportCountRequest request = (GetReportCountRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebService(marketPlace, marketplaceWebServiceConfig).getReportCount(request);
        } else if (baseRequest instanceof GetReportListByNextTokenRequest) {
            GetReportListByNextTokenRequest request = (GetReportListByNextTokenRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebService(marketPlace, marketplaceWebServiceConfig).getReportListByNextToken(request);
        } else if (baseRequest instanceof GetReportListRequest) {
            GetReportListRequest request = (GetReportListRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebService(marketPlace, marketplaceWebServiceConfig).getReportList(request);
        } else if (baseRequest instanceof GetReportRequest) {
            /**
             * 获取报告第三步
             */
            GetReportRequest getReportRequest = (GetReportRequest) baseRequest;
            org.apache.commons.io.output.ByteArrayOutputStream outputStream = new org.apache.commons.io.output.ByteArrayOutputStream();
            getReportRequest.setReportOutputStream(outputStream);
            return MarketplaceService.buildMarketplaceWebService(marketPlace, marketplaceWebServiceConfig).getReport(getReportRequest);
        } else if (baseRequest instanceof GetReportRequestCountRequest) {
            GetReportRequestCountRequest request = (GetReportRequestCountRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebService(marketPlace, marketplaceWebServiceConfig).getReportRequestCount(request);
        } else if (baseRequest instanceof GetReportRequestListByNextTokenRequest) {
            GetReportRequestListByNextTokenRequest request = (GetReportRequestListByNextTokenRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebService(marketPlace, marketplaceWebServiceConfig).getReportRequestListByNextToken(request);
        } else if (baseRequest instanceof GetReportRequestListRequest) {
            /**
             * 获取报告第二步
             */
            GetReportRequestListRequest getReportRequestListRequest = (GetReportRequestListRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebService(marketPlace, marketplaceWebServiceConfig).getReportRequestList(getReportRequestListRequest);
        } else if (baseRequest instanceof GetReportScheduleCountRequest) {
            GetReportScheduleCountRequest request = (GetReportScheduleCountRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebService(marketPlace, marketplaceWebServiceConfig).getReportScheduleCount(request);
        } else if (baseRequest instanceof GetReportScheduleListByNextTokenRequest) {
            GetReportScheduleListByNextTokenRequest request = (GetReportScheduleListByNextTokenRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebService(marketPlace, marketplaceWebServiceConfig).getReportScheduleListByNextToken(request);
        } else if (baseRequest instanceof GetReportScheduleListRequest) {
            GetReportScheduleListRequest request = (GetReportScheduleListRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebService(marketPlace, marketplaceWebServiceConfig).getReportScheduleList(request);
        } else if (baseRequest instanceof ManageReportScheduleRequest) {
            ManageReportScheduleRequest request = (ManageReportScheduleRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebService(marketPlace, marketplaceWebServiceConfig).manageReportSchedule(request);
        } else if (baseRequest instanceof RequestReportRequest) {
            /**
             * 获取报告第一步
             */
            RequestReportRequest requestReportRequest = (RequestReportRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebService(marketPlace, marketplaceWebServiceConfig).requestReport(requestReportRequest);
        } else if (baseRequest instanceof SubmitFeedRequest) {
            SubmitFeedRequest request = (SubmitFeedRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebService(marketPlace, marketplaceWebServiceConfig).submitFeed(request);
        } else if (baseRequest instanceof UpdateReportAcknowledgementsRequest) {
            UpdateReportAcknowledgementsRequest request = (UpdateReportAcknowledgementsRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebService(marketPlace, marketplaceWebServiceConfig).updateReportAcknowledgements(request);
        }

        //com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model
        else if (baseRequest instanceof CancelFulfillmentOrderRequest) {
            CancelFulfillmentOrderRequest request = (CancelFulfillmentOrderRequest) baseRequest;
            return MarketplaceService.buildFBAOutboundServiceMWS(marketPlace).cancelFulfillmentOrder(request);
        } else if (baseRequest instanceof CreateFulfillmentOrderRequest) {
            CreateFulfillmentOrderRequest request = (CreateFulfillmentOrderRequest) baseRequest;
            return MarketplaceService.buildFBAOutboundServiceMWS(marketPlace).createFulfillmentOrder(request);
        } else if (baseRequest instanceof GetFulfillmentOrderRequest) {
            GetFulfillmentOrderRequest request = (GetFulfillmentOrderRequest) baseRequest;
            return MarketplaceService.buildFBAOutboundServiceMWS(marketPlace).getFulfillmentOrder(request);
        } else if (baseRequest instanceof GetFulfillmentPreviewRequest) {
            GetFulfillmentPreviewRequest request = (GetFulfillmentPreviewRequest) baseRequest;
            return MarketplaceService.buildFBAOutboundServiceMWS(marketPlace).getFulfillmentPreview(request);
        } else if (baseRequest instanceof GetPackageTrackingDetailsRequest) {
            GetPackageTrackingDetailsRequest request = (GetPackageTrackingDetailsRequest) baseRequest;
            return MarketplaceService.buildFBAOutboundServiceMWS(marketPlace).getPackageTrackingDetails(request);
        } else if (baseRequest instanceof com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model.GetServiceStatusRequest) {
            com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model.GetServiceStatusRequest request = (com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model.GetServiceStatusRequest) baseRequest;
            return MarketplaceService.buildFBAOutboundServiceMWS(marketPlace).getServiceStatus(request);
        } else if (baseRequest instanceof ListAllFulfillmentOrdersByNextTokenRequest) {
            ListAllFulfillmentOrdersByNextTokenRequest request = (ListAllFulfillmentOrdersByNextTokenRequest) baseRequest;
            return MarketplaceService.buildFBAOutboundServiceMWS(marketPlace).listAllFulfillmentOrdersByNextToken(request);
        } else if (baseRequest instanceof ListAllFulfillmentOrdersRequest) {
            ListAllFulfillmentOrdersRequest request = (ListAllFulfillmentOrdersRequest) baseRequest;
            return MarketplaceService.buildFBAOutboundServiceMWS(marketPlace).listAllFulfillmentOrders(request);
        }

        //com.amazonservices.mws.merchantfulfillment._2015_06_01.model
        else if (baseRequest instanceof CancelShipmentRequest) {
            CancelShipmentRequest request = (CancelShipmentRequest) baseRequest;
            return MarketplaceService.buildMWSMerchantFulfillmentService(marketPlace).cancelShipment(request);
        } else if (baseRequest instanceof CreateShipmentRequest) {
            CreateShipmentRequest request = (CreateShipmentRequest) baseRequest;
            return MarketplaceService.buildMWSMerchantFulfillmentService(marketPlace).createShipment(request);
        } else if (baseRequest instanceof GetEligibleShippingServicesRequest) {
            GetEligibleShippingServicesRequest request = (GetEligibleShippingServicesRequest) baseRequest;
            return MarketplaceService.buildMWSMerchantFulfillmentService(marketPlace).getEligibleShippingServices(request);
        } else if (baseRequest instanceof com.amazonservices.mws.merchantfulfillment._2015_06_01.model.GetServiceStatusRequest) {
            com.amazonservices.mws.merchantfulfillment._2015_06_01.model.GetServiceStatusRequest request = (com.amazonservices.mws.merchantfulfillment._2015_06_01.model.GetServiceStatusRequest) baseRequest;
            return MarketplaceService.buildMWSMerchantFulfillmentService(marketPlace).getServiceStatus(request);
        } else if (baseRequest instanceof GetShipmentRequest) {
            GetShipmentRequest request = (GetShipmentRequest) baseRequest;
            return MarketplaceService.buildMWSMerchantFulfillmentService(marketPlace).getShipment(request);
        }

        //com.amazonservices.mws.orders._2013_09_01.model
        else if (baseRequest instanceof GetOrderRequest) {
            GetOrderRequest request = (GetOrderRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebServiceOrders(marketPlace).getOrder(request);
        } else if (baseRequest instanceof com.amazonservices.mws.orders._2013_09_01.model.GetServiceStatusRequest) {
            com.amazonservices.mws.orders._2013_09_01.model.GetServiceStatusRequest request = (com.amazonservices.mws.orders._2013_09_01.model.GetServiceStatusRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebServiceOrders(marketPlace).getServiceStatus(request);
        } else if (baseRequest instanceof ListOrderItemsByNextTokenRequest) {
            ListOrderItemsByNextTokenRequest request = (ListOrderItemsByNextTokenRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebServiceOrders(marketPlace).listOrderItemsByNextToken(request);
        } else if (baseRequest instanceof ListOrderItemsRequest) {
            ListOrderItemsRequest request = (ListOrderItemsRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebServiceOrders(marketPlace).listOrderItems(request);
        } else if (baseRequest instanceof ListOrdersByNextTokenRequest) {
            ListOrdersByNextTokenRequest request = (ListOrdersByNextTokenRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebServiceOrders(marketPlace).listOrdersByNextToken(request);
        } else if (baseRequest instanceof ListOrdersRequest) {
            ListOrdersRequest request = (ListOrdersRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebServiceOrders(marketPlace).listOrders(request);
        }

        //com.amazonservices.mws.sellers.model
        else if (baseRequest instanceof com.amazonservices.mws.sellers.model.GetServiceStatusRequest) {
            com.amazonservices.mws.sellers.model.GetServiceStatusRequest request = (com.amazonservices.mws.sellers.model.GetServiceStatusRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebServiceSellers(marketPlace).getServiceStatus(request);
        } else if (baseRequest instanceof ListMarketplaceParticipationsByNextTokenRequest) {
            ListMarketplaceParticipationsByNextTokenRequest request = (ListMarketplaceParticipationsByNextTokenRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebServiceSellers(marketPlace).listMarketplaceParticipationsByNextToken(request);
        } else if (baseRequest instanceof ListMarketplaceParticipationsRequest) {
            ListMarketplaceParticipationsRequest request = (ListMarketplaceParticipationsRequest) baseRequest;
            return MarketplaceService.buildMarketplaceWebServiceSellers(marketPlace).listMarketplaceParticipations(request);
        }


        //com.amazonservices.mws.FulfillmentInventory._2010_10_01.model
        else if (baseRequest instanceof com.amazonservices.mws.FulfillmentInventory._2010_10_01.model.GetServiceStatusRequest) {
            com.amazonservices.mws.FulfillmentInventory._2010_10_01.model.GetServiceStatusRequest request = (com.amazonservices.mws.FulfillmentInventory._2010_10_01.model.GetServiceStatusRequest) baseRequest;
            return MarketplaceService.buildFBAInventoryServiceMWS(marketPlace).getServiceStatus(request);
        } else if (baseRequest instanceof ListInventorySupplyByNextTokenRequest) {
            ListInventorySupplyByNextTokenRequest request = (ListInventorySupplyByNextTokenRequest) baseRequest;
            return MarketplaceService.buildFBAInventoryServiceMWS(marketPlace).listInventorySupplyByNextToken(request);
        } else if (baseRequest instanceof ListInventorySupplyRequest) {
            ListInventorySupplyRequest request = (ListInventorySupplyRequest) baseRequest;
            return MarketplaceService.buildFBAInventoryServiceMWS(marketPlace).listInventorySupply(request);
        }


        //默认没有实现的
        else {
            throw new Exception("未知请求类,请在AmazonClient.executeInternal方法添加新的API请求");
        }
    }

}
