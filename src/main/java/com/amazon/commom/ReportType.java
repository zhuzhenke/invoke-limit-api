package com.amazon.commom;

public enum ReportType {

    /**
     * 在售商品报告
     * "在售"、"禁止显示"、"在售(商品信息质量警告)"、"不可售（缺货）"会被找出来,"不可售（停售）"的不会被找出来
     */
    _GET_MERCHANT_LISTINGS_DATA_,

    /**
     * 可售商品报告
     * "在售"、"在售(商品信息质量警告)"、"禁止显示"会被找出来,"不可售（停售）"、"不可售（缺货）"的不会被找出来
     */
    _GET_MERCHANT_LISTINGS_DATA_BACK_COMPAT_,


    /**
     * 商品信息质量报告 （“商品信息质量和阻止上传的商品信息报告”）
     * "禁止显示"、"在售(商品信息质量警告)"会被找出来，但是商品"不可售（停售)"、"不可售（缺货）"、"在售"的不会找出来
     */
    _GET_MERCHANT_LISTINGS_DEFECT_DATA_,

    /**
     * 可售商品报告 （“库存报告”）
     */
    _GET_FLAT_FILE_OPEN_LISTINGS_DATA_,

    /**
     * 可售商品报告精简版
     */
    _GET_MERCHANT_LISTINGS_DATA_LITE_,

    /**
     * 可售商品报告精简升级版
     */
    _GET_MERCHANT_LISTINGS_DATA_LITER_,

    /**
     * 已售商品报告
     */
    _GET_CONVERGED_FLAT_FILE_SOLD_LISTINGS_DATA_,

    /**
     * 可售商品报告精简版[只有sku	asin	price	quantity,包含库存为0的商品]
     * _GET_MERCHANT_LISTINGS_DATA_LITE_
     * 暂时不优化
     */

    /**
     * 返回买家对您的业绩的负面和中性反馈（1 到 3 星）
     */
    _GET_SELLER_FEEDBACK_DATA_,

}
