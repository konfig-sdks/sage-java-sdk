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


import com.konfigthis.client.model.PerformanceGetQuarterlyCompanyGoalsResponse;
import com.konfigthis.client.model.PerformanceGetQuarterlyIndividualGoalsResponse;
import com.konfigthis.client.model.PerformanceGetQuarterlyTeamGoalsResponse;
import com.konfigthis.client.model.PerformanceOverviewQuarterlyProgressResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PerformanceApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PerformanceApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public PerformanceApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getQuarterlyCompanyGoalsCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/performance/goals/quarterly-progress/company-goals";

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

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getQuarterlyCompanyGoalsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getQuarterlyCompanyGoalsCall(_callback);

    }


    private ApiResponse<PerformanceGetQuarterlyCompanyGoalsResponse> getQuarterlyCompanyGoalsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getQuarterlyCompanyGoalsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<PerformanceGetQuarterlyCompanyGoalsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getQuarterlyCompanyGoalsAsync(final ApiCallback<PerformanceGetQuarterlyCompanyGoalsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getQuarterlyCompanyGoalsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<PerformanceGetQuarterlyCompanyGoalsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetQuarterlyCompanyGoalsRequestBuilder {

        private GetQuarterlyCompanyGoalsRequestBuilder() {
        }

        /**
         * Build call for getQuarterlyCompanyGoals
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
            return getQuarterlyCompanyGoalsCall(_callback);
        }


        /**
         * Execute getQuarterlyCompanyGoals request
         * @return PerformanceGetQuarterlyCompanyGoalsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public PerformanceGetQuarterlyCompanyGoalsResponse execute() throws ApiException {
            ApiResponse<PerformanceGetQuarterlyCompanyGoalsResponse> localVarResp = getQuarterlyCompanyGoalsWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getQuarterlyCompanyGoals request with HTTP info returned
         * @return ApiResponse&lt;PerformanceGetQuarterlyCompanyGoalsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PerformanceGetQuarterlyCompanyGoalsResponse> executeWithHttpInfo() throws ApiException {
            return getQuarterlyCompanyGoalsWithHttpInfo();
        }

        /**
         * Execute getQuarterlyCompanyGoals request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PerformanceGetQuarterlyCompanyGoalsResponse> _callback) throws ApiException {
            return getQuarterlyCompanyGoalsAsync(_callback);
        }
    }

    /**
     * Quarterly company goals
     * 
     * @return GetQuarterlyCompanyGoalsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public GetQuarterlyCompanyGoalsRequestBuilder getQuarterlyCompanyGoals() throws IllegalArgumentException {
        return new GetQuarterlyCompanyGoalsRequestBuilder();
    }
    private okhttp3.Call getQuarterlyIndividualGoalsCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/performance/goals/quarterly-progress/individual-goals";

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

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getQuarterlyIndividualGoalsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getQuarterlyIndividualGoalsCall(_callback);

    }


    private ApiResponse<PerformanceGetQuarterlyIndividualGoalsResponse> getQuarterlyIndividualGoalsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getQuarterlyIndividualGoalsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<PerformanceGetQuarterlyIndividualGoalsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getQuarterlyIndividualGoalsAsync(final ApiCallback<PerformanceGetQuarterlyIndividualGoalsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getQuarterlyIndividualGoalsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<PerformanceGetQuarterlyIndividualGoalsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetQuarterlyIndividualGoalsRequestBuilder {

        private GetQuarterlyIndividualGoalsRequestBuilder() {
        }

        /**
         * Build call for getQuarterlyIndividualGoals
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
            return getQuarterlyIndividualGoalsCall(_callback);
        }


        /**
         * Execute getQuarterlyIndividualGoals request
         * @return PerformanceGetQuarterlyIndividualGoalsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public PerformanceGetQuarterlyIndividualGoalsResponse execute() throws ApiException {
            ApiResponse<PerformanceGetQuarterlyIndividualGoalsResponse> localVarResp = getQuarterlyIndividualGoalsWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getQuarterlyIndividualGoals request with HTTP info returned
         * @return ApiResponse&lt;PerformanceGetQuarterlyIndividualGoalsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PerformanceGetQuarterlyIndividualGoalsResponse> executeWithHttpInfo() throws ApiException {
            return getQuarterlyIndividualGoalsWithHttpInfo();
        }

        /**
         * Execute getQuarterlyIndividualGoals request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PerformanceGetQuarterlyIndividualGoalsResponse> _callback) throws ApiException {
            return getQuarterlyIndividualGoalsAsync(_callback);
        }
    }

    /**
     * Quarterly individual goals
     * 
     * @return GetQuarterlyIndividualGoalsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public GetQuarterlyIndividualGoalsRequestBuilder getQuarterlyIndividualGoals() throws IllegalArgumentException {
        return new GetQuarterlyIndividualGoalsRequestBuilder();
    }
    private okhttp3.Call getQuarterlyTeamGoalsCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/performance/goals/quarterly-progress/team-goals";

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

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getQuarterlyTeamGoalsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getQuarterlyTeamGoalsCall(_callback);

    }


    private ApiResponse<PerformanceGetQuarterlyTeamGoalsResponse> getQuarterlyTeamGoalsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getQuarterlyTeamGoalsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<PerformanceGetQuarterlyTeamGoalsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getQuarterlyTeamGoalsAsync(final ApiCallback<PerformanceGetQuarterlyTeamGoalsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getQuarterlyTeamGoalsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<PerformanceGetQuarterlyTeamGoalsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetQuarterlyTeamGoalsRequestBuilder {

        private GetQuarterlyTeamGoalsRequestBuilder() {
        }

        /**
         * Build call for getQuarterlyTeamGoals
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
            return getQuarterlyTeamGoalsCall(_callback);
        }


        /**
         * Execute getQuarterlyTeamGoals request
         * @return PerformanceGetQuarterlyTeamGoalsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public PerformanceGetQuarterlyTeamGoalsResponse execute() throws ApiException {
            ApiResponse<PerformanceGetQuarterlyTeamGoalsResponse> localVarResp = getQuarterlyTeamGoalsWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getQuarterlyTeamGoals request with HTTP info returned
         * @return ApiResponse&lt;PerformanceGetQuarterlyTeamGoalsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PerformanceGetQuarterlyTeamGoalsResponse> executeWithHttpInfo() throws ApiException {
            return getQuarterlyTeamGoalsWithHttpInfo();
        }

        /**
         * Execute getQuarterlyTeamGoals request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PerformanceGetQuarterlyTeamGoalsResponse> _callback) throws ApiException {
            return getQuarterlyTeamGoalsAsync(_callback);
        }
    }

    /**
     * Quarterly team goals
     * 
     * @return GetQuarterlyTeamGoalsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public GetQuarterlyTeamGoalsRequestBuilder getQuarterlyTeamGoals() throws IllegalArgumentException {
        return new GetQuarterlyTeamGoalsRequestBuilder();
    }
    private okhttp3.Call overviewQuarterlyProgressCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/performance/goals/quarterly-progress/overall";

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

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call overviewQuarterlyProgressValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return overviewQuarterlyProgressCall(_callback);

    }


    private ApiResponse<PerformanceOverviewQuarterlyProgressResponse> overviewQuarterlyProgressWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = overviewQuarterlyProgressValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<PerformanceOverviewQuarterlyProgressResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call overviewQuarterlyProgressAsync(final ApiCallback<PerformanceOverviewQuarterlyProgressResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = overviewQuarterlyProgressValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<PerformanceOverviewQuarterlyProgressResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class OverviewQuarterlyProgressRequestBuilder {

        private OverviewQuarterlyProgressRequestBuilder() {
        }

        /**
         * Build call for overviewQuarterlyProgress
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
            return overviewQuarterlyProgressCall(_callback);
        }


        /**
         * Execute overviewQuarterlyProgress request
         * @return PerformanceOverviewQuarterlyProgressResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public PerformanceOverviewQuarterlyProgressResponse execute() throws ApiException {
            ApiResponse<PerformanceOverviewQuarterlyProgressResponse> localVarResp = overviewQuarterlyProgressWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute overviewQuarterlyProgress request with HTTP info returned
         * @return ApiResponse&lt;PerformanceOverviewQuarterlyProgressResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PerformanceOverviewQuarterlyProgressResponse> executeWithHttpInfo() throws ApiException {
            return overviewQuarterlyProgressWithHttpInfo();
        }

        /**
         * Execute overviewQuarterlyProgress request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PerformanceOverviewQuarterlyProgressResponse> _callback) throws ApiException {
            return overviewQuarterlyProgressAsync(_callback);
        }
    }

    /**
     * Overview of quarterly goal progress
     * 
     * @return OverviewQuarterlyProgressRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public OverviewQuarterlyProgressRequestBuilder overviewQuarterlyProgress() throws IllegalArgumentException {
        return new OverviewQuarterlyProgressRequestBuilder();
    }
}
