/*
 * Aces Encoded Listener API
 * API Specification for Encoded Listeners that read data on a blockchain and forward transaction events to registered subscribers. 
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.Health;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.NotFoundError;
import io.swagger.client.model.Subscription;
import io.swagger.client.model.SubscriptionRequest;
import io.swagger.client.model.SubscriptionUnsubscribe;
import io.swagger.client.model.ValidationError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for statusGet
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call statusGetCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/status";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call statusGetValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = statusGetCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Health of node.
     * Get application health information.
     * @return Health
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Health statusGet() throws ApiException {
        ApiResponse<Health> resp = statusGetWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get Health of node.
     * Get application health information.
     * @return ApiResponse&lt;Health&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Health> statusGetWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = statusGetValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<Health>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Health of node. (asynchronously)
     * Get application health information.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call statusGetAsync(final ApiCallback<Health> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = statusGetValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Health>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for subscriptionsIdEventsGet
     * @param id Subscription Identifier (required)
     * @param pageSize Number of items to return per page. (optional, default to 100)
     * @param page Zero-offset page number to return. (optional)
     * @param continuation Continuation param for fetching next page. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call subscriptionsIdEventsGetCall(String id, Integer pageSize, Integer page, String continuation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/subscriptions/{id}/events"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (continuation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("continuation", continuation));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call subscriptionsIdEventsGetValidateBeforeCall(String id, Integer pageSize, Integer page, String continuation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling subscriptionsIdEventsGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = subscriptionsIdEventsGetCall(id, pageSize, page, continuation, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List Subscription Events
     * Gets a page of Subscription Events.
     * @param id Subscription Identifier (required)
     * @param pageSize Number of items to return per page. (optional, default to 100)
     * @param page Zero-offset page number to return. (optional)
     * @param continuation Continuation param for fetching next page. (optional)
     * @return InlineResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse200 subscriptionsIdEventsGet(String id, Integer pageSize, Integer page, String continuation) throws ApiException {
        ApiResponse<InlineResponse200> resp = subscriptionsIdEventsGetWithHttpInfo(id, pageSize, page, continuation);
        return resp.getData();
    }

    /**
     * List Subscription Events
     * Gets a page of Subscription Events.
     * @param id Subscription Identifier (required)
     * @param pageSize Number of items to return per page. (optional, default to 100)
     * @param page Zero-offset page number to return. (optional)
     * @param continuation Continuation param for fetching next page. (optional)
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse200> subscriptionsIdEventsGetWithHttpInfo(String id, Integer pageSize, Integer page, String continuation) throws ApiException {
        com.squareup.okhttp.Call call = subscriptionsIdEventsGetValidateBeforeCall(id, pageSize, page, continuation, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Subscription Events (asynchronously)
     * Gets a page of Subscription Events.
     * @param id Subscription Identifier (required)
     * @param pageSize Number of items to return per page. (optional, default to 100)
     * @param page Zero-offset page number to return. (optional)
     * @param continuation Continuation param for fetching next page. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call subscriptionsIdEventsGetAsync(String id, Integer pageSize, Integer page, String continuation, final ApiCallback<InlineResponse200> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = subscriptionsIdEventsGetValidateBeforeCall(id, pageSize, page, continuation, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for subscriptionsIdGet
     * @param id Subscription Identifier (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call subscriptionsIdGetCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/subscriptions/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call subscriptionsIdGetValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling subscriptionsIdGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = subscriptionsIdGetCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets Subscription
     * Get a Subscription by identifier.
     * @param id Subscription Identifier (required)
     * @return Subscription
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Subscription subscriptionsIdGet(String id) throws ApiException {
        ApiResponse<Subscription> resp = subscriptionsIdGetWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Gets Subscription
     * Get a Subscription by identifier.
     * @param id Subscription Identifier (required)
     * @return ApiResponse&lt;Subscription&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Subscription> subscriptionsIdGetWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = subscriptionsIdGetValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<Subscription>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets Subscription (asynchronously)
     * Get a Subscription by identifier.
     * @param id Subscription Identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call subscriptionsIdGetAsync(String id, final ApiCallback<Subscription> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = subscriptionsIdGetValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Subscription>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for subscriptionsIdUnsubscribesPost
     * @param id Subscription Identifier (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call subscriptionsIdUnsubscribesPostCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/subscriptions/{id}/unsubscribes"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call subscriptionsIdUnsubscribesPostValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling subscriptionsIdUnsubscribesPost(Async)");
        }
        
        
        com.squareup.okhttp.Call call = subscriptionsIdUnsubscribesPostCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create an Unsubscription.
     * Unsubscribes an active Subscription.
     * @param id Subscription Identifier (required)
     * @return SubscriptionUnsubscribe
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SubscriptionUnsubscribe subscriptionsIdUnsubscribesPost(String id) throws ApiException {
        ApiResponse<SubscriptionUnsubscribe> resp = subscriptionsIdUnsubscribesPostWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Create an Unsubscription.
     * Unsubscribes an active Subscription.
     * @param id Subscription Identifier (required)
     * @return ApiResponse&lt;SubscriptionUnsubscribe&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SubscriptionUnsubscribe> subscriptionsIdUnsubscribesPostWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = subscriptionsIdUnsubscribesPostValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<SubscriptionUnsubscribe>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create an Unsubscription. (asynchronously)
     * Unsubscribes an active Subscription.
     * @param id Subscription Identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call subscriptionsIdUnsubscribesPostAsync(String id, final ApiCallback<SubscriptionUnsubscribe> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = subscriptionsIdUnsubscribesPostValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SubscriptionUnsubscribe>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for subscriptionsPost
     * @param subscriptionRequest The request to create a new Subscription. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call subscriptionsPostCall(SubscriptionRequest subscriptionRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = subscriptionRequest;
        
        // create path and map variables
        String localVarPath = "/subscriptions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call subscriptionsPostValidateBeforeCall(SubscriptionRequest subscriptionRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = subscriptionsPostCall(subscriptionRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Registers a subscriber node to receive blockchain events.
     * The Subscribers endpoint allows subscriber to register their node to receive blockchain events from the Encoded Listener. 
     * @param subscriptionRequest The request to create a new Subscription. (optional)
     * @return Subscription
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Subscription subscriptionsPost(SubscriptionRequest subscriptionRequest) throws ApiException {
        ApiResponse<Subscription> resp = subscriptionsPostWithHttpInfo(subscriptionRequest);
        return resp.getData();
    }

    /**
     * Registers a subscriber node to receive blockchain events.
     * The Subscribers endpoint allows subscriber to register their node to receive blockchain events from the Encoded Listener. 
     * @param subscriptionRequest The request to create a new Subscription. (optional)
     * @return ApiResponse&lt;Subscription&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Subscription> subscriptionsPostWithHttpInfo(SubscriptionRequest subscriptionRequest) throws ApiException {
        com.squareup.okhttp.Call call = subscriptionsPostValidateBeforeCall(subscriptionRequest, null, null);
        Type localVarReturnType = new TypeToken<Subscription>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Registers a subscriber node to receive blockchain events. (asynchronously)
     * The Subscribers endpoint allows subscriber to register their node to receive blockchain events from the Encoded Listener. 
     * @param subscriptionRequest The request to create a new Subscription. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call subscriptionsPostAsync(SubscriptionRequest subscriptionRequest, final ApiCallback<Subscription> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = subscriptionsPostValidateBeforeCall(subscriptionRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Subscription>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
