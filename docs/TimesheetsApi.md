# TimesheetsApi

All URIs are relative to *https://subdomain.sage.hr/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**clockInOut**](TimesheetsApi.md#clockInOut) | **POST** /timesheets/clock-in | Clock in &amp; out employees on specific days |


<a name="clockInOut"></a>
# **clockInOut**
> TimesheetsClockInOutResponse clockInOut(timesheetsClockInOutRequest).execute();

Clock in &amp; out employees on specific days

Employees will be only clocked in &amp; out if API time clocking is enabled for Timesheet group

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimesheetsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    
    configuration.apiKey  = "YOUR API KEY";
    Sage client = new Sage(configuration);
    String override = "override_example"; // 'true' if override provided days clocked entries
    TimesheetsClockInOutRequestClockedTime clockedTime = new TimesheetsClockInOutRequestClockedTime();
    try {
      TimesheetsClockInOutResponse result = client
              .timesheets
              .clockInOut()
              .override(override)
              .clockedTime(clockedTime)
              .execute();
      System.out.println(result);
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#clockInOut");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimesheetsClockInOutResponse> response = client
              .timesheets
              .clockInOut()
              .override(override)
              .clockedTime(clockedTime)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimesheetsApi#clockInOut");
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
| **timesheetsClockInOutRequest** | [**TimesheetsClockInOutRequest**](TimesheetsClockInOutRequest.md)| Times on specific dates for specific employees as json | |

### Return type

[**TimesheetsClockInOutResponse**](TimesheetsClockInOutResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

