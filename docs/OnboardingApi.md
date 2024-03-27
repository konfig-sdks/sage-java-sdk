# OnboardingApi

All URIs are relative to *https://subdomain.sage.hr/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewTask**](OnboardingApi.md#createNewTask) | **POST** /onboarding/tasks | Create new onboarding task |
| [**listTaskCategories**](OnboardingApi.md#listTaskCategories) | **GET** /onboarding/categories | List onboarding task categories |


<a name="createNewTask"></a>
# **createNewTask**
> OnboardingCreateNewTaskResponse createNewTask(title, boardingTaskTemplateCategoryId, dueIn, onboardingCreateNewTaskRequest).description(description).defaultAssigneeType(defaultAssigneeType).assigneeId(assigneeId).requireAttachment(requireAttachment).addAfter(addAfter).execute();

Create new onboarding task

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnboardingApi;
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
    Double dueIn = 3.4D; // Due date in days after employee start date
    String description = "description_example";
    String defaultAssigneeType = "self"; // Default: self; leader - direct manager; employee - specific employee via assignee_id
    Double assigneeId = 3.4D; // Specific assignee if default_assignee_type is 'employee'
    String requireAttachment = "requireAttachment_example"; // 'true' to enabled required attachment
    Double addAfter = 3.4D; // Task start date in days after employee start date
    try {
      OnboardingCreateNewTaskResponse result = client
              .onboarding
              .createNewTask(title, boardingTaskTemplateCategoryId, dueIn)
              .description(description)
              .defaultAssigneeType(defaultAssigneeType)
              .assigneeId(assigneeId)
              .requireAttachment(requireAttachment)
              .addAfter(addAfter)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnboardingApi#createNewTask");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OnboardingCreateNewTaskResponse> response = client
              .onboarding
              .createNewTask(title, boardingTaskTemplateCategoryId, dueIn)
              .description(description)
              .defaultAssigneeType(defaultAssigneeType)
              .assigneeId(assigneeId)
              .requireAttachment(requireAttachment)
              .addAfter(addAfter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnboardingApi#createNewTask");
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
| **dueIn** | **Double**| Due date in days after employee start date | |
| **onboardingCreateNewTaskRequest** | [**OnboardingCreateNewTaskRequest**](OnboardingCreateNewTaskRequest.md)|  | |
| **description** | **String**|  | [optional] |
| **defaultAssigneeType** | **String**| Default: self; leader - direct manager; employee - specific employee via assignee_id | [optional] [enum: self, leader, employee] |
| **assigneeId** | **Double**| Specific assignee if default_assignee_type is &#39;employee&#39; | [optional] |
| **requireAttachment** | **String**| &#39;true&#39; to enabled required attachment | [optional] |
| **addAfter** | **Double**| Task start date in days after employee start date | [optional] |

### Return type

[**OnboardingCreateNewTaskResponse**](OnboardingCreateNewTaskResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |

<a name="listTaskCategories"></a>
# **listTaskCategories**
> OnboardingListTaskCategoriesResponse listTaskCategories().execute();

List onboarding task categories

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnboardingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    Sage client = new Sage(configuration);
    try {
      OnboardingListTaskCategoriesResponse result = client
              .onboarding
              .listTaskCategories()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnboardingApi#listTaskCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OnboardingListTaskCategoriesResponse> response = client
              .onboarding
              .listTaskCategories()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnboardingApi#listTaskCategories");
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

[**OnboardingListTaskCategoriesResponse**](OnboardingListTaskCategoriesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

