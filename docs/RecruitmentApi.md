# RecruitmentApi

All URIs are relative to *https://subdomain.sage.hr/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createApplicantWithReferral**](RecruitmentApi.md#createApplicantWithReferral) | **POST** /recruitment/positions/{id}/applicants | Create new applicant |
| [**getApplicantDetails**](RecruitmentApi.md#getApplicantDetails) | **GET** /recruitment/applicants/{id} | Applicant details |
| [**getPositionDetails**](RecruitmentApi.md#getPositionDetails) | **GET** /recruitment/positions/{id} | Position details |
| [**listApplicantActions**](RecruitmentApi.md#listApplicantActions) | **GET** /recruitment/applicants/{id}/actions | Applicant actions |
| [**listApplicants**](RecruitmentApi.md#listApplicants) | **GET** /recruitment/positions/{id}/applicants | List applicants |
| [**listPositions**](RecruitmentApi.md#listPositions) | **GET** /recruitment/positions | List recruitment positions |


<a name="createApplicantWithReferral"></a>
# **createApplicantWithReferral**
> RecruitmentCreateApplicantWithReferralResponse createApplicantWithReferral(id, applicantFirstName).sendThankYouEmail(sendThankYouEmail).applicantLastName(applicantLastName).applicantEmail(applicantEmail).applicantReferral(applicantReferral).applicantPhoneNumber(applicantPhoneNumber).applicantSource(applicantSource).applicantAddress(applicantAddress).applicantSummary(applicantSummary).applicantAttachment(applicantAttachment).recruitmentCreateApplicantWithReferralRequest(recruitmentCreateApplicantWithReferralRequest).execute();

Create new applicant

Tracking applicant&#39;s source:  * if left blank, source will be automatically set to &#x60;api&#x60;  * set source to a special keyword (&#x60;company_marketing&#x60;, &#x60;recruiters&#x60;, &#x60;referral&#x60;, &#x60;sourced&#x60;) to have it mapped to corresponding values   * set source to a desired reference to create a custom source, e.g. &#x60;source&#x3D;linkedin&#x60; will create a custom source called linkedin if it does not exist already  * passing a referral object as a parameter will set the source to &#x60;referral&#x60;    Example of creating an applicant with a refferal object: &#x60;&#x60;&#x60; curl -X POST -H &#39;X-AUTH-TOKEN:***&#39; -H &#39;Content-Type:application/json&#39; \\   \&quot;https://_***_/api/recruitment/positions/2/applicants\&quot; \\   -d &#39;{\&quot;applicant\&quot;: \\           {\&quot;referral\&quot;: {\&quot;email\&quot;: \&quot;recruitment@example.com\&quot;, \&quot;full_name\&quot;: \&quot;Alice L\&quot;}, \\            \&quot;address\&quot;: \&quot;BD23 8UL\&quot;, \&quot;summary\&quot;:\&quot;An applicant\&quot;, \\            \&quot;first_name\&quot;: \&quot;Applicant Name\&quot;}}&#39; &#x60;&#x60;&#x60; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecruitmentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Sage client = new Sage(configuration);
    Integer id = 56; // Numeric ID of position (must not be closed or completed).
    String applicantFirstName = "applicantFirstName_example";
    String sendThankYouEmail = "sendThankYouEmail_example"; // 'true' to send thank you email to applicant
    String applicantLastName = "applicantLastName_example";
    String applicantEmail = "applicantEmail_example";
    String applicantReferral = "applicantReferral_example";
    String applicantPhoneNumber = "applicantPhoneNumber_example";
    String applicantSource = "applicantSource_example";
    String applicantAddress = "applicantAddress_example";
    String applicantSummary = "applicantSummary_example";
    File applicantAttachment = new File("/path/to/file"); // The file to upload.
    try {
      RecruitmentCreateApplicantWithReferralResponse result = client
              .recruitment
              .createApplicantWithReferral(id, applicantFirstName)
              .sendThankYouEmail(sendThankYouEmail)
              .applicantLastName(applicantLastName)
              .applicantEmail(applicantEmail)
              .applicantReferral(applicantReferral)
              .applicantPhoneNumber(applicantPhoneNumber)
              .applicantSource(applicantSource)
              .applicantAddress(applicantAddress)
              .applicantSummary(applicantSummary)
              .applicantAttachment(applicantAttachment)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecruitmentApi#createApplicantWithReferral");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecruitmentCreateApplicantWithReferralResponse> response = client
              .recruitment
              .createApplicantWithReferral(id, applicantFirstName)
              .sendThankYouEmail(sendThankYouEmail)
              .applicantLastName(applicantLastName)
              .applicantEmail(applicantEmail)
              .applicantReferral(applicantReferral)
              .applicantPhoneNumber(applicantPhoneNumber)
              .applicantSource(applicantSource)
              .applicantAddress(applicantAddress)
              .applicantSummary(applicantSummary)
              .applicantAttachment(applicantAttachment)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecruitmentApi#createApplicantWithReferral");
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
| **id** | **Integer**| Numeric ID of position (must not be closed or completed). | |
| **applicantFirstName** | **String**|  | |
| **sendThankYouEmail** | **String**| &#39;true&#39; to send thank you email to applicant | [optional] |
| **applicantLastName** | **String**|  | [optional] |
| **applicantEmail** | **String**|  | [optional] |
| **applicantReferral** | **String**|  | [optional] |
| **applicantPhoneNumber** | **String**|  | [optional] |
| **applicantSource** | **String**|  | [optional] |
| **applicantAddress** | **String**|  | [optional] |
| **applicantSummary** | **String**|  | [optional] |
| **applicantAttachment** | **File**| The file to upload. | [optional] |
| **recruitmentCreateApplicantWithReferralRequest** | [**RecruitmentCreateApplicantWithReferralRequest**](RecruitmentCreateApplicantWithReferralRequest.md)|  | [optional] |

### Return type

[**RecruitmentCreateApplicantWithReferralResponse**](RecruitmentCreateApplicantWithReferralResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |

<a name="getApplicantDetails"></a>
# **getApplicantDetails**
> RecruitmentGetApplicantDetailsResponse getApplicantDetails(id).execute();

Applicant details

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecruitmentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Sage client = new Sage(configuration);
    Integer id = 56; // Numeric ID of applicant
    try {
      RecruitmentGetApplicantDetailsResponse result = client
              .recruitment
              .getApplicantDetails(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecruitmentApi#getApplicantDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecruitmentGetApplicantDetailsResponse> response = client
              .recruitment
              .getApplicantDetails(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecruitmentApi#getApplicantDetails");
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
| **id** | **Integer**| Numeric ID of applicant | |

### Return type

[**RecruitmentGetApplicantDetailsResponse**](RecruitmentGetApplicantDetailsResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getPositionDetails"></a>
# **getPositionDetails**
> RecruitmentGetPositionDetailsResponse getPositionDetails(id).execute();

Position details

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecruitmentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Sage client = new Sage(configuration);
    Integer id = 56; // Numeric ID of position
    try {
      RecruitmentGetPositionDetailsResponse result = client
              .recruitment
              .getPositionDetails(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecruitmentApi#getPositionDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecruitmentGetPositionDetailsResponse> response = client
              .recruitment
              .getPositionDetails(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecruitmentApi#getPositionDetails");
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
| **id** | **Integer**| Numeric ID of position | |

### Return type

[**RecruitmentGetPositionDetailsResponse**](RecruitmentGetPositionDetailsResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="listApplicantActions"></a>
# **listApplicantActions**
> RecruitmentListApplicantActionsResponse listApplicantActions(id).page(page).perPage(perPage).execute();

Applicant actions

List applicant&#39;s process throught the recruitment pipeline. Newest, first. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecruitmentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Sage client = new Sage(configuration);
    Integer id = 56; // Numeric ID of applicant
    Integer page = 2; // Pagination: fetch page at given offset
    Integer perPage = 25; // Pagination: amount of actions to return in 1 call, default: 30, max: 100 
    try {
      RecruitmentListApplicantActionsResponse result = client
              .recruitment
              .listApplicantActions(id)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecruitmentApi#listApplicantActions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecruitmentListApplicantActionsResponse> response = client
              .recruitment
              .listApplicantActions(id)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecruitmentApi#listApplicantActions");
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
| **id** | **Integer**| Numeric ID of applicant | |
| **page** | **Integer**| Pagination: fetch page at given offset | [optional] |
| **perPage** | **Integer**| Pagination: amount of actions to return in 1 call, default: 30, max: 100  | [optional] |

### Return type

[**RecruitmentListApplicantActionsResponse**](RecruitmentListApplicantActionsResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="listApplicants"></a>
# **listApplicants**
> RecruitmentListApplicantsResponse listApplicants(id).stageId(stageId).page(page).perPage(perPage).execute();

List applicants

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecruitmentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Sage client = new Sage(configuration);
    Integer id = 56; // Numeric ID of position
    Integer stageId = 25; // Optional filter by stage e.g. `?stage_id=25`
    Integer page = 2; // Pagination: fetch page at given offset, default 1
    Integer perPage = 25; // Pagination: amount of applicants to return in 1 call, default: 30, max: 100 
    try {
      RecruitmentListApplicantsResponse result = client
              .recruitment
              .listApplicants(id)
              .stageId(stageId)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecruitmentApi#listApplicants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecruitmentListApplicantsResponse> response = client
              .recruitment
              .listApplicants(id)
              .stageId(stageId)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecruitmentApi#listApplicants");
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
| **id** | **Integer**| Numeric ID of position | |
| **stageId** | **Integer**| Optional filter by stage e.g. &#x60;?stage_id&#x3D;25&#x60; | [optional] |
| **page** | **Integer**| Pagination: fetch page at given offset, default 1 | [optional] |
| **perPage** | **Integer**| Pagination: amount of applicants to return in 1 call, default: 30, max: 100  | [optional] |

### Return type

[**RecruitmentListApplicantsResponse**](RecruitmentListApplicantsResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="listPositions"></a>
# **listPositions**
> RecruitmentListPositionsResponse listPositions().status(status).hiringManagerIds(hiringManagerIds).groupIds(groupIds).locationIds(locationIds).page(page).perPage(perPage).execute();

List recruitment positions

Posible recruitment position statuses: &#x60;draft&#x60;, &#x60;published&#x60;, &#x60;internal&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecruitmentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Sage client = new Sage(configuration);
    String status = "completed"; // Filter by status, see list of possible statuses `?status=open` 
    List<String> hiringManagerIds = Arrays.asList(); // Filter by hiring manager id, can appear multiple times `hiring_manager_ids[]=251&hiring_manager_ids[]=121` 
    List<String> groupIds = Arrays.asList(); // Filter by group id, can appear multiple times `group_ids[]=27&group_ids[]=761` 
    List<String> locationIds = Arrays.asList(); // Filter by location id, can appear multiple times `location_ids[]=1&location_ids[]=12` 
    Integer page = 2; // Pagination: fetch page at given offset
    Integer perPage = 25; // Pagination: amount of positions to return in 1 call, default: 30, max: 100 
    try {
      RecruitmentListPositionsResponse result = client
              .recruitment
              .listPositions()
              .status(status)
              .hiringManagerIds(hiringManagerIds)
              .groupIds(groupIds)
              .locationIds(locationIds)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecruitmentApi#listPositions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecruitmentListPositionsResponse> response = client
              .recruitment
              .listPositions()
              .status(status)
              .hiringManagerIds(hiringManagerIds)
              .groupIds(groupIds)
              .locationIds(locationIds)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecruitmentApi#listPositions");
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
| **status** | **String**| Filter by status, see list of possible statuses &#x60;?status&#x3D;open&#x60;  | [optional] |
| **hiringManagerIds** | [**List&lt;String&gt;**](String.md)| Filter by hiring manager id, can appear multiple times &#x60;hiring_manager_ids[]&#x3D;251&amp;hiring_manager_ids[]&#x3D;121&#x60;  | [optional] |
| **groupIds** | [**List&lt;String&gt;**](String.md)| Filter by group id, can appear multiple times &#x60;group_ids[]&#x3D;27&amp;group_ids[]&#x3D;761&#x60;  | [optional] |
| **locationIds** | [**List&lt;String&gt;**](String.md)| Filter by location id, can appear multiple times &#x60;location_ids[]&#x3D;1&amp;location_ids[]&#x3D;12&#x60;  | [optional] |
| **page** | **Integer**| Pagination: fetch page at given offset | [optional] |
| **perPage** | **Integer**| Pagination: amount of positions to return in 1 call, default: 30, max: 100  | [optional] |

### Return type

[**RecruitmentListPositionsResponse**](RecruitmentListPositionsResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

