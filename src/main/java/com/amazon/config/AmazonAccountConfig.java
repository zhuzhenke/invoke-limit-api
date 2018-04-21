package com.amazon.config;

/**
 * @author zhuzhenke
 * @date 2018/04/22
 */
public class AmazonAccountConfig {

    private static String applicationName;
    private static String applicationVersion;
    private static String awsAccessKeyId;
    private static String awsSecretAccessKey;

    public static String getApplicationName() {
        return applicationName;
    }

    public static void setApplicationName(String applicationName) {
        AmazonAccountConfig.applicationName = applicationName;
    }

    public static String getApplicationVersion() {
        return applicationVersion;
    }

    public static void setApplicationVersion(String applicationVersion) {
        AmazonAccountConfig.applicationVersion = applicationVersion;
    }

    public static String getAwsAccessKeyId() {
        return awsAccessKeyId;
    }

    public static void setAwsAccessKeyId(String awsAccessKeyId) {
        AmazonAccountConfig.awsAccessKeyId = awsAccessKeyId;
    }

    public static String getAwsSecretAccessKey() {
        return awsSecretAccessKey;
    }

    public static void setAwsSecretAccessKey(String awsSecretAccessKey) {
        AmazonAccountConfig.awsSecretAccessKey = awsSecretAccessKey;
    }
}
