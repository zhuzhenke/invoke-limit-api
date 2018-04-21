/*******************************************************************************
 * Copyright 2009-2016 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * FBA Outbound Service MWS
 * API Version: 2010-10-01
 * Library Version: 2016-02-01
 * Generated: Fri Jan 08 13:26:39 PST 2016
 */
package com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.mock;


import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.*;
import java.util.Date;

import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.*;
import com.amazonservices.mws.FulfillmentOutboundShipment._2010_10_01.model.*;

import com.amazonservices.mws.client.MwsObject;
import com.amazonservices.mws.client.MwsUtl;
import com.amazonservices.mws.client.MwsXmlReader;

/**
 * A mock implementation of FBAOutboundServiceMWS that uses pre-populated set of 
 * XML files that serve local data.
 *
 * It simulates responses from the FBA Outbound Service MWS service.
 *
 * Use this to test your application without making actual service calls.
 *
 * This mock implementation does not validate requests.
 */
public class FBAOutboundServiceMWSMock 
        implements FBAOutboundServiceMWS, FBAOutboundServiceMWSAsync {

    /**
     * Create a future that will immediately return the given response.
     *
     * @param response
     *
     * @return Future
     */
    private <T> Future<T> newFuture(final T response) {
        FutureTask<T> t = new FutureTask<T>(new Callable<T>() {
                @Override
                public T call() {
                    return response;
                }
            });
        t.run();
        return t;
    }

    /**
     * Create a new response object.
     * 
     * @param cls
     * 
     * @return The object.
     */
    private <T extends MwsObject> T newResponse(
            Class<T> cls) {
        InputStream is = null;
        try {
            is = this.getClass().getResourceAsStream(cls.getSimpleName()+".xml");
            MwsXmlReader reader = new MwsXmlReader(is);
            T obj = cls.newInstance();
            obj.readFragmentFrom(reader);
            ResponseHeaderMetadata rhmd = new ResponseHeaderMetadata(
                "mockRequestId", Arrays.asList("A","B","C"), "mockTimestamp", 0d, 0d, new Date());
            cls.getMethod("setResponseHeaderMetadata", rhmd.getClass()).invoke(obj,  rhmd);
            return obj;
        } catch (Exception e) {
            throw MwsUtl.wrap(e);
        } finally {
            MwsUtl.close(is);
        }
    }

    /**
     * Cancel Fulfillment Order
     * Request for Amazon to no longer attempt to fulfill an existing
     *   fulfillment order. Amazon will attempt to stop fulfillment of all
     *   items that haven't already shipped, but cannot guarantee success.
     *   Note: Items that have already shipped cannot be cancelled.
     *
     * @param request
     *           CancelFulfillmentOrderRequest request.
     *
     * @return CancelFulfillmentOrderResponse response.
     *
     * @throws FBAOutboundServiceMWSException
     */
    public CancelFulfillmentOrderResponse cancelFulfillmentOrder(CancelFulfillmentOrderRequest request) 
            throws FBAOutboundServiceMWSException {
        return newResponse(CancelFulfillmentOrderResponse.class);
    }

    /**
    * Cancel Fulfillment Order
    * Request for Amazon to no longer attempt to fulfill an existing
     *   fulfillment order. Amazon will attempt to stop fulfillment of all
     *   items that haven't already shipped, but cannot guarantee success.
     *   Note: Items that have already shipped cannot be cancelled.
    *
    * @param request
    *           CancelFulfillmentOrderRequest request.
    *
    * @return Future<CancelFulfillmentOrderResponse> Future containing completed response
    *
    * @throws FBAOutboundServiceMWSException
    */
    public Future<CancelFulfillmentOrderResponse> cancelFulfillmentOrderAsync(CancelFulfillmentOrderRequest request) {
        return newFuture(cancelFulfillmentOrder(request));
    }

    /**
     * Create Fulfillment Order
     * The SellerFulfillmentOrderId must be unique for all fulfillment
     *   orders created by the seller. If your system already has a
     *   unique order identifier, then that may be a good value to put in
     *   this field.
     * 
     *   This DisplayableOrderDateTime will appear as the "order date" in
     *   recipient-facing materials such as the packing slip.  The format
     *   must be timestamp.
     * 
     * 
     *   The DisplayableOrderId will appear as the "order id" in those
     *   materials, and the DisplayableOrderComment will appear as well.
     *   
     *   ShippingSpeedCategory is the Service Level Agreement for how long it
     *   will take a shipment to be transported from the fulfillment center
     *   to the recipient, once shipped. no default.
     *   The following shipping speeds are available for US domestic:
     *    * Standard, 3-5 business days
     *    * Expedited, 2 business days
     *    * Priority, 1 business day
     * 
     *   Shipping speeds may vary elsewhere.  Please consult your manual for published SLAs.
     * 
     * 
     *   DestinationAddress is the address the items will be shipped to.
     * 
     *   FulfillmentPolicy indicates how unfulfillable items should be 
     *   handled. default is FillOrKill.
     *    * FillOrKill if any item is determined to be unfulfillable
     *      before any items have started shipping, the entire order is
     *      considered unfulfillable.  Once any part of the order has
     *      started shipping, as much of the order as possible will be
     *      shipped.
     *    * FillAll never consider any item unfulfillable.  Items must
     *      either be fulfilled or merchant-cancelled.
     *    * FillAllAvailable fulfill as much of the order as possible.
     *   
     *   FulfillmentMethod indicates the intended recipient channel for the 
     *   order whether it be a consumer order or inventory return.
     *   default is Consumer.
     *   The available methods to fulfill a given order:
     *    * Consumer indicates a customer order, this is the default.
     *    * Removal indicates that the inventory should be returned to the
     *      specified destination address.
     *   
     *   
     *   NotificationEmailList can be used to provide a list of e-mail 
     *   addresses to receive ship-complete e-mail notifications. These 
     *   e-mails are customer-facing e-mails sent by FBA on behalf of 
     *   the seller.
     *
     * @param request
     *           CreateFulfillmentOrderRequest request.
     *
     * @return CreateFulfillmentOrderResponse response.
     *
     * @throws FBAOutboundServiceMWSException
     */
    public CreateFulfillmentOrderResponse createFulfillmentOrder(CreateFulfillmentOrderRequest request) 
            throws FBAOutboundServiceMWSException {
        return newResponse(CreateFulfillmentOrderResponse.class);
    }

    /**
    * Create Fulfillment Order
    * The SellerFulfillmentOrderId must be unique for all fulfillment
     *   orders created by the seller. If your system already has a
     *   unique order identifier, then that may be a good value to put in
     *   this field.
     * 
     *   This DisplayableOrderDateTime will appear as the "order date" in
     *   recipient-facing materials such as the packing slip.  The format
     *   must be timestamp.
     * 
     * 
     *   The DisplayableOrderId will appear as the "order id" in those
     *   materials, and the DisplayableOrderComment will appear as well.
     *   
     *   ShippingSpeedCategory is the Service Level Agreement for how long it
     *   will take a shipment to be transported from the fulfillment center
     *   to the recipient, once shipped. no default.
     *   The following shipping speeds are available for US domestic:
     *    * Standard, 3-5 business days
     *    * Expedited, 2 business days
     *    * Priority, 1 business day
     * 
     *   Shipping speeds may vary elsewhere.  Please consult your manual for published SLAs.
     * 
     * 
     *   DestinationAddress is the address the items will be shipped to.
     * 
     *   FulfillmentPolicy indicates how unfulfillable items should be 
     *   handled. default is FillOrKill.
     *    * FillOrKill if any item is determined to be unfulfillable
     *      before any items have started shipping, the entire order is
     *      considered unfulfillable.  Once any part of the order has
     *      started shipping, as much of the order as possible will be
     *      shipped.
     *    * FillAll never consider any item unfulfillable.  Items must
     *      either be fulfilled or merchant-cancelled.
     *    * FillAllAvailable fulfill as much of the order as possible.
     *   
     *   FulfillmentMethod indicates the intended recipient channel for the 
     *   order whether it be a consumer order or inventory return.
     *   default is Consumer.
     *   The available methods to fulfill a given order:
     *    * Consumer indicates a customer order, this is the default.
     *    * Removal indicates that the inventory should be returned to the
     *      specified destination address.
     *   
     *   
     *   NotificationEmailList can be used to provide a list of e-mail 
     *   addresses to receive ship-complete e-mail notifications. These 
     *   e-mails are customer-facing e-mails sent by FBA on behalf of 
     *   the seller.
    *
    * @param request
    *           CreateFulfillmentOrderRequest request.
    *
    * @return Future<CreateFulfillmentOrderResponse> Future containing completed response
    *
    * @throws FBAOutboundServiceMWSException
    */
    public Future<CreateFulfillmentOrderResponse> createFulfillmentOrderAsync(CreateFulfillmentOrderRequest request) {
        return newFuture(createFulfillmentOrder(request));
    }

    /**
     * Get Fulfillment Order
     * Get detailed information about a FulfillmentOrder.  This includes the
     *   original fulfillment order request, the status of the order and its
     *   items in Amazon's fulfillment network, and the shipments that have been
     *   generated to fulfill the order.
     *
     * @param request
     *           GetFulfillmentOrderRequest request.
     *
     * @return GetFulfillmentOrderResponse response.
     *
     * @throws FBAOutboundServiceMWSException
     */
    public GetFulfillmentOrderResponse getFulfillmentOrder(GetFulfillmentOrderRequest request) 
            throws FBAOutboundServiceMWSException {
        return newResponse(GetFulfillmentOrderResponse.class);
    }

    /**
    * Get Fulfillment Order
    * Get detailed information about a FulfillmentOrder.  This includes the
     *   original fulfillment order request, the status of the order and its
     *   items in Amazon's fulfillment network, and the shipments that have been
     *   generated to fulfill the order.
    *
    * @param request
    *           GetFulfillmentOrderRequest request.
    *
    * @return Future<GetFulfillmentOrderResponse> Future containing completed response
    *
    * @throws FBAOutboundServiceMWSException
    */
    public Future<GetFulfillmentOrderResponse> getFulfillmentOrderAsync(GetFulfillmentOrderRequest request) {
        return newFuture(getFulfillmentOrder(request));
    }

    /**
     * Get Fulfillment Preview
     * Get estimated shipping dates and fees for all 
     *   available shipping speed given a set of seller SKUs and quantities      
     * 
     *   If "ShippingSpeedCategories" are inputed, only previews for those options will be returned. 
     *   
     *   If "ShippingSpeedCategories" are not inputed, then previews for all available options 
     *   are returned.
     * 
     *   The service will return the fulfillment estimates for a set of Seller 
     *   SKUs and quantities.
     *
     * @param request
     *           GetFulfillmentPreviewRequest request.
     *
     * @return GetFulfillmentPreviewResponse response.
     *
     * @throws FBAOutboundServiceMWSException
     */
    public GetFulfillmentPreviewResponse getFulfillmentPreview(GetFulfillmentPreviewRequest request) 
            throws FBAOutboundServiceMWSException {
        return newResponse(GetFulfillmentPreviewResponse.class);
    }

    /**
    * Get Fulfillment Preview
    * Get estimated shipping dates and fees for all 
     *   available shipping speed given a set of seller SKUs and quantities      
     * 
     *   If "ShippingSpeedCategories" are inputed, only previews for those options will be returned. 
     *   
     *   If "ShippingSpeedCategories" are not inputed, then previews for all available options 
     *   are returned.
     * 
     *   The service will return the fulfillment estimates for a set of Seller 
     *   SKUs and quantities.
    *
    * @param request
    *           GetFulfillmentPreviewRequest request.
    *
    * @return Future<GetFulfillmentPreviewResponse> Future containing completed response
    *
    * @throws FBAOutboundServiceMWSException
    */
    public Future<GetFulfillmentPreviewResponse> getFulfillmentPreviewAsync(GetFulfillmentPreviewRequest request) {
        return newFuture(getFulfillmentPreview(request));
    }

    /**
     * Get Package Tracking Details
     * Gets the tracking details for a shipment package.
     *
     * @param request
     *           GetPackageTrackingDetailsRequest request.
     *
     * @return GetPackageTrackingDetailsResponse response.
     *
     * @throws FBAOutboundServiceMWSException
     */
    public GetPackageTrackingDetailsResponse getPackageTrackingDetails(GetPackageTrackingDetailsRequest request) 
            throws FBAOutboundServiceMWSException {
        return newResponse(GetPackageTrackingDetailsResponse.class);
    }

    /**
    * Get Package Tracking Details
    * Gets the tracking details for a shipment package.
    *
    * @param request
    *           GetPackageTrackingDetailsRequest request.
    *
    * @return Future<GetPackageTrackingDetailsResponse> Future containing completed response
    *
    * @throws FBAOutboundServiceMWSException
    */
    public Future<GetPackageTrackingDetailsResponse> getPackageTrackingDetailsAsync(GetPackageTrackingDetailsRequest request) {
        return newFuture(getPackageTrackingDetails(request));
    }

    /**
     * Get Service Status
     * Request to poll the system for availability.
     *   Status is one of GREEN, RED representing:
     *   GREEN: The service section is operating normally.
     *   RED: The service section disruption.
     *
     * @param request
     *           GetServiceStatusRequest request.
     *
     * @return GetServiceStatusResponse response.
     *
     * @throws FBAOutboundServiceMWSException
     */
    public GetServiceStatusResponse getServiceStatus(GetServiceStatusRequest request) 
            throws FBAOutboundServiceMWSException {
        return newResponse(GetServiceStatusResponse.class);
    }

    /**
    * Get Service Status
    * Request to poll the system for availability.
     *   Status is one of GREEN, RED representing:
     *   GREEN: The service section is operating normally.
     *   RED: The service section disruption.
    *
    * @param request
    *           GetServiceStatusRequest request.
    *
    * @return Future<GetServiceStatusResponse> Future containing completed response
    *
    * @throws FBAOutboundServiceMWSException
    */
    public Future<GetServiceStatusResponse> getServiceStatusAsync(GetServiceStatusRequest request) {
        return newFuture(getServiceStatus(request));
    }

    /**
     * List All Fulfillment Orders
     * Gets the first set of fulfillment orders that are currently being
     *   fulfilled or that were being fulfilled at some time in the past
     *   (as specified by the query parameters). Also returns a NextToken
     *   which can be used iterate through the remaining fulfillment orders
     *   (via the ListAllFulfillmentOrdersByNextToken operation).
     * 
     *   If a NextToken is not returned, it indicates the end-of-data.
     *   
     *   If the QueryStartDateTime is set, the results will include all orders
     *   currently being fulfilled, and all orders that were being fulfilled
     *   since that date and time.
     *
     * @param request
     *           ListAllFulfillmentOrdersRequest request.
     *
     * @return ListAllFulfillmentOrdersResponse response.
     *
     * @throws FBAOutboundServiceMWSException
     */
    public ListAllFulfillmentOrdersResponse listAllFulfillmentOrders(ListAllFulfillmentOrdersRequest request) 
            throws FBAOutboundServiceMWSException {
        return newResponse(ListAllFulfillmentOrdersResponse.class);
    }

    /**
    * List All Fulfillment Orders
    * Gets the first set of fulfillment orders that are currently being
     *   fulfilled or that were being fulfilled at some time in the past
     *   (as specified by the query parameters). Also returns a NextToken
     *   which can be used iterate through the remaining fulfillment orders
     *   (via the ListAllFulfillmentOrdersByNextToken operation).
     * 
     *   If a NextToken is not returned, it indicates the end-of-data.
     *   
     *   If the QueryStartDateTime is set, the results will include all orders
     *   currently being fulfilled, and all orders that were being fulfilled
     *   since that date and time.
    *
    * @param request
    *           ListAllFulfillmentOrdersRequest request.
    *
    * @return Future<ListAllFulfillmentOrdersResponse> Future containing completed response
    *
    * @throws FBAOutboundServiceMWSException
    */
    public Future<ListAllFulfillmentOrdersResponse> listAllFulfillmentOrdersAsync(ListAllFulfillmentOrdersRequest request) {
        return newFuture(listAllFulfillmentOrders(request));
    }

    /**
     * List All Fulfillment Orders By Next Token
     * Gets the next set of fulfillment orders that are currently being
     *   being fulfilled or that were being fulfilled at some time in the
     *   past.
     * 
     *   If a NextToken is not returned, it indicates the end-of-data.
     *
     * @param request
     *           ListAllFulfillmentOrdersByNextTokenRequest request.
     *
     * @return ListAllFulfillmentOrdersByNextTokenResponse response.
     *
     * @throws FBAOutboundServiceMWSException
     */
    public ListAllFulfillmentOrdersByNextTokenResponse listAllFulfillmentOrdersByNextToken(ListAllFulfillmentOrdersByNextTokenRequest request) 
            throws FBAOutboundServiceMWSException {
        return newResponse(ListAllFulfillmentOrdersByNextTokenResponse.class);
    }

    /**
    * List All Fulfillment Orders By Next Token
    * Gets the next set of fulfillment orders that are currently being
     *   being fulfilled or that were being fulfilled at some time in the
     *   past.
     * 
     *   If a NextToken is not returned, it indicates the end-of-data.
    *
    * @param request
    *           ListAllFulfillmentOrdersByNextTokenRequest request.
    *
    * @return Future<ListAllFulfillmentOrdersByNextTokenResponse> Future containing completed response
    *
    * @throws FBAOutboundServiceMWSException
    */
    public Future<ListAllFulfillmentOrdersByNextTokenResponse> listAllFulfillmentOrdersByNextTokenAsync(ListAllFulfillmentOrdersByNextTokenRequest request) {
        return newFuture(listAllFulfillmentOrdersByNextToken(request));
    }

    /**
     * Update Fulfillment Order
     * The SellerFulfillmentOrderId must be the order ID of the original
     *     order that needs to be updated.
     * 
     *   This DisplayableOrderDateTime will appear as the "order date" in
     *   recipient-facing materials such as the packing slip.  The format
     *   must be timestamp.
     * 
     *   The DisplayableOrderId will appear as the "order id" in those
     *   materials, and the DisplayableOrderComment will appear as well.
     *   
     *   ShippingSpeedCategory is the Service Level Agreement for how long it
     *   will take a shipment to be transported from the fulfillment center
     *   to the recipient, once shipped. no default.
     *   The following shipping speeds are available for US domestic:
     *    * Standard, 3-5 business days
     *    * Expedited, 2 business days
     *    * Priority, 1 business day
     * 
     *   Shipping speeds may vary elsewhere.  Please consult your manual for published SLAs.
     * 
     * 
     *   DestinationAddress is the address the items will be shipped to.
     *   
     *   FulfillmentAction indicates whether an order will be held or shipped. 
     *   Default is Hold. 
     *   * Hold if the order needs to be held but does not need to be shipped. 
     *   * Ship if the order is to be fulfilled and shipped out to the customer
     *   immediately. 
     * 
     *   FulfillmentPolicy indicates how unfulfillable items should be 
     *   handled. default is FillOrKill.
     *    * FillOrKill if any item is determined to be unfulfillable
     *      before any items have started shipping, the entire order is
     *      considered unfulfillable.  Once any part of the order has
     *      started shipping, as much of the order as possible will be
     *      shipped.
     *    * FillAll never consider any item unfulfillable.  Items must
     *      either be fulfilled or merchant-cancelled.
     *    * FillAllAvailable fulfill as much of the order as possible.
     *   
     *   NotificationEmailList can be used to provide a list of e-mail 
     *   addresses to receive ship-complete e-mail notifications. These 
     *   e-mails are customer-facing e-mails sent by FBA on behalf of 
     *   the seller.
     *
     * @param request
     *           UpdateFulfillmentOrderRequest request.
     *
     * @return UpdateFulfillmentOrderResponse response.
     *
     * @throws FBAOutboundServiceMWSException
     */
    public UpdateFulfillmentOrderResponse updateFulfillmentOrder(UpdateFulfillmentOrderRequest request) 
            throws FBAOutboundServiceMWSException {
        return newResponse(UpdateFulfillmentOrderResponse.class);
    }

    /**
    * Update Fulfillment Order
    * The SellerFulfillmentOrderId must be the order ID of the original
     *     order that needs to be updated.
     * 
     *   This DisplayableOrderDateTime will appear as the "order date" in
     *   recipient-facing materials such as the packing slip.  The format
     *   must be timestamp.
     * 
     *   The DisplayableOrderId will appear as the "order id" in those
     *   materials, and the DisplayableOrderComment will appear as well.
     *   
     *   ShippingSpeedCategory is the Service Level Agreement for how long it
     *   will take a shipment to be transported from the fulfillment center
     *   to the recipient, once shipped. no default.
     *   The following shipping speeds are available for US domestic:
     *    * Standard, 3-5 business days
     *    * Expedited, 2 business days
     *    * Priority, 1 business day
     * 
     *   Shipping speeds may vary elsewhere.  Please consult your manual for published SLAs.
     * 
     * 
     *   DestinationAddress is the address the items will be shipped to.
     *   
     *   FulfillmentAction indicates whether an order will be held or shipped. 
     *   Default is Hold. 
     *   * Hold if the order needs to be held but does not need to be shipped. 
     *   * Ship if the order is to be fulfilled and shipped out to the customer
     *   immediately. 
     * 
     *   FulfillmentPolicy indicates how unfulfillable items should be 
     *   handled. default is FillOrKill.
     *    * FillOrKill if any item is determined to be unfulfillable
     *      before any items have started shipping, the entire order is
     *      considered unfulfillable.  Once any part of the order has
     *      started shipping, as much of the order as possible will be
     *      shipped.
     *    * FillAll never consider any item unfulfillable.  Items must
     *      either be fulfilled or merchant-cancelled.
     *    * FillAllAvailable fulfill as much of the order as possible.
     *   
     *   NotificationEmailList can be used to provide a list of e-mail 
     *   addresses to receive ship-complete e-mail notifications. These 
     *   e-mails are customer-facing e-mails sent by FBA on behalf of 
     *   the seller.
    *
    * @param request
    *           UpdateFulfillmentOrderRequest request.
    *
    * @return Future<UpdateFulfillmentOrderResponse> Future containing completed response
    *
    * @throws FBAOutboundServiceMWSException
    */
    public Future<UpdateFulfillmentOrderResponse> updateFulfillmentOrderAsync(UpdateFulfillmentOrderRequest request) {
        return newFuture(updateFulfillmentOrder(request));
    }

}
