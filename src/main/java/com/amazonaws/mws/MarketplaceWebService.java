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
 *  Generated: Wed Feb 18 13:28:48 PST 2009 
 * 
 */



package com.amazonaws.mws;

import com.amazonaws.mws.model.*;

import java.util.concurrent.Future;



/**
 * The Amazon Marketplace Web Service contain APIs for inventory and order management.
 * 
 * 
 */
public interface  MarketplaceWebService {
    

            
    /**
     * Get Report 
     *
     * The GetReport operation returns the contents of a report. Reports can potentially be
     * very large (>100MB) which is why we only return one report at a time, and in a
     * streaming fashion.
     *   
     * @param request
     *          GetReport Action
     * @return
     *          GetReport Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportResponse getReport(GetReportRequest request) throws MarketplaceWebServiceException;

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
    public Future<GetReportResponse> getReportAsync(GetReportRequest request);


            
    /**
     * Get Report Schedule Count 
     *
     * returns the number of report schedules
     *   
     * @param request
     *          GetReportScheduleCount Action
     * @return
     *          GetReportScheduleCount Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportScheduleCountResponse getReportScheduleCount(GetReportScheduleCountRequest request) throws MarketplaceWebServiceException;

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
    public Future<GetReportScheduleCountResponse> getReportScheduleCountAsync(GetReportScheduleCountRequest request);


            
    /**
     * Get Report Request List By Next Token 
     *
     * retrieve the next batch of list items and if there are more items to retrieve
     *   
     * @param request
     *          GetReportRequestListByNextToken Action
     * @return
     *          GetReportRequestListByNextToken Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportRequestListByNextTokenResponse getReportRequestListByNextToken(GetReportRequestListByNextTokenRequest request) throws MarketplaceWebServiceException;

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
    public Future<GetReportRequestListByNextTokenResponse> getReportRequestListByNextTokenAsync(GetReportRequestListByNextTokenRequest request);


            
    /**
     * Update Report Acknowledgements 
     *
     * The UpdateReportAcknowledgements operation updates the acknowledged status of one or more reports.
     *   
     * @param request
     *          UpdateReportAcknowledgements Action
     * @return
     *          UpdateReportAcknowledgements Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public UpdateReportAcknowledgementsResponse updateReportAcknowledgements(UpdateReportAcknowledgementsRequest request) throws MarketplaceWebServiceException;

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
    public Future<UpdateReportAcknowledgementsResponse> updateReportAcknowledgementsAsync(UpdateReportAcknowledgementsRequest request);


            
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
     *          SubmitFeed Action
     * @return
     *          SubmitFeed Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public SubmitFeedResponse submitFeed(SubmitFeedRequest request) throws MarketplaceWebServiceException;

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
    public Future<SubmitFeedResponse> submitFeedAsync(SubmitFeedRequest request);


            
    /**
     * Get Report Count 
     *
     * returns a count of reports matching your criteria;
     * by default, the number of reports generated in the last 90 days,
     * regardless of acknowledgement status
     *   
     * @param request
     *          GetReportCount Action
     * @return
     *          GetReportCount Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportCountResponse getReportCount(GetReportCountRequest request) throws MarketplaceWebServiceException;

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
    public Future<GetReportCountResponse> getReportCountAsync(GetReportCountRequest request);


            
    /**
     * Get Feed Submission List By Next Token 
     *
     * retrieve the next batch of list items and if there are more items to retrieve
     *   
     * @param request
     *          GetFeedSubmissionListByNextToken Action
     * @return
     *          GetFeedSubmissionListByNextToken Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetFeedSubmissionListByNextTokenResponse getFeedSubmissionListByNextToken(GetFeedSubmissionListByNextTokenRequest request) throws MarketplaceWebServiceException;

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
    public Future<GetFeedSubmissionListByNextTokenResponse> getFeedSubmissionListByNextTokenAsync(GetFeedSubmissionListByNextTokenRequest request);


            
    /**
     * Cancel Feed Submissions 
     *
     * cancels feed submissions - by default all of the submissions of the
     * last 30 days that have not started processing
     *   
     * @param request
     *          CancelFeedSubmissions Action
     * @return
     *          CancelFeedSubmissions Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public CancelFeedSubmissionsResponse cancelFeedSubmissions(CancelFeedSubmissionsRequest request) throws MarketplaceWebServiceException;

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
    public Future<CancelFeedSubmissionsResponse> cancelFeedSubmissionsAsync(CancelFeedSubmissionsRequest request);


            
    /**
     * Request Report 
     *
     * requests the generation of a report
     *   
     * @param request
     *          RequestReport Action
     * @return
     *          RequestReport Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public RequestReportResponse requestReport(RequestReportRequest request) throws MarketplaceWebServiceException;

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
    public Future<RequestReportResponse> requestReportAsync(RequestReportRequest request);


            
    /**
     * Get Feed Submission Count 
     *
     * returns the number of feeds matching all of the specified criteria
     *   
     * @param request
     *          GetFeedSubmissionCount Action
     * @return
     *          GetFeedSubmissionCount Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetFeedSubmissionCountResponse getFeedSubmissionCount(GetFeedSubmissionCountRequest request) throws MarketplaceWebServiceException;

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
    public Future<GetFeedSubmissionCountResponse> getFeedSubmissionCountAsync(GetFeedSubmissionCountRequest request);


            
    /**
     * Cancel Report Requests 
     *
     * cancels report requests that have not yet started processing,
     * by default all those within the last 90 days
     *   
     * @param request
     *          CancelReportRequests Action
     * @return
     *          CancelReportRequests Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public CancelReportRequestsResponse cancelReportRequests(CancelReportRequestsRequest request) throws MarketplaceWebServiceException;

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
    public Future<CancelReportRequestsResponse> cancelReportRequestsAsync(CancelReportRequestsRequest request);


            
    /**
     * Get Report List 
     *
     * returns a list of reports; by default the most recent ten reports,
     * regardless of their acknowledgement status
     *   
     * @param request
     *          GetReportList Action
     * @return
     *          GetReportList Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportListResponse getReportList(GetReportListRequest request) throws MarketplaceWebServiceException;

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
    public Future<GetReportListResponse> getReportListAsync(GetReportListRequest request);


            
    /**
     * Get Feed Submission Result 
     *
     * retrieves the feed processing report
     *   
     * @param request
     *          GetFeedSubmissionResult Action
     * @return
     *          GetFeedSubmissionResult Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetFeedSubmissionResultResponse getFeedSubmissionResult(GetFeedSubmissionResultRequest request) throws MarketplaceWebServiceException;

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
    public Future<GetFeedSubmissionResultResponse> getFeedSubmissionResultAsync(GetFeedSubmissionResultRequest request);


            
    /**
     * Get Feed Submission List 
     *
     * returns a list of feed submission identifiers and their associated metadata
     *   
     * @param request
     *          GetFeedSubmissionList Action
     * @return
     *          GetFeedSubmissionList Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetFeedSubmissionListResponse getFeedSubmissionList(GetFeedSubmissionListRequest request) throws MarketplaceWebServiceException;

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
    public Future<GetFeedSubmissionListResponse> getFeedSubmissionListAsync(GetFeedSubmissionListRequest request);


            
    /**
     * Get Report Request List 
     *
     * returns a list of report requests ids and their associated metadata
     *   
     * @param request
     *          GetReportRequestList Action
     * @return
     *          GetReportRequestList Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportRequestListResponse getReportRequestList(GetReportRequestListRequest request) throws MarketplaceWebServiceException;

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
    public Future<GetReportRequestListResponse> getReportRequestListAsync(GetReportRequestListRequest request);


            
    /**
     * Get Report Schedule List By Next Token 
     *
     * retrieve the next batch of list items and if there are more items to retrieve
     *   
     * @param request
     *          GetReportScheduleListByNextToken Action
     * @return
     *          GetReportScheduleListByNextToken Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportScheduleListByNextTokenResponse getReportScheduleListByNextToken(GetReportScheduleListByNextTokenRequest request) throws MarketplaceWebServiceException;

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
    public Future<GetReportScheduleListByNextTokenResponse> getReportScheduleListByNextTokenAsync(GetReportScheduleListByNextTokenRequest request);


            
    /**
     * Get Report List By Next Token 
     *
     * retrieve the next batch of list items and if there are more items to retrieve
     *   
     * @param request
     *          GetReportListByNextToken Action
     * @return
     *          GetReportListByNextToken Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportListByNextTokenResponse getReportListByNextToken(GetReportListByNextTokenRequest request) throws MarketplaceWebServiceException;

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
    public Future<GetReportListByNextTokenResponse> getReportListByNextTokenAsync(GetReportListByNextTokenRequest request);


            
    /**
     * Manage Report Schedule 
     *
     * Creates, updates, or deletes a report schedule
     * for a given report type, such as order reports in particular.
     *   
     * @param request
     *          ManageReportSchedule Action
     * @return
     *          ManageReportSchedule Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public ManageReportScheduleResponse manageReportSchedule(ManageReportScheduleRequest request) throws MarketplaceWebServiceException;

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
    public Future<ManageReportScheduleResponse> manageReportScheduleAsync(ManageReportScheduleRequest request);


            
    /**
     * Get Report Request Count 
     *
     * returns a count of report requests; by default all the report
     * requests in the last 90 days
     *   
     * @param request
     *          GetReportRequestCount Action
     * @return
     *          GetReportRequestCount Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportRequestCountResponse getReportRequestCount(GetReportRequestCountRequest request) throws MarketplaceWebServiceException;

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
    public Future<GetReportRequestCountResponse> getReportRequestCountAsync(GetReportRequestCountRequest request);


            
    /**
     * Get Report Schedule List 
     *
     * returns the list of report schedules
     *   
     * @param request
     *          GetReportScheduleList Action
     * @return
     *          GetReportScheduleList Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportScheduleListResponse getReportScheduleList(GetReportScheduleListRequest request) throws MarketplaceWebServiceException;

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
    public Future<GetReportScheduleListResponse> getReportScheduleListAsync(GetReportScheduleListRequest request);
    
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
    public SubmitFeedResponse submitFeedFromFile(SubmitFeedRequest request)
      throws MarketplaceWebServiceException;
    
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
    public Future<SubmitFeedResponse> submitFeedFromFileAsync(final SubmitFeedRequest request);

}