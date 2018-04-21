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



package com.amazonaws.mws.mock;

import com.amazonaws.mws.model.*;
import com.amazonaws.mws.*;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.xml.sax.InputSource;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * MarketplaceWebServiceMock is the implementation of MarketplaceWebService based
 * on the pre-populated set of XML files that serve local data. It simulates 
 * responses from Marketplace Web Service service.
 *
 * Use this to test your application without making a call to Marketplace Web Service 
 *
 * Note, current Mock Service implementation does not valiadate requests
 *
 */
public  class MarketplaceWebServiceMock implements MarketplaceWebService {
    
    private final Log log = LogFactory.getLog(MarketplaceWebServiceMock.class);
    private static JAXBContext  jaxbContext;
    private static ThreadLocal<Unmarshaller> unmarshaller;
    private ExecutorService asyncExecutor = Executors.newCachedThreadPool(
            new ThreadFactory() {
                private final AtomicInteger threadNumber = new AtomicInteger(1);
                public Thread newThread(Runnable task) {
                    Thread thread = new Thread(task, "MarketplaceWebServiceMock-Thread-" + threadNumber.getAndIncrement());
                    thread.setDaemon(Boolean.TRUE);
                    if (thread.getPriority() != Thread.NORM_PRIORITY) {
                        thread.setPriority(Thread.NORM_PRIORITY);
                    }
                    return thread;
                }
                });

    
    /** Initialize JAXBContext and  Unmarshaller **/
    static {
        try {
            jaxbContext = JAXBContext.newInstance("com.amazonaws.mws.model", MarketplaceWebService.class.getClassLoader());
        } catch (JAXBException ex) {
            throw new ExceptionInInitializerError(ex);
        }
        unmarshaller = new ThreadLocal<Unmarshaller>() {
            protected synchronized Unmarshaller initialValue() {
                try {
                    return jaxbContext.createUnmarshaller();
                } catch(JAXBException e) {
                    throw new ExceptionInInitializerError(e);
                }
            }
        };
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
     *          GetReport Action
     * @return
     *          GetReport Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportResponse getReport(GetReportRequest request)
        throws MarketplaceWebServiceException {
        GetReportResponse response;
        try {
            response = (GetReportResponse)getUnmarshaller().unmarshal
                    (new InputSource(this.getClass().getResourceAsStream("GetReportResponse.xml")));

            log.debug("Response from Mock Service: " + response.toXML());
            
        } catch (JAXBException jbe) {
            throw new MarketplaceWebServiceException("Unable to process mock response", jbe);
        }
        return response;
    }

    public Future<GetReportResponse> getReportAsync(final
GetReportRequest request) {
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
     *          GetReportScheduleCount Action
     * @return
     *          GetReportScheduleCount Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportScheduleCountResponse getReportScheduleCount(GetReportScheduleCountRequest request)
        throws MarketplaceWebServiceException {
        GetReportScheduleCountResponse response;
        try {
            response = (GetReportScheduleCountResponse)getUnmarshaller().unmarshal
                    (new InputSource(this.getClass().getResourceAsStream("GetReportScheduleCountResponse.xml")));

            log.debug("Response from Mock Service: " + response.toXML());
            
        } catch (JAXBException jbe) {
            throw new MarketplaceWebServiceException("Unable to process mock response", jbe);
        }
        return response;
    }

    public Future<GetReportScheduleCountResponse> getReportScheduleCountAsync(final
GetReportScheduleCountRequest request) {
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
     *          GetReportRequestListByNextToken Action
     * @return
     *          GetReportRequestListByNextToken Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportRequestListByNextTokenResponse getReportRequestListByNextToken(GetReportRequestListByNextTokenRequest request)
        throws MarketplaceWebServiceException {
        GetReportRequestListByNextTokenResponse response;
        try {
            response = (GetReportRequestListByNextTokenResponse)getUnmarshaller().unmarshal
                    (new InputSource(this.getClass().getResourceAsStream("GetReportRequestListByNextTokenResponse.xml")));

            log.debug("Response from Mock Service: " + response.toXML());
            
        } catch (JAXBException jbe) {
            throw new MarketplaceWebServiceException("Unable to process mock response", jbe);
        }
        return response;
    }

    public Future<GetReportRequestListByNextTokenResponse> getReportRequestListByNextTokenAsync(final
GetReportRequestListByNextTokenRequest request) {
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
     *          UpdateReportAcknowledgements Action
     * @return
     *          UpdateReportAcknowledgements Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public UpdateReportAcknowledgementsResponse updateReportAcknowledgements(UpdateReportAcknowledgementsRequest request)
        throws MarketplaceWebServiceException {
        UpdateReportAcknowledgementsResponse response;
        try {
            response = (UpdateReportAcknowledgementsResponse)getUnmarshaller().unmarshal
                    (new InputSource(this.getClass().getResourceAsStream("UpdateReportAcknowledgementsResponse.xml")));

            log.debug("Response from Mock Service: " + response.toXML());
            
        } catch (JAXBException jbe) {
            throw new MarketplaceWebServiceException("Unable to process mock response", jbe);
        }
        return response;
    }

    public Future<UpdateReportAcknowledgementsResponse> updateReportAcknowledgementsAsync(final
UpdateReportAcknowledgementsRequest request) {
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
     *          SubmitFeed Action
     * @return
     *          SubmitFeed Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public SubmitFeedResponse submitFeed(SubmitFeedRequest request)
        throws MarketplaceWebServiceException {
        SubmitFeedResponse response;
        try {
            response = (SubmitFeedResponse)getUnmarshaller().unmarshal
                    (new InputSource(this.getClass().getResourceAsStream("SubmitFeedResponse.xml")));

            log.debug("Response from Mock Service: " + response.toXML());
            
        } catch (JAXBException jbe) {
            throw new MarketplaceWebServiceException("Unable to process mock response", jbe);
        }
        return response;
    }

    public Future<SubmitFeedResponse> submitFeedAsync(final
SubmitFeedRequest request) {
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
    public SubmitFeedResponse submitFeedFromFile(SubmitFeedRequest request)
        throws MarketplaceWebServiceException {
        SubmitFeedResponse response;
        try {
            response = (SubmitFeedResponse)getUnmarshaller().unmarshal
                    (new InputSource(this.getClass().getResourceAsStream("SubmitFeedResponse.xml")));

            log.debug("Response from Mock Service: " + response.toXML());
            
        } catch (JAXBException jbe) {
            throw new MarketplaceWebServiceException("Unable to process mock response", jbe);
        }
        return response;
    }

    public Future<SubmitFeedResponse> submitFeedFromFileAsync(final
SubmitFeedRequest request) {
        Future<SubmitFeedResponse> response = asyncExecutor.submit(new Callable<SubmitFeedResponse>() {

            public SubmitFeedResponse call() throws MarketplaceWebServiceException {
                return submitFeed(request);
            }
            });
        return response;
    }
        
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
    public GetReportCountResponse getReportCount(GetReportCountRequest request)
        throws MarketplaceWebServiceException {
        GetReportCountResponse response;
        try {
            response = (GetReportCountResponse)getUnmarshaller().unmarshal
                    (new InputSource(this.getClass().getResourceAsStream("GetReportCountResponse.xml")));

            log.debug("Response from Mock Service: " + response.toXML());
            
        } catch (JAXBException jbe) {
            throw new MarketplaceWebServiceException("Unable to process mock response", jbe);
        }
        return response;
    }

    public Future<GetReportCountResponse> getReportCountAsync(final
GetReportCountRequest request) {
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
     *          GetFeedSubmissionListByNextToken Action
     * @return
     *          GetFeedSubmissionListByNextToken Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetFeedSubmissionListByNextTokenResponse getFeedSubmissionListByNextToken(GetFeedSubmissionListByNextTokenRequest request)
        throws MarketplaceWebServiceException {
        GetFeedSubmissionListByNextTokenResponse response;
        try {
            response = (GetFeedSubmissionListByNextTokenResponse)getUnmarshaller().unmarshal
                    (new InputSource(this.getClass().getResourceAsStream("GetFeedSubmissionListByNextTokenResponse.xml")));

            log.debug("Response from Mock Service: " + response.toXML());
            
        } catch (JAXBException jbe) {
            throw new MarketplaceWebServiceException("Unable to process mock response", jbe);
        }
        return response;
    }

    public Future<GetFeedSubmissionListByNextTokenResponse> getFeedSubmissionListByNextTokenAsync(final
GetFeedSubmissionListByNextTokenRequest request) {
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
     *          CancelFeedSubmissions Action
     * @return
     *          CancelFeedSubmissions Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public CancelFeedSubmissionsResponse cancelFeedSubmissions(CancelFeedSubmissionsRequest request)
        throws MarketplaceWebServiceException {
        CancelFeedSubmissionsResponse response;
        try {
            response = (CancelFeedSubmissionsResponse)getUnmarshaller().unmarshal
                    (new InputSource(this.getClass().getResourceAsStream("CancelFeedSubmissionsResponse.xml")));

            log.debug("Response from Mock Service: " + response.toXML());
            
        } catch (JAXBException jbe) {
            throw new MarketplaceWebServiceException("Unable to process mock response", jbe);
        }
        return response;
    }

    public Future<CancelFeedSubmissionsResponse> cancelFeedSubmissionsAsync(final
CancelFeedSubmissionsRequest request) {
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
     *          RequestReport Action
     * @return
     *          RequestReport Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public RequestReportResponse requestReport(RequestReportRequest request)
        throws MarketplaceWebServiceException {
        RequestReportResponse response;
        try {
            response = (RequestReportResponse)getUnmarshaller().unmarshal
                    (new InputSource(this.getClass().getResourceAsStream("RequestReportResponse.xml")));

            log.debug("Response from Mock Service: " + response.toXML());
            
        } catch (JAXBException jbe) {
            throw new MarketplaceWebServiceException("Unable to process mock response", jbe);
        }
        return response;
    }

    public Future<RequestReportResponse> requestReportAsync(final
RequestReportRequest request) {
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
     *          GetFeedSubmissionCount Action
     * @return
     *          GetFeedSubmissionCount Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetFeedSubmissionCountResponse getFeedSubmissionCount(GetFeedSubmissionCountRequest request)
        throws MarketplaceWebServiceException {
        GetFeedSubmissionCountResponse response;
        try {
            response = (GetFeedSubmissionCountResponse)getUnmarshaller().unmarshal
                    (new InputSource(this.getClass().getResourceAsStream("GetFeedSubmissionCountResponse.xml")));

            log.debug("Response from Mock Service: " + response.toXML());
            
        } catch (JAXBException jbe) {
            throw new MarketplaceWebServiceException("Unable to process mock response", jbe);
        }
        return response;
    }

    public Future<GetFeedSubmissionCountResponse> getFeedSubmissionCountAsync(final
GetFeedSubmissionCountRequest request) {
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
    public CancelReportRequestsResponse cancelReportRequests(CancelReportRequestsRequest request)
        throws MarketplaceWebServiceException {
        CancelReportRequestsResponse response;
        try {
            response = (CancelReportRequestsResponse)getUnmarshaller().unmarshal
                    (new InputSource(this.getClass().getResourceAsStream("CancelReportRequestsResponse.xml")));

            log.debug("Response from Mock Service: " + response.toXML());
            
        } catch (JAXBException jbe) {
            throw new MarketplaceWebServiceException("Unable to process mock response", jbe);
        }
        return response;
    }

    public Future<CancelReportRequestsResponse> cancelReportRequestsAsync(final
CancelReportRequestsRequest request) {
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
     * regardless of their acknowledgement status
     *   
     * @param request
     *          GetReportList Action
     * @return
     *          GetReportList Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportListResponse getReportList(GetReportListRequest request)
        throws MarketplaceWebServiceException {
        GetReportListResponse response;
        try {
            response = (GetReportListResponse)getUnmarshaller().unmarshal
                    (new InputSource(this.getClass().getResourceAsStream("GetReportListResponse.xml")));

            log.debug("Response from Mock Service: " + response.toXML());
            
        } catch (JAXBException jbe) {
            throw new MarketplaceWebServiceException("Unable to process mock response", jbe);
        }
        return response;
    }

    public Future<GetReportListResponse> getReportListAsync(final
GetReportListRequest request) {
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
     *          GetFeedSubmissionResult Action
     * @return
     *          GetFeedSubmissionResult Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetFeedSubmissionResultResponse getFeedSubmissionResult(GetFeedSubmissionResultRequest request)
        throws MarketplaceWebServiceException {
        GetFeedSubmissionResultResponse response;
        try {
            response = (GetFeedSubmissionResultResponse)getUnmarshaller().unmarshal
                    (new InputSource(this.getClass().getResourceAsStream("GetFeedSubmissionResultResponse.xml")));

            log.debug("Response from Mock Service: " + response.toXML());
            
        } catch (JAXBException jbe) {
            throw new MarketplaceWebServiceException("Unable to process mock response", jbe);
        }
        return response;
    }

    public Future<GetFeedSubmissionResultResponse> getFeedSubmissionResultAsync(final
GetFeedSubmissionResultRequest request) {
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
     *          GetFeedSubmissionList Action
     * @return
     *          GetFeedSubmissionList Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetFeedSubmissionListResponse getFeedSubmissionList(GetFeedSubmissionListRequest request)
        throws MarketplaceWebServiceException {
        GetFeedSubmissionListResponse response;
        try {
            response = (GetFeedSubmissionListResponse)getUnmarshaller().unmarshal
                    (new InputSource(this.getClass().getResourceAsStream("GetFeedSubmissionListResponse.xml")));

            log.debug("Response from Mock Service: " + response.toXML());
            
        } catch (JAXBException jbe) {
            throw new MarketplaceWebServiceException("Unable to process mock response", jbe);
        }
        return response;
    }

    public Future<GetFeedSubmissionListResponse> getFeedSubmissionListAsync(final
GetFeedSubmissionListRequest request) {
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
     *          GetReportRequestList Action
     * @return
     *          GetReportRequestList Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportRequestListResponse getReportRequestList(GetReportRequestListRequest request)
        throws MarketplaceWebServiceException {
        GetReportRequestListResponse response;
        try {
            response = (GetReportRequestListResponse)getUnmarshaller().unmarshal
                    (new InputSource(this.getClass().getResourceAsStream("GetReportRequestListResponse.xml")));

            log.debug("Response from Mock Service: " + response.toXML());
            
        } catch (JAXBException jbe) {
            throw new MarketplaceWebServiceException("Unable to process mock response", jbe);
        }
        return response;
    }

    public Future<GetReportRequestListResponse> getReportRequestListAsync(final
GetReportRequestListRequest request) {
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
     *          GetReportScheduleListByNextToken Action
     * @return
     *          GetReportScheduleListByNextToken Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportScheduleListByNextTokenResponse getReportScheduleListByNextToken(GetReportScheduleListByNextTokenRequest request)
        throws MarketplaceWebServiceException {
        GetReportScheduleListByNextTokenResponse response;
        try {
            response = (GetReportScheduleListByNextTokenResponse)getUnmarshaller().unmarshal
                    (new InputSource(this.getClass().getResourceAsStream("GetReportScheduleListByNextTokenResponse.xml")));

            log.debug("Response from Mock Service: " + response.toXML());
            
        } catch (JAXBException jbe) {
            throw new MarketplaceWebServiceException("Unable to process mock response", jbe);
        }
        return response;
    }

    public Future<GetReportScheduleListByNextTokenResponse> getReportScheduleListByNextTokenAsync(final
GetReportScheduleListByNextTokenRequest request) {
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
     *          GetReportListByNextToken Action
     * @return
     *          GetReportListByNextToken Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportListByNextTokenResponse getReportListByNextToken(GetReportListByNextTokenRequest request)
        throws MarketplaceWebServiceException {
        GetReportListByNextTokenResponse response;
        try {
            response = (GetReportListByNextTokenResponse)getUnmarshaller().unmarshal
                    (new InputSource(this.getClass().getResourceAsStream("GetReportListByNextTokenResponse.xml")));

            log.debug("Response from Mock Service: " + response.toXML());
            
        } catch (JAXBException jbe) {
            throw new MarketplaceWebServiceException("Unable to process mock response", jbe);
        }
        return response;
    }

    public Future<GetReportListByNextTokenResponse> getReportListByNextTokenAsync(final
GetReportListByNextTokenRequest request) {
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
     *          ManageReportSchedule Action
     * @return
     *          ManageReportSchedule Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public ManageReportScheduleResponse manageReportSchedule(ManageReportScheduleRequest request)
        throws MarketplaceWebServiceException {
        ManageReportScheduleResponse response;
        try {
            response = (ManageReportScheduleResponse)getUnmarshaller().unmarshal
                    (new InputSource(this.getClass().getResourceAsStream("ManageReportScheduleResponse.xml")));

            log.debug("Response from Mock Service: " + response.toXML());
            
        } catch (JAXBException jbe) {
            throw new MarketplaceWebServiceException("Unable to process mock response", jbe);
        }
        return response;
    }

    public Future<ManageReportScheduleResponse> manageReportScheduleAsync(final
ManageReportScheduleRequest request) {
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
     *          GetReportRequestCount Action
     * @return
     *          GetReportRequestCount Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportRequestCountResponse getReportRequestCount(GetReportRequestCountRequest request)
        throws MarketplaceWebServiceException {
        GetReportRequestCountResponse response;
        try {
            response = (GetReportRequestCountResponse)getUnmarshaller().unmarshal
                    (new InputSource(this.getClass().getResourceAsStream("GetReportRequestCountResponse.xml")));

            log.debug("Response from Mock Service: " + response.toXML());
            
        } catch (JAXBException jbe) {
            throw new MarketplaceWebServiceException("Unable to process mock response", jbe);
        }
        return response;
    }

    public Future<GetReportRequestCountResponse> getReportRequestCountAsync(final
GetReportRequestCountRequest request) {
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
     *          GetReportScheduleList Action
     * @return
     *          GetReportScheduleList Response from the service
     *
     * @throws MarketplaceWebServiceException
     */
    public GetReportScheduleListResponse getReportScheduleList(GetReportScheduleListRequest request)
        throws MarketplaceWebServiceException {
        GetReportScheduleListResponse response;
        try {
            response = (GetReportScheduleListResponse)getUnmarshaller().unmarshal
                    (new InputSource(this.getClass().getResourceAsStream("GetReportScheduleListResponse.xml")));

            log.debug("Response from Mock Service: " + response.toXML());
            
        } catch (JAXBException jbe) {
            throw new MarketplaceWebServiceException("Unable to process mock response", jbe);
        }
        return response;
    }

    public Future<GetReportScheduleListResponse> getReportScheduleListAsync(final
GetReportScheduleListRequest request) {
        Future<GetReportScheduleListResponse> response = asyncExecutor.submit(new Callable<GetReportScheduleListResponse>() {

            public GetReportScheduleListResponse call() throws MarketplaceWebServiceException {
                return getReportScheduleList(request);
            }
            });
        return response;
    }

    /**
     * Get unmarshaller for current thread
     */
    private Unmarshaller getUnmarshaller() {
        return unmarshaller.get();
    }
}