/*
 * Sage HR API
 * All requests are required to be sent to your subdomain. To learn how to enable API in your Sage HR account, please visit https://support.sage.hr/en/articles/3246469-how-does-cakehr-api-work
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.OffboardingCreateTaskRequest;
import com.konfigthis.client.model.OffboardingCreateTaskResponse;
import com.konfigthis.client.model.OffboardingListCategoriesResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class OffboardingApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public OffboardingApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public OffboardingApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call createTaskCall(String title, Double boardingTaskTemplateCategoryId, Double dueIn, OffboardingCreateTaskRequest offboardingCreateTaskRequest, String description, String defaultAssigneeType, Double assigneeId, String requireAttachment, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = offboardingCreateTaskRequest;

        // create path and map variables
        String localVarPath = "/offboarding/tasks";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (title != null) {
            localVarFormParams.put("title", title);
        }

        if (description != null) {
            localVarFormParams.put("description", description);
        }

        if (boardingTaskTemplateCategoryId != null) {
            localVarFormParams.put("boarding_task_template_category_id", boardingTaskTemplateCategoryId);
        }

        if (dueIn != null) {
            localVarFormParams.put("due_in", dueIn);
        }

        if (defaultAssigneeType != null) {
            localVarFormParams.put("default_assignee_type", defaultAssigneeType);
        }

        if (assigneeId != null) {
            localVarFormParams.put("assignee_id", assigneeId);
        }

        if (requireAttachment != null) {
            localVarFormParams.put("require_attachment", requireAttachment);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createTaskValidateBeforeCall(String title, Double boardingTaskTemplateCategoryId, Double dueIn, OffboardingCreateTaskRequest offboardingCreateTaskRequest, String description, String defaultAssigneeType, Double assigneeId, String requireAttachment, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'title' is set
        if (title == null) {
            throw new ApiException("Missing the required parameter 'title' when calling createTask(Async)");
        }

        // verify the required parameter 'boardingTaskTemplateCategoryId' is set
        if (boardingTaskTemplateCategoryId == null) {
            throw new ApiException("Missing the required parameter 'boardingTaskTemplateCategoryId' when calling createTask(Async)");
        }

        // verify the required parameter 'dueIn' is set
        if (dueIn == null) {
            throw new ApiException("Missing the required parameter 'dueIn' when calling createTask(Async)");
        }

        // verify the required parameter 'offboardingCreateTaskRequest' is set
        if (offboardingCreateTaskRequest == null) {
            throw new ApiException("Missing the required parameter 'offboardingCreateTaskRequest' when calling createTask(Async)");
        }

        return createTaskCall(title, boardingTaskTemplateCategoryId, dueIn, offboardingCreateTaskRequest, description, defaultAssigneeType, assigneeId, requireAttachment, _callback);

    }


    private ApiResponse<OffboardingCreateTaskResponse> createTaskWithHttpInfo(String title, Double boardingTaskTemplateCategoryId, Double dueIn, OffboardingCreateTaskRequest offboardingCreateTaskRequest, String description, String defaultAssigneeType, Double assigneeId, String requireAttachment) throws ApiException {
        okhttp3.Call localVarCall = createTaskValidateBeforeCall(title, boardingTaskTemplateCategoryId, dueIn, offboardingCreateTaskRequest, description, defaultAssigneeType, assigneeId, requireAttachment, null);
        Type localVarReturnType = new TypeToken<OffboardingCreateTaskResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createTaskAsync(String title, Double boardingTaskTemplateCategoryId, Double dueIn, OffboardingCreateTaskRequest offboardingCreateTaskRequest, String description, String defaultAssigneeType, Double assigneeId, String requireAttachment, final ApiCallback<OffboardingCreateTaskResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createTaskValidateBeforeCall(title, boardingTaskTemplateCategoryId, dueIn, offboardingCreateTaskRequest, description, defaultAssigneeType, assigneeId, requireAttachment, _callback);
        Type localVarReturnType = new TypeToken<OffboardingCreateTaskResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateTaskRequestBuilder {
        private final String title;
        private final Double boardingTaskTemplateCategoryId;
        private final Double dueIn;
        private String description;
        private String defaultAssigneeType;
        private Double assigneeId;
        private String requireAttachment;

        private CreateTaskRequestBuilder(String title, double boardingTaskTemplateCategoryId, double dueIn) {
            this.title = title;
            this.boardingTaskTemplateCategoryId = boardingTaskTemplateCategoryId;
            this.dueIn = dueIn;
        }

        /**
         * Set description
         * @param description  (optional)
         * @return CreateTaskRequestBuilder
         */
        public CreateTaskRequestBuilder description(String description) {
            this.description = description;
            return this;
        }
        
        /**
         * Set defaultAssigneeType
         * @param defaultAssigneeType Default: self; leader - direct manager; employee - specific employee via assignee_id (optional)
         * @return CreateTaskRequestBuilder
         */
        public CreateTaskRequestBuilder defaultAssigneeType(String defaultAssigneeType) {
            this.defaultAssigneeType = defaultAssigneeType;
            return this;
        }
        
        /**
         * Set assigneeId
         * @param assigneeId Specific assignee if default_assignee_type is &#39;employee&#39; (optional)
         * @return CreateTaskRequestBuilder
         */
        public CreateTaskRequestBuilder assigneeId(Double assigneeId) {
            this.assigneeId = assigneeId;
            return this;
        }
        
        /**
         * Set requireAttachment
         * @param requireAttachment &#39;true&#39; to enabled required attachment (optional)
         * @return CreateTaskRequestBuilder
         */
        public CreateTaskRequestBuilder requireAttachment(String requireAttachment) {
            this.requireAttachment = requireAttachment;
            return this;
        }
        
        /**
         * Build call for createTask
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            OffboardingCreateTaskRequest offboardingCreateTaskRequest = buildBodyParams();
            return createTaskCall(title, boardingTaskTemplateCategoryId, dueIn, offboardingCreateTaskRequest, description, defaultAssigneeType, assigneeId, requireAttachment, _callback);
        }

        private OffboardingCreateTaskRequest buildBodyParams() {
            OffboardingCreateTaskRequest offboardingCreateTaskRequest = new OffboardingCreateTaskRequest();
            offboardingCreateTaskRequest.title(this.title);
            offboardingCreateTaskRequest.description(this.description);
            offboardingCreateTaskRequest.boardingTaskTemplateCategoryId(this.boardingTaskTemplateCategoryId);
            offboardingCreateTaskRequest.dueIn(this.dueIn);
            if (this.defaultAssigneeType != null)
            offboardingCreateTaskRequest.defaultAssigneeType(OffboardingCreateTaskRequest.DefaultAssigneeTypeEnum.fromValue(this.defaultAssigneeType));
            offboardingCreateTaskRequest.assigneeId(this.assigneeId);
            offboardingCreateTaskRequest.requireAttachment(this.requireAttachment);
            return offboardingCreateTaskRequest;
        }

        /**
         * Execute createTask request
         * @return OffboardingCreateTaskResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public OffboardingCreateTaskResponse execute() throws ApiException {
            OffboardingCreateTaskRequest offboardingCreateTaskRequest = buildBodyParams();
            ApiResponse<OffboardingCreateTaskResponse> localVarResp = createTaskWithHttpInfo(title, boardingTaskTemplateCategoryId, dueIn, offboardingCreateTaskRequest, description, defaultAssigneeType, assigneeId, requireAttachment);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createTask request with HTTP info returned
         * @return ApiResponse&lt;OffboardingCreateTaskResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<OffboardingCreateTaskResponse> executeWithHttpInfo() throws ApiException {
            OffboardingCreateTaskRequest offboardingCreateTaskRequest = buildBodyParams();
            return createTaskWithHttpInfo(title, boardingTaskTemplateCategoryId, dueIn, offboardingCreateTaskRequest, description, defaultAssigneeType, assigneeId, requireAttachment);
        }

        /**
         * Execute createTask request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<OffboardingCreateTaskResponse> _callback) throws ApiException {
            OffboardingCreateTaskRequest offboardingCreateTaskRequest = buildBodyParams();
            return createTaskAsync(title, boardingTaskTemplateCategoryId, dueIn, offboardingCreateTaskRequest, description, defaultAssigneeType, assigneeId, requireAttachment, _callback);
        }
    }

    /**
     * Create new offboarding task
     * 
     * @param title  (required)
     * @param boardingTaskTemplateCategoryId  (required)
     * @param dueIn Due date in days before employee last working day (required)
     * @param offboardingCreateTaskRequest  (required)
     * @return CreateTaskRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public CreateTaskRequestBuilder createTask(String title, double boardingTaskTemplateCategoryId, double dueIn) throws IllegalArgumentException {
        if (title == null) throw new IllegalArgumentException("\"title\" is required but got null");
            

        
        
        return new CreateTaskRequestBuilder(title, boardingTaskTemplateCategoryId, dueIn);
    }
    private okhttp3.Call listCategoriesCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/offboarding/categories";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listCategoriesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return listCategoriesCall(_callback);

    }


    private ApiResponse<OffboardingListCategoriesResponse> listCategoriesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = listCategoriesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<OffboardingListCategoriesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listCategoriesAsync(final ApiCallback<OffboardingListCategoriesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listCategoriesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<OffboardingListCategoriesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListCategoriesRequestBuilder {

        private ListCategoriesRequestBuilder() {
        }

        /**
         * Build call for listCategories
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listCategoriesCall(_callback);
        }


        /**
         * Execute listCategories request
         * @return OffboardingListCategoriesResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public OffboardingListCategoriesResponse execute() throws ApiException {
            ApiResponse<OffboardingListCategoriesResponse> localVarResp = listCategoriesWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listCategories request with HTTP info returned
         * @return ApiResponse&lt;OffboardingListCategoriesResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<OffboardingListCategoriesResponse> executeWithHttpInfo() throws ApiException {
            return listCategoriesWithHttpInfo();
        }

        /**
         * Execute listCategories request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<OffboardingListCategoriesResponse> _callback) throws ApiException {
            return listCategoriesAsync(_callback);
        }
    }

    /**
     * List offboarding task categories
     * 
     * @return ListCategoriesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public ListCategoriesRequestBuilder listCategories() throws IllegalArgumentException {
        return new ListCategoriesRequestBuilder();
    }
}
