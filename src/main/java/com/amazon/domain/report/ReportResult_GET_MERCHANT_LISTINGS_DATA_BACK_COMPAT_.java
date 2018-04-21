package com.amazon.domain.report;

import java.util.ArrayList;
import java.util.List;

/**
 * _GET_MERCHANT_LISTINGS_DATA_BACK_COMPAT_
 * 对应报文头的先后顺序
 * item-name	item-description	listing-id	seller-sku	price	quantity	open-date	image-url	item-is-marketplace	product-id-type	zshop-shipping-fee	item-note	item-condition	zshop-category1	zshop-browse-path	zshop-storefront-feature	asin1	asin2	asin3	will-ship-internationally	expedited-shipping	zshop-boldface	product-id	bid-for-featured-placement	add-delete	pending-quantity	merchant-shipping-group
 *
 * @author zhuzhenke
 * @date 2018/03/26
 */
public class ReportResult_GET_MERCHANT_LISTINGS_DATA_BACK_COMPAT_ implements ResolveReportResult {
    private String itemName;
    private String itemDescription;
    private String listingId;
    private String sellerSku;
    private String price;
    private String quantity;
    private String openDate;
    private String imageUrl;
    private String itemIsMarketplace;
    private String productIdType;
    private String zshopShippingFee;
    private String itemNote;
    private String itemCondition;
    private String zshopCategory1;
    private String zshopBrowsePath;
    private String zshopStorefrontFeature;
    private String asin1;
    private String asin2;
    private String asin3;
    private String willShipInternationally;
    private String expeditedShipping;
    private String zshopBoldface;
    private String productId;
    private String bidForFeaturedPlacement;
    private String addDelete;
    private String pendingQuantity;
    private String merchantShippingGroup;

    public String getAddDelete() {
        return addDelete;
    }

    public void setAddDelete(String addDelete) {
        this.addDelete = addDelete;
    }

    public String getAsin1() {
        return asin1;
    }

    public void setAsin1(String asin1) {
        this.asin1 = asin1;
    }

    public String getAsin2() {
        return asin2;
    }

    public void setAsin2(String asin2) {
        this.asin2 = asin2;
    }

    public String getAsin3() {
        return asin3;
    }

    public void setAsin3(String asin3) {
        this.asin3 = asin3;
    }

    public String getBidForFeaturedPlacement() {
        return bidForFeaturedPlacement;
    }

    public void setBidForFeaturedPlacement(String bidForFeaturedPlacement) {
        this.bidForFeaturedPlacement = bidForFeaturedPlacement;
    }

    public String getExpeditedShipping() {
        return expeditedShipping;
    }

    public void setExpeditedShipping(String expeditedShipping) {
        this.expeditedShipping = expeditedShipping;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getItemCondition() {
        return itemCondition;
    }

    public void setItemCondition(String itemCondition) {
        this.itemCondition = itemCondition;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemIsMarketplace() {
        return itemIsMarketplace;
    }

    public void setItemIsMarketplace(String itemIsMarketplace) {
        this.itemIsMarketplace = itemIsMarketplace;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemNote() {
        return itemNote;
    }

    public void setItemNote(String itemNote) {
        this.itemNote = itemNote;
    }

    public String getListingId() {
        return listingId;
    }

    public void setListingId(String listingId) {
        this.listingId = listingId;
    }

    public String getMerchantShippingGroup() {
        return merchantShippingGroup;
    }

    public void setMerchantShippingGroup(String merchantShippingGroup) {
        this.merchantShippingGroup = merchantShippingGroup;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getPendingQuantity() {
        return pendingQuantity;
    }

    public void setPendingQuantity(String pendingQuantity) {
        this.pendingQuantity = pendingQuantity;
    }

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

    public String getProductIdType() {
        return productIdType;
    }

    public void setProductIdType(String productIdType) {
        this.productIdType = productIdType;
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

    public String getWillShipInternationally() {
        return willShipInternationally;
    }

    public void setWillShipInternationally(String willShipInternationally) {
        this.willShipInternationally = willShipInternationally;
    }

    public String getZshopBoldface() {
        return zshopBoldface;
    }

    public void setZshopBoldface(String zshopBoldface) {
        this.zshopBoldface = zshopBoldface;
    }

    public String getZshopBrowsePath() {
        return zshopBrowsePath;
    }

    public void setZshopBrowsePath(String zshopBrowsePath) {
        this.zshopBrowsePath = zshopBrowsePath;
    }

    public String getZshopCategory1() {
        return zshopCategory1;
    }

    public void setZshopCategory1(String zshopCategory1) {
        this.zshopCategory1 = zshopCategory1;
    }

    public String getZshopShippingFee() {
        return zshopShippingFee;
    }

    public void setZshopShippingFee(String zshopShippingFee) {
        this.zshopShippingFee = zshopShippingFee;
    }

    public String getZshopStorefrontFeature() {
        return zshopStorefrontFeature;
    }

    public void setZshopStorefrontFeature(String zshopStorefrontFeature) {
        this.zshopStorefrontFeature = zshopStorefrontFeature;
    }

    @Override
    public List<Object> resolveResult(List<String> resultList) {
        List<Object> reportResultList = new ArrayList<Object>();
        if (resultList == null || resultList.size() <= 1) {
            return reportResultList;
        }
        for (int i = 1; i < resultList.size(); i++) {
            String[] strings = resultList.get(i).split("\t");
            ReportResult_GET_MERCHANT_LISTINGS_DATA_BACK_COMPAT_ object = new ReportResult_GET_MERCHANT_LISTINGS_DATA_BACK_COMPAT_();

            object.setItemName(strings[0]);
            object.setItemDescription(strings[1]);
            object.setListingId(strings[2]);
            object.setSellerSku(strings[3]);
            object.setPrice(strings[4]);
            object.setQuantity(strings[5]);
            object.setOpenDate(strings[6]);
            object.setImageUrl(strings[7]);
            object.setItemIsMarketplace(strings[8]);
            object.setProductIdType(strings[9]);
            object.setZshopShippingFee(strings[10]);
            object.setItemNote(strings[11]);
            object.setItemCondition(strings[12]);
            object.setZshopCategory1(strings[13]);
            object.setZshopBrowsePath(strings[14]);
            object.setZshopStorefrontFeature(strings[15]);
            object.setAsin1(strings[16]);
            object.setAsin2(strings[17]);
            object.setAsin3(strings[18]);
            object.setWillShipInternationally(strings[19]);
            object.setExpeditedShipping(strings[20]);
            object.setZshopBoldface(strings[21]);
            object.setProductId(strings[22]);
            object.setBidForFeaturedPlacement(strings[23]);
            object.setAddDelete(strings[24]);
            object.setPendingQuantity(strings[25]);
            object.setMerchantShippingGroup(strings[26]);

            reportResultList.add(object);
        }

        return reportResultList;
    }
}
