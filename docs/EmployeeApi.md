# EmployeeApi

All URIs are relative to *https://subdomain.sage.hr/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewEmployee**](EmployeeApi.md#createNewEmployee) | **POST** /employees | Create new employee |
| [**getById**](EmployeeApi.md#getById) | **GET** /employees/{id} | Single active employee in company |
| [**getCompensations**](EmployeeApi.md#getCompensations) | **GET** /employees/{id}/compensations | Employee compensations |
| [**getCustomFields**](EmployeeApi.md#getCustomFields) | **GET** /employees/{id}/custom-fields | Employee custom fields |
| [**getTerminatedEmployee**](EmployeeApi.md#getTerminatedEmployee) | **GET** /terminated-employees/{id} | Single terminated employee in company |
| [**getTimeOffBalances**](EmployeeApi.md#getTimeOffBalances) | **GET** /employees/{id}/leave-management/balances | Employee time off balances |
| [**listActiveEmployees**](EmployeeApi.md#listActiveEmployees) | **GET** /employees | List active employees in company |
| [**listTerminatedEmployees**](EmployeeApi.md#listTerminatedEmployees) | **GET** /terminated-employees | List terminated employees in company |
| [**terminateEmployee**](EmployeeApi.md#terminateEmployee) | **POST** /employees/{id}/terminations | Terminate employee |
| [**updateById**](EmployeeApi.md#updateById) | **PUT** /employees/{id} | Update Employee |
| [**updateCustomField**](EmployeeApi.md#updateCustomField) | **PUT** /employees/{id}/custom-fields/{custom_field_id} | Update custom field |


<a name="createNewEmployee"></a>
# **createNewEmployee**
> EmployeeCreateNewEmployeeResponse createNewEmployee(email, firstName, lastName, employeeCreateNewEmployeeRequest).workStartDate(workStartDate).sendEmail(sendEmail).execute();

Create new employee

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    Sage client = new Sage(configuration);
    String email = "email_example"; // Employees email
    String firstName = "firstName_example"; // Employees first name
    String lastName = "lastName_example"; // Employees last name
    String workStartDate = "workStartDate_example"; // Employees work start date, format: YYYY-MM-DD, leave empty to use todays date
    String sendEmail = "sendEmail_example"; // 'true' to send welcome email to employee
    try {
      EmployeeCreateNewEmployeeResponse result = client
              .employee
              .createNewEmployee(email, firstName, lastName)
              .workStartDate(workStartDate)
              .sendEmail(sendEmail)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#createNewEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeCreateNewEmployeeResponse> response = client
              .employee
              .createNewEmployee(email, firstName, lastName)
              .workStartDate(workStartDate)
              .sendEmail(sendEmail)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#createNewEmployee");
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
| **email** | **String**| Employees email | |
| **firstName** | **String**| Employees first name | |
| **lastName** | **String**| Employees last name | |
| **employeeCreateNewEmployeeRequest** | [**EmployeeCreateNewEmployeeRequest**](EmployeeCreateNewEmployeeRequest.md)|  | |
| **workStartDate** | **String**| Employees work start date, format: YYYY-MM-DD, leave empty to use todays date | [optional] |
| **sendEmail** | **String**| &#39;true&#39; to send welcome email to employee | [optional] |

### Return type

[**EmployeeCreateNewEmployeeResponse**](EmployeeCreateNewEmployeeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |

<a name="getById"></a>
# **getById**
> EmployeeGetByIdResponse getById(id).teamHistory(teamHistory).employmentStatusHistory(employmentStatusHistory).positionHistory(positionHistory).execute();

Single active employee in company

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeApi;
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
    Boolean teamHistory = true;
    Boolean employmentStatusHistory = true;
    Boolean positionHistory = true;
    try {
      EmployeeGetByIdResponse result = client
              .employee
              .getById(id)
              .teamHistory(teamHistory)
              .employmentStatusHistory(employmentStatusHistory)
              .positionHistory(positionHistory)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeGetByIdResponse> response = client
              .employee
              .getById(id)
              .teamHistory(teamHistory)
              .employmentStatusHistory(employmentStatusHistory)
              .positionHistory(positionHistory)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#getById");
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
| **teamHistory** | **Boolean**|  | [optional] |
| **employmentStatusHistory** | **Boolean**|  | [optional] |
| **positionHistory** | **Boolean**|  | [optional] |

### Return type

[**EmployeeGetByIdResponse**](EmployeeGetByIdResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response, team_history/employment_status_history/position_history collections are returned only if regarding optional paramters are provided in query |  -  |

<a name="getCompensations"></a>
# **getCompensations**
> EmployeeGetCompensationsResponse getCompensations(id).execute();

Employee compensations

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeApi;
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
      EmployeeGetCompensationsResponse result = client
              .employee
              .getCompensations(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#getCompensations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeGetCompensationsResponse> response = client
              .employee
              .getCompensations(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#getCompensations");
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

[**EmployeeGetCompensationsResponse**](EmployeeGetCompensationsResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getCustomFields"></a>
# **getCustomFields**
> EmployeeGetCustomFieldsResponse getCustomFields(id).execute();

Employee custom fields

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeApi;
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
      EmployeeGetCustomFieldsResponse result = client
              .employee
              .getCustomFields(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#getCustomFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeGetCustomFieldsResponse> response = client
              .employee
              .getCustomFields(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#getCustomFields");
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

[**EmployeeGetCustomFieldsResponse**](EmployeeGetCustomFieldsResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getTerminatedEmployee"></a>
# **getTerminatedEmployee**
> EmployeeGetTerminatedEmployeeResponse getTerminatedEmployee(id).execute();

Single terminated employee in company

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeApi;
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
      EmployeeGetTerminatedEmployeeResponse result = client
              .employee
              .getTerminatedEmployee(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#getTerminatedEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeGetTerminatedEmployeeResponse> response = client
              .employee
              .getTerminatedEmployee(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#getTerminatedEmployee");
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

[**EmployeeGetTerminatedEmployeeResponse**](EmployeeGetTerminatedEmployeeResponse.md)

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
import com.konfigthis.client.api.EmployeeApi;
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
              .employee
              .getTimeOffBalances(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#getTimeOffBalances");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaveManagementGetTimeOffBalancesResponse> response = client
              .employee
              .getTimeOffBalances(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#getTimeOffBalances");
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

<a name="listActiveEmployees"></a>
# **listActiveEmployees**
> EmployeeListActiveEmployeesResponse listActiveEmployees().page(page).teamHistory(teamHistory).employmentStatusHistory(employmentStatusHistory).positionHistory(positionHistory).execute();

List active employees in company

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeApi;
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
    Boolean teamHistory = true;
    Boolean employmentStatusHistory = true;
    Boolean positionHistory = true;
    try {
      EmployeeListActiveEmployeesResponse result = client
              .employee
              .listActiveEmployees()
              .page(page)
              .teamHistory(teamHistory)
              .employmentStatusHistory(employmentStatusHistory)
              .positionHistory(positionHistory)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#listActiveEmployees");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeListActiveEmployeesResponse> response = client
              .employee
              .listActiveEmployees()
              .page(page)
              .teamHistory(teamHistory)
              .employmentStatusHistory(employmentStatusHistory)
              .positionHistory(positionHistory)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#listActiveEmployees");
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
| **teamHistory** | **Boolean**|  | [optional] |
| **employmentStatusHistory** | **Boolean**|  | [optional] |
| **positionHistory** | **Boolean**|  | [optional] |

### Return type

[**EmployeeListActiveEmployeesResponse**](EmployeeListActiveEmployeesResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response, team_history/employment_status_history/position_history collections are returned only if regarding optional paramters are provided in query |  -  |

<a name="listTerminatedEmployees"></a>
# **listTerminatedEmployees**
> EmployeeListTerminatedEmployeesResponse listTerminatedEmployees().page(page).execute();

List terminated employees in company

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeApi;
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
    try {
      EmployeeListTerminatedEmployeesResponse result = client
              .employee
              .listTerminatedEmployees()
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#listTerminatedEmployees");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeListTerminatedEmployeesResponse> response = client
              .employee
              .listTerminatedEmployees()
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#listTerminatedEmployees");
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

### Return type

[**EmployeeListTerminatedEmployeesResponse**](EmployeeListTerminatedEmployeesResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="terminateEmployee"></a>
# **terminateEmployee**
> EmployeeTerminateEmployeeResponse terminateEmployee(id, date, terminationReasonId, employeeTerminateEmployeeRequest).comments(comments).execute();

Terminate employee

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Sage client = new Sage(configuration);
    Integer id = 56; // Numeric ID of the user
    String date = "date_example"; // Last working day; format: YYYY-MM-DD
    Double terminationReasonId = 3.4D; // Termination reason ID
    String comments = "comments_example"; // Comments
    try {
      EmployeeTerminateEmployeeResponse result = client
              .employee
              .terminateEmployee(id, date, terminationReasonId)
              .comments(comments)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#terminateEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeTerminateEmployeeResponse> response = client
              .employee
              .terminateEmployee(id, date, terminationReasonId)
              .comments(comments)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#terminateEmployee");
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
| **id** | **Integer**| Numeric ID of the user | |
| **date** | **String**| Last working day; format: YYYY-MM-DD | |
| **terminationReasonId** | **Double**| Termination reason ID | |
| **employeeTerminateEmployeeRequest** | [**EmployeeTerminateEmployeeRequest**](EmployeeTerminateEmployeeRequest.md)|  | |
| **comments** | **String**| Comments | [optional] |

### Return type

[**EmployeeTerminateEmployeeResponse**](EmployeeTerminateEmployeeResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |

<a name="updateById"></a>
# **updateById**
> EmployeeUpdateByIdResponse updateById(id).employeeUpdateByIdRequest(employeeUpdateByIdRequest).execute();

Update Employee

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    Sage client = new Sage(configuration);
    Integer id = 56; // Numeric ID of the user to update.
    String firstName = "firstName_example";
    String lastName = "lastName_example";
    String workStartDate = "workStartDate_example";
    Integer locationId = 56;
    Integer teamId = 56;
    Integer leaderId = 56;
    Integer positionId = 56;
    String employeeNumber = "employeeNumber_example";
    List<Integer> approverIds = Arrays.asList();
    List<Integer> selectedLeaveTypes = Arrays.asList();
    try {
      EmployeeUpdateByIdResponse result = client
              .employee
              .updateById(id)
              .firstName(firstName)
              .lastName(lastName)
              .workStartDate(workStartDate)
              .locationId(locationId)
              .teamId(teamId)
              .leaderId(leaderId)
              .positionId(positionId)
              .employeeNumber(employeeNumber)
              .approverIds(approverIds)
              .selectedLeaveTypes(selectedLeaveTypes)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeUpdateByIdResponse> response = client
              .employee
              .updateById(id)
              .firstName(firstName)
              .lastName(lastName)
              .workStartDate(workStartDate)
              .locationId(locationId)
              .teamId(teamId)
              .leaderId(leaderId)
              .positionId(positionId)
              .employeeNumber(employeeNumber)
              .approverIds(approverIds)
              .selectedLeaveTypes(selectedLeaveTypes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#updateById");
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
| **id** | **Integer**| Numeric ID of the user to update. | |
| **employeeUpdateByIdRequest** | [**EmployeeUpdateByIdRequest**](EmployeeUpdateByIdRequest.md)|  | [optional] |

### Return type

[**EmployeeUpdateByIdResponse**](EmployeeUpdateByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |

<a name="updateCustomField"></a>
# **updateCustomField**
> EmployeeUpdateCustomFieldResponse updateCustomField(id, customFieldId, value, employeeUpdateCustomFieldRequest).execute();

Update custom field

Update employee custom field

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    Sage client = new Sage(configuration);
    Integer id = 56; // Employee identifier
    Integer customFieldId = 56; // Custom field identifier
    String value = "value_example"; // String or array (for tags)
    try {
      EmployeeUpdateCustomFieldResponse result = client
              .employee
              .updateCustomField(id, customFieldId, value)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#updateCustomField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeUpdateCustomFieldResponse> response = client
              .employee
              .updateCustomField(id, customFieldId, value)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#updateCustomField");
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
| **id** | **Integer**| Employee identifier | |
| **customFieldId** | **Integer**| Custom field identifier | |
| **value** | **String**| String or array (for tags) | |
| **employeeUpdateCustomFieldRequest** | [**EmployeeUpdateCustomFieldRequest**](EmployeeUpdateCustomFieldRequest.md)|  | |

### Return type

[**EmployeeUpdateCustomFieldResponse**](EmployeeUpdateCustomFieldResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

