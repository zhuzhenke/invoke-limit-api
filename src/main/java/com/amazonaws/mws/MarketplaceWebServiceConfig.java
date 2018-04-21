/******************************************************************************* 
 *  Copyright 2009 Amazon Services.
 *  Licensed under the Apache License, Version 2.0 (the "License"); 
 *  
 *  You may not use this file except in compliance with the License. 
 *  You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 *  This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 *  CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 *  specific language governing permissions and limitations under the License.
 * ***************************************************************************** 
 *
 *  Marketplace Web Service Java Library
 *  API Version: 2009-01-01
 *  Generated: Tue Feb 03 15:59:58 PST 2009 
 * 
 */





package com.amazonaws.mws;

/**
 * Configuration for accessing Marketplace Web Service  service
 */
public class MarketplaceWebServiceConfig {
    public enum ProxyProtocol  { HTTP, HTTPS };
    
    private int connectionTimeout = 50000;
    private int socketTimeout = 50000;
    private String serviceVersion = "2009-01-01";
    private String serviceURL = null;
    private String userAgent = null;
    private String signatureMethod = "HmacSHA256";
    private String proxyHost = null;
    private ProxyProtocol  proxyProtocol = null;
    private int proxyPort = -1;
    private String proxyUsername = null;
    private String proxyPassword = null;
    private int maxErrorRetry = 3;
    private int maxAsyncThreads = 30;
    private int maxAsyncQueueSize = maxAsyncThreads * 10;
    
  
    /**
     * Gets Version of the API
     *
     * @return Version of the Service
     */
    public String getServiceVersion() {
        return serviceVersion;
    }

    /**
     * Gets ConnectionTimeout property
     *
     * @return Connection Timeout for establishing connections
     */
    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    /**
     * Sets ConnectionTimeout property
     *
     * @param connectionTimeout Timeout until connection is established
     */
    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    /**
     * Sets ConnectionTimeout property and returns current MarketplaceWebServiceConfig
     *
     * @param connectionTimeout until connection is established
     *
     * @return MarketplaceWebServiceConfig
     */
    public MarketplaceWebServiceConfig withConnectionTimeout(int connectionTimeout) {
        setConnectionTimeout(connectionTimeout);
        return this;
    }

    /**
     * Checks if ConnectionTimeout property is set
     *
     * @return true if ConnectionTimeout property is set
     */
    public boolean isSetConnectionTimeout() {
        return true;
    }

    /**
     * Gets SocketTimeout property
     *
     * @return Socket Timeout for waiting for data
     */
    public int getSoTimeout() {
        return socketTimeout;
    }

    /**
     * Sets SocketTimeout property
     *
     * @param socketTimeout Timeout for waiting for data
     */
    public void setSoTimeout(int socketTimeout) {
        this.socketTimeout = socketTimeout;
    }

    /**
     * Sets SocketTimeout property and returns current MarketplaceWebServiceConfig
     *
     * @param socketTimeout for waiting for data
     *
     * @return MarketplaceWebServiceConfig
     */
    public MarketplaceWebServiceConfig withSoTimeout(int socketTimeout) {
    	setSoTimeout(socketTimeout);
        return this;
    }

    /**
     * Checks if SocketTimeout property is set
     *
     * @return true if SocketTimeout property is set
     */
    public boolean isSetSoTimeout() {
        return true;
    }

    /**
     * Gets SignatureMethod property
     *
     * @return Signature Method for signing requests
     */
    public String getSignatureMethod() {
        return signatureMethod;
    }

    /**
     * Sets SignatureMethod property
     *
     * @param signatureMethod Signature Method for signing requests
     */
    public void setSignatureMethod(String signatureMethod) {
        this.signatureMethod = signatureMethod;
    }

    /**
     * Sets SignatureMethod property and returns current MarketplaceWebServiceConfig
     *
     * @param signatureMethod Signature Method for signing requests
     *
     * @return MarketplaceWebServiceConfig
     */
    public MarketplaceWebServiceConfig withSignatureMethod(String signatureMethod) {
        setSignatureMethod(signatureMethod);
        return this;
    }

    /**
     * Checks if SignatureMethod property is set
     *
     * @return true if SignatureMethod property is set
     */
    public boolean isSetSignatureMethod() {
        return true;
    }

    /**
     * Gets UserAgent property
     *
     * @return User Agent String to use when sending request
     */
    public String getUserAgent() {
        return userAgent;
    }
    
    /**
     * Sets UserAgent property
     *
     * @param userAgent User Agent String to use when sending request
     *
     */
    public void setUserAgent(
    		String applicationName, 
    		String applicationVersion, 
    		String programmingLanguage, 
    		String... additionalNameValuePairs) {
    	if(applicationName==null) throw new IllegalArgumentException(
    			"applicationName cannot be NULL");
    	if(applicationVersion==null) throw new IllegalArgumentException(
    			"applicationVersion cannot be NULL");
    	if(programmingLanguage==null) throw new IllegalArgumentException(
    			"programmingLanguage cannot be NULL");
    	if(additionalNameValuePairs.length % 2 != 0) throw new IllegalArgumentException(
    			"there must be a matching value for every name you pass in");
    	StringBuilder b = new StringBuilder();
    	b.append(applicationName);
    	b.append("/");
    	b.append(applicationVersion);
    	b.append(" (Language=");
    	b.append(programmingLanguage);
    	int i=0;
    	while(i<additionalNameValuePairs.length) {
    		String name = additionalNameValuePairs[i];
    		String value = additionalNameValuePairs[i+1];
    		b.append("; ");
    		b.append(name);
    		b.append("=");
    		b.append(value);
    		i+=2;
    	}
    	b.append(")");
        this.userAgent = b.toString();
    }
    
    /**
     * Sets UserAgent property and returns current MarketplaceWebServiceConfig
     *
     * @param userAgent User Agent String to use when sending request
     *
     * @return MarketplaceWebServiceConfig
     */
    public MarketplaceWebServiceConfig withUserAgent(
            String applicationName, 
            String applicationVersion, 
            String programmingLanguage, 
            String... additionalNameValuePairs) {
        setUserAgent(
                applicationName, 
                applicationVersion, 
                programmingLanguage, 
                additionalNameValuePairs);
        return this;
    }
    
    /**
     * Checks if UserAgent property is set
     *
     * @return true if UserAgent property is set
     */
    public boolean isSetUserAgent() {
        return this.userAgent != null;
    }
    
    /**
     * Gets ServiceURL property
     *
     * @return Service Endpoint URL
     */
    public String getServiceURL() {
        return serviceURL;
    }
    
    /**
     * Sets ServiceURL property
     *
     * @param serviceURL Service Endpoint URL
     *
     */
    public void setServiceURL(String serviceURL) {
        this.serviceURL = serviceURL;
    }
    
    /**
     * Sets ServiceURL property and returns current MarketplaceWebServiceConfig
     *
     * @param serviceURL Service Endpoint URL
     *
     * @return MarketplaceWebServiceConfig
     */
    public MarketplaceWebServiceConfig withServiceURL(String serviceURL) {
        setServiceURL(serviceURL);
        return this;
    }
    
    /**
     * Checks if ServiceURL property is set
     *
     * @return true if ServiceURL property is set
     */
    public boolean isSetServiceURL() {
        return this.serviceURL != null;
    }
    
    /**
     * Gets ProxyHost property
     *
     * @return Proxy Host for connection
     */
    public String getProxyHost() {
        return proxyHost;
    }
    
    /**
     * Sets ProxyHost property
     *
     * @param proxyHost Proxy Host for connection
     *
     */
    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }
    
    /**
     * Sets ProxyHost property and returns current MarketplaceWebServiceConfig
     *
     * @param proxyHost Proxy Host for connection
     *
     * @return MarketplaceWebServiceConfig
     */
    public MarketplaceWebServiceConfig withProxyHost(String proxyHost) {
        setProxyHost(proxyHost);
        return this;
    }
    
    /**
     * Checks if ProxyHost property is set
     *
     * @return true if ProxyHost property is set
     */
    public boolean isSetProxyHost() {
        return this.proxyHost != null;
    }
    
    /**
     * Gets ProxyProtocol property
     *
     * @return Proxy Protocol for connection
     */
    public ProxyProtocol getProxyProtocol() {
        return proxyProtocol;
    }
    
    /**
     * Sets ProxyProtocol property
     *
     * @param proxyProtocol Proxy Protocol for connection
     *
     */
    public void setProxyProtocol(ProxyProtocol proxyProtocol) {
        this.proxyProtocol = proxyProtocol;
    }
    
    /**
     * Sets ProxyProtocol property and returns current MarketplaceWebServiceConfig
     *
     * @param proxyProtocol Proxy Protocol for connection
     *
     * @return MarketplaceWebServiceConfig
     */
    public MarketplaceWebServiceConfig withProxyProtocol(ProxyProtocol proxyProtocol) {
        setProxyProtocol(proxyProtocol);
        return this;
    }
    
    /**
     * Checks if ProxyProtocol property is set
     *
     * @return true if ProxyProtocol property is set
     */
    public boolean isSetProxyProtocol() {
        return this.proxyProtocol != null;
    }
    
    /**
     * Gets ProxyPort property
     *
     * @return Proxy Port for connection
     */
    public int getProxyPort() {
        return proxyPort;
    }
    
    /**
     * Sets ProxyPort property
     *
     * @param proxyPort Proxy Port for connection
     *
     */
    public void setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
    }
    
    /**
     * Sets ProxyPort property and returns current MarketplaceWebServiceConfig
     *
     * @param proxyPort Proxy Port for connection
     *
     * @return MarketplaceWebServiceConfig
     */
    public MarketplaceWebServiceConfig withProxyPort(int proxyPort) {
        setProxyPort(proxyPort);
        return this;
    }
    
    /**
     * Checks if ProxyPort property is set
     *
     * @return true if ProxyPort property is set
     */
    public boolean isSetProxyPort() {
        return this.proxyPort != -1;
    }

    /**
     * Gets ProxyUsername property
     *
     * @return Proxy Username
     */
    public String getProxyUsername() {
        return proxyUsername;
    }

    /**
     * Sets ProxyUsername property
     *
     * @param proxyUsername Proxy Username for connection
     *
     */
    public void setProxyUsername(String proxyUsername) {
        this.proxyUsername = proxyUsername;
    }

    /**
     * Sets ProxyUsername property and returns current MarketplaceWebServiceConfig
     *
     * @param proxyUsername Proxy Username for connection
     *
     * @return MarketplaceWebServiceConfig
     */
    public MarketplaceWebServiceConfig withProxyUsername(String proxyUsername) {
        setProxyUsername(proxyUsername);
        return this;
    }

    /**
     * Checks if ProxyUsername property is set
     *
     * @return true if ProxyUsername property is set
     */
    public boolean isSetProxyUsername() {
        return this.proxyUsername != null;
    }

    /**
     * Gets ProxyPassword property
     *
     * @return Proxy Password
     */
    public String getProxyPassword() {
        return proxyPassword;
    }

    /**
     * Sets ProxyPassword property
     *
     * @param proxyPassword Proxy Password for connection
     *
     */
    public void setProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
    }

    /**
     * Sets ProxyPassword property and returns current MarketplaceWebServiceConfig
     *
     * @param proxyPassword Proxy Password for connection
     *
     * @return MarketplaceWebServiceConfig
     */
    public MarketplaceWebServiceConfig withProxyPassword(String proxyPassword) {
        setProxyPassword(proxyPassword);
        return this;
    }

    /**
     * Checks if ProxyPassword property is set
     *
     * @return true if ProxyPassword property is set
     */
    public boolean isSetProxyPassword() {
        return this.proxyPassword != null;
    }

    /**
     * Gets MaxErrorRetry property
     *
     * @return Max number of retries on 500th errors
     */
    public int getMaxErrorRetry() {
        return maxErrorRetry;
    }

    /**
     * Sets MaxErrorRetry property
     *
     * @param maxErrorRetry Max number of retries on 500th errors
     *
     */
    public void setMaxErrorRetry(int maxErrorRetry) {
        this.maxErrorRetry = maxErrorRetry;
    }

    /**
     * Sets MaxErrorRetry property and returns current MarketplaceWebServiceConfig
     *
     * @param maxErrorRetry Max number of retries on 500th errors
     *
     * @return MarketplaceWebServiceConfig
     */
    public MarketplaceWebServiceConfig withMaxErrorRetry(int maxErrorRetry) {
        setMaxErrorRetry(maxErrorRetry);
        return this;
    }

    /**
     * Checks if MaxErrorRetry property is set
     *
     * @return true if MaxErrorRetry property is set
     */
    public boolean isSetMaxErrorRetry() {
        return this.maxErrorRetry > 0;
    }
    /**
     * Gets MaxAsyncThreads property
     *
     * @return Max number of threads to be used for async operations
     */
    public int getMaxAsyncThreads() {
        return maxAsyncThreads;
    }

    /**
     * Sets MaxAsyncThreads property
     *
     * @param maxAsyncThreads Max number of threads to spawn for async operation.
     * Note, this parameter works in conjuction with MaxAsyncQueueSize. When
     * Max number of threads is reached, requests will be stored in the queue.
     * If queue becomes full, request will be executed on the calling thread.
     *
     * There is not a perfect combination of these two parameters, it will depend
     * on your particular environment. Experiment.
     *
     */
    public void setMaxAsyncThreads(int maxAsyncThreads) {
        this.maxAsyncThreads = maxAsyncThreads;
    }

    /**
     * Sets MaxAsyncThreads property and returns current MarketplaceWebServiceConfig
     *
     * @param maxAsyncThreads Max number of threads to spawn for async operation.
     * Note, this parameter works in conjuction with MaxAsyncQueueSize. When
     * Max number of threads is reached, requests will be stored in the queue.
     *
     * If queue becomes full, request will be executed on the calling thread.
     *
     * There is not a perfect combination of these two parameters, it will depend
     * on your particular environment. Experiment.
     *
     *
     * @return MarketplaceWebServiceConfig
     */
    public MarketplaceWebServiceConfig withMaxAsyncThreads(int maxAsyncThreads) {
        setMaxAsyncThreads(maxAsyncThreads);
        return this;
    }

    /**
     * Checks if MaxAsyncThreads property is set
     *
     * @return true if MaxAsyncThreads property is set
     */
    public boolean isSetMaxAsyncThreads() {
        return this.maxAsyncThreads > 0;
    }

    /**
     * Gets MaxAsyncQueueSize property
     *
     * @return Max number of requests to be queued when max number of threads is
     * reached and all those threads are busy processing.
     */
    public int getMaxAsyncQueueSize() {
        return maxAsyncQueueSize;
    }

    /**
     * Checks if MaxAsyncQueueSize property is set
     *
     * @return true if MaxAsyncQueueSize property is set
     */
    public boolean isSetMaxAsyncQueueSize() {
        return this.maxAsyncQueueSize > 0;
    }

    /**
     * Sets MaxAsyncQueueSize property
     *
     * @param maxAsyncQueueSize Max number of requests to queue when max number of
     * threads is reached, and all threads are busy processing.
     *
     * Note, this parameter works in conjuction with MaxAsyncThreads.
     *
     * When max number of threads is reached and queue is full, request will
     * be executed on the calling thread.
     *
     * There is not a perfect combination of these two parameters, it will depend
     * on your particular environment. Experiment.
     *
     */
    public void setMaxAsyncQueueSize(int maxAsyncQueueSize) {
        this.maxAsyncQueueSize = maxAsyncQueueSize;
    }

    /**
     * Sets MaxAsyncQueueSize property and returns current MarketplaceWebServiceConfig
     *
     * @param maxAsyncQueueSize Max number of requests to queue when max number of
     * threads is reached, and all threads are busy processing.
     *
     * Note, this parameter works in conjuction with MaxAsyncThreads.
     *
     * When max number of threads is reached and queue is full, request will
     * be executed on the calling thread.
     *
     * There is not a perfect combination of these two parameters, it will depend
     * on your particular environment. Experiment.
     *
     */
    public MarketplaceWebServiceConfig withMaxAsyncQueueSize(int maxAsyncQueueSize) {
        setMaxAsyncQueueSize(maxAsyncQueueSize);
        return this;
    }
}
