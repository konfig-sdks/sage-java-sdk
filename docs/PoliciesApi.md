# PoliciesApi

All URIs are relative to *https://subdomain.sage.hr/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createKitDay**](PoliciesApi.md#createKitDay) | **POST** /leave-management/kit-days | Create a KIT day in a leave |
| [**getKitDays**](PoliciesApi.md#getKitDays) | **GET** /leave-management/kit-days | View all the KIT days of an employee in a policy |
| [**processKitDay**](PoliciesApi.md#processKitDay) | **PATCH** /leave-management/kit-days/{id} | Approve, decline or cancel a KIT day |


<a name="createKitDay"></a>
# **createKitDay**
> LeaveManagementCreateKitDayResponse createKitDay(policyId, employeeId, leaveManagementCreateKitDayRequest).date(date).dateFrom(dateFrom).dateTo(dateTo).execute();

Create a KIT day in a leave

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PoliciesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Sage client = new Sage(configuration);
    Integer policyId = 56; // Time-off policy identifier
    Integer employeeId = 56; // Employee identifier
    String date = "date_example"; // Date of single-day KIT day
    String dateFrom = "dateFrom_example"; // Start date of a multi-day KIT day
    String dateTo = "dateTo_example"; // End date of a multi-day KIT day
    try {
      LeaveManagementCreateKitDayResponse result = client
              .policies
              .createKitDay(policyId, employeeId)
              .date(date)
              .dateFrom(dateFrom)
              .dateTo(dateTo)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#createKitDay");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaveManagementCreateKitDayResponse> response = client
              .policies
              .createKitDay(policyId, employeeId)
              .date(date)
              .dateFrom(dateFrom)
              .dateTo(dateTo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#createKitDay");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyId** | **Integer**| Time-off policy identifier | |
| **employeeId** | **Integer**| Employee identifier | |
| **leaveManagementCreateKitDayRequest** | [**LeaveManagementCreateKitDayRequest**](LeaveManagementCreateKitDayRequest.md)|  | |
| **date** | **String**| Date of single-day KIT day | [optional] |
| **dateFrom** | **String**| Start date of a multi-day KIT day | [optional] |
| **dateTo** | **String**| End date of a multi-day KIT day | [optional] |

### Return type

[**LeaveManagementCreateKitDayResponse**](LeaveManagementCreateKitDayResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getKitDays"></a>
# **getKitDays**
> LeaveManagementGetKitDaysResponse getKitDays(policyId, employeeId).execute();

View all the KIT days of an employee in a policy

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PoliciesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Sage client = new Sage(configuration);
    Integer policyId = 1; // Time-off policy identifier
    Integer employeeId = 2; // Employee identifier
    try {
      LeaveManagementGetKitDaysResponse result = client
              .policies
              .getKitDays(policyId, employeeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#getKitDays");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaveManagementGetKitDaysResponse> response = client
              .policies
              .getKitDays(policyId, employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#getKitDays");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyId** | **Integer**| Time-off policy identifier | |
| **employeeId** | **Integer**| Employee identifier | |

### Return type

[**LeaveManagementGetKitDaysResponse**](LeaveManagementGetKitDaysResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="processKitDay"></a>
# **processKitDay**
> processKitDay(id, status, leaveManagementProcessKitDayRequest).execute();

Approve, decline or cancel a KIT day

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PoliciesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Sage client = new Sage(configuration);
    Integer id = 56; // KIT day identifier
    String status = "cancel"; // Action to apply to the specified KIT day
    try {
      client
              .policies
              .processKitDay(id, status)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#processKitDay");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .policies
              .processKitDay(id, status)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#processKitDay");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| KIT day identifier | |
| **status** | **String**| Action to apply to the specified KIT day | [enum: cancel, approve, decline] |
| **leaveManagementProcessKitDayRequest** | [**LeaveManagementProcessKitDayRequest**](LeaveManagementProcessKitDayRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

