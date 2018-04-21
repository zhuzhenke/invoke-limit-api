package com.amazon.domain.report;

import java.util.List;

/**
 * @author zhuzhenke
 * @date 2018/03/26
 */
public interface ResolveReportResult {
    List<Object> resolveResult(List<String> resultList);
}
