# DocumentsApi

All URIs are relative to *https://subdomain.sage.hr/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewDocument**](DocumentsApi.md#createNewDocument) | **POST** /documents | Create new document |
| [**listCategories**](DocumentsApi.md#listCategories) | **GET** /documents/categories | List document categories |


<a name="createNewDocument"></a>
# **createNewDocument**
> DocumentsCreateNewDocumentResponse createNewDocument(_file, employeeId, documentsCreateNewDocumentRequest).description(description).categoryId(categoryId).notify(notify).execute();

Create new document

Document will only be visible to employee themselves

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DocumentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    Sage client = new Sage(configuration);
    File _file = new File("/path/to/file"); // The file to upload.
    Integer employeeId = 56; // Employee identifier
    String description = "description_example"; // Document description
    Integer categoryId = 56; // Category identifier, leave empty for default category
    String notify = "notify_example"; // 'true' to notify employee by email
    try {
      DocumentsCreateNewDocumentResponse result = client
              .documents
              .createNewDocument(_file, employeeId)
              .description(description)
              .categoryId(categoryId)
              .notify(notify)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#createNewDocument");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DocumentsCreateNewDocumentResponse> response = client
              .documents
              .createNewDocument(_file, employeeId)
              .description(description)
              .categoryId(categoryId)
              .notify(notify)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#createNewDocument");
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
| **_file** | **File**| The file to upload. | |
| **employeeId** | **Integer**| Employee identifier | |
| **documentsCreateNewDocumentRequest** | [**DocumentsCreateNewDocumentRequest**](DocumentsCreateNewDocumentRequest.md)|  | |
| **description** | **String**| Document description | [optional] |
| **categoryId** | **Integer**| Category identifier, leave empty for default category | [optional] |
| **notify** | **String**| &#39;true&#39; to notify employee by email | [optional] |

### Return type

[**DocumentsCreateNewDocumentResponse**](DocumentsCreateNewDocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |

<a name="listCategories"></a>
# **listCategories**
> DocumentsListCategoriesResponse listCategories().execute();

List document categories

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DocumentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    Sage client = new Sage(configuration);
    try {
      DocumentsListCategoriesResponse result = client
              .documents
              .listCategories()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#listCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DocumentsListCategoriesResponse> response = client
              .documents
              .listCategories()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentsApi#listCategories");
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

[**DocumentsListCategoriesResponse**](DocumentsListCategoriesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

