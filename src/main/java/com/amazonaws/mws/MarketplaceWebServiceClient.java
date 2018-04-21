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
 *  Generated: Tue Feb 17 13:31:26 PST 2009 
 * 
 */



package com.amazonaws.mws;

import com.amazonaws.mws.model.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.*;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.CoreProtocolPNames;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.lang.reflect.Method;
import java.net.*;
import java.security.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The Amazon Marketplace Web Service contain APIs for inventory and order management.
 * 
 *
 *
 * MarketplaceWebServiceClient is implementation of MarketplaceWebService based on the
 * Apache <a href="http://jakarta.apache.org/commons/httpclient/">HttpClient</a>.
 *
 */
public  class MarketplaceWebServiceClient implements MarketplaceWebService {

    private final Log log = LogFactory.getLog(MarketplaceWebServiceClient.class);

    private String awsAccessKeyId = null;
    private String awsSecretAccessKey = null;
    private MarketplaceWebServiceConfig config = null;
    
    private HttpClient httpClient = null;
    private CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
    private HttpContext httpContext= null;
    private ExecutorService asyncExecutor;
    
    private List<Header> defaultHeaders = new ArrayList<Header>();
    
    private static JAXBContext  jaxbContext;
    private static ThreadLocal<Unmarshaller> unmarshaller;
    private static Pattern ERROR_PATTERN_ONE = Pattern.compile(".*\\<RequestId>(.*)\\</RequestId>.*\\<Error>" +
            "\\<Code>(.*)\\</Code>\\<Message>(.*)\\</Message>\\</Error>.*(\\<Error>)?.*",
            Pattern.MULTILINE | Pattern.DOTALL);
    private static Pattern ERROR_PATTERN_TWO = Pattern.compile(".*\\<Error>\\<Code>(.*)\\</Code>\\<Message>(.*)" +
            "\\</Message>\\</Error>.*(\\<Error>)?.*\\<RequestID>(.*)\\</RequestID>.*",
            Pattern.MULTILINE | Pattern.DOTALL);
    private static String DEFAULT_ENCODING = "UTF-8";
    /** Initialize JAXBContext and  Unmarshaller **/
    static {
        try {
            jaxbContext = JAXBContext.newInstance("com.amazonaws.mws.model", MarketplaceWebService.class.getClassLoader());
        } catch (JAXBException ex) {
            throw new ExceptionInInitializerError(ex);
        }
        unmarshaller = new ThreadLocal<Unmarshaller>() {
            @Override
            protected synchronized Unmarshaller initialValue() {
                try {
                    return jaxbContext.createUnmarshaller();
                } catch(JAXBException e) {
                    throw new ExceptionInInitializerError(e);
                }
            }
        };
    }


    /**
     * Constructs MarketplaceWebServiceClient with AWS Access Key ID and AWS Secret Key
     *
     * @param awsAccessKeyId
     *          AWS Access Key ID
     * @param awsSecretAccessKey
     *          AWS Secret Access Key
     */
    public  MarketplaceWebServiceClient(
        	String awsAccessKeyId,
    		String awsSecretAccessKey,
    		String applicationName,
    		String applicationVersion) {
        this(	awsAccessKeyId, awsSecretAccessKey, 
        		applicationName, applicationVersion,
        		new MarketplaceWebServiceConfig());
    }

    /**
     * Constructs MarketplaceWebServiceClient with AWS Access Key ID, AWS Secret Key
     * and max number of threads to spawn for async operations
     *
     * @param awsAccessKeyId
     *          AWS Access Key ID
     * @param awsSecretAccessKey
     *          AWS Secret Access Key
     * @param maxAsyncThreads
     *          Max number of threads to spawn for async operation.
     */
    public MarketplaceWebServiceClient(
    		String awsAccessKeyId, 
    		String awsSecretAccessKey,
    		String applicationName,
    		String applicationVersion, 
    		int maxAsyncThreads) {
        this(	awsAccessKeyId, awsSecretAccessKey, 
        		applicationName, applicationVersion,
        		new MarketplaceWebServiceConfig().withMaxAsyncThreads(maxAsyncThreads));
    }



    /**
     * Constructs MarketplaceWebServiceClient with AWS Access Key ID, AWS Secret Key
     * and MarketplaceWebServiceConfig. Use MarketplaceWebServiceConfig to pass additional
     * configuration that affects how service is being called.
     *
     * @param awsAccessKeyId
     *          AWS Access Key ID
     * @param awsSecretAccessKey
     *          AWS Secret Access Key
     * @param config
     *          Additional configuration options
     */
    @SuppressWarnings("serial")
	public  MarketplaceWebServiceClient(
    		String awsAccessKeyId,
    		String awsSecretAccessKey,
    		String applicationName,
    		String applicationVersion,
            MarketplaceWebServiceConfig config) {
        this.awsAccessKeyId = awsAccessKeyId;
        this.awsSecretAccessKey = awsSecretAccessKey;
        this.config = config;
        this.httpClient = configureHttpClient(applicationName, applicationVersion);
        this.asyncExecutor = new ThreadPoolExecutor(config.getMaxAsyncThreads(),
                config.getMaxAsyncThreads(), 60L, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(config.getMaxAsyncQueueSize()) {

                    @Override
                    public boolean offer(Runnable task) {
                        log.debug("Maximum number of concurrent threads reached, queuing task...");
                        return super.offer(task);
                    }
                },
                new ThreadFactory() {

                    private final AtomicInteger threadNumber = new AtomicInteger(1);

                    public Thread newThread(Runnable task) {
                        Thread thread = new Thread(task, "MarketplaceWebServiceClient-Thread-" +
                                threadNumber.getAndIncrement());
                        thread.setDaemon(true);
                        if (thread.getPriority() != Thread.NORM_PRIORITY) {
                            thread.setPriority(Thread.NORM_PRIORITY);
                        }
                        log.debug("ThreadFactory created new thread: " + thread.getName());
                        return thread;
                    }
                },
                new RejectedExecutionHandler() {

                    public void rejectedExecution(Runnable task, ThreadPoolExecutor executor) {
                        log.debug("Maximum number of concurrent threads reached, and queue is full. " +
                                "Running task in the calling thread..." + Thread.currentThread().getName());
                        if (!executor.isShutdown()) {
                            task.run();
                        }
                    }
                });
    }

    // Public API ------------------------------------------------------------//


        
    /**
     * Get Report 
     *
     * The GetReport operation returns the contents of a report. Reports can potentially be
     * very large (>100MB) which is why we only return one report at a time, and in a
     * streaming fashion.
     * 
     * @param request
     *          GetReportRequest request
     * @return
     *          GetReport Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportResponse getReport(GetReportRequest request) throws MarketplaceWebServiceException {
        return invoke(GetReportResponse.class, convertGetReport(request), request);
    }

    /**
     * Non-blocking Get Report 
     * <p/>
     * Returns <code>future</code> pointer to GetReportResponse
     * <p/>
     * If response is ready, call to <code>future.get()</code> 
     * will return GetReportResponse. 
     * <p/>
     * If response is not ready, call to <code>future.get()</code> will block the 
     * calling thread until response is returned. 
     * <p/>
     * Note, <code>future.get()</code> will throw wrapped runtime exception. 
     * <p/>
     * If service error has occured, MarketplaceWebServiceException can be extracted with
     * <code>exception.getCause()</code>
     * <p/>
     * Usage example for parallel processing:
     * <pre>
     *
     *  List&lt;Future&lt;GetReportResponse&gt;&gt; responses = new ArrayList&lt;Future&lt;GetReportResponse&gt;&gt;();
     *  for (GetReportRequest request : requests) {
     *      responses.add(client.getReportAsync(request));
     *  }
     *  for (Future&lt;GetReportResponse&gt; future : responses) {
     *      while (!future.isDone()) {
     *          Thread.yield();
     *      }
     *      try {
     *          GetReportResponse response = future.get();
     *      // use response
     *      } catch (Exception e) {
     *          if (e instanceof MarketplaceWebServiceException) {
     *              MarketplaceWebServiceException exception = MarketplaceWebServiceException.class.cast(e);
     *          // handle MarketplaceWebServiceException
     *          } else {
     *          // handle other exceptions
     *          }
     *      }
     *  }
     * </pre>
     *
     * @param request
     *          GetReportRequest request
     * @return Future&lt;GetReportResponse&gt; future pointer to GetReportResponse
     * 
     */
    public Future<GetReportResponse> getReportAsync(final GetReportRequest request) {
        Future<GetReportResponse> response = asyncExecutor.submit(new Callable<GetReportResponse>() {

            public GetReportResponse call() throws MarketplaceWebServiceException {
                return getReport(request);
            }
            });
        return response;
    }
        
    /**
     * Get Report Schedule Count 
     *
     * returns the number of report schedules
     * 
     * @param request
     *          GetReportScheduleCountRequest request
     * @return
     *          GetReportScheduleCount Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportScheduleCountResponse getReportScheduleCount(GetReportScheduleCountRequest request) throws MarketplaceWebServiceException {
        return invoke(GetReportScheduleCountResponse.class, convertGetReportScheduleCount(request));
    }

    /**
     * Non-blocking Get Report Schedule Count 
     * <p/>
     * Returns <code>future</code> pointer to GetReportScheduleCountResponse
     * <p/>
     * If response is ready, call to <code>future.get()</code> 
     * will return GetReportScheduleCountResponse. 
     * <p/>
     * If response is not ready, call to <code>future.get()</code> will block the 
     * calling thread until response is returned. 
     * <p/>
     * Note, <code>future.get()</code> will throw wrapped runtime exception. 
     * <p/>
     * If service error has occured, MarketplaceWebServiceException can be extracted with
     * <code>exception.getCause()</code>
     * <p/>
     * Usage example for parallel processing:
     * <pre>
     *
     *  List&lt;Future&lt;GetReportScheduleCountResponse&gt;&gt; responses = new ArrayList&lt;Future&lt;GetReportScheduleCountResponse&gt;&gt;();
     *  for (GetReportScheduleCountRequest request : requests) {
     *      responses.add(client.getReportScheduleCountAsync(request));
     *  }
     *  for (Future&lt;GetReportScheduleCountResponse&gt; future : responses) {
     *      while (!future.isDone()) {
     *          Thread.yield();
     *      }
     *      try {
     *          GetReportScheduleCountResponse response = future.get();
     *      // use response
     *      } catch (Exception e) {
     *          if (e instanceof MarketplaceWebServiceException) {
     *              MarketplaceWebServiceException exception = MarketplaceWebServiceException.class.cast(e);
     *          // handle MarketplaceWebServiceException
     *          } else {
     *          // handle other exceptions
     *          }
     *      }
     *  }
     * </pre>
     *
     * @param request
     *          GetReportScheduleCountRequest request
     * @return Future&lt;GetReportScheduleCountResponse&gt; future pointer to GetReportScheduleCountResponse
     * 
     */
    public Future<GetReportScheduleCountResponse> getReportScheduleCountAsync(final GetReportScheduleCountRequest request) {
        Future<GetReportScheduleCountResponse> response = asyncExecutor.submit(new Callable<GetReportScheduleCountResponse>() {

            public GetReportScheduleCountResponse call() throws MarketplaceWebServiceException {
                return getReportScheduleCount(request);
            }
            });
        return response;
    }
        
    /**
     * Get Report Request List By Next Token 
     *
     * retrieve the next batch of list items and if there are more items to retrieve
     * 
     * @param request
     *          GetReportRequestListByNextTokenRequest request
     * @return
     *          GetReportRequestListByNextToken Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportRequestListByNextTokenResponse getReportRequestListByNextToken(GetReportRequestListByNextTokenRequest request) throws MarketplaceWebServiceException {
        return invoke(GetReportRequestListByNextTokenResponse.class, convertGetReportRequestListByNextToken(request));
    }

    /**
     * Non-blocking Get Report Request List By Next Token 
     * <p/>
     * Returns <code>future</code> pointer to GetReportRequestListByNextTokenResponse
     * <p/>
     * If response is ready, call to <code>future.get()</code> 
     * will return GetReportRequestListByNextTokenResponse. 
     * <p/>
     * If response is not ready, call to <code>future.get()</code> will block the 
     * calling thread until response is returned. 
     * <p/>
     * Note, <code>future.get()</code> will throw wrapped runtime exception. 
     * <p/>
     * If service error has occured, MarketplaceWebServiceException can be extracted with
     * <code>exception.getCause()</code>
     * <p/>
     * Usage example for parallel processing:
     * <pre>
     *
     *  List&lt;Future&lt;GetReportRequestListByNextTokenResponse&gt;&gt; responses = new ArrayList&lt;Future&lt;GetReportRequestListByNextTokenResponse&gt;&gt;();
     *  for (GetReportRequestListByNextTokenRequest request : requests) {
     *      responses.add(client.getReportRequestListByNextTokenAsync(request));
     *  }
     *  for (Future&lt;GetReportRequestListByNextTokenResponse&gt; future : responses) {
     *      while (!future.isDone()) {
     *          Thread.yield();
     *      }
     *      try {
     *          GetReportRequestListByNextTokenResponse response = future.get();
     *      // use response
     *      } catch (Exception e) {
     *          if (e instanceof MarketplaceWebServiceException) {
     *              MarketplaceWebServiceException exception = MarketplaceWebServiceException.class.cast(e);
     *          // handle MarketplaceWebServiceException
     *          } else {
     *          // handle other exceptions
     *          }
     *      }
     *  }
     * </pre>
     *
     * @param request
     *          GetReportRequestListByNextTokenRequest request
     * @return Future&lt;GetReportRequestListByNextTokenResponse&gt; future pointer to GetReportRequestListByNextTokenResponse
     * 
     */
    public Future<GetReportRequestListByNextTokenResponse> getReportRequestListByNextTokenAsync(final GetReportRequestListByNextTokenRequest request) {
        Future<GetReportRequestListByNextTokenResponse> response = asyncExecutor.submit(new Callable<GetReportRequestListByNextTokenResponse>() {

            public GetReportRequestListByNextTokenResponse call() throws MarketplaceWebServiceException {
                return getReportRequestListByNextToken(request);
            }
            });
        return response;
    }
        
    /**
     * Update Report Acknowledgements 
     *
     * The UpdateReportAcknowledgements operation updates the acknowledged status of one or more reports.
     * 
     * @param request
     *          UpdateReportAcknowledgementsRequest request
     * @return
     *          UpdateReportAcknowledgements Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public UpdateReportAcknowledgementsResponse updateReportAcknowledgements(UpdateReportAcknowledgementsRequest request) throws MarketplaceWebServiceException {
        return invoke(UpdateReportAcknowledgementsResponse.class, convertUpdateReportAcknowledgements(request));
    }

    /**
     * Non-blocking Update Report Acknowledgements 
     * <p/>
     * Returns <code>future</code> pointer to UpdateReportAcknowledgementsResponse
     * <p/>
     * If response is ready, call to <code>future.get()</code> 
     * will return UpdateReportAcknowledgementsResponse. 
     * <p/>
     * If response is not ready, call to <code>future.get()</code> will block the 
     * calling thread until response is returned. 
     * <p/>
     * Note, <code>future.get()</code> will throw wrapped runtime exception. 
     * <p/>
     * If service error has occured, MarketplaceWebServiceException can be extracted with
     * <code>exception.getCause()</code>
     * <p/>
     * Usage example for parallel processing:
     * <pre>
     *
     *  List&lt;Future&lt;UpdateReportAcknowledgementsResponse&gt;&gt; responses = new ArrayList&lt;Future&lt;UpdateReportAcknowledgementsResponse&gt;&gt;();
     *  for (UpdateReportAcknowledgementsRequest request : requests) {
     *      responses.add(client.updateReportAcknowledgementsAsync(request));
     *  }
     *  for (Future&lt;UpdateReportAcknowledgementsResponse&gt; future : responses) {
     *      while (!future.isDone()) {
     *          Thread.yield();
     *      }
     *      try {
     *          UpdateReportAcknowledgementsResponse response = future.get();
     *      // use response
     *      } catch (Exception e) {
     *          if (e instanceof MarketplaceWebServiceException) {
     *              MarketplaceWebServiceException exception = MarketplaceWebServiceException.class.cast(e);
     *          // handle MarketplaceWebServiceException
     *          } else {
     *          // handle other exceptions
     *          }
     *      }
     *  }
     * </pre>
     *
     * @param request
     *          UpdateReportAcknowledgementsRequest request
     * @return Future&lt;UpdateReportAcknowledgementsResponse&gt; future pointer to UpdateReportAcknowledgementsResponse
     * 
     */
    public Future<UpdateReportAcknowledgementsResponse> updateReportAcknowledgementsAsync(final UpdateReportAcknowledgementsRequest request) {
        Future<UpdateReportAcknowledgementsResponse> response = asyncExecutor.submit(new Callable<UpdateReportAcknowledgementsResponse>() {

            public UpdateReportAcknowledgementsResponse call() throws MarketplaceWebServiceException {
                return updateReportAcknowledgements(request);
            }
            });
        return response;
    }
        
    /**
     * Submit Feed 
     *
     * Uploads a file for processing together with the necessary
     * metadata to process the file, such as which type of feed it is.
     * PurgeAndReplace if true means that your existing e.g. inventory is
     * wiped out and replace with the contents of this feed - use with
     * caution (the default is false).
     * 
     * @param request
     *          SubmitFeedRequest request
     * @return
     *          SubmitFeed Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public SubmitFeedResponse submitFeed(SubmitFeedRequest request) throws MarketplaceWebServiceException {
        return invoke(SubmitFeedResponse.class, convertSubmitFeed(request), request);
    }


    /**
     * Non-blocking Submit Feed 
     * <p/>
     * Returns <code>future</code> pointer to SubmitFeedResponse
     * <p/>
     * If response is ready, call to <code>future.get()</code> 
     * will return SubmitFeedResponse. 
     * <p/>
     * If response is not ready, call to <code>future.get()</code> will block the 
     * calling thread until response is returned. 
     * <p/>
     * Note, <code>future.get()</code> will throw wrapped runtime exception. 
     * <p/>
     * If service error has occured, MarketplaceWebServiceException can be extracted with
     * <code>exception.getCause()</code>
     * <p/>
     * Usage example for parallel processing:
     * <pre>
     *
     *  List&lt;Future&lt;SubmitFeedResponse&gt;&gt; responses = new ArrayList&lt;Future&lt;SubmitFeedResponse&gt;&gt;();
     *  for (SubmitFeedRequest request : requests) {
     *      responses.add(client.submitFeedAsync(request));
     *  }
     *  for (Future&lt;SubmitFeedResponse&gt; future : responses) {
     *      while (!future.isDone()) {
     *          Thread.yield();
     *      }
     *      try {
     *          SubmitFeedResponse response = future.get();
     *      // use response
     *      } catch (Exception e) {
     *          if (e instanceof MarketplaceWebServiceException) {
     *              MarketplaceWebServiceException exception = MarketplaceWebServiceException.class.cast(e);
     *          // handle MarketplaceWebServiceException
     *          } else {
     *          // handle other exceptions
     *          }
     *      }
     *  }
     * </pre>
     *
     * @param request
     *          SubmitFeedRequest request
     * @return Future&lt;SubmitFeedResponse&gt; future pointer to SubmitFeedResponse
     * 
     */
    public Future<SubmitFeedResponse> submitFeedAsync(final SubmitFeedRequest request) {
        Future<SubmitFeedResponse> response = asyncExecutor.submit(new Callable<SubmitFeedResponse>() {

            public SubmitFeedResponse call() throws MarketplaceWebServiceException {
                return submitFeed(request);
            }
            });
        return response;
    }
    
    /**
     * Submit Feed From File
     *
     * Uploads a file from disk for processing together with the necessary
     * metadata to process the file, such as which type of feed it is.
     * PurgeAndReplace if true means that your existing e.g. inventory is
     * wiped out and replace with the contents of this feed - use with
     * caution (the default is false).
     * 
     * This function assumes the Content MD5 value is unset in the request, and will
     * set it before making the Submit Feed request. The Feed Content must be stored
     * on disk, as the assumption is that the content is accessed through
     * a FileInputStream.
     * 
     * @param request
     *          SubmitFeedRequest request without the contentMd5 field set.
     * @return
     *          SubmitFeed Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public SubmitFeedResponse submitFeedFromFile( SubmitFeedRequest request )
      throws MarketplaceWebServiceException {
        
        try {
            String contentMd5 = computeContentMD5HeaderValue( (FileInputStream)request.getFeedContent() );
            request.setContentMD5( contentMd5 );
        }
        catch( Throwable t ) {
            throw new MarketplaceWebServiceException( t );
        }
        
        return submitFeed( request );
    }
    
    /**
     * Non-blocking Submit Feed From File 
     * <p/>
     * Returns <code>future</code> pointer to SubmitFeedResponse
     * <p/>
     * If response is ready, call to <code>future.get()</code> 
     * will return SubmitFeedResponse. 
     * <p/>
     * If response is not ready, call to <code>future.get()</code> will block the 
     * calling thread until response is returned. 
     * <p/>
     * Note, <code>future.get()</code> will throw wrapped runtime exception. 
     * <p/>
     * If service error has occured, MarketplaceWebServiceException can be extracted with
     * <code>exception.getCause()</code>
     * <p/>
     * Usage example for parallel processing:
     * <pre>
     *
     *  List&lt;Future&lt;SubmitFeedResponse&gt;&gt; responses = new ArrayList&lt;Future&lt;SubmitFeedResponse&gt;&gt;();
     *  for (SubmitFeedRequest request : requests) {
     *      responses.add(client.submitFeedFromFileAsync(request));
     *  }
     *  for (Future&lt;SubmitFeedResponse&gt; future : responses) {
     *      while (!future.isDone()) {
     *          Thread.yield();
     *      }
     *      try {
     *          SubmitFeedResponse response = future.get();
     *      // use response
     *      } catch (Exception e) {
     *          if (e instanceof MarketplaceWebServiceException) {
     *              MarketplaceWebServiceException exception = MarketplaceWebServiceException.class.cast(e);
     *          // handle MarketplaceWebServiceException
     *          } else {
     *          // handle other exceptions
     *          }
     *      }
     *  }
     * </pre>
     *
     * @param request
     *          SubmitFeedRequest request
     * @return Future&lt;SubmitFeedResponse&gt; future pointer to SubmitFeedResponse
     * 
     */
    public Future<SubmitFeedResponse> submitFeedFromFileAsync(final SubmitFeedRequest request) {
        Future<SubmitFeedResponse> response = asyncExecutor.submit(new Callable<SubmitFeedResponse>() {

            public SubmitFeedResponse call() throws MarketplaceWebServiceException { 
                return submitFeedFromFile( request );
            }
            });
        return response;
    }
        
    /**
     * Get Report Count 
     *
     * returns a count of reports matching your criteria;
     * by default, the number of reports generated in the last 90 days,
     * regardless of acknowledgment status
     * 
     * @param request
     *          GetReportCountRequest request
     * @return
     *          GetReportCount Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportCountResponse getReportCount(GetReportCountRequest request) throws MarketplaceWebServiceException {
        return invoke(GetReportCountResponse.class, convertGetReportCount(request));
    }

    /**
     * Non-blocking Get Report Count 
     * <p/>
     * Returns <code>future</code> pointer to GetReportCountResponse
     * <p/>
     * If response is ready, call to <code>future.get()</code> 
     * will return GetReportCountResponse. 
     * <p/>
     * If response is not ready, call to <code>future.get()</code> will block the 
     * calling thread until response is returned. 
     * <p/>
     * Note, <code>future.get()</code> will throw wrapped runtime exception. 
     * <p/>
     * If service error has occured, MarketplaceWebServiceException can be extracted with
     * <code>exception.getCause()</code>
     * <p/>
     * Usage example for parallel processing:
     * <pre>
     *
     *  List&lt;Future&lt;GetReportCountResponse&gt;&gt; responses = new ArrayList&lt;Future&lt;GetReportCountResponse&gt;&gt;();
     *  for (GetReportCountRequest request : requests) {
     *      responses.add(client.getReportCountAsync(request));
     *  }
     *  for (Future&lt;GetReportCountResponse&gt; future : responses) {
     *      while (!future.isDone()) {
     *          Thread.yield();
     *      }
     *      try {
     *          GetReportCountResponse response = future.get();
     *      // use response
     *      } catch (Exception e) {
     *          if (e instanceof MarketplaceWebServiceException) {
     *              MarketplaceWebServiceException exception = MarketplaceWebServiceException.class.cast(e);
     *          // handle MarketplaceWebServiceException
     *          } else {
     *          // handle other exceptions
     *          }
     *      }
     *  }
     * </pre>
     *
     * @param request
     *          GetReportCountRequest request
     * @return Future&lt;GetReportCountResponse&gt; future pointer to GetReportCountResponse
     * 
     */
    public Future<GetReportCountResponse> getReportCountAsync(final GetReportCountRequest request) {
        Future<GetReportCountResponse> response = asyncExecutor.submit(new Callable<GetReportCountResponse>() {

            public GetReportCountResponse call() throws MarketplaceWebServiceException {
                return getReportCount(request);
            }
            });
        return response;
    }
        
    /**
     * Get Feed Submission List By Next Token 
     *
     * retrieve the next batch of list items and if there are more items to retrieve
     * 
     * @param request
     *          GetFeedSubmissionListByNextTokenRequest request
     * @return
     *          GetFeedSubmissionListByNextToken Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetFeedSubmissionListByNextTokenResponse getFeedSubmissionListByNextToken(GetFeedSubmissionListByNextTokenRequest request) throws MarketplaceWebServiceException {
        return invoke(GetFeedSubmissionListByNextTokenResponse.class, convertGetFeedSubmissionListByNextToken(request));
    }

    /**
     * Non-blocking Get Feed Submission List By Next Token 
     * <p/>
     * Returns <code>future</code> pointer to GetFeedSubmissionListByNextTokenResponse
     * <p/>
     * If response is ready, call to <code>future.get()</code> 
     * will return GetFeedSubmissionListByNextTokenResponse. 
     * <p/>
     * If response is not ready, call to <code>future.get()</code> will block the 
     * calling thread until response is returned. 
     * <p/>
     * Note, <code>future.get()</code> will throw wrapped runtime exception. 
     * <p/>
     * If service error has occured, MarketplaceWebServiceException can be extracted with
     * <code>exception.getCause()</code>
     * <p/>
     * Usage example for parallel processing:
     * <pre>
     *
     *  List&lt;Future&lt;GetFeedSubmissionListByNextTokenResponse&gt;&gt; responses = new ArrayList&lt;Future&lt;GetFeedSubmissionListByNextTokenResponse&gt;&gt;();
     *  for (GetFeedSubmissionListByNextTokenRequest request : requests) {
     *      responses.add(client.getFeedSubmissionListByNextTokenAsync(request));
     *  }
     *  for (Future&lt;GetFeedSubmissionListByNextTokenResponse&gt; future : responses) {
     *      while (!future.isDone()) {
     *          Thread.yield();
     *      }
     *      try {
     *          GetFeedSubmissionListByNextTokenResponse response = future.get();
     *      // use response
     *      } catch (Exception e) {
     *          if (e instanceof MarketplaceWebServiceException) {
     *              MarketplaceWebServiceException exception = MarketplaceWebServiceException.class.cast(e);
     *          // handle MarketplaceWebServiceException
     *          } else {
     *          // handle other exceptions
     *          }
     *      }
     *  }
     * </pre>
     *
     * @param request
     *          GetFeedSubmissionListByNextTokenRequest request
     * @return Future&lt;GetFeedSubmissionListByNextTokenResponse&gt; future pointer to GetFeedSubmissionListByNextTokenResponse
     * 
     */
    public Future<GetFeedSubmissionListByNextTokenResponse> getFeedSubmissionListByNextTokenAsync(final GetFeedSubmissionListByNextTokenRequest request) {
        Future<GetFeedSubmissionListByNextTokenResponse> response = asyncExecutor.submit(new Callable<GetFeedSubmissionListByNextTokenResponse>() {

            public GetFeedSubmissionListByNextTokenResponse call() throws MarketplaceWebServiceException {
                return getFeedSubmissionListByNextToken(request);
            }
            });
        return response;
    }
        
    /**
     * Cancel Feed Submissions 
     *
     * cancels feed submissions - by default all of the submissions of the
     * last 30 days that have not started processing
     * 
     * @param request
     *          CancelFeedSubmissionsRequest request
     * @return
     *          CancelFeedSubmissions Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public CancelFeedSubmissionsResponse cancelFeedSubmissions(CancelFeedSubmissionsRequest request) throws MarketplaceWebServiceException {
        return invoke(CancelFeedSubmissionsResponse.class, convertCancelFeedSubmissions(request));
    }

    /**
     * Non-blocking Cancel Feed Submissions 
     * <p/>
     * Returns <code>future</code> pointer to CancelFeedSubmissionsResponse
     * <p/>
     * If response is ready, call to <code>future.get()</code> 
     * will return CancelFeedSubmissionsResponse. 
     * <p/>
     * If response is not ready, call to <code>future.get()</code> will block the 
     * calling thread until response is returned. 
     * <p/>
     * Note, <code>future.get()</code> will throw wrapped runtime exception. 
     * <p/>
     * If service error has occured, MarketplaceWebServiceException can be extracted with
     * <code>exception.getCause()</code>
     * <p/>
     * Usage example for parallel processing:
     * <pre>
     *
     *  List&lt;Future&lt;CancelFeedSubmissionsResponse&gt;&gt; responses = new ArrayList&lt;Future&lt;CancelFeedSubmissionsResponse&gt;&gt;();
     *  for (CancelFeedSubmissionsRequest request : requests) {
     *      responses.add(client.cancelFeedSubmissionsAsync(request));
     *  }
     *  for (Future&lt;CancelFeedSubmissionsResponse&gt; future : responses) {
     *      while (!future.isDone()) {
     *          Thread.yield();
     *      }
     *      try {
     *          CancelFeedSubmissionsResponse response = future.get();
     *      // use response
     *      } catch (Exception e) {
     *          if (e instanceof MarketplaceWebServiceException) {
     *              MarketplaceWebServiceException exception = MarketplaceWebServiceException.class.cast(e);
     *          // handle MarketplaceWebServiceException
     *          } else {
     *          // handle other exceptions
     *          }
     *      }
     *  }
     * </pre>
     *
     * @param request
     *          CancelFeedSubmissionsRequest request
     * @return Future&lt;CancelFeedSubmissionsResponse&gt; future pointer to CancelFeedSubmissionsResponse
     * 
     */
    public Future<CancelFeedSubmissionsResponse> cancelFeedSubmissionsAsync(final CancelFeedSubmissionsRequest request) {
        Future<CancelFeedSubmissionsResponse> response = asyncExecutor.submit(new Callable<CancelFeedSubmissionsResponse>() {

            public CancelFeedSubmissionsResponse call() throws MarketplaceWebServiceException {
                return cancelFeedSubmissions(request);
            }
            });
        return response;
    }
        
    /**
     * Request Report 
     *
     * requests the generation of a report
     * 
     * @param request
     *          RequestReportRequest request
     * @return
     *          RequestReport Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public RequestReportResponse requestReport(RequestReportRequest request) throws MarketplaceWebServiceException {
        return invoke(RequestReportResponse.class, convertRequestReport(request));
    }

    /**
     * Non-blocking Request Report 
     * <p/>
     * Returns <code>future</code> pointer to RequestReportResponse
     * <p/>
     * If response is ready, call to <code>future.get()</code> 
     * will return RequestReportResponse. 
     * <p/>
     * If response is not ready, call to <code>future.get()</code> will block the 
     * calling thread until response is returned. 
     * <p/>
     * Note, <code>future.get()</code> will throw wrapped runtime exception. 
     * <p/>
     * If service error has occured, MarketplaceWebServiceException can be extracted with
     * <code>exception.getCause()</code>
     * <p/>
     * Usage example for parallel processing:
     * <pre>
     *
     *  List&lt;Future&lt;RequestReportResponse&gt;&gt; responses = new ArrayList&lt;Future&lt;RequestReportResponse&gt;&gt;();
     *  for (RequestReportRequest request : requests) {
     *      responses.add(client.requestReportAsync(request));
     *  }
     *  for (Future&lt;RequestReportResponse&gt; future : responses) {
     *      while (!future.isDone()) {
     *          Thread.yield();
     *      }
     *      try {
     *          RequestReportResponse response = future.get();
     *      // use response
     *      } catch (Exception e) {
     *          if (e instanceof MarketplaceWebServiceException) {
     *              MarketplaceWebServiceException exception = MarketplaceWebServiceException.class.cast(e);
     *          // handle MarketplaceWebServiceException
     *          } else {
     *          // handle other exceptions
     *          }
     *      }
     *  }
     * </pre>
     *
     * @param request
     *          RequestReportRequest request
     * @return Future&lt;RequestReportResponse&gt; future pointer to RequestReportResponse
     * 
     */
    public Future<RequestReportResponse> requestReportAsync(final RequestReportRequest request) {
        Future<RequestReportResponse> response = asyncExecutor.submit(new Callable<RequestReportResponse>() {

            public RequestReportResponse call() throws MarketplaceWebServiceException {
                return requestReport(request);
            }
            });
        return response;
    }
        
    /**
     * Get Feed Submission Count 
     *
     * returns the number of feeds matching all of the specified criteria
     * 
     * @param request
     *          GetFeedSubmissionCountRequest request
     * @return
     *          GetFeedSubmissionCount Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetFeedSubmissionCountResponse getFeedSubmissionCount(GetFeedSubmissionCountRequest request) throws MarketplaceWebServiceException {
        return invoke(GetFeedSubmissionCountResponse.class, convertGetFeedSubmissionCount(request));
    }

    /**
     * Non-blocking Get Feed Submission Count 
     * <p/>
     * Returns <code>future</code> pointer to GetFeedSubmissionCountResponse
     * <p/>
     * If response is ready, call to <code>future.get()</code> 
     * will return GetFeedSubmissionCountResponse. 
     * <p/>
     * If response is not ready, call to <code>future.get()</code> will block the 
     * calling thread until response is returned. 
     * <p/>
     * Note, <code>future.get()</code> will throw wrapped runtime exception. 
     * <p/>
     * If service error has occured, MarketplaceWebServiceException can be extracted with
     * <code>exception.getCause()</code>
     * <p/>
     * Usage example for parallel processing:
     * <pre>
     *
     *  List&lt;Future&lt;GetFeedSubmissionCountResponse&gt;&gt; responses = new ArrayList&lt;Future&lt;GetFeedSubmissionCountResponse&gt;&gt;();
     *  for (GetFeedSubmissionCountRequest request : requests) {
     *      responses.add(client.getFeedSubmissionCountAsync(request));
     *  }
     *  for (Future&lt;GetFeedSubmissionCountResponse&gt; future : responses) {
     *      while (!future.isDone()) {
     *          Thread.yield();
     *      }
     *      try {
     *          GetFeedSubmissionCountResponse response = future.get();
     *      // use response
     *      } catch (Exception e) {
     *          if (e instanceof MarketplaceWebServiceException) {
     *              MarketplaceWebServiceException exception = MarketplaceWebServiceException.class.cast(e);
     *          // handle MarketplaceWebServiceException
     *          } else {
     *          // handle other exceptions
     *          }
     *      }
     *  }
     * </pre>
     *
     * @param request
     *          GetFeedSubmissionCountRequest request
     * @return Future&lt;GetFeedSubmissionCountResponse&gt; future pointer to GetFeedSubmissionCountResponse
     * 
     */
    public Future<GetFeedSubmissionCountResponse> getFeedSubmissionCountAsync(final GetFeedSubmissionCountRequest request) {
        Future<GetFeedSubmissionCountResponse> response = asyncExecutor.submit(new Callable<GetFeedSubmissionCountResponse>() {

            public GetFeedSubmissionCountResponse call() throws MarketplaceWebServiceException {
                return getFeedSubmissionCount(request);
            }
            });
        return response;
    }
        
    /**
     * Cancel Report Requests 
     *
     * cancels report request that have not yet started processing,
     * by default all those within the last 90 days
     * 
     * @param request
     *          CancelReportRequestsRequest request
     * @return
     *          CancelReportRequests Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public CancelReportRequestsResponse cancelReportRequests(CancelReportRequestsRequest request) throws MarketplaceWebServiceException {
        return invoke(CancelReportRequestsResponse.class, convertCancelReportRequests(request));
    }

    /**
     * Non-blocking Cancel Report Requests 
     * <p/>
     * Returns <code>future</code> pointer to CancelReportRequestsResponse
     * <p/>
     * If response is ready, call to <code>future.get()</code> 
     * will return CancelReportRequestsResponse. 
     * <p/>
     * If response is not ready, call to <code>future.get()</code> will block the 
     * calling thread until response is returned. 
     * <p/>
     * Note, <code>future.get()</code> will throw wrapped runtime exception. 
     * <p/>
     * If service error has occured, MarketplaceWebServiceException can be extracted with
     * <code>exception.getCause()</code>
     * <p/>
     * Usage example for parallel processing:
     * <pre>
     *
     *  List&lt;Future&lt;CancelReportRequestsResponse&gt;&gt; responses = new ArrayList&lt;Future&lt;CancelReportRequestsResponse&gt;&gt;();
     *  for (CancelReportRequestsRequest request : requests) {
     *      responses.add(client.cancelReportRequestsAsync(request));
     *  }
     *  for (Future&lt;CancelReportRequestsResponse&gt; future : responses) {
     *      while (!future.isDone()) {
     *          Thread.yield();
     *      }
     *      try {
     *          CancelReportRequestsResponse response = future.get();
     *      // use response
     *      } catch (Exception e) {
     *          if (e instanceof MarketplaceWebServiceException) {
     *              MarketplaceWebServiceException exception = MarketplaceWebServiceException.class.cast(e);
     *          // handle MarketplaceWebServiceException
     *          } else {
     *          // handle other exceptions
     *          }
     *      }
     *  }
     * </pre>
     *
     * @param request
     *          CancelReportRequestsRequest request
     * @return Future&lt;CancelReportRequestsResponse&gt; future pointer to CancelReportRequestsResponse
     * 
     */
    public Future<CancelReportRequestsResponse> cancelReportRequestsAsync(final CancelReportRequestsRequest request) {
        Future<CancelReportRequestsResponse> response = asyncExecutor.submit(new Callable<CancelReportRequestsResponse>() {

            public CancelReportRequestsResponse call() throws MarketplaceWebServiceException {
                return cancelReportRequests(request);
            }
            });
        return response;
    }
        
    /**
     * Get Report List 
     *
     * returns a list of reports; by default the most recent ten reports,
     * regardless of their acknowledgment status
     * 
     * @param request
     *          GetReportListRequest request
     * @return
     *          GetReportList Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportListResponse getReportList(GetReportListRequest request) throws MarketplaceWebServiceException {
        return invoke(GetReportListResponse.class, convertGetReportList(request));
    }

    /**
     * Non-blocking Get Report List 
     * <p/>
     * Returns <code>future</code> pointer to GetReportListResponse
     * <p/>
     * If response is ready, call to <code>future.get()</code> 
     * will return GetReportListResponse. 
     * <p/>
     * If response is not ready, call to <code>future.get()</code> will block the 
     * calling thread until response is returned. 
     * <p/>
     * Note, <code>future.get()</code> will throw wrapped runtime exception. 
     * <p/>
     * If service error has occured, MarketplaceWebServiceException can be extracted with
     * <code>exception.getCause()</code>
     * <p/>
     * Usage example for parallel processing:
     * <pre>
     *
     *  List&lt;Future&lt;GetReportListResponse&gt;&gt; responses = new ArrayList&lt;Future&lt;GetReportListResponse&gt;&gt;();
     *  for (GetReportListRequest request : requests) {
     *      responses.add(client.getReportListAsync(request));
     *  }
     *  for (Future&lt;GetReportListResponse&gt; future : responses) {
     *      while (!future.isDone()) {
     *          Thread.yield();
     *      }
     *      try {
     *          GetReportListResponse response = future.get();
     *      // use response
     *      } catch (Exception e) {
     *          if (e instanceof MarketplaceWebServiceException) {
     *              MarketplaceWebServiceException exception = MarketplaceWebServiceException.class.cast(e);
     *          // handle MarketplaceWebServiceException
     *          } else {
     *          // handle other exceptions
     *          }
     *      }
     *  }
     * </pre>
     *
     * @param request
     *          GetReportListRequest request
     * @return Future&lt;GetReportListResponse&gt; future pointer to GetReportListResponse
     * 
     */
    public Future<GetReportListResponse> getReportListAsync(final GetReportListRequest request) {
        Future<GetReportListResponse> response = asyncExecutor.submit(new Callable<GetReportListResponse>() {

            public GetReportListResponse call() throws MarketplaceWebServiceException {
                return getReportList(request);
            }
            });
        return response;
    }
        
    /**
     * Get Feed Submission Result 
     *
     * retrieves the feed processing report
     * 
     * @param request
     *          GetFeedSubmissionResultRequest request
     * @return
     *          GetFeedSubmissionResult Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetFeedSubmissionResultResponse getFeedSubmissionResult(GetFeedSubmissionResultRequest request) throws MarketplaceWebServiceException {
        return invoke(GetFeedSubmissionResultResponse.class, convertGetFeedSubmissionResult(request), request);
    }

    /**
     * Non-blocking Get Feed Submission Result 
     * <p/>
     * Returns <code>future</code> pointer to GetFeedSubmissionResultResponse
     * <p/>
     * If response is ready, call to <code>future.get()</code> 
     * will return GetFeedSubmissionResultResponse. 
     * <p/>
     * If response is not ready, call to <code>future.get()</code> will block the 
     * calling thread until response is returned. 
     * <p/>
     * Note, <code>future.get()</code> will throw wrapped runtime exception. 
     * <p/>
     * If service error has occured, MarketplaceWebServiceException can be extracted with
     * <code>exception.getCause()</code>
     * <p/>
     * Usage example for parallel processing:
     * <pre>
     *
     *  List&lt;Future&lt;GetFeedSubmissionResultResponse&gt;&gt; responses = new ArrayList&lt;Future&lt;GetFeedSubmissionResultResponse&gt;&gt;();
     *  for (GetFeedSubmissionResultRequest request : requests) {
     *      responses.add(client.getFeedSubmissionResultAsync(request));
     *  }
     *  for (Future&lt;GetFeedSubmissionResultResponse&gt; future : responses) {
     *      while (!future.isDone()) {
     *          Thread.yield();
     *      }
     *      try {
     *          GetFeedSubmissionResultResponse response = future.get();
     *      // use response
     *      } catch (Exception e) {
     *          if (e instanceof MarketplaceWebServiceException) {
     *              MarketplaceWebServiceException exception = MarketplaceWebServiceException.class.cast(e);
     *          // handle MarketplaceWebServiceException
     *          } else {
     *          // handle other exceptions
     *          }
     *      }
     *  }
     * </pre>
     *
     * @param request
     *          GetFeedSubmissionResultRequest request
     * @return Future&lt;GetFeedSubmissionResultResponse&gt; future pointer to GetFeedSubmissionResultResponse
     * 
     */
    public Future<GetFeedSubmissionResultResponse> getFeedSubmissionResultAsync(final GetFeedSubmissionResultRequest request) {
        Future<GetFeedSubmissionResultResponse> response = asyncExecutor.submit(new Callable<GetFeedSubmissionResultResponse>() {

            public GetFeedSubmissionResultResponse call() throws MarketplaceWebServiceException {
                return getFeedSubmissionResult(request);
            }
            });
        return response;
    }
        
    /**
     * Get Feed Submission List 
     *
     * returns a list of feed submission identifiers and their associated metadata
     * 
     * @param request
     *          GetFeedSubmissionListRequest request
     * @return
     *          GetFeedSubmissionList Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetFeedSubmissionListResponse getFeedSubmissionList(GetFeedSubmissionListRequest request) throws MarketplaceWebServiceException {
        return invoke(GetFeedSubmissionListResponse.class, convertGetFeedSubmissionList(request));
    }

    /**
     * Non-blocking Get Feed Submission List 
     * <p/>
     * Returns <code>future</code> pointer to GetFeedSubmissionListResponse
     * <p/>
     * If response is ready, call to <code>future.get()</code> 
     * will return GetFeedSubmissionListResponse. 
     * <p/>
     * If response is not ready, call to <code>future.get()</code> will block the 
     * calling thread until response is returned. 
     * <p/>
     * Note, <code>future.get()</code> will throw wrapped runtime exception. 
     * <p/>
     * If service error has occured, MarketplaceWebServiceException can be extracted with
     * <code>exception.getCause()</code>
     * <p/>
     * Usage example for parallel processing:
     * <pre>
     *
     *  List&lt;Future&lt;GetFeedSubmissionListResponse&gt;&gt; responses = new ArrayList&lt;Future&lt;GetFeedSubmissionListResponse&gt;&gt;();
     *  for (GetFeedSubmissionListRequest request : requests) {
     *      responses.add(client.getFeedSubmissionListAsync(request));
     *  }
     *  for (Future&lt;GetFeedSubmissionListResponse&gt; future : responses) {
     *      while (!future.isDone()) {
     *          Thread.yield();
     *      }
     *      try {
     *          GetFeedSubmissionListResponse response = future.get();
     *      // use response
     *      } catch (Exception e) {
     *          if (e instanceof MarketplaceWebServiceException) {
     *              MarketplaceWebServiceException exception = MarketplaceWebServiceException.class.cast(e);
     *          // handle MarketplaceWebServiceException
     *          } else {
     *          // handle other exceptions
     *          }
     *      }
     *  }
     * </pre>
     *
     * @param request
     *          GetFeedSubmissionListRequest request
     * @return Future&lt;GetFeedSubmissionListResponse&gt; future pointer to GetFeedSubmissionListResponse
     * 
     */
    public Future<GetFeedSubmissionListResponse> getFeedSubmissionListAsync(final GetFeedSubmissionListRequest request) {
        Future<GetFeedSubmissionListResponse> response = asyncExecutor.submit(new Callable<GetFeedSubmissionListResponse>() {

            public GetFeedSubmissionListResponse call() throws MarketplaceWebServiceException {
                return getFeedSubmissionList(request);
            }
            });
        return response;
    }
        
    /**
     * Get Report Request List 
     *
     * returns a list of report requests ids and their associated metadata
     * 
     * @param request
     *          GetReportRequestListRequest request
     * @return
     *          GetReportRequestList Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportRequestListResponse getReportRequestList(GetReportRequestListRequest request) throws MarketplaceWebServiceException {
        return invoke(GetReportRequestListResponse.class, convertGetReportRequestList(request));
    }

    /**
     * Non-blocking Get Report Request List 
     * <p/>
     * Returns <code>future</code> pointer to GetReportRequestListResponse
     * <p/>
     * If response is ready, call to <code>future.get()</code> 
     * will return GetReportRequestListResponse. 
     * <p/>
     * If response is not ready, call to <code>future.get()</code> will block the 
     * calling thread until response is returned. 
     * <p/>
     * Note, <code>future.get()</code> will throw wrapped runtime exception. 
     * <p/>
     * If service error has occured, MarketplaceWebServiceException can be extracted with
     * <code>exception.getCause()</code>
     * <p/>
     * Usage example for parallel processing:
     * <pre>
     *
     *  List&lt;Future&lt;GetReportRequestListResponse&gt;&gt; responses = new ArrayList&lt;Future&lt;GetReportRequestListResponse&gt;&gt;();
     *  for (GetReportRequestListRequest request : requests) {
     *      responses.add(client.getReportRequestListAsync(request));
     *  }
     *  for (Future&lt;GetReportRequestListResponse&gt; future : responses) {
     *      while (!future.isDone()) {
     *          Thread.yield();
     *      }
     *      try {
     *          GetReportRequestListResponse response = future.get();
     *      // use response
     *      } catch (Exception e) {
     *          if (e instanceof MarketplaceWebServiceException) {
     *              MarketplaceWebServiceException exception = MarketplaceWebServiceException.class.cast(e);
     *          // handle MarketplaceWebServiceException
     *          } else {
     *          // handle other exceptions
     *          }
     *      }
     *  }
     * </pre>
     *
     * @param request
     *          GetReportRequestListRequest request
     * @return Future&lt;GetReportRequestListResponse&gt; future pointer to GetReportRequestListResponse
     * 
     */
    public Future<GetReportRequestListResponse> getReportRequestListAsync(final GetReportRequestListRequest request) {
        Future<GetReportRequestListResponse> response = asyncExecutor.submit(new Callable<GetReportRequestListResponse>() {

            public GetReportRequestListResponse call() throws MarketplaceWebServiceException {
                return getReportRequestList(request);
            }
            });
        return response;
    }
        
    /**
     * Get Report Schedule List By Next Token 
     *
     * retrieve the next batch of list items and if there are more items to retrieve
     * 
     * @param request
     *          GetReportScheduleListByNextTokenRequest request
     * @return
     *          GetReportScheduleListByNextToken Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportScheduleListByNextTokenResponse getReportScheduleListByNextToken(GetReportScheduleListByNextTokenRequest request) throws MarketplaceWebServiceException {
        return invoke(GetReportScheduleListByNextTokenResponse.class, convertGetReportScheduleListByNextToken(request));
    }

    /**
     * Non-blocking Get Report Schedule List By Next Token 
     * <p/>
     * Returns <code>future</code> pointer to GetReportScheduleListByNextTokenResponse
     * <p/>
     * If response is ready, call to <code>future.get()</code> 
     * will return GetReportScheduleListByNextTokenResponse. 
     * <p/>
     * If response is not ready, call to <code>future.get()</code> will block the 
     * calling thread until response is returned. 
     * <p/>
     * Note, <code>future.get()</code> will throw wrapped runtime exception. 
     * <p/>
     * If service error has occured, MarketplaceWebServiceException can be extracted with
     * <code>exception.getCause()</code>
     * <p/>
     * Usage example for parallel processing:
     * <pre>
     *
     *  List&lt;Future&lt;GetReportScheduleListByNextTokenResponse&gt;&gt; responses = new ArrayList&lt;Future&lt;GetReportScheduleListByNextTokenResponse&gt;&gt;();
     *  for (GetReportScheduleListByNextTokenRequest request : requests) {
     *      responses.add(client.getReportScheduleListByNextTokenAsync(request));
     *  }
     *  for (Future&lt;GetReportScheduleListByNextTokenResponse&gt; future : responses) {
     *      while (!future.isDone()) {
     *          Thread.yield();
     *      }
     *      try {
     *          GetReportScheduleListByNextTokenResponse response = future.get();
     *      // use response
     *      } catch (Exception e) {
     *          if (e instanceof MarketplaceWebServiceException) {
     *              MarketplaceWebServiceException exception = MarketplaceWebServiceException.class.cast(e);
     *          // handle MarketplaceWebServiceException
     *          } else {
     *          // handle other exceptions
     *          }
     *      }
     *  }
     * </pre>
     *
     * @param request
     *          GetReportScheduleListByNextTokenRequest request
     * @return Future&lt;GetReportScheduleListByNextTokenResponse&gt; future pointer to GetReportScheduleListByNextTokenResponse
     * 
     */
    public Future<GetReportScheduleListByNextTokenResponse> getReportScheduleListByNextTokenAsync(final GetReportScheduleListByNextTokenRequest request) {
        Future<GetReportScheduleListByNextTokenResponse> response = asyncExecutor.submit(new Callable<GetReportScheduleListByNextTokenResponse>() {

            public GetReportScheduleListByNextTokenResponse call() throws MarketplaceWebServiceException {
                return getReportScheduleListByNextToken(request);
            }
            });
        return response;
    }
        
    /**
     * Get Report List By Next Token 
     *
     * retrieve the next batch of list items and if there are more items to retrieve
     * 
     * @param request
     *          GetReportListByNextTokenRequest request
     * @return
     *          GetReportListByNextToken Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportListByNextTokenResponse getReportListByNextToken(GetReportListByNextTokenRequest request) throws MarketplaceWebServiceException {
        return invoke(GetReportListByNextTokenResponse.class, convertGetReportListByNextToken(request));
    }

    /**
     * Non-blocking Get Report List By Next Token 
     * <p/>
     * Returns <code>future</code> pointer to GetReportListByNextTokenResponse
     * <p/>
     * If response is ready, call to <code>future.get()</code> 
     * will return GetReportListByNextTokenResponse. 
     * <p/>
     * If response is not ready, call to <code>future.get()</code> will block the 
     * calling thread until response is returned. 
     * <p/>
     * Note, <code>future.get()</code> will throw wrapped runtime exception. 
     * <p/>
     * If service error has occured, MarketplaceWebServiceException can be extracted with
     * <code>exception.getCause()</code>
     * <p/>
     * Usage example for parallel processing:
     * <pre>
     *
     *  List&lt;Future&lt;GetReportListByNextTokenResponse&gt;&gt; responses = new ArrayList&lt;Future&lt;GetReportListByNextTokenResponse&gt;&gt;();
     *  for (GetReportListByNextTokenRequest request : requests) {
     *      responses.add(client.getReportListByNextTokenAsync(request));
     *  }
     *  for (Future&lt;GetReportListByNextTokenResponse&gt; future : responses) {
     *      while (!future.isDone()) {
     *          Thread.yield();
     *      }
     *      try {
     *          GetReportListByNextTokenResponse response = future.get();
     *      // use response
     *      } catch (Exception e) {
     *          if (e instanceof MarketplaceWebServiceException) {
     *              MarketplaceWebServiceException exception = MarketplaceWebServiceException.class.cast(e);
     *          // handle MarketplaceWebServiceException
     *          } else {
     *          // handle other exceptions
     *          }
     *      }
     *  }
     * </pre>
     *
     * @param request
     *          GetReportListByNextTokenRequest request
     * @return Future&lt;GetReportListByNextTokenResponse&gt; future pointer to GetReportListByNextTokenResponse
     * 
     */
    public Future<GetReportListByNextTokenResponse> getReportListByNextTokenAsync(final GetReportListByNextTokenRequest request) {
        Future<GetReportListByNextTokenResponse> response = asyncExecutor.submit(new Callable<GetReportListByNextTokenResponse>() {

            public GetReportListByNextTokenResponse call() throws MarketplaceWebServiceException {
                return getReportListByNextToken(request);
            }
            });
        return response;
    }
        
    /**
     * Manage Report Schedule 
     *
     * Creates, updates, or deletes a report schedule
     * for a given report type, such as order reports in particular.
     * 
     * @param request
     *          ManageReportScheduleRequest request
     * @return
     *          ManageReportSchedule Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public ManageReportScheduleResponse manageReportSchedule(ManageReportScheduleRequest request) throws MarketplaceWebServiceException {
        return invoke(ManageReportScheduleResponse.class, convertManageReportSchedule(request));
    }

    /**
     * Non-blocking Manage Report Schedule 
     * <p/>
     * Returns <code>future</code> pointer to ManageReportScheduleResponse
     * <p/>
     * If response is ready, call to <code>future.get()</code> 
     * will return ManageReportScheduleResponse. 
     * <p/>
     * If response is not ready, call to <code>future.get()</code> will block the 
     * calling thread until response is returned. 
     * <p/>
     * Note, <code>future.get()</code> will throw wrapped runtime exception. 
     * <p/>
     * If service error has occured, MarketplaceWebServiceException can be extracted with
     * <code>exception.getCause()</code>
     * <p/>
     * Usage example for parallel processing:
     * <pre>
     *
     *  List&lt;Future&lt;ManageReportScheduleResponse&gt;&gt; responses = new ArrayList&lt;Future&lt;ManageReportScheduleResponse&gt;&gt;();
     *  for (ManageReportScheduleRequest request : requests) {
     *      responses.add(client.manageReportScheduleAsync(request));
     *  }
     *  for (Future&lt;ManageReportScheduleResponse&gt; future : responses) {
     *      while (!future.isDone()) {
     *          Thread.yield();
     *      }
     *      try {
     *          ManageReportScheduleResponse response = future.get();
     *      // use response
     *      } catch (Exception e) {
     *          if (e instanceof MarketplaceWebServiceException) {
     *              MarketplaceWebServiceException exception = MarketplaceWebServiceException.class.cast(e);
     *          // handle MarketplaceWebServiceException
     *          } else {
     *          // handle other exceptions
     *          }
     *      }
     *  }
     * </pre>
     *
     * @param request
     *          ManageReportScheduleRequest request
     * @return Future&lt;ManageReportScheduleResponse&gt; future pointer to ManageReportScheduleResponse
     * 
     */
    public Future<ManageReportScheduleResponse> manageReportScheduleAsync(final ManageReportScheduleRequest request) {
        Future<ManageReportScheduleResponse> response = asyncExecutor.submit(new Callable<ManageReportScheduleResponse>() {

            public ManageReportScheduleResponse call() throws MarketplaceWebServiceException {
                return manageReportSchedule(request);
            }
            });
        return response;
    }
        
    /**
     * Get Report Request Count 
     *
     * returns a count of report requests; by default all the report
     * requests in the last 90 days
     * 
     * @param request
     *          GetReportRequestCountRequest request
     * @return
     *          GetReportRequestCount Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportRequestCountResponse getReportRequestCount(GetReportRequestCountRequest request) throws MarketplaceWebServiceException {
        return invoke(GetReportRequestCountResponse.class, convertGetReportRequestCount(request));
    }

    /**
     * Non-blocking Get Report Request Count 
     * <p/>
     * Returns <code>future</code> pointer to GetReportRequestCountResponse
     * <p/>
     * If response is ready, call to <code>future.get()</code> 
     * will return GetReportRequestCountResponse. 
     * <p/>
     * If response is not ready, call to <code>future.get()</code> will block the 
     * calling thread until response is returned. 
     * <p/>
     * Note, <code>future.get()</code> will throw wrapped runtime exception. 
     * <p/>
     * If service error has occured, MarketplaceWebServiceException can be extracted with
     * <code>exception.getCause()</code>
     * <p/>
     * Usage example for parallel processing:
     * <pre>
     *
     *  List&lt;Future&lt;GetReportRequestCountResponse&gt;&gt; responses = new ArrayList&lt;Future&lt;GetReportRequestCountResponse&gt;&gt;();
     *  for (GetReportRequestCountRequest request : requests) {
     *      responses.add(client.getReportRequestCountAsync(request));
     *  }
     *  for (Future&lt;GetReportRequestCountResponse&gt; future : responses) {
     *      while (!future.isDone()) {
     *          Thread.yield();
     *      }
     *      try {
     *          GetReportRequestCountResponse response = future.get();
     *      // use response
     *      } catch (Exception e) {
     *          if (e instanceof MarketplaceWebServiceException) {
     *              MarketplaceWebServiceException exception = MarketplaceWebServiceException.class.cast(e);
     *          // handle MarketplaceWebServiceException
     *          } else {
     *          // handle other exceptions
     *          }
     *      }
     *  }
     * </pre>
     *
     * @param request
     *          GetReportRequestCountRequest request
     * @return Future&lt;GetReportRequestCountResponse&gt; future pointer to GetReportRequestCountResponse
     * 
     */
    public Future<GetReportRequestCountResponse> getReportRequestCountAsync(final GetReportRequestCountRequest request) {
        Future<GetReportRequestCountResponse> response = asyncExecutor.submit(new Callable<GetReportRequestCountResponse>() {

            public GetReportRequestCountResponse call() throws MarketplaceWebServiceException {
                return getReportRequestCount(request);
            }
            });
        return response;
    }
        
    /**
     * Get Report Schedule List 
     *
     * returns the list of report schedules
     * 
     * @param request
     *          GetReportScheduleListRequest request
     * @return
     *          GetReportScheduleList Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportScheduleListResponse getReportScheduleList(GetReportScheduleListRequest request) throws MarketplaceWebServiceException {
        return invoke(GetReportScheduleListResponse.class, convertGetReportScheduleList(request));
    }

    /**
     * Non-blocking Get Report Schedule List 
     * <p/>
     * Returns <code>future</code> pointer to GetReportScheduleListResponse
     * <p/>
     * If response is ready, call to <code>future.get()</code> 
     * will return GetReportScheduleListResponse. 
     * <p/>
     * If response is not ready, call to <code>future.get()</code> will block the 
     * calling thread until response is returned. 
     * <p/>
     * Note, <code>future.get()</code> will throw wrapped runtime exception. 
     * <p/>
     * If service error has occured, MarketplaceWebServiceException can be extracted with
     * <code>exception.getCause()</code>
     * <p/>
     * Usage example for parallel processing:
     * <pre>
     *
     *  List&lt;Future&lt;GetReportScheduleListResponse&gt;&gt; responses = new ArrayList&lt;Future&lt;GetReportScheduleListResponse&gt;&gt;();
     *  for (GetReportScheduleListRequest request : requests) {
     *      responses.add(client.getReportScheduleListAsync(request));
     *  }
     *  for (Future&lt;GetReportScheduleListResponse&gt; future : responses) {
     *      while (!future.isDone()) {
     *          Thread.yield();
     *      }
     *      try {
     *          GetReportScheduleListResponse response = future.get();
     *      // use response
     *      } catch (Exception e) {
     *          if (e instanceof MarketplaceWebServiceException) {
     *              MarketplaceWebServiceException exception = MarketplaceWebServiceException.class.cast(e);
     *          // handle MarketplaceWebServiceException
     *          } else {
     *          // handle other exceptions
     *          }
     *      }
     *  }
     * </pre>
     *
     * @param request
     *          GetReportScheduleListRequest request
     * @return Future&lt;GetReportScheduleListResponse&gt; future pointer to GetReportScheduleListResponse
     * 
     */
    public Future<GetReportScheduleListResponse> getReportScheduleListAsync(final GetReportScheduleListRequest request) {
        Future<GetReportScheduleListResponse> response = asyncExecutor.submit(new Callable<GetReportScheduleListResponse>() {

            public GetReportScheduleListResponse call() throws MarketplaceWebServiceException {
                return getReportScheduleList(request);
            }
            });
        return response;
    }

	/**
	 * Remove all leading whitespace, trailing whitespace, repeated whitespace
	 * and replace any interior whitespace with a single space
	 */
    private static String clean(String s) {
    	return s
    		.replaceAll("\\s", " ")
    		.replaceAll(" {2,}", " ")
    		.trim();
    }

    public static String quoteAppName(String s) {
        return clean(s)
            .replace("\\", "\\\\")
            .replace("/", "\\/");
    }

    public static String quoteAppVersion(String s) {
        return clean(s)
            .replace("\\", "\\\\")
            .replace("(", "\\(");
    }

    public static String quoteAttributeName(String s) {
        return clean(s)
            .replace("\\", "\\\\")
            .replace("=", "\\=");
    }

    public static String quoteAttributeValue(String s) {
        return clean(s)
            .replace("\\", "\\\\")
            .replace(";", "\\;")
            .replace(")", "\\)");
    }

    private static final String mwsClientLibraryVersion = "2016-09-21";

    
    // Private API ------------------------------------------------------------//

    /**
     * Configure HttpClient with set of defaults as well as configuration
     * from MarketplaceWebServiceConfig instance
     *
     */
    private HttpClient configureHttpClient(
    		String applicationName,
    		String applicationVersion) {
        
        // respect a user-provided User-Agent header as-is, but if none is provided
        // then generate one satisfying the MWS User-Agent requirements
        if(config.getUserAgent()==null) {
        	config.setUserAgent(
        			quoteAppName(applicationName), 
        			quoteAppVersion(applicationVersion), 
        			quoteAttributeValue("Java/"+System.getProperty("java.version")+
        			"/"+System.getProperty("java.class.version")+
        			"/"+System.getProperty("java.vendor")), 
        			
        			quoteAttributeName("Platform"), 
        			quoteAttributeValue(""+System.getProperty("os.name")+
        			"/"+System.getProperty("os.arch")+
        			"/"+System.getProperty("os.version")),
        			
        			quoteAttributeName("MWSClientVersion"), 
        			quoteAttributeValue(mwsClientLibraryVersion));
        }
 
        defaultHeaders.add(new BasicHeader("X-Amazon-User-Agent", config.getUserAgent()));
        
        
        /* Set http client parameters */
    	BasicHttpParams httpParams = new BasicHttpParams();
    	
        httpParams.setParameter(CoreProtocolPNames.USER_AGENT, config.getUserAgent());
        

        /* Set connection parameters */
        HttpConnectionParams.setConnectionTimeout(httpParams, config.getConnectionTimeout());
        HttpConnectionParams.setSoTimeout(httpParams, config.getSoTimeout());
        HttpConnectionParams.setStaleCheckingEnabled(httpParams, true);
        HttpConnectionParams.setTcpNoDelay(httpParams, true);    
        

        /* Set connection manager */
        PoolingClientConnectionManager connectionManager = new PoolingClientConnectionManager();
        connectionManager.setMaxTotal(config.getMaxAsyncQueueSize());
        connectionManager.setDefaultMaxPerRoute(config.getMaxAsyncQueueSize());

        /* Set http client */
        httpClient = new DefaultHttpClient(connectionManager, httpParams);
        httpContext = new BasicHttpContext();

        
        /* Set proxy if configured */
        if (config.isSetProxyHost() && config.isSetProxyPort()) {
            String proxyProtocol = null;
            if (config.isSetProxyProtocol()) {
                //User explicitly set how to talk to proxy
                proxyProtocol = config.getProxyProtocol().toString().toLowerCase();
            }
            else {
                // assume that the mws endpoint url determines the protocol
                // for the proxy as well
                proxyProtocol = usesHttps(config.getServiceURL()) ? "https" : "http";
            }
            log.info("Configuring Proxy. Proxy Host: " + config.getProxyHost() +
                    " Proxy Port: " + config.getProxyPort() + " Proxy protocol: "+ proxyProtocol);
            final HttpHost hostConfiguration = new HttpHost(config.getProxyHost(), config.getProxyPort(), proxyProtocol );
            httpContext = new BasicHttpContext();
            httpClient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, hostConfiguration); 

            if (config.isSetProxyUsername() && config.isSetProxyPassword()) {
                credentialsProvider.setCredentials (new AuthScope(
                                          config.getProxyHost(),
                                          config.getProxyPort()),
                                          new UsernamePasswordCredentials(
                                              config.getProxyUsername(),
                                              config.getProxyPassword()));
                httpContext.setAttribute(ClientContext.CREDS_PROVIDER, credentialsProvider);

            }

        }

        return httpClient;
    }
    
    /**
     * Stream the response into an output stream.
     */
    private void copyResponseToOutputStream(InputStream from, OutputStream to) throws IOException {
    	byte[] buffer = new byte[1048576]; // 1024*1024
    	int read = 0;
    	while ((read = from.read(buffer)) > 0) {
    		to.write(buffer, 0, read);
    	}
    }

    private void addRequiredParameters(Map< String, String > parameters) throws SignatureException {
      parameters.put("Version", config.getServiceVersion());
      parameters.put("SignatureVersion", "2");
      parameters.put("Timestamp", getFormattedTimestamp());
      parameters.put("AWSAccessKeyId",  this.awsAccessKeyId);
      parameters.put("Signature", signParameters(parameters, this.awsSecretAccessKey));
    }
    
    private String getSubmitFeedUrlParameters( Map< String, String > parameters ) throws SignatureException, MarketplaceWebServiceException {

        addRequiredParameters(parameters);
        
        StringBuilder sb = new StringBuilder();
        for( Entry< String, String > entry : parameters.entrySet() ) {
            if( sb.length() != 0 ) {
                sb.append( "&" );
            }
            
            try {
                String key = URLEncoder.encode( entry.getKey(), "UTF-8" );
                String value = URLEncoder.encode( entry.getValue(), "UTF-8" );
            
                sb.append( key + "=" + value );
            }
            catch( Throwable t ) {
                log.error("Caught Exception", t);
                throw new MarketplaceWebServiceException(t);
            }
        }
        
        return sb.toString();
    }
    
    private <T> T invoke(Class<T> clazz, Map<String, String> parameters)
    throws MarketplaceWebServiceException {
        return invoke( clazz, parameters, null );
    }
    
    @SuppressWarnings("serial")
    private <T, U> T invoke(Class<T> clazz, Map<String, String> parameters, U request ) throws MarketplaceWebServiceException {
        
        String actionName = parameters.get("Action");
        T response = null;
        String responseBodyString = null;
        ResponseHeaderMetadata responseHeaderMetadata = null;
        Method responseHeaderMetadataSetter = null;
        
        HttpPost method = null;
        
        try {

            responseHeaderMetadataSetter = clazz.getMethod("setResponseHeaderMetadata", ResponseHeaderMetadata.class);

            if(!config.isSetServiceURL()){
                throw new MarketplaceWebServiceException("Missing serviceUrl configuration value. You may obtain a list of valid MWS URLs by consulting the MWS Developer's Guide, or reviewing the sample code published along side this library.", -1, "InvalidServiceUrl", "Sender", null,  null, null) {
                };
            }
            // SubmitFeed will be the only MWS API function that will stream requests to the server.
            if( request instanceof SubmitFeedRequest ) {
                
                // For SubmitFeed, HTTP body is reserved for the Feed Content and the function parameters 
                // are contained within the HTTP header
                SubmitFeedRequest sfr = (SubmitFeedRequest)request;
                
                method = new HttpPost( config.getServiceURL() + "?" + getSubmitFeedUrlParameters( parameters ) );
               
                method.setEntity( new InputStreamEntity(sfr.getFeedContent() , -1) );

                /* Set content type and encoding - encoding and charset are ignored right now because
                 * octet-stream is the only supported transport of MWS feeds. */
                method.addHeader(new BasicHeader("Content-Type", sfr.getContentType().toString()));
                
            }
            else {
                method = new HttpPost(config.getServiceURL());
                log.debug("Adding required parameters...");
                addRequiredParametersToRequest(method, parameters);               

                /* Set content type and encoding */
                log.debug("Setting content-type to application/x-www-form-urlencoded; charset=" + DEFAULT_ENCODING.toLowerCase());
                method.addHeader(new BasicHeader("Content-Type", "application/x-www-form-urlencoded; charset=" + DEFAULT_ENCODING.toLowerCase()));

                log.debug("Done adding additional required parameters. Parameters now: " + parameters);
            }
            
            for(Header head: defaultHeaders) {
            	method.addHeader(head);
            }
           
        } 
        catch( Throwable t ) {
            throw new MarketplaceWebServiceException( t );
        }
        
        int status = -1;
        
        log.debug("Invoking" + actionName + " request. Current parameters: " + parameters);
        try {
            boolean shouldRetry = true;
            int retries = 0;
            do {
                log.debug("Sending Request to host:  " + config.getServiceURL());

                try {

                    /* Submit request */
                    HttpResponse postResponse;
                    postResponse = httpClient.execute(method, httpContext);
                    status = postResponse.getStatusLine().getStatusCode();

                    responseHeaderMetadata = getResponseHeaderMetadata(postResponse);
                    
                    // GetFeedSubmissionResult and GetReport will be the only MWS API functions that will stream
                    // server responses.
                    boolean isStreamingResponse = (request instanceof GetFeedSubmissionResultRequest || request instanceof GetReportRequest); 
                    
                    if( !isStreamingResponse ) {
                        // SubmitFeed
                        responseBodyString = getResponsBodyAsString(postResponse.getEntity().getContent());
                        assert( responseBodyString != null );
                    }
                    
                    /* Successful response. Attempting to unmarshal into the <Action>Response type */
                    if (status == HttpStatus.SC_OK && responseBodyString != null) {
                        shouldRetry = false;
                        log.debug("Received Response. Status: " + status + ". " +
                                "Response Body: " + responseBodyString);

                        log.debug("Attempting to unmarshal into the " + actionName + "Response type...");
                        response = clazz.cast(getUnmarshaller().unmarshal(new StreamSource(new StringReader(responseBodyString))));
                        responseHeaderMetadataSetter.invoke(response, responseHeaderMetadata);

                        log.debug("Unmarshalled response into " + actionName + "Response type.");

                    } 
                    else if (status == HttpStatus.SC_OK && isStreamingResponse ) {
                        
                        Method outputStreamGetter = null;
                        for( Method m : request.getClass().getMethods() ) {
                            if( m.getName().matches( "get.+OutputStream$" ) ) {
                                outputStreamGetter = m;
                            }
                        }

                        OutputStream originalOs = (OutputStream)outputStreamGetter.invoke( request, new Object[0] );
                        
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        DigestOutputStream os = new DigestOutputStream(originalOs, messageDigest);
                        
                        // Streaming-response-as-unnamed-body responses from MWS
                        // must carry the generated unique request id as a HTTP
                        // header (x-amz-request-id) as it cannot be passed in a
                        // wrapper to the XML response.
                        String requestIdFromHeader = null;
                        {
                            requestIdFromHeader = getFirstHeader(postResponse, "x-amz-request-id").getValue();
                            
                            // Avoid use of the JDK-1.6-only isEmpty() call.
                            if(requestIdFromHeader==null || requestIdFromHeader.length()==0) {
                                throw new MarketplaceWebServiceException(
                                    "no request id returned in the x-amz-request-id HTTP header " +
                                    "for a streaming response call - please contact Amazon");
                            }
                        }
                        
                        String returnedContentMD5 = null;
                        
                       	returnedContentMD5 = getFirstHeader(postResponse, "Content-MD5").getValue();
                        
                        copyResponseToOutputStream(postResponse.getEntity().getContent(), os);
                        
                        // Streaming-response-as-unnamed-body responses from MWS
                        // must also carry a Content-MD5 header and it must
                        // match the calculated MD5 for the body.
                        String calculatedContentMD5 = new String(Base64.encodeBase64(messageDigest.digest()), "UTF-8");
                        if(!calculatedContentMD5.equals(returnedContentMD5)) {
                            throw new MarketplaceWebServiceException(
                                    "Content-MD5 HTTP header transmitted by MWS ("+returnedContentMD5+") " +
                                    "does not match the calculated MD5 ("+calculatedContentMD5+") " +
                                    "in request id "+requestIdFromHeader+" - please contact Amazon");
                        }
                        
                        response = clazz.newInstance();
                        responseHeaderMetadataSetter.invoke(response, responseHeaderMetadata);
                        if( clazz == GetFeedSubmissionResultResponse.class ) {
                            GetFeedSubmissionResultResponse r = (GetFeedSubmissionResultResponse)response;
                            r.setGetFeedSubmissionResultResult( new GetFeedSubmissionResultResult( returnedContentMD5 ) );
                            r.setResponseMetadata( new ResponseMetadata( requestIdFromHeader ) );
                        }
                        else if( clazz == GetReportResponse.class ) {
                            GetReportResponse r = (GetReportResponse)response;
                            r.setGetReportResult( new GetReportResult( returnedContentMD5 ) );
                            r.setResponseMetadata( new ResponseMetadata( requestIdFromHeader ) );
                        } else {
                            throw new MarketplaceWebServiceException(
                                    "unexpected streaming-response class "+clazz.getName()
                                    +" - please contact Amazon");
                        }
                        
                        shouldRetry = false;
                        log.debug( "Received streaming response." );

                    } else { /* Unsucessful response. Attempting to unmarshall into ErrorResponse  type */

                        if( isStreamingResponse ) {
                            // Response body contains error message.
                            responseBodyString = getResponsBodyAsString(postResponse.getEntity().getContent());
                        }
                        

                        log.debug("Received Response. Status: " + status + "." );

                        if (status == HttpStatus.SC_INTERNAL_SERVER_ERROR
                        		&& !(request instanceof SubmitFeedRequest)
                        		&& pauseIfRetryNeeded(++retries)){
                            shouldRetry = true;
                        }else {
                            log.debug("Attempting to unmarshal into the ErrorResponse type...");
                            ErrorResponse errorResponse = (ErrorResponse) getUnmarshaller().unmarshal(new StreamSource(new StringReader(responseBodyString)));

                            log.debug("Unmarshalled response into the ErrorResponse type.");

                            com.amazonaws.mws.model.Error error = errorResponse.getError().get(0);
                            
                            if(status == HttpStatus.SC_SERVICE_UNAVAILABLE  
                            		&& !(error.getCode().equals("RequestThrottled"))
                            		&& !(request instanceof SubmitFeedRequest)
                            		&& pauseIfRetryNeeded(++retries)) {
                        		shouldRetry = true;
                            } else {
                            	shouldRetry=false;	
                            	throw new MarketplaceWebServiceException(
                            		(((request instanceof SubmitFeedRequest) && (error.getType().equals("Receiver")))? 
                            			error.getMessage() + " [Cannot retry SubmitFeed request: must reset InputStream to retry.]" : 
                            			error.getMessage()),
                                    status,
                                    error.getCode(),
                                    error.getType(),
                                    errorResponse.getRequestId(),
                                    errorResponse.toXML(),
                                    responseHeaderMetadata);
                            }
                        }
                    }
                } catch (JAXBException je) {
                    /* Response cannot be unmarshalled neither as <Action>Response or ErrorResponse types.
                    Checking for other possible errors. */

                    log.debug ("Caught JAXBException", je);
                    log.debug("Response cannot be unmarshalled neither as " + actionName + "Response or ErrorResponse types." +
                            "Checking for other possible errors.");

                    MarketplaceWebServiceException awse = processErrors(responseBodyString, status, responseHeaderMetadata);

                    throw awse;

                } catch (IOException ioe) {
                    log.error("Caught IOException exception", ioe);
                    if (config.isSetProxyHost() && config.isSetProxyPort() && ioe instanceof javax.net.ssl.SSLPeerUnverifiedException) {
                        String error = "\n*****\n* Perhaps you are attempting to use https protocol to communicate with the proxy that does not support it.\n* If so either enable https on the proxy, or configure the client to use http communications with the proxy.\n* See  MarketplaceWebServiceClientConfig.setProxyProtocol for details.\n*****";
                       log.error(error);
                    }
                    throw new MarketplaceWebServiceException("Internal Error", ioe);
                } catch (Exception e) {
                    log.error("Caught Exception", e);
                    throw new MarketplaceWebServiceException(e);
                } finally {
                    method.releaseConnection();
                }
            } while (shouldRetry);

        } catch (MarketplaceWebServiceException se) {
            log.error("Caught MarketplaceWebServiceException", se);
            throw se;

        } catch (Throwable t) {
            log.error("Caught Exception", t);
            throw new MarketplaceWebServiceException(t);
        }
        return response;
    }

    private Header getFirstHeader(HttpResponse response, String headerName)
    {
        Header[] responseHeaders = response.getHeaders(headerName);
        if (responseHeaders.length > 0)
        {
            return responseHeaders[0];
        }
    	return null;
    }
    private ResponseHeaderMetadata getResponseHeaderMetadata(HttpResponse response) {
      Header requestId = null;
      Header responseContext = null;
      Header timestamp = null;

      requestId = getFirstHeader(response, "x-mws-request-id");
      responseContext = getFirstHeader(response, "x-mws-response-context");
      timestamp = getFirstHeader(response, "x-mws-timestamp");

      return new ResponseHeaderMetadata(
        requestId != null ? requestId.getValue() : null,
        responseContext != null ? responseContext.getValue() : null,
        timestamp != null ? timestamp.getValue() : null);
    }
    
    /**
     * Calculate content MD5 header values for feeds stored on disk.
     */
    private String computeContentMD5HeaderValue( FileInputStream fis ) 
        throws IOException, NoSuchAlgorithmException {
        
        DigestInputStream dis = new DigestInputStream( fis, MessageDigest.getInstance( "MD5" ));
            
        byte[] buffer = new byte[8192];
        while( dis.read( buffer ) > 0 );
            
        String md5Content = new String( Base64.encodeBase64(dis.getMessageDigest().digest()) );
        
        // Effectively resets the stream to be beginning of the file via a FileChannel.
        fis.getChannel().position( 0 );
        
        return md5Content;
    }

    /**
     * Read stream into string
     * @param input stream to read
     */
    private String getResponsBodyAsString(InputStream input) throws IOException {
        String responsBodyString = null;
        try {
            Reader reader = new InputStreamReader(input, DEFAULT_ENCODING);
            StringBuilder b = new StringBuilder();
            char[] c = new char[1024];
            int len;
            while (0 < (len = reader.read(c))) {
                b.append(c, 0, len);
            }
            responsBodyString = b.toString();
        } finally {
            input.close();
        }
        return responsBodyString;
    }

    /**
     * Exponential sleep on failed request. Sleeps and returns true if retry needed
     * @param retries current retry
     * @throws InterruptedException
     */
    private boolean pauseIfRetryNeeded(int retries)
          throws InterruptedException {
        if (retries <= config.getMaxErrorRetry()) {
            long delay = (long) (Math.pow(4, retries) * 100L);
            log.debug("Retriable error detected, will retry in " + delay + "ms, attempt numer: " + retries);
            Thread.sleep(delay);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Add authentication related and version parameter and set request body
     * with all of the parameters
     * @throws UnsupportedEncodingException 
     */
    private void addRequiredParametersToRequest(HttpPost method, Map<String, String> parameters)
            throws SignatureException, UnsupportedEncodingException {
        addRequiredParameters(parameters);
        List <NameValuePair> parameterList = new ArrayList <NameValuePair>();
        for (Entry<String, String> entry : parameters.entrySet()) {
            String key = entry.getKey()==null ? "" : entry.getKey();
            String value = entry.getValue()==null ? "" : entry.getValue();
            parameterList.add(new BasicNameValuePair(key, value));
        }
        method.setEntity(new UrlEncodedFormEntity(parameterList, HTTP.UTF_8));

    }

    private MarketplaceWebServiceException processErrors(String responseString, int status, ResponseHeaderMetadata metadata)  {
        MarketplaceWebServiceException ex = null;
        Matcher matcher = null;
        if (responseString != null && responseString.startsWith("<")) {
            matcher = ERROR_PATTERN_ONE.matcher(responseString);
            if (matcher.matches()) {
                ex = new MarketplaceWebServiceException(matcher.group(3), status,
                        matcher.group(2), "Unknown", matcher.group(1), responseString, metadata);
            } else {
                matcher = ERROR_PATTERN_TWO.matcher(responseString);
                if (matcher.matches()) {
                    ex = new MarketplaceWebServiceException(matcher.group(2), status,
                            matcher.group(1), "Unknown", matcher.group(4), responseString, metadata);
            } else {
                ex =  new MarketplaceWebServiceException("Internal Error", status, metadata);
                log.error("Service Error. Response Status: " + status + ". Received message: " + responseString);
            }
            }
        } else {
            ex =  new MarketplaceWebServiceException("Internal Error", status, metadata);
            log.error("Service Error. Response Status: " + status + ". Received message: " + responseString);
        }
        return ex;
    }

    /**
     * Formats date as ISO 8601 timestamp
     */
    private String getFormattedTimestamp() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        df.setTimeZone(TimeZone.getTimeZone("UTC"));
        return df.format(new Date());
    }

    /**
     * Computes RFC 2104-compliant HMAC signature for request parameters
     * Implements AWS Signature, as per following spec:
     *
     * If Signature Version is 1, it performs the following:
     *
     * Sorts all  parameters (including SignatureVersion and excluding Signature,
     * the value of which is being created), ignoring case.
     *
     * Iterate over the sorted list and append the parameter name (in original case)
     * and then its value. It will not URL-encode the parameter values before
     * constructing this string. There are no separators.
     *
     * If Signature Version is 2, string to sign is based on following:
     *
     *    1. The HTTP Request Method followed by an ASCII newline (%0A)
     *    2. The HTTP Host header in the form of lowercase host, followed by an ASCII newline.
     *    3. The URL encoded HTTP absolute path component of the URI
     *       (up to but not including the query string parameters);
     *       if this is empty use a forward '/'. This parameter is followed by an ASCII newline.
     *    4. The concatenation of all query string components (names and values)
     *       as UTF-8 characters which are URL encoded as per RFC 3986
     *       (hex characters MUST be uppercase), sorted using lexicographic byte ordering.
     *       Parameter names are separated from their values by the '=' character
     *       (ASCII character 61), even if the value is empty.
     *       Pairs of parameter and values are separated by the '&' character (ASCII code 38).
     *
     */
    private String signParameters(Map<String, String> parameters, String key)
            throws  SignatureException {

        String signatureVersion = parameters.get("SignatureVersion");
        String algorithm = "HmacSHA1";
        String stringToSign = null;
        if ("2".equals(signatureVersion)) {
            algorithm = config.getSignatureMethod();
            parameters.put("SignatureMethod", algorithm);
            stringToSign = calculateStringToSignV2(parameters);
        } else {
            throw new SignatureException("Invalid Signature Version specified");
        }
        log.debug("Calculated string to sign: " + stringToSign);
        return sign(stringToSign, key, algorithm);
    }

    /**
     * Calculate String to Sign for SignatureVersion 2
     * @param parameters request parameters
     * @return String to Sign
     * @throws SignatureException
     */
    private String calculateStringToSignV2(Map<String, String> parameters)
            throws SignatureException {
        StringBuilder data = new StringBuilder();
        data.append("POST");
        data.append("\n");
        URI endpoint = null;
        try {
            endpoint = new URI(config.getServiceURL().toLowerCase());
        } catch (URISyntaxException ex) {
            log.error("URI Syntax Exception", ex);
            throw new SignatureException("URI Syntax Exception thrown " +
                    "while constructing string to sign", ex);
        }
        data.append(endpoint.getHost());
        if (!usesAStandardPort(config.getServiceURL())) {
            data.append(":");
            data.append(endpoint.getPort());
        }
        data.append("\n");
        String uri = endpoint.getPath();
        if (uri == null || uri.length() == 0) {
            uri = "/";
        }
        data.append(uri);
        data.append("\n");
        Map<String, String> sorted = new TreeMap<String, String>();
        sorted.putAll(parameters);
        Iterator<Entry<String, String>> pairs = sorted.entrySet().iterator();
        while (pairs.hasNext()) {
            Entry<String, String> pair = pairs.next();
            String key = pair.getKey();
            data.append(urlEncode(key));
            data.append("=");
            String value = pair.getValue();
            data.append(urlEncode(value));
            if (pairs.hasNext()) {
                data.append("&");
            }
        }        
        return data.toString();
    }
    
    private static boolean usesHttps(String url){
        URL urlToCheck;
        try {
            urlToCheck = new URL(url);
        } catch (MalformedURLException e) {
            return false;
        }
        if (urlToCheck.getProtocol().equals("https")){
            return true;
        }else
        {
            return false;
        }
    }

    private static int extractPortNumber(String url, boolean usesHttps) {
        URL urlToCheck;
        try {
            urlToCheck = new URL(url);
        } catch (MalformedURLException e) {
            throw new RuntimeException("not a URL", e);
        }
        
        int portNumber = urlToCheck.getPort();
        if (portNumber == -1){
            // no port was specified
            if (usesHttps){
                // it uses https, so we should return the standard https port number
                return 443;
            }else
            {
                // it uses http, so we should return the standard http port number
                return 80;
            }
        }else
        {
            return portNumber;
        }
    }

    private static boolean usesAStandardPort(String url) {
        boolean usesHttps = usesHttps(url);
        int portNumber = extractPortNumber(url, usesHttps);
        return usesHttps && portNumber == 443
            || !usesHttps && portNumber == 80;
    }

    private String urlEncode(String rawValue) {
        String value = rawValue==null ? "" : rawValue;
        String encoded = null;
        try {
            encoded = URLEncoder.encode(value, DEFAULT_ENCODING)
                                        .replace("+", "%20")
                                        .replace("*", "%2A")
                                        .replace("%7E","~");
        } catch (UnsupportedEncodingException ex) {
            log.error("Unsupported Encoding Exception", ex);
            throw new RuntimeException(ex);
        }
        return encoded;
    }

    /**
     * Computes RFC 2104-compliant HMAC signature.
     *
     */
    private String sign(String data, String key, String algorithm) throws SignatureException {
        byte [] signature;
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.getBytes(), algorithm));
            signature = Base64.encodeBase64(mac.doFinal(data.getBytes(DEFAULT_ENCODING)));
        } catch (Exception e) {
            throw new SignatureException("Failed to generate signature: " + e.getMessage(), e);
        }

        return new String(signature);
    }

    /**
     * Get unmarshaller for current thread
     */
    private Unmarshaller getUnmarshaller() {
        return unmarshaller.get();
    }
                                    /**
     * Convert GetReportRequest to name value pairs
     */
    private Map<String, String> convertGetReport(GetReportRequest request) {
        
        Map<String, String> params = new HashMap<String, String>();
        params.put("Action", "GetReport");
        if (request.isSetMarketplace()) {
            params.put("Marketplace", request.getMarketplace());
        }
        if (request.isSetMerchant()) {
            params.put("Merchant", request.getMerchant());
        }
        if(request.isSetMWSAuthToken()) {
        	params.put("MWSAuthToken", request.getMWSAuthToken());
        }
        if (request.isSetReportId()) {
            params.put("ReportId", request.getReportId());
        }

        return params;
    }
        
                                    /**
     * Convert GetReportScheduleCountRequest to name value pairs
     */
    private Map<String, String> convertGetReportScheduleCount(GetReportScheduleCountRequest request) {
        
        Map<String, String> params = new HashMap<String, String>();
        params.put("Action", "GetReportScheduleCount");
        if (request.isSetMarketplace()) {
            params.put("Marketplace", request.getMarketplace());
        }
        if (request.isSetMerchant()) {
            params.put("Merchant", request.getMerchant());
        }
        if(request.isSetMWSAuthToken()) {
        	params.put("MWSAuthToken", request.getMWSAuthToken());
        }
        if (request.isSetReportTypeList()) {
            TypeList  reportTypeList = request.getReportTypeList();
            List<String> typeList  =  reportTypeList.getType();
            for  (String type : typeList) { 
                params.put("ReportTypeList" + "." + "Type" + "."  + (typeList.indexOf(type) + 1), type);
            }   
        } 

        return params;
    }
        
                                    /**
     * Convert GetReportRequestListByNextTokenRequest to name value pairs
     */
    private Map<String, String> convertGetReportRequestListByNextToken(GetReportRequestListByNextTokenRequest request) {
        
        Map<String, String> params = new HashMap<String, String>();
        params.put("Action", "GetReportRequestListByNextToken");
        if (request.isSetMarketplace()) {
            params.put("Marketplace", request.getMarketplace());
        }
        if (request.isSetMerchant()) {
            params.put("Merchant", request.getMerchant());
        }
        if(request.isSetMWSAuthToken()) {
        	params.put("MWSAuthToken", request.getMWSAuthToken());
        }
        if (request.isSetNextToken()) {
            params.put("NextToken", request.getNextToken());
        }

        return params;
    }
        
                                    /**
     * Convert UpdateReportAcknowledgementsRequest to name value pairs
     */
    private Map<String, String> convertUpdateReportAcknowledgements(UpdateReportAcknowledgementsRequest request) {
        
        Map<String, String> params = new HashMap<String, String>();
        params.put("Action", "UpdateReportAcknowledgements");
        if (request.isSetMarketplace()) {
            params.put("Marketplace", request.getMarketplace());
        }
        if (request.isSetMerchant()) {
            params.put("Merchant", request.getMerchant());
        }
        if(request.isSetMWSAuthToken()) {
        	params.put("MWSAuthToken", request.getMWSAuthToken());
        }
        if (request.isSetReportIdList()) {
            IdList  reportIdList = request.getReportIdList();
            List<String> idList  =  reportIdList.getId();
            for  (String id : idList) { 
                params.put("ReportIdList" + "." + "Id" + "."  + (idList.indexOf(id) + 1), id);
            }   
        } 
        if (request.isSetAcknowledged()) {
            params.put("Acknowledged", request.isAcknowledged() + "");
        }

        return params;
    }
        
                                    /**
     * Convert SubmitFeedRequest to name value pairs
     */
    private Map<String, String> convertSubmitFeed(SubmitFeedRequest request) {
        
        Map<String, String> params = new HashMap<String, String>();
        params.put("Action", "SubmitFeed");
        if (request.isSetMarketplace()) {
            params.put("Marketplace", request.getMarketplace());
        }
        if (request.isSetMarketplaceIdList()) {
            IdList marketplaceIdList = request.getMarketplaceIdList();
            List<String> idList = marketplaceIdList.getId();
            
            for (int i = 0; i < idList.size(); i++) {
                params.put("MarketplaceIdList.Id." + (i + 1), idList.get(i));
            }
        }
        if (request.isSetMerchant()) {
            params.put("Merchant", request.getMerchant());
        }
        if(request.isSetMWSAuthToken()) {
        	params.put("MWSAuthToken", request.getMWSAuthToken());
        }
        if (request.isSetFeedType()) {
            params.put("FeedType", request.getFeedType());
        }
        if (request.isSetPurgeAndReplace()) {
            params.put("PurgeAndReplace", request.isPurgeAndReplace() + "");
        }
        if (request.isSetContentMD5()) {
            params.put("ContentMD5Value", request.getContentMD5());
        }

        return params;
    }
        
                                    /**
     * Convert GetReportCountRequest to name value pairs
     */
    private Map<String, String> convertGetReportCount(GetReportCountRequest request) {
        
        Map<String, String> params = new HashMap<String, String>();
        params.put("Action", "GetReportCount");
        if (request.isSetMarketplace()) {
            params.put("Marketplace", request.getMarketplace());
        }
        if (request.isSetMerchant()) {
            params.put("Merchant", request.getMerchant());
        }
        if(request.isSetMWSAuthToken()) {
        	params.put("MWSAuthToken", request.getMWSAuthToken());
        }
        if (request.isSetReportTypeList()) {
            TypeList  reportTypeList = request.getReportTypeList();
            List<String> typeList  =  reportTypeList.getType();
            for  (String type : typeList) { 
                params.put("ReportTypeList" + "." + "Type" + "."  + (typeList.indexOf(type) + 1), type);
            }   
        } 
        if (request.isSetAcknowledged()) {
            params.put("Acknowledged", request.isAcknowledged() + "");
        }
        if (request.isSetAvailableFromDate()) {
            params.put("AvailableFromDate", request.getAvailableFromDate() + "");
        }
        if (request.isSetAvailableToDate()) {
            params.put("AvailableToDate", request.getAvailableToDate() + "");
        }

        return params;
    }
        
                                    /**
     * Convert GetFeedSubmissionListByNextTokenRequest to name value pairs
     */
    private Map<String, String> convertGetFeedSubmissionListByNextToken(GetFeedSubmissionListByNextTokenRequest request) {
        
        Map<String, String> params = new HashMap<String, String>();
        params.put("Action", "GetFeedSubmissionListByNextToken");
        if (request.isSetMarketplace()) {
            params.put("Marketplace", request.getMarketplace());
        }
        if (request.isSetMerchant()) {
            params.put("Merchant", request.getMerchant());
        }
        if(request.isSetMWSAuthToken()) {
        	params.put("MWSAuthToken", request.getMWSAuthToken());
        }
        if (request.isSetNextToken()) {
            params.put("NextToken", request.getNextToken());
        }

        return params;
    }
        
                                    /**
     * Convert CancelFeedSubmissionsRequest to name value pairs
     */
    private Map<String, String> convertCancelFeedSubmissions(CancelFeedSubmissionsRequest request) {
        
        Map<String, String> params = new HashMap<String, String>();
        params.put("Action", "CancelFeedSubmissions");
        if (request.isSetMarketplace()) {
            params.put("Marketplace", request.getMarketplace());
        }
        if (request.isSetMerchant()) {
            params.put("Merchant", request.getMerchant());
        }
        if(request.isSetMWSAuthToken()) {
        	params.put("MWSAuthToken", request.getMWSAuthToken());
        }

        if (request.isSetFeedSubmissionIdList()) {
            IdList  feedSubmissionIdList = request.getFeedSubmissionIdList();
            List<String> idList  =  feedSubmissionIdList.getId();
            for  (String id : idList) { 
                params.put("FeedSubmissionIdList" + "." + "Id" + "."  + (idList.indexOf(id) + 1), id);
            }   
        } 
        if (request.isSetFeedTypeList()) {
            TypeList  feedTypeList = request.getFeedTypeList();
            List<String> typeList  =  feedTypeList.getType();
            for  (String type : typeList) { 
                params.put("FeedTypeList" + "." + "Type" + "."  + (typeList.indexOf(type) + 1), type);
            }   
        } 
        if (request.isSetSubmittedFromDate()) {
            params.put("SubmittedFromDate", request.getSubmittedFromDate() + "");
        }
        if (request.isSetSubmittedToDate()) {
            params.put("SubmittedToDate", request.getSubmittedToDate() + "");
        }
        
        return params;
    }
        
                                    /**
     * Convert RequestReportRequest to name value pairs
     */
    private Map<String, String> convertRequestReport(RequestReportRequest request) {
        
        Map<String, String> params = new HashMap<String, String>();
        params.put("Action", "RequestReport");
        if (request.isSetMarketplaceIdList()) {
            IdList marketplaceIdList = request.getMarketplaceIdList();
            List<String> idList = marketplaceIdList.getId();
            
            for (int i = 0; i < idList.size(); i++) {
                params.put("MarketplaceIdList.Id." + (i + 1), idList.get(i));
            }
        }
        if (request.isSetMarketplace()) {
            params.put("Marketplace", request.getMarketplace());
        }
        if (request.isSetMerchant()) {
            params.put("Merchant", request.getMerchant());
        }
        if(request.isSetMWSAuthToken()) {
        	params.put("MWSAuthToken", request.getMWSAuthToken());
        }
        if (request.isSetReportType()) {
            params.put("ReportType", request.getReportType());
        }
        if (request.isSetStartDate()) {
            params.put("StartDate", request.getStartDate() + "");
        }
        if (request.isSetEndDate()) {
            params.put("EndDate", request.getEndDate() + "");
        }
        if (request.isSetReportOptions()) {
            params.put("ReportOptions", request.getReportOptions());
        }

        return params;
    }
        
                                    /**
     * Convert GetFeedSubmissionCountRequest to name value pairs
     */
    private Map<String, String> convertGetFeedSubmissionCount(GetFeedSubmissionCountRequest request) {
        
        Map<String, String> params = new HashMap<String, String>();
        params.put("Action", "GetFeedSubmissionCount");
        if (request.isSetMarketplace()) {
            params.put("Marketplace", request.getMarketplace());
        }
        if (request.isSetMerchant()) {
            params.put("Merchant", request.getMerchant());
        }
        if(request.isSetMWSAuthToken()) {
        	params.put("MWSAuthToken", request.getMWSAuthToken());
        }
        if (request.isSetFeedTypeList()) {
            TypeList  feedTypeList = request.getFeedTypeList();
            List<String> typeList  =  feedTypeList.getType();
            for  (String type : typeList) { 
                params.put("FeedTypeList" + "." + "Type" + "."  + (typeList.indexOf(type) + 1), type);
            }   
        } 
        if (request.isSetFeedProcessingStatusList()) {
            StatusList  feedProcessingStatusList = request.getFeedProcessingStatusList();
            List<String> statusList  =  feedProcessingStatusList.getStatus();
            for  (String status : statusList) { 
                params.put("FeedProcessingStatusList" + "." + "Status" + "."  + (statusList.indexOf(status) + 1), status);
            }   
        } 
        if (request.isSetSubmittedFromDate()) {
            params.put("SubmittedFromDate", request.getSubmittedFromDate() + "");
        }
        if (request.isSetSubmittedToDate()) {
            params.put("SubmittedToDate", request.getSubmittedToDate() + "");
        }

        return params;
    }
        
                                    /**
     * Convert CancelReportRequestsRequest to name value pairs
     */
    private Map<String, String> convertCancelReportRequests(CancelReportRequestsRequest request) {
        
        Map<String, String> params = new HashMap<String, String>();
        params.put("Action", "CancelReportRequests");
        if (request.isSetMarketplace()) {
            params.put("Marketplace", request.getMarketplace());
        }
        if (request.isSetMerchant()) {
            params.put("Merchant", request.getMerchant());
        }
        if(request.isSetMWSAuthToken()) {
        	params.put("MWSAuthToken", request.getMWSAuthToken());
        }
        if (request.isSetReportRequestIdList()) {
            IdList  reportRequestIdList = request.getReportRequestIdList();
            List<String> idList  =  reportRequestIdList.getId();
            for  (String id : idList) { 
                params.put("ReportRequestIdList" + "." + "Id" + "."  + (idList.indexOf(id) + 1), id);
            }   
        } 
        if (request.isSetReportTypeList()) {
            TypeList  reportTypeList = request.getReportTypeList();
            List<String> typeList  =  reportTypeList.getType();
            for  (String type : typeList) { 
                params.put("ReportTypeList" + "." + "Type" + "."  + (typeList.indexOf(type) + 1), type);
            }   
        } 
        if (request.isSetReportProcessingStatusList()) {
            StatusList  reportProcessingStatusList = request.getReportProcessingStatusList();
            List<String> statusList  =  reportProcessingStatusList.getStatus();
            for  (String status : statusList) { 
                params.put("ReportProcessingStatusList" + "." + "Status" + "."  + (statusList.indexOf(status) + 1), status);
            }   
        } 
        if (request.isSetRequestedFromDate()) {
            params.put("RequestedFromDate", request.getRequestedFromDate() + "");
        }
        if (request.isSetRequestedToDate()) {
            params.put("RequestedToDate", request.getRequestedToDate() + "");
        }

        return params;
    }
        
                                    /**
     * Convert GetReportListRequest to name value pairs
     */
    private Map<String, String> convertGetReportList(GetReportListRequest request) {
        
        Map<String, String> params = new HashMap<String, String>();
        params.put("Action", "GetReportList");
        
        if (request.isSetMarketplace()) {
            params.put("Marketplace", request.getMarketplace());
        }
        if (request.isSetMerchant()) {
            params.put("Merchant", request.getMerchant());
        }
        if(request.isSetMWSAuthToken()) {
        	params.put("MWSAuthToken", request.getMWSAuthToken());
        }
        if (request.isSetMaxCount()) {
            params.put("MaxCount", request.getMaxCount() + "");
        }
        if (request.isSetReportTypeList()) {
            TypeList  reportTypeList = request.getReportTypeList();
            List<String> typeList  =  reportTypeList.getType();
            for  (String type : typeList) { 
                params.put("ReportTypeList" + "." + "Type" + "."  + (typeList.indexOf(type) + 1), type);
            }   
        } 
        if (request.isSetAcknowledged()) {
            params.put("Acknowledged", request.isAcknowledged() + "");
        }
        if (request.isSetAvailableFromDate()) {
            params.put("AvailableFromDate", request.getAvailableFromDate() + "");
        }
        if (request.isSetAvailableToDate()) {
            params.put("AvailableToDate", request.getAvailableToDate() + "");
        }
        if (request.isSetReportRequestIdList()) {
            IdList  reportRequestIdList = request.getReportRequestIdList();
            List<String> idList  =  reportRequestIdList.getId();
            for  (String id : idList) { 
                params.put("ReportRequestIdList" + "." + "Id" + "."  + (idList.indexOf(id) + 1), id);
            }   
        } 

        return params;
    }
        
                                    /**
     * Convert GetFeedSubmissionResultRequest to name value pairs
     */
    private Map<String, String> convertGetFeedSubmissionResult(GetFeedSubmissionResultRequest request) {
        
        Map<String, String> params = new HashMap<String, String>();
        params.put("Action", "GetFeedSubmissionResult");
        if (request.isSetMarketplace()) {
            params.put("Marketplace", request.getMarketplace());
        }
        if (request.isSetMerchant()) {
            params.put("Merchant", request.getMerchant());
        }
        if(request.isSetMWSAuthToken()) {
        	params.put("MWSAuthToken", request.getMWSAuthToken());
        }
        if (request.isSetFeedSubmissionId()) {
            params.put("FeedSubmissionId", request.getFeedSubmissionId());
        }

        return params;
    }
        
                                    /**
     * Convert GetFeedSubmissionListRequest to name value pairs
     */
    private Map<String, String> convertGetFeedSubmissionList(GetFeedSubmissionListRequest request) {
        
        Map<String, String> params = new HashMap<String, String>();
        params.put("Action", "GetFeedSubmissionList");
        if (request.isSetMarketplace()) {
            params.put("Marketplace", request.getMarketplace());
        }
        if (request.isSetMerchant()) {
            params.put("Merchant", request.getMerchant());
        }
        if(request.isSetMWSAuthToken()) {
        	params.put("MWSAuthToken", request.getMWSAuthToken());
        }
        if (request.isSetFeedSubmissionIdList()) {
            IdList  feedSubmissionIdList = request.getFeedSubmissionIdList();
            List<String> idList  =  feedSubmissionIdList.getId();
            for  (String id : idList) { 
                params.put("FeedSubmissionIdList" + "." + "Id" + "."  + (idList.indexOf(id) + 1), id);
            }   
        } 
        if (request.isSetMaxCount()) {
            params.put("MaxCount", request.getMaxCount() + "");
        }
        if (request.isSetFeedTypeList()) {
            TypeList  feedTypeList = request.getFeedTypeList();
            List<String> typeList  =  feedTypeList.getType();
            for  (String type : typeList) { 
                params.put("FeedTypeList" + "." + "Type" + "."  + (typeList.indexOf(type) + 1), type);
            }   
        } 
        if (request.isSetFeedProcessingStatusList()) {
            StatusList  feedProcessingStatusList = request.getFeedProcessingStatusList();
            List<String> statusList  =  feedProcessingStatusList.getStatus();
            for  (String status : statusList) { 
                params.put("FeedProcessingStatusList" + "." + "Status" + "."  + (statusList.indexOf(status) + 1), status);
            }   
        } 
        if (request.isSetSubmittedFromDate()) {
            params.put("SubmittedFromDate", request.getSubmittedFromDate() + "");
        }
        if (request.isSetSubmittedToDate()) {
            params.put("SubmittedToDate", request.getSubmittedToDate() + "");
        }

        return params;
    }
        
                                    /**
     * Convert GetReportRequestListRequest to name value pairs
     */
    private Map<String, String> convertGetReportRequestList(GetReportRequestListRequest request) {
        
        Map<String, String> params = new HashMap<String, String>();
        params.put("Action", "GetReportRequestList");
        if (request.isSetMarketplace()) {
            params.put("Marketplace", request.getMarketplace());
        }
        if (request.isSetMerchant()) {
            params.put("Merchant", request.getMerchant());
        }
        if(request.isSetMWSAuthToken()) {
        	params.put("MWSAuthToken", request.getMWSAuthToken());
        }
        if (request.isSetReportRequestIdList()) {
            IdList  reportRequestIdList = request.getReportRequestIdList();
            List<String> idList  =  reportRequestIdList.getId();
            for  (String id : idList) { 
                params.put("ReportRequestIdList" + "." + "Id" + "."  + (idList.indexOf(id) + 1), id);
            }   
        } 
        if (request.isSetReportTypeList()) {
            TypeList  reportTypeList = request.getReportTypeList();
            List<String> typeList  =  reportTypeList.getType();
            for  (String type : typeList) { 
                params.put("ReportTypeList" + "." + "Type" + "."  + (typeList.indexOf(type) + 1), type);
            }   
        } 
        if (request.isSetReportProcessingStatusList()) {
            StatusList  reportProcessingStatusList = request.getReportProcessingStatusList();
            List<String> statusList  =  reportProcessingStatusList.getStatus();
            for  (String status : statusList) { 
                params.put("ReportProcessingStatusList" + "." + "Status" + "."  + (statusList.indexOf(status) + 1), status);
            }   
        } 
        if (request.isSetMaxCount()) {
            params.put("MaxCount", request.getMaxCount() + "");
        }
        if (request.isSetRequestedFromDate()) {
            params.put("RequestedFromDate", request.getRequestedFromDate() + "");
        }
        if (request.isSetRequestedToDate()) {
            params.put("RequestedToDate", request.getRequestedToDate() + "");
        }

        return params;
    }
        
                                    /**
     * Convert GetReportScheduleListByNextTokenRequest to name value pairs
     */
    private Map<String, String> convertGetReportScheduleListByNextToken(GetReportScheduleListByNextTokenRequest request) {
        
        Map<String, String> params = new HashMap<String, String>();
        params.put("Action", "GetReportScheduleListByNextToken");
        if (request.isSetMarketplace()) {
            params.put("Marketplace", request.getMarketplace());
        }
        if (request.isSetMerchant()) {
            params.put("Merchant", request.getMerchant());
        }
        if(request.isSetMWSAuthToken()) {
        	params.put("MWSAuthToken", request.getMWSAuthToken());
        }
        if (request.isSetNextToken()) {
            params.put("NextToken", request.getNextToken());
        }

        return params;
    }
        
                                    /**
     * Convert GetReportListByNextTokenRequest to name value pairs
     */
    private Map<String, String> convertGetReportListByNextToken(GetReportListByNextTokenRequest request) {
        
        Map<String, String> params = new HashMap<String, String>();
        params.put("Action", "GetReportListByNextToken");
        if (request.isSetMarketplace()) {
            params.put("Marketplace", request.getMarketplace());
        }
        if (request.isSetMerchant()) {
            params.put("Merchant", request.getMerchant());
        }
        if(request.isSetMWSAuthToken()) {
        	params.put("MWSAuthToken", request.getMWSAuthToken());
        }
        if (request.isSetNextToken()) {
            params.put("NextToken", request.getNextToken());
        }

        return params;
    }
        
                                    /**
     * Convert ManageReportScheduleRequest to name value pairs
     */
    private Map<String, String> convertManageReportSchedule(ManageReportScheduleRequest request) {
        
        Map<String, String> params = new HashMap<String, String>();
        params.put("Action", "ManageReportSchedule");
        if (request.isSetMarketplace()) {
            params.put("Marketplace", request.getMarketplace());
        }
        if (request.isSetMerchant()) {
            params.put("Merchant", request.getMerchant());
        }
        if(request.isSetMWSAuthToken()) {
        	params.put("MWSAuthToken", request.getMWSAuthToken());
        }
        if (request.isSetReportType()) {
            params.put("ReportType", request.getReportType());
        }
        if (request.isSetSchedule()) {
            params.put("Schedule", request.getSchedule());
        }
        if (request.isSetScheduleDate()) {
            params.put("ScheduleDate", request.getScheduleDate() + "");
        }

        return params;
    }
        
                                    /**
     * Convert GetReportRequestCountRequest to name value pairs
     */
    private Map<String, String> convertGetReportRequestCount(GetReportRequestCountRequest request) {
        
        Map<String, String> params = new HashMap<String, String>();
        params.put("Action", "GetReportRequestCount");
        if (request.isSetMarketplace()) {
            params.put("Marketplace", request.getMarketplace());
        }
        if (request.isSetMerchant()) {
            params.put("Merchant", request.getMerchant());
        }
        if(request.isSetMWSAuthToken()) {
        	params.put("MWSAuthToken", request.getMWSAuthToken());
        }
        if (request.isSetReportTypeList()) {
            TypeList  reportTypeList = request.getReportTypeList();
            List<String> typeList  =  reportTypeList.getType();
            for  (String type : typeList) { 
                params.put("ReportTypeList" + "." + "Type" + "."  + (typeList.indexOf(type) + 1), type);
            }   
        } 
        if (request.isSetReportProcessingStatusList()) {
            StatusList  reportProcessingStatusList = request.getReportProcessingStatusList();
            List<String> statusList  =  reportProcessingStatusList.getStatus();
            for  (String status : statusList) { 
                params.put("ReportProcessingStatusList" + "." + "Status" + "."  + (statusList.indexOf(status) + 1), status);
            }   
        } 
        if (request.isSetRequestedFromDate()) {
            params.put("RequestedFromDate", request.getRequestedFromDate() + "");
        }
        if (request.isSetRequestedToDate()) {
            params.put("RequestedToDate", request.getRequestedToDate() + "");
        }

        return params;
    }
        
                                    /**
     * Convert GetReportScheduleListRequest to name value pairs
     */
    private Map<String, String> convertGetReportScheduleList(GetReportScheduleListRequest request) {
        
        Map<String, String> params = new HashMap<String, String>();
        params.put("Action", "GetReportScheduleList");
        if (request.isSetMarketplace()) {
            params.put("Marketplace", request.getMarketplace());
        }
        if (request.isSetMerchant()) {
            params.put("Merchant", request.getMerchant());
        }
        if(request.isSetMWSAuthToken()) {
        	params.put("MWSAuthToken", request.getMWSAuthToken());
        }
        if (request.isSetReportTypeList()) {
            TypeList  reportTypeList = request.getReportTypeList();
            List<String> typeList  =  reportTypeList.getType();
            for  (String type : typeList) { 
                params.put("ReportTypeList" + "." + "Type" + "."  + (typeList.indexOf(type) + 1), type);
            }   
        } 

        return params;
    }
        
                                                                                                                                                
}
