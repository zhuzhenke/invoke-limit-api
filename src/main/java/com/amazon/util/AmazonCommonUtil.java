package com.amazon.util;

import com.amazon.commom.ProcessingStatus;
import com.amazon.commom.ReportType;
import com.amazon.domain.report.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhuzhenke
 * @date 2018/03/26
 */
public class AmazonCommonUtil {
    /**
     * 报告已经完成
     */
    public static boolean isFinishStatus(String processStatus) {
        return ProcessingStatus._CANCELLED_.name().equals(processStatus)
                || ProcessingStatus._DONE_.name().equals(processStatus)
                || ProcessingStatus._DONE_NO_DATA_.name().equals(processStatus);
    }

    /**
     * 报告任务被取消
     */
    public static boolean isCancelledStatus(String processStatus) {
        return ProcessingStatus._CANCELLED_.name().equals(processStatus);
    }

    /**
     * 报告完成且有报告中数据
     */
    public static boolean isFinishHasDataStatus(String processStatus) {
        return ProcessingStatus._DONE_.name().equals(processStatus);
    }

    /**
     * 报告完成且报告没有数据
     */
    public static boolean isFinishNoDataStatus(String processStatus) {
        return ProcessingStatus._DONE_NO_DATA_.name().equals(processStatus);
    }

    public static List<Object> resolveReportResult(String type, List<String> resultList) throws Exception {
        ResolveReportResult resolveReportResult = getResolveReportResult(type);
        return resolveReportResult.resolveResult(resultList);
    }

    private static Map<String, ResolveReportResult> resolveReportResultMap = new HashMap<String, ResolveReportResult>();

    private static ResolveReportResult getResolveReportResult(String type) throws Exception {
        ResolveReportResult resolveReportResult = resolveReportResultMap.get(type);
        if (resolveReportResult == null) {
            if (ReportType._GET_MERCHANT_LISTINGS_DATA_.name().equals(type)) {
                resolveReportResult = new ReportResult_GET_MERCHANT_LISTINGS_DATA_();
                resolveReportResultMap.put(type, resolveReportResult);
            } else if (ReportType._GET_MERCHANT_LISTINGS_DATA_BACK_COMPAT_.name().equals(type)) {
                resolveReportResult = new ReportResult_GET_MERCHANT_LISTINGS_DATA_BACK_COMPAT_();
                resolveReportResultMap.put(type, resolveReportResult);
            } else if (ReportType._GET_MERCHANT_LISTINGS_DEFECT_DATA_.name().equals(type)) {
                resolveReportResult = new ReportResult_GET_MERCHANT_LISTINGS_DEFECT_DATA_();
                resolveReportResultMap.put(type, resolveReportResult);
            } else if (ReportType._GET_FLAT_FILE_OPEN_LISTINGS_DATA_.name().equals(type)) {
                resolveReportResult = new ReportResult_GET_FLAT_FILE_OPEN_LISTINGS_DATA_();
                resolveReportResultMap.put(type, resolveReportResult);
            } else if (ReportType._GET_MERCHANT_LISTINGS_DATA_LITE_.name().equals(type)) {
                resolveReportResult = new ReportResult_GET_MERCHANT_LISTINGS_DATA_LITE_();
                resolveReportResultMap.put(type, resolveReportResult);
            } else if (ReportType._GET_MERCHANT_LISTINGS_DATA_LITER_.name().equals(type)) {
                resolveReportResult = new ReportResult_GET_MERCHANT_LISTINGS_DATA_LITER_();
                resolveReportResultMap.put(type, resolveReportResult);
            } else if (ReportType._GET_CONVERGED_FLAT_FILE_SOLD_LISTINGS_DATA_.name().equals(type)) {
                resolveReportResult = new ReportResult_GET_CONVERGED_FLAT_FILE_SOLD_LISTINGS_DATA_();
                resolveReportResultMap.put(type, resolveReportResult);
            } else if (ReportType._GET_SELLER_FEEDBACK_DATA_.name().equals(type)) {
                resolveReportResult = new ReportResult_GET_SELLER_FEEDBACK_DATA_();
                resolveReportResultMap.put(type, resolveReportResult);
            } else {
                throw new Exception("AmazonCommonUtil.resolveResult() find type is not match");
            }
        }
        return resolveReportResult;
    }

}
