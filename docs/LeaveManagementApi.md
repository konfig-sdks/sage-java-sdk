# LeaveManagementApi

All URIs are relative to *https://subdomain.sage.hr/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createKitDay**](LeaveManagementApi.md#createKitDay) | **POST** /leave-management/kit-days | Create a KIT day in a leave |
| [**getIndividualAllowances**](LeaveManagementApi.md#getIndividualAllowances) | **GET** /leave-management/reports/individual-allowances | Report with individual allowances |
| [**getKitDays**](LeaveManagementApi.md#getKitDays) | **GET** /leave-management/kit-days | View all the KIT days of an employee in a policy |
| [**getTimeOffBalances**](LeaveManagementApi.md#getTimeOffBalances) | **GET** /employees/{id}/leave-management/balances | Employee time off balances |
| [**getTimeOffPolicyById**](LeaveManagementApi.md#getTimeOffPolicyById) | **GET** /leave-management/policies/{id} | Details about a time off policy |
| [**listEmployeesOutToday**](LeaveManagementApi.md#listEmployeesOutToday) | **GET** /leave-management/out-of-office-today | List employees out of office today |
| [**listTimeOffPolicies**](LeaveManagementApi.md#listTimeOffPolicies) | **GET** /leave-management/policies | List time off policies |
| [**listTimeOffRequests**](LeaveManagementApi.md#listTimeOffRequests) | **GET** /leave-management/requests | List time off requests |
| [**newTimeOffRequest**](LeaveManagementApi.md#newTimeOffRequest) | **POST** /leave-management/requests | Create new time off request |
| [**processKitDay**](LeaveManagementApi.md#processKitDay) | **PATCH** /leave-management/kit-days/{id} | Approve, decline or cancel a KIT day |
| [**updateKitDaysConfiguration**](LeaveManagementApi.md#updateKitDaysConfiguration) | **PATCH** /leave-management/policies/{id} | Update KIT days configuration of a time off policy |


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
import com.konfigthis.client.api.LeaveManagementApi;
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
              .leaveManagement
              .createKitDay(policyId, employeeId)
              .date(date)
              .dateFrom(dateFrom)
              .dateTo(dateTo)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveManagementApi#createKitDay");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaveManagementCreateKitDayResponse> response = client
              .leaveManagement
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
      System.err.println("Exception when calling LeaveManagementApi#createKitDay");
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

<a name="getIndividualAllowances"></a>
# **getIndividualAllowances**
> LeaveManagementGetIndividualAllowancesResponse getIndividualAllowances().page(page).perPage(perPage).locationIds(locationIds).employeeIds(employeeIds).teamIds(teamIds).execute();

Report with individual allowances

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaveManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Sage client = new Sage(configuration);
    Integer page = 2;
    Integer perPage = 25;
    List<Integer> locationIds = Arrays.asList(); // Limit the reports to employees in specified location ids
    List<Integer> employeeIds = Arrays.asList(); // Limit the reports to selected employee ids
    List<Integer> teamIds = Arrays.asList(); // Limit the reports to employees in specified team ids
    try {
      LeaveManagementGetIndividualAllowancesResponse result = client
              .leaveManagement
              .getIndividualAllowances()
              .page(page)
              .perPage(perPage)
              .locationIds(locationIds)
              .employeeIds(employeeIds)
              .teamIds(teamIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveManagementApi#getIndividualAllowances");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaveManagementGetIndividualAllowancesResponse> response = client
              .leaveManagement
              .getIndividualAllowances()
              .page(page)
              .perPage(perPage)
              .locationIds(locationIds)
              .employeeIds(employeeIds)
              .teamIds(teamIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveManagementApi#getIndividualAllowances");
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
| **page** | **Integer**|  | [optional] |
| **perPage** | **Integer**|  | [optional] |
| **locationIds** | [**List&lt;Integer&gt;**](Integer.md)| Limit the reports to employees in specified location ids | [optional] |
| **employeeIds** | [**List&lt;Integer&gt;**](Integer.md)| Limit the reports to selected employee ids | [optional] |
| **teamIds** | [**List&lt;Integer&gt;**](Integer.md)| Limit the reports to employees in specified team ids | [optional] |

### Return type

[**LeaveManagementGetIndividualAllowancesResponse**](LeaveManagementGetIndividualAllowancesResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
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
import com.konfigthis.client.api.LeaveManagementApi;
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
              .leaveManagement
              .getKitDays(policyId, employeeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveManagementApi#getKitDays");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaveManagementGetKitDaysResponse> response = client
              .leaveManagement
              .getKitDays(policyId, employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveManagementApi#getKitDays");
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

<a name="getTimeOffBalances"></a>
# **getTimeOffBalances**
> LeaveManagementGetTimeOffBalancesResponse getTimeOffBalances(id).execute();

Employee time off balances

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaveManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Sage client = new Sage(configuration);
    Integer id = 56; // Numeric ID of the user to get.
    try {
      LeaveManagementGetTimeOffBalancesResponse result = client
              .leaveManagement
              .getTimeOffBalances(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveManagementApi#getTimeOffBalances");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaveManagementGetTimeOffBalancesResponse> response = client
              .leaveManagement
              .getTimeOffBalances(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveManagementApi#getTimeOffBalances");
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
| **id** | **Integer**| Numeric ID of the user to get. | |

### Return type

[**LeaveManagementGetTimeOffBalancesResponse**](LeaveManagementGetTimeOffBalancesResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getTimeOffPolicyById"></a>
# **getTimeOffPolicyById**
> LeaveManagementGetTimeOffPolicyByIdResponse getTimeOffPolicyById(id).execute();

Details about a time off policy

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaveManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Sage client = new Sage(configuration);
    Integer id = 56; // Numeric ID of the policy to get.
    try {
      LeaveManagementGetTimeOffPolicyByIdResponse result = client
              .leaveManagement
              .getTimeOffPolicyById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveManagementApi#getTimeOffPolicyById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaveManagementGetTimeOffPolicyByIdResponse> response = client
              .leaveManagement
              .getTimeOffPolicyById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveManagementApi#getTimeOffPolicyById");
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
| **id** | **Integer**| Numeric ID of the policy to get. | |

### Return type

[**LeaveManagementGetTimeOffPolicyByIdResponse**](LeaveManagementGetTimeOffPolicyByIdResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="listEmployeesOutToday"></a>
# **listEmployeesOutToday**
> LeaveManagementListEmployeesOutTodayResponse listEmployeesOutToday().date(date).execute();

List employees out of office today

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaveManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Sage client = new Sage(configuration);
    String date = "2018-11-23"; // Optional date, defauls to today
    try {
      LeaveManagementListEmployeesOutTodayResponse result = client
              .leaveManagement
              .listEmployeesOutToday()
              .date(date)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveManagementApi#listEmployeesOutToday");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaveManagementListEmployeesOutTodayResponse> response = client
              .leaveManagement
              .listEmployeesOutToday()
              .date(date)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveManagementApi#listEmployeesOutToday");
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
| **date** | **String**| Optional date, defauls to today | [optional] |

### Return type

[**LeaveManagementListEmployeesOutTodayResponse**](LeaveManagementListEmployeesOutTodayResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="listTimeOffPolicies"></a>
# **listTimeOffPolicies**
> LeaveManagementListTimeOffPoliciesResponse listTimeOffPolicies().execute();

List time off policies

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaveManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Sage client = new Sage(configuration);
    try {
      LeaveManagementListTimeOffPoliciesResponse result = client
              .leaveManagement
              .listTimeOffPolicies()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveManagementApi#listTimeOffPolicies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaveManagementListTimeOffPoliciesResponse> response = client
              .leaveManagement
              .listTimeOffPolicies()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveManagementApi#listTimeOffPolicies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LeaveManagementListTimeOffPoliciesResponse**](LeaveManagementListTimeOffPoliciesResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="listTimeOffRequests"></a>
# **listTimeOffRequests**
> LeaveManagementListTimeOffRequestsResponse listTimeOffRequests().page(page).from(from).to(to).execute();

List time off requests

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaveManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Sage client = new Sage(configuration);
    Integer page = 2;
    String from = "2018-05-20"; // If not specified defaults to beginning of current month
    String to = "2018-06-20"; // If not specified defaults to end of current month. Days between from date and to date must be less than 65. If you need info for larger period of time make multiple requests;
    try {
      LeaveManagementListTimeOffRequestsResponse result = client
              .leaveManagement
              .listTimeOffRequests()
              .page(page)
              .from(from)
              .to(to)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveManagementApi#listTimeOffRequests");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaveManagementListTimeOffRequestsResponse> response = client
              .leaveManagement
              .listTimeOffRequests()
              .page(page)
              .from(from)
              .to(to)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveManagementApi#listTimeOffRequests");
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
| **page** | **Integer**|  | [optional] |
| **from** | **String**| If not specified defaults to beginning of current month | [optional] |
| **to** | **String**| If not specified defaults to end of current month. Days between from date and to date must be less than 65. If you need info for larger period of time make multiple requests; | [optional] |

### Return type

[**LeaveManagementListTimeOffRequestsResponse**](LeaveManagementListTimeOffRequestsResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="newTimeOffRequest"></a>
# **newTimeOffRequest**
> LeaveManagementNewTimeOffRequestResponse newTimeOffRequest(type, timeOffPolicyId, employeeId, partOfDay, leaveManagementNewTimeOffRequestRequest).date(date).dateFrom(dateFrom).dateTo(dateTo).hours(hours).timeFrom(timeFrom).timeTo(timeTo).details(details).execute();

Create new time off request

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaveManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    Sage client = new Sage(configuration);
    String type = "single";
    Integer timeOffPolicyId = 56;
    Integer employeeId = 56;
    String partOfDay = "all_day"; // required if type is single
    String date = "date_example"; // format: YYYY-MM-DD; required if type is single
    String dateFrom = "dateFrom_example"; // format: YYYY-MM-DD; required if type is multi
    String dateTo = "dateTo_example"; // format: YYYY-MM-DD; required if type is multi
    Double hours = 3.4D; // required if type is single & part_of_day is first_part_of_day or second_part_of_day
    String timeFrom = "timeFrom_example"; // format: H:M; required if part_of_day is specific_timespan
    String timeTo = "timeTo_example"; // format: H:M; required if part_of_day is specific_timespan
    String details = "details_example"; // required based on policy settings
    try {
      LeaveManagementNewTimeOffRequestResponse result = client
              .leaveManagement
              .newTimeOffRequest(type, timeOffPolicyId, employeeId, partOfDay)
              .date(date)
              .dateFrom(dateFrom)
              .dateTo(dateTo)
              .hours(hours)
              .timeFrom(timeFrom)
              .timeTo(timeTo)
              .details(details)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveManagementApi#newTimeOffRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaveManagementNewTimeOffRequestResponse> response = client
              .leaveManagement
              .newTimeOffRequest(type, timeOffPolicyId, employeeId, partOfDay)
              .date(date)
              .dateFrom(dateFrom)
              .dateTo(dateTo)
              .hours(hours)
              .timeFrom(timeFrom)
              .timeTo(timeTo)
              .details(details)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveManagementApi#newTimeOffRequest");
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
| **type** | **String**|  | [enum: single, multi] |
| **timeOffPolicyId** | **Integer**|  | |
| **employeeId** | **Integer**|  | |
| **partOfDay** | **String**| required if type is single | [enum: all_day, first_part_of_day, second_part_of_day, specific_timespan] |
| **leaveManagementNewTimeOffRequestRequest** | [**LeaveManagementNewTimeOffRequestRequest**](LeaveManagementNewTimeOffRequestRequest.md)|  | |
| **date** | **String**| format: YYYY-MM-DD; required if type is single | [optional] |
| **dateFrom** | **String**| format: YYYY-MM-DD; required if type is multi | [optional] |
| **dateTo** | **String**| format: YYYY-MM-DD; required if type is multi | [optional] |
| **hours** | **Double**| required if type is single &amp; part_of_day is first_part_of_day or second_part_of_day | [optional] |
| **timeFrom** | **String**| format: H:M; required if part_of_day is specific_timespan | [optional] |
| **timeTo** | **String**| format: H:M; required if part_of_day is specific_timespan | [optional] |
| **details** | **String**| required based on policy settings | [optional] |

### Return type

[**LeaveManagementNewTimeOffRequestResponse**](LeaveManagementNewTimeOffRequestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |

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
import com.konfigthis.client.api.LeaveManagementApi;
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
              .leaveManagement
              .processKitDay(id, status)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveManagementApi#processKitDay");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .leaveManagement
              .processKitDay(id, status)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveManagementApi#processKitDay");
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

<a name="updateKitDaysConfiguration"></a>
# **updateKitDaysConfiguration**
> updateKitDaysConfiguration(id, kitDaysEnabled, kitDaysQuantity, leaveManagementUpdateKitDaysConfigurationRequest).execute();

Update KIT days configuration of a time off policy

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LeaveManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Sage client = new Sage(configuration);
    Integer id = 56; // Numeric ID of the policy to get.
    Boolean kitDaysEnabled = true; // Whether the policy allows Kit days or not
    Integer kitDaysQuantity = 56; // Maximum number of Kit days allowed in the policy
    try {
      client
              .leaveManagement
              .updateKitDaysConfiguration(id, kitDaysEnabled, kitDaysQuantity)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveManagementApi#updateKitDaysConfiguration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .leaveManagement
              .updateKitDaysConfiguration(id, kitDaysEnabled, kitDaysQuantity)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LeaveManagementApi#updateKitDaysConfiguration");
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
| **id** | **Integer**| Numeric ID of the policy to get. | |
| **kitDaysEnabled** | **Boolean**| Whether the policy allows Kit days or not | [enum: true, false] |
| **kitDaysQuantity** | **Integer**| Maximum number of Kit days allowed in the policy | |
| **leaveManagementUpdateKitDaysConfigurationRequest** | [**LeaveManagementUpdateKitDaysConfigurationRequest**](LeaveManagementUpdateKitDaysConfigurationRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

