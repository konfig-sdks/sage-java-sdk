# OffboardingApi

All URIs are relative to *https://subdomain.sage.hr/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTask**](OffboardingApi.md#createTask) | **POST** /offboarding/tasks | Create new offboarding task |
| [**listCategories**](OffboardingApi.md#listCategories) | **GET** /offboarding/categories | List offboarding task categories |


<a name="createTask"></a>
# **createTask**
> OffboardingCreateTaskResponse createTask(title, boardingTaskTemplateCategoryId, dueIn, offboardingCreateTaskRequest).description(description).defaultAssigneeType(defaultAssigneeType).assigneeId(assigneeId).requireAttachment(requireAttachment).execute();

Create new offboarding task

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OffboardingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    Sage client = new Sage(configuration);
    String title = "title_example";
    Double boardingTaskTemplateCategoryId = 3.4D;
    Double dueIn = 3.4D; // Due date in days before employee last working day
    String description = "description_example";
    String defaultAssigneeType = "self"; // Default: self; leader - direct manager; employee - specific employee via assignee_id
    Double assigneeId = 3.4D; // Specific assignee if default_assignee_type is 'employee'
    String requireAttachment = "requireAttachment_example"; // 'true' to enabled required attachment
    try {
      OffboardingCreateTaskResponse result = client
              .offboarding
              .createTask(title, boardingTaskTemplateCategoryId, dueIn)
              .description(description)
              .defaultAssigneeType(defaultAssigneeType)
              .assigneeId(assigneeId)
              .requireAttachment(requireAttachment)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling OffboardingApi#createTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OffboardingCreateTaskResponse> response = client
              .offboarding
              .createTask(title, boardingTaskTemplateCategoryId, dueIn)
              .description(description)
              .defaultAssigneeType(defaultAssigneeType)
              .assigneeId(assigneeId)
              .requireAttachment(requireAttachment)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OffboardingApi#createTask");
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
| **title** | **String**|  | |
| **boardingTaskTemplateCategoryId** | **Double**|  | |
| **dueIn** | **Double**| Due date in days before employee last working day | |
| **offboardingCreateTaskRequest** | [**OffboardingCreateTaskRequest**](OffboardingCreateTaskRequest.md)|  | |
| **description** | **String**|  | [optional] |
| **defaultAssigneeType** | **String**| Default: self; leader - direct manager; employee - specific employee via assignee_id | [optional] [enum: self, leader, employee] |
| **assigneeId** | **Double**| Specific assignee if default_assignee_type is &#39;employee&#39; | [optional] |
| **requireAttachment** | **String**| &#39;true&#39; to enabled required attachment | [optional] |

### Return type

[**OffboardingCreateTaskResponse**](OffboardingCreateTaskResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |

<a name="listCategories"></a>
# **listCategories**
> OffboardingListCategoriesResponse listCategories().execute();

List offboarding task categories

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OffboardingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    Sage client = new Sage(configuration);
    try {
      OffboardingListCategoriesResponse result = client
              .offboarding
              .listCategories()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling OffboardingApi#listCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OffboardingListCategoriesResponse> response = client
              .offboarding
              .listCategories()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OffboardingApi#listCategories");
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

[**OffboardingListCategoriesResponse**](OffboardingListCategoriesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

