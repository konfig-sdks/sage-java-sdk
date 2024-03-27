# IntegrationsApi

All URIs are relative to *https://subdomain.sage.hr/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**importNewStartersList**](IntegrationsApi.md#importNewStartersList) | **POST** /vikarina/newstarter-employees | New starters list from Sage HR to Vikarina |
| [**sendBonusesToVikarina**](IntegrationsApi.md#sendBonusesToVikarina) | **POST** /vikarina/bonuses | Sending bonuses [payed once] to Vikarina |
| [**transferAppointmentInfo**](IntegrationsApi.md#transferAppointmentInfo) | **POST** /vikarina/appointments | New appointment (position changes) information transfer from Sage HR to Vikarina |
| [**transferBankAccountInfo**](IntegrationsApi.md#transferBankAccountInfo) | **POST** /vikarina/bank-accounts | Bank account information transfer (Custom field) from Sage HR to Vikarina |
| [**transferContractInformationToVikarina**](IntegrationsApi.md#transferContractInformationToVikarina) | **POST** /vikarina/contract-information | Contract (custom field) information transfer from Sage HR to Vikarina |
| [**transferJobPositionFromSageToVikarina**](IntegrationsApi.md#transferJobPositionFromSageToVikarina) | **POST** /vikarina/job-positions | Job position transfer from Sage HR to Vikarina |
| [**transferLeaveInformationToVikarina**](IntegrationsApi.md#transferLeaveInformationToVikarina) | **POST** /vikarina/leave-types | Leaves information transfer from Sage HR to Vikarina |
| [**transferOrganizationalStructureFromSageToVikarina**](IntegrationsApi.md#transferOrganizationalStructureFromSageToVikarina) | **POST** /vikarina/organization-structure | Organizational structure transfer from Sage HR to Vikarina |
| [**transferSalaryInformation**](IntegrationsApi.md#transferSalaryInformation) | **POST** /vikarina/salaries | Salary information transfer from Sage HR to Vikarina to Vikarina |
| [**transferTerminationInfoToVikarina**](IntegrationsApi.md#transferTerminationInfoToVikarina) | **POST** /vikarina/terminated-employees | Termination information transfer from Sage HR to Vikarina |
| [**transferTimeScheduleInformation**](IntegrationsApi.md#transferTimeScheduleInformation) | **POST** /vikarina/timesheets | Time Schedule information transfer from Sage HR to Vikarina |
| [**transferUnusedVacationDaysToVikarina**](IntegrationsApi.md#transferUnusedVacationDaysToVikarina) | **POST** /vikarina/unused-days | Unused vacation days transfer from Sage HR to Vikarina |


<a name="importNewStartersList"></a>
# **importNewStartersList**
> IntegrationsImportNewStartersListResponse importNewStartersList().startDate(startDate).endDate(endDate).execute();

New starters list from Sage HR to Vikarina

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntegrationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    Sage client = new Sage(configuration);
    String startDate = "2020-01-01";
    String endDate = "2020-02-01";
    try {
      IntegrationsImportNewStartersListResponse result = client
              .integrations
              .importNewStartersList()
              .startDate(startDate)
              .endDate(endDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#importNewStartersList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IntegrationsImportNewStartersListResponse> response = client
              .integrations
              .importNewStartersList()
              .startDate(startDate)
              .endDate(endDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#importNewStartersList");
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
| **startDate** | **String**|  | [optional] |
| **endDate** | **String**|  | [optional] |

### Return type

[**IntegrationsImportNewStartersListResponse**](IntegrationsImportNewStartersListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="sendBonusesToVikarina"></a>
# **sendBonusesToVikarina**
> IntegrationsSendBonusesToVikarinaResponse sendBonusesToVikarina().startDate(startDate).endDate(endDate).execute();

Sending bonuses [payed once] to Vikarina

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntegrationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    Sage client = new Sage(configuration);
    String startDate = "2020-01-01";
    String endDate = "2020-02-01";
    try {
      IntegrationsSendBonusesToVikarinaResponse result = client
              .integrations
              .sendBonusesToVikarina()
              .startDate(startDate)
              .endDate(endDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#sendBonusesToVikarina");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IntegrationsSendBonusesToVikarinaResponse> response = client
              .integrations
              .sendBonusesToVikarina()
              .startDate(startDate)
              .endDate(endDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#sendBonusesToVikarina");
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
| **startDate** | **String**|  | [optional] |
| **endDate** | **String**|  | [optional] |

### Return type

[**IntegrationsSendBonusesToVikarinaResponse**](IntegrationsSendBonusesToVikarinaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="transferAppointmentInfo"></a>
# **transferAppointmentInfo**
> IntegrationsTransferAppointmentInfoResponse transferAppointmentInfo().startDate(startDate).endDate(endDate).execute();

New appointment (position changes) information transfer from Sage HR to Vikarina

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntegrationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    Sage client = new Sage(configuration);
    String startDate = "2020-01-01";
    String endDate = "2020-02-01";
    try {
      IntegrationsTransferAppointmentInfoResponse result = client
              .integrations
              .transferAppointmentInfo()
              .startDate(startDate)
              .endDate(endDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#transferAppointmentInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IntegrationsTransferAppointmentInfoResponse> response = client
              .integrations
              .transferAppointmentInfo()
              .startDate(startDate)
              .endDate(endDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#transferAppointmentInfo");
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
| **startDate** | **String**|  | [optional] |
| **endDate** | **String**|  | [optional] |

### Return type

[**IntegrationsTransferAppointmentInfoResponse**](IntegrationsTransferAppointmentInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="transferBankAccountInfo"></a>
# **transferBankAccountInfo**
> IntegrationsTransferBankAccountInfoResponse transferBankAccountInfo().execute();

Bank account information transfer (Custom field) from Sage HR to Vikarina

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntegrationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    Sage client = new Sage(configuration);
    try {
      IntegrationsTransferBankAccountInfoResponse result = client
              .integrations
              .transferBankAccountInfo()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#transferBankAccountInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IntegrationsTransferBankAccountInfoResponse> response = client
              .integrations
              .transferBankAccountInfo()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#transferBankAccountInfo");
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

[**IntegrationsTransferBankAccountInfoResponse**](IntegrationsTransferBankAccountInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="transferContractInformationToVikarina"></a>
# **transferContractInformationToVikarina**
> IntegrationsTransferContractInformationToVikarinaResponse transferContractInformationToVikarina().execute();

Contract (custom field) information transfer from Sage HR to Vikarina

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntegrationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    Sage client = new Sage(configuration);
    try {
      IntegrationsTransferContractInformationToVikarinaResponse result = client
              .integrations
              .transferContractInformationToVikarina()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#transferContractInformationToVikarina");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IntegrationsTransferContractInformationToVikarinaResponse> response = client
              .integrations
              .transferContractInformationToVikarina()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#transferContractInformationToVikarina");
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

[**IntegrationsTransferContractInformationToVikarinaResponse**](IntegrationsTransferContractInformationToVikarinaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="transferJobPositionFromSageToVikarina"></a>
# **transferJobPositionFromSageToVikarina**
> IntegrationsTransferJobPositionFromSageToVikarinaResponse transferJobPositionFromSageToVikarina().execute();

Job position transfer from Sage HR to Vikarina

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntegrationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    Sage client = new Sage(configuration);
    try {
      IntegrationsTransferJobPositionFromSageToVikarinaResponse result = client
              .integrations
              .transferJobPositionFromSageToVikarina()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#transferJobPositionFromSageToVikarina");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IntegrationsTransferJobPositionFromSageToVikarinaResponse> response = client
              .integrations
              .transferJobPositionFromSageToVikarina()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#transferJobPositionFromSageToVikarina");
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

[**IntegrationsTransferJobPositionFromSageToVikarinaResponse**](IntegrationsTransferJobPositionFromSageToVikarinaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="transferLeaveInformationToVikarina"></a>
# **transferLeaveInformationToVikarina**
> IntegrationsTransferLeaveInformationToVikarinaResponse transferLeaveInformationToVikarina().startDate(startDate).endDate(endDate).execute();

Leaves information transfer from Sage HR to Vikarina

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntegrationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    Sage client = new Sage(configuration);
    String startDate = "2020-01-01";
    String endDate = "2020-02-01";
    try {
      IntegrationsTransferLeaveInformationToVikarinaResponse result = client
              .integrations
              .transferLeaveInformationToVikarina()
              .startDate(startDate)
              .endDate(endDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#transferLeaveInformationToVikarina");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IntegrationsTransferLeaveInformationToVikarinaResponse> response = client
              .integrations
              .transferLeaveInformationToVikarina()
              .startDate(startDate)
              .endDate(endDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#transferLeaveInformationToVikarina");
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
| **startDate** | **String**|  | [optional] |
| **endDate** | **String**|  | [optional] |

### Return type

[**IntegrationsTransferLeaveInformationToVikarinaResponse**](IntegrationsTransferLeaveInformationToVikarinaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="transferOrganizationalStructureFromSageToVikarina"></a>
# **transferOrganizationalStructureFromSageToVikarina**
> IntegrationsTransferOrganizationalStructureFromSageToVikarinaResponse transferOrganizationalStructureFromSageToVikarina().execute();

Organizational structure transfer from Sage HR to Vikarina

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntegrationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    Sage client = new Sage(configuration);
    try {
      IntegrationsTransferOrganizationalStructureFromSageToVikarinaResponse result = client
              .integrations
              .transferOrganizationalStructureFromSageToVikarina()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#transferOrganizationalStructureFromSageToVikarina");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IntegrationsTransferOrganizationalStructureFromSageToVikarinaResponse> response = client
              .integrations
              .transferOrganizationalStructureFromSageToVikarina()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#transferOrganizationalStructureFromSageToVikarina");
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

[**IntegrationsTransferOrganizationalStructureFromSageToVikarinaResponse**](IntegrationsTransferOrganizationalStructureFromSageToVikarinaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="transferSalaryInformation"></a>
# **transferSalaryInformation**
> IntegrationsTransferSalaryInformationResponse transferSalaryInformation().startDate(startDate).endDate(endDate).execute();

Salary information transfer from Sage HR to Vikarina to Vikarina

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntegrationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    Sage client = new Sage(configuration);
    String startDate = "2020-01-01";
    String endDate = "2020-02-01";
    try {
      IntegrationsTransferSalaryInformationResponse result = client
              .integrations
              .transferSalaryInformation()
              .startDate(startDate)
              .endDate(endDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#transferSalaryInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IntegrationsTransferSalaryInformationResponse> response = client
              .integrations
              .transferSalaryInformation()
              .startDate(startDate)
              .endDate(endDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#transferSalaryInformation");
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
| **startDate** | **String**|  | [optional] |
| **endDate** | **String**|  | [optional] |

### Return type

[**IntegrationsTransferSalaryInformationResponse**](IntegrationsTransferSalaryInformationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="transferTerminationInfoToVikarina"></a>
# **transferTerminationInfoToVikarina**
> IntegrationsTransferTerminationInfoToVikarinaResponse transferTerminationInfoToVikarina().startDate(startDate).endDate(endDate).execute();

Termination information transfer from Sage HR to Vikarina

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntegrationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    Sage client = new Sage(configuration);
    String startDate = "2020-01-01";
    String endDate = "2020-02-01";
    try {
      IntegrationsTransferTerminationInfoToVikarinaResponse result = client
              .integrations
              .transferTerminationInfoToVikarina()
              .startDate(startDate)
              .endDate(endDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#transferTerminationInfoToVikarina");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IntegrationsTransferTerminationInfoToVikarinaResponse> response = client
              .integrations
              .transferTerminationInfoToVikarina()
              .startDate(startDate)
              .endDate(endDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#transferTerminationInfoToVikarina");
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
| **startDate** | **String**|  | [optional] |
| **endDate** | **String**|  | [optional] |

### Return type

[**IntegrationsTransferTerminationInfoToVikarinaResponse**](IntegrationsTransferTerminationInfoToVikarinaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="transferTimeScheduleInformation"></a>
# **transferTimeScheduleInformation**
> IntegrationsTransferTimeScheduleInformationResponse transferTimeScheduleInformation().startDate(startDate).endDate(endDate).execute();

Time Schedule information transfer from Sage HR to Vikarina

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntegrationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    Sage client = new Sage(configuration);
    String startDate = "2020-01-01";
    String endDate = "2020-02-01";
    try {
      IntegrationsTransferTimeScheduleInformationResponse result = client
              .integrations
              .transferTimeScheduleInformation()
              .startDate(startDate)
              .endDate(endDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#transferTimeScheduleInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IntegrationsTransferTimeScheduleInformationResponse> response = client
              .integrations
              .transferTimeScheduleInformation()
              .startDate(startDate)
              .endDate(endDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#transferTimeScheduleInformation");
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
| **startDate** | **String**|  | [optional] |
| **endDate** | **String**|  | [optional] |

### Return type

[**IntegrationsTransferTimeScheduleInformationResponse**](IntegrationsTransferTimeScheduleInformationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="transferUnusedVacationDaysToVikarina"></a>
# **transferUnusedVacationDaysToVikarina**
> IntegrationsTransferUnusedVacationDaysToVikarinaResponse transferUnusedVacationDaysToVikarina().execute();

Unused vacation days transfer from Sage HR to Vikarina

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntegrationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://subdomain.sage.hr/api";
    Sage client = new Sage(configuration);
    try {
      IntegrationsTransferUnusedVacationDaysToVikarinaResponse result = client
              .integrations
              .transferUnusedVacationDaysToVikarina()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#transferUnusedVacationDaysToVikarina");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IntegrationsTransferUnusedVacationDaysToVikarinaResponse> response = client
              .integrations
              .transferUnusedVacationDaysToVikarina()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#transferUnusedVacationDaysToVikarina");
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

[**IntegrationsTransferUnusedVacationDaysToVikarinaResponse**](IntegrationsTransferUnusedVacationDaysToVikarinaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

