<div align="left">

[![Visit Sage](./header.png)](https://sage.com)

# [Sage](https://sage.com)

All requests are required to be sent to your subdomain. To learn how to enable API in your Sage HR account, please visit https://support.sage.hr/en/articles/3246469-how-does-cakehr-api-work

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Sage&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>sage-java-sdk</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:sage-java-sdk:1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/sage-java-sdk-1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://subdomain.sage.hr/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DocumentsApi* | [**createNewDocument**](docs/DocumentsApi.md#createNewDocument) | **POST** /documents | Create new document
*DocumentsApi* | [**listCategories**](docs/DocumentsApi.md#listCategories) | **GET** /documents/categories | List document categories
*EmployeeApi* | [**createNewEmployee**](docs/EmployeeApi.md#createNewEmployee) | **POST** /employees | Create new employee
*EmployeeApi* | [**getById**](docs/EmployeeApi.md#getById) | **GET** /employees/{id} | Single active employee in company
*EmployeeApi* | [**getCompensations**](docs/EmployeeApi.md#getCompensations) | **GET** /employees/{id}/compensations | Employee compensations
*EmployeeApi* | [**getCustomFields**](docs/EmployeeApi.md#getCustomFields) | **GET** /employees/{id}/custom-fields | Employee custom fields
*EmployeeApi* | [**getTerminatedEmployee**](docs/EmployeeApi.md#getTerminatedEmployee) | **GET** /terminated-employees/{id} | Single terminated employee in company
*EmployeeApi* | [**getTimeOffBalances**](docs/EmployeeApi.md#getTimeOffBalances) | **GET** /employees/{id}/leave-management/balances | Employee time off balances
*EmployeeApi* | [**listActiveEmployees**](docs/EmployeeApi.md#listActiveEmployees) | **GET** /employees | List active employees in company
*EmployeeApi* | [**listTerminatedEmployees**](docs/EmployeeApi.md#listTerminatedEmployees) | **GET** /terminated-employees | List terminated employees in company
*EmployeeApi* | [**terminateEmployee**](docs/EmployeeApi.md#terminateEmployee) | **POST** /employees/{id}/terminations | Terminate employee
*EmployeeApi* | [**updateById**](docs/EmployeeApi.md#updateById) | **PUT** /employees/{id} | Update Employee
*EmployeeApi* | [**updateCustomField**](docs/EmployeeApi.md#updateCustomField) | **PUT** /employees/{id}/custom-fields/{custom_field_id} | Update custom field
*IntegrationsApi* | [**importNewStartersList**](docs/IntegrationsApi.md#importNewStartersList) | **POST** /vikarina/newstarter-employees | New starters list from Sage HR to Vikarina
*IntegrationsApi* | [**sendBonusesToVikarina**](docs/IntegrationsApi.md#sendBonusesToVikarina) | **POST** /vikarina/bonuses | Sending bonuses [payed once] to Vikarina
*IntegrationsApi* | [**transferAppointmentInfo**](docs/IntegrationsApi.md#transferAppointmentInfo) | **POST** /vikarina/appointments | New appointment (position changes) information transfer from Sage HR to Vikarina
*IntegrationsApi* | [**transferBankAccountInfo**](docs/IntegrationsApi.md#transferBankAccountInfo) | **POST** /vikarina/bank-accounts | Bank account information transfer (Custom field) from Sage HR to Vikarina
*IntegrationsApi* | [**transferContractInformationToVikarina**](docs/IntegrationsApi.md#transferContractInformationToVikarina) | **POST** /vikarina/contract-information | Contract (custom field) information transfer from Sage HR to Vikarina
*IntegrationsApi* | [**transferJobPositionFromSageToVikarina**](docs/IntegrationsApi.md#transferJobPositionFromSageToVikarina) | **POST** /vikarina/job-positions | Job position transfer from Sage HR to Vikarina
*IntegrationsApi* | [**transferLeaveInformationToVikarina**](docs/IntegrationsApi.md#transferLeaveInformationToVikarina) | **POST** /vikarina/leave-types | Leaves information transfer from Sage HR to Vikarina
*IntegrationsApi* | [**transferOrganizationalStructureFromSageToVikarina**](docs/IntegrationsApi.md#transferOrganizationalStructureFromSageToVikarina) | **POST** /vikarina/organization-structure | Organizational structure transfer from Sage HR to Vikarina
*IntegrationsApi* | [**transferSalaryInformation**](docs/IntegrationsApi.md#transferSalaryInformation) | **POST** /vikarina/salaries | Salary information transfer from Sage HR to Vikarina to Vikarina
*IntegrationsApi* | [**transferTerminationInfoToVikarina**](docs/IntegrationsApi.md#transferTerminationInfoToVikarina) | **POST** /vikarina/terminated-employees | Termination information transfer from Sage HR to Vikarina
*IntegrationsApi* | [**transferTimeScheduleInformation**](docs/IntegrationsApi.md#transferTimeScheduleInformation) | **POST** /vikarina/timesheets | Time Schedule information transfer from Sage HR to Vikarina
*IntegrationsApi* | [**transferUnusedVacationDaysToVikarina**](docs/IntegrationsApi.md#transferUnusedVacationDaysToVikarina) | **POST** /vikarina/unused-days | Unused vacation days transfer from Sage HR to Vikarina
*KitDaysApi* | [**createKitDay**](docs/KitDaysApi.md#createKitDay) | **POST** /leave-management/kit-days | Create a KIT day in a leave
*KitDaysApi* | [**getKitDays**](docs/KitDaysApi.md#getKitDays) | **GET** /leave-management/kit-days | View all the KIT days of an employee in a policy
*KitDaysApi* | [**processKitDay**](docs/KitDaysApi.md#processKitDay) | **PATCH** /leave-management/kit-days/{id} | Approve, decline or cancel a KIT day
*KitDaysApi* | [**updateKitDaysConfiguration**](docs/KitDaysApi.md#updateKitDaysConfiguration) | **PATCH** /leave-management/policies/{id} | Update KIT days configuration of a time off policy
*LeaveManagementApi* | [**createKitDay**](docs/LeaveManagementApi.md#createKitDay) | **POST** /leave-management/kit-days | Create a KIT day in a leave
*LeaveManagementApi* | [**getIndividualAllowances**](docs/LeaveManagementApi.md#getIndividualAllowances) | **GET** /leave-management/reports/individual-allowances | Report with individual allowances
*LeaveManagementApi* | [**getKitDays**](docs/LeaveManagementApi.md#getKitDays) | **GET** /leave-management/kit-days | View all the KIT days of an employee in a policy
*LeaveManagementApi* | [**getTimeOffBalances**](docs/LeaveManagementApi.md#getTimeOffBalances) | **GET** /employees/{id}/leave-management/balances | Employee time off balances
*LeaveManagementApi* | [**getTimeOffPolicyById**](docs/LeaveManagementApi.md#getTimeOffPolicyById) | **GET** /leave-management/policies/{id} | Details about a time off policy
*LeaveManagementApi* | [**listEmployeesOutToday**](docs/LeaveManagementApi.md#listEmployeesOutToday) | **GET** /leave-management/out-of-office-today | List employees out of office today
*LeaveManagementApi* | [**listTimeOffPolicies**](docs/LeaveManagementApi.md#listTimeOffPolicies) | **GET** /leave-management/policies | List time off policies
*LeaveManagementApi* | [**listTimeOffRequests**](docs/LeaveManagementApi.md#listTimeOffRequests) | **GET** /leave-management/requests | List time off requests
*LeaveManagementApi* | [**newTimeOffRequest**](docs/LeaveManagementApi.md#newTimeOffRequest) | **POST** /leave-management/requests | Create new time off request
*LeaveManagementApi* | [**processKitDay**](docs/LeaveManagementApi.md#processKitDay) | **PATCH** /leave-management/kit-days/{id} | Approve, decline or cancel a KIT day
*LeaveManagementApi* | [**updateKitDaysConfiguration**](docs/LeaveManagementApi.md#updateKitDaysConfiguration) | **PATCH** /leave-management/policies/{id} | Update KIT days configuration of a time off policy
*OffboardingApi* | [**createTask**](docs/OffboardingApi.md#createTask) | **POST** /offboarding/tasks | Create new offboarding task
*OffboardingApi* | [**listCategories**](docs/OffboardingApi.md#listCategories) | **GET** /offboarding/categories | List offboarding task categories
*OnboardingApi* | [**createNewTask**](docs/OnboardingApi.md#createNewTask) | **POST** /onboarding/tasks | Create new onboarding task
*OnboardingApi* | [**listTaskCategories**](docs/OnboardingApi.md#listTaskCategories) | **GET** /onboarding/categories | List onboarding task categories
*PerformanceApi* | [**getQuarterlyCompanyGoals**](docs/PerformanceApi.md#getQuarterlyCompanyGoals) | **GET** /performance/goals/quarterly-progress/company-goals | Quarterly company goals
*PerformanceApi* | [**getQuarterlyIndividualGoals**](docs/PerformanceApi.md#getQuarterlyIndividualGoals) | **GET** /performance/goals/quarterly-progress/individual-goals | Quarterly individual goals
*PerformanceApi* | [**getQuarterlyTeamGoals**](docs/PerformanceApi.md#getQuarterlyTeamGoals) | **GET** /performance/goals/quarterly-progress/team-goals | Quarterly team goals
*PerformanceApi* | [**overviewQuarterlyProgress**](docs/PerformanceApi.md#overviewQuarterlyProgress) | **GET** /performance/goals/quarterly-progress/overall | Overview of quarterly goal progress
*PoliciesApi* | [**createKitDay**](docs/PoliciesApi.md#createKitDay) | **POST** /leave-management/kit-days | Create a KIT day in a leave
*PoliciesApi* | [**getKitDays**](docs/PoliciesApi.md#getKitDays) | **GET** /leave-management/kit-days | View all the KIT days of an employee in a policy
*PoliciesApi* | [**processKitDay**](docs/PoliciesApi.md#processKitDay) | **PATCH** /leave-management/kit-days/{id} | Approve, decline or cancel a KIT day
*PositionsApi* | [**listCompanyPositions**](docs/PositionsApi.md#listCompanyPositions) | **GET** /positions | List positions in company
*RecruitmentApi* | [**createApplicantWithReferral**](docs/RecruitmentApi.md#createApplicantWithReferral) | **POST** /recruitment/positions/{id}/applicants | Create new applicant
*RecruitmentApi* | [**getApplicantDetails**](docs/RecruitmentApi.md#getApplicantDetails) | **GET** /recruitment/applicants/{id} | Applicant details
*RecruitmentApi* | [**getPositionDetails**](docs/RecruitmentApi.md#getPositionDetails) | **GET** /recruitment/positions/{id} | Position details
*RecruitmentApi* | [**listApplicantActions**](docs/RecruitmentApi.md#listApplicantActions) | **GET** /recruitment/applicants/{id}/actions | Applicant actions
*RecruitmentApi* | [**listApplicants**](docs/RecruitmentApi.md#listApplicants) | **GET** /recruitment/positions/{id}/applicants | List applicants
*RecruitmentApi* | [**listPositions**](docs/RecruitmentApi.md#listPositions) | **GET** /recruitment/positions | List recruitment positions
*TeamsApi* | [**listInCompany**](docs/TeamsApi.md#listInCompany) | **GET** /teams | List teams in company
*TerminationsReasonsApi* | [**listInCompany**](docs/TerminationsReasonsApi.md#listInCompany) | **GET** /termination-reasons | List termination reasons in company
*TimesheetsApi* | [**clockInOut**](docs/TimesheetsApi.md#clockInOut) | **POST** /timesheets/clock-in | Clock in &amp; out employees on specific days


## Documentation for Models

 - [DocumentsCreateNewDocumentRequest](docs/DocumentsCreateNewDocumentRequest.md)
 - [DocumentsCreateNewDocumentResponse](docs/DocumentsCreateNewDocumentResponse.md)
 - [DocumentsCreateNewDocumentResponseData](docs/DocumentsCreateNewDocumentResponseData.md)
 - [DocumentsListCategoriesResponse](docs/DocumentsListCategoriesResponse.md)
 - [DocumentsListCategoriesResponseDataInner](docs/DocumentsListCategoriesResponseDataInner.md)
 - [EmployeeCreateNewEmployeeRequest](docs/EmployeeCreateNewEmployeeRequest.md)
 - [EmployeeCreateNewEmployeeResponse](docs/EmployeeCreateNewEmployeeResponse.md)
 - [EmployeeCreateNewEmployeeResponseData](docs/EmployeeCreateNewEmployeeResponseData.md)
 - [EmployeeGetByIdResponse](docs/EmployeeGetByIdResponse.md)
 - [EmployeeGetByIdResponseData](docs/EmployeeGetByIdResponseData.md)
 - [EmployeeGetByIdResponseDataEmploymentStatusHistoryInner](docs/EmployeeGetByIdResponseDataEmploymentStatusHistoryInner.md)
 - [EmployeeGetByIdResponseDataPositionHistoryInner](docs/EmployeeGetByIdResponseDataPositionHistoryInner.md)
 - [EmployeeGetByIdResponseDataTeamHistoryInner](docs/EmployeeGetByIdResponseDataTeamHistoryInner.md)
 - [EmployeeGetCompensationsResponse](docs/EmployeeGetCompensationsResponse.md)
 - [EmployeeGetCompensationsResponseDataInner](docs/EmployeeGetCompensationsResponseDataInner.md)
 - [EmployeeGetCompensationsResponseMeta](docs/EmployeeGetCompensationsResponseMeta.md)
 - [EmployeeGetCustomFieldsResponse](docs/EmployeeGetCustomFieldsResponse.md)
 - [EmployeeGetCustomFieldsResponseDataInner](docs/EmployeeGetCustomFieldsResponseDataInner.md)
 - [EmployeeGetTerminatedEmployeeResponse](docs/EmployeeGetTerminatedEmployeeResponse.md)
 - [EmployeeGetTerminatedEmployeeResponseData](docs/EmployeeGetTerminatedEmployeeResponseData.md)
 - [EmployeeGetTerminatedEmployeeResponseDataTermination](docs/EmployeeGetTerminatedEmployeeResponseDataTermination.md)
 - [EmployeeListActiveEmployeesResponse](docs/EmployeeListActiveEmployeesResponse.md)
 - [EmployeeListActiveEmployeesResponseDataInner](docs/EmployeeListActiveEmployeesResponseDataInner.md)
 - [EmployeeListActiveEmployeesResponseDataInnerEmploymentStatusHistoryInner](docs/EmployeeListActiveEmployeesResponseDataInnerEmploymentStatusHistoryInner.md)
 - [EmployeeListActiveEmployeesResponseDataInnerPositionHistoryInner](docs/EmployeeListActiveEmployeesResponseDataInnerPositionHistoryInner.md)
 - [EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner](docs/EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner.md)
 - [EmployeeListActiveEmployeesResponseMeta](docs/EmployeeListActiveEmployeesResponseMeta.md)
 - [EmployeeListTerminatedEmployeesResponse](docs/EmployeeListTerminatedEmployeesResponse.md)
 - [EmployeeListTerminatedEmployeesResponseDataInner](docs/EmployeeListTerminatedEmployeesResponseDataInner.md)
 - [EmployeeListTerminatedEmployeesResponseMeta](docs/EmployeeListTerminatedEmployeesResponseMeta.md)
 - [EmployeeTerminateEmployeeRequest](docs/EmployeeTerminateEmployeeRequest.md)
 - [EmployeeTerminateEmployeeResponse](docs/EmployeeTerminateEmployeeResponse.md)
 - [EmployeeUpdateByIdRequest](docs/EmployeeUpdateByIdRequest.md)
 - [EmployeeUpdateByIdResponse](docs/EmployeeUpdateByIdResponse.md)
 - [EmployeeUpdateByIdResponseData](docs/EmployeeUpdateByIdResponseData.md)
 - [EmployeeUpdateCustomFieldRequest](docs/EmployeeUpdateCustomFieldRequest.md)
 - [EmployeeUpdateCustomFieldResponse](docs/EmployeeUpdateCustomFieldResponse.md)
 - [IntegrationsImportNewStartersListResponse](docs/IntegrationsImportNewStartersListResponse.md)
 - [IntegrationsImportNewStartersListResponseData](docs/IntegrationsImportNewStartersListResponseData.md)
 - [IntegrationsSendBonusesToVikarinaResponse](docs/IntegrationsSendBonusesToVikarinaResponse.md)
 - [IntegrationsSendBonusesToVikarinaResponseData](docs/IntegrationsSendBonusesToVikarinaResponseData.md)
 - [IntegrationsTransferAppointmentInfoResponse](docs/IntegrationsTransferAppointmentInfoResponse.md)
 - [IntegrationsTransferAppointmentInfoResponseData](docs/IntegrationsTransferAppointmentInfoResponseData.md)
 - [IntegrationsTransferBankAccountInfoResponse](docs/IntegrationsTransferBankAccountInfoResponse.md)
 - [IntegrationsTransferBankAccountInfoResponseData](docs/IntegrationsTransferBankAccountInfoResponseData.md)
 - [IntegrationsTransferContractInformationToVikarinaResponse](docs/IntegrationsTransferContractInformationToVikarinaResponse.md)
 - [IntegrationsTransferContractInformationToVikarinaResponseData](docs/IntegrationsTransferContractInformationToVikarinaResponseData.md)
 - [IntegrationsTransferJobPositionFromSageToVikarinaResponse](docs/IntegrationsTransferJobPositionFromSageToVikarinaResponse.md)
 - [IntegrationsTransferJobPositionFromSageToVikarinaResponseData](docs/IntegrationsTransferJobPositionFromSageToVikarinaResponseData.md)
 - [IntegrationsTransferLeaveInformationToVikarinaResponse](docs/IntegrationsTransferLeaveInformationToVikarinaResponse.md)
 - [IntegrationsTransferLeaveInformationToVikarinaResponseData](docs/IntegrationsTransferLeaveInformationToVikarinaResponseData.md)
 - [IntegrationsTransferOrganizationalStructureFromSageToVikarinaResponse](docs/IntegrationsTransferOrganizationalStructureFromSageToVikarinaResponse.md)
 - [IntegrationsTransferOrganizationalStructureFromSageToVikarinaResponseData](docs/IntegrationsTransferOrganizationalStructureFromSageToVikarinaResponseData.md)
 - [IntegrationsTransferSalaryInformationResponse](docs/IntegrationsTransferSalaryInformationResponse.md)
 - [IntegrationsTransferSalaryInformationResponseData](docs/IntegrationsTransferSalaryInformationResponseData.md)
 - [IntegrationsTransferTerminationInfoToVikarinaResponse](docs/IntegrationsTransferTerminationInfoToVikarinaResponse.md)
 - [IntegrationsTransferTerminationInfoToVikarinaResponseData](docs/IntegrationsTransferTerminationInfoToVikarinaResponseData.md)
 - [IntegrationsTransferTimeScheduleInformationResponse](docs/IntegrationsTransferTimeScheduleInformationResponse.md)
 - [IntegrationsTransferTimeScheduleInformationResponseData](docs/IntegrationsTransferTimeScheduleInformationResponseData.md)
 - [IntegrationsTransferUnusedVacationDaysToVikarinaResponse](docs/IntegrationsTransferUnusedVacationDaysToVikarinaResponse.md)
 - [IntegrationsTransferUnusedVacationDaysToVikarinaResponseData](docs/IntegrationsTransferUnusedVacationDaysToVikarinaResponseData.md)
 - [LeaveManagementCreateKitDayRequest](docs/LeaveManagementCreateKitDayRequest.md)
 - [LeaveManagementCreateKitDayResponse](docs/LeaveManagementCreateKitDayResponse.md)
 - [LeaveManagementCreateKitDayResponseDataInner](docs/LeaveManagementCreateKitDayResponseDataInner.md)
 - [LeaveManagementGetIndividualAllowancesResponse](docs/LeaveManagementGetIndividualAllowancesResponse.md)
 - [LeaveManagementGetIndividualAllowancesResponseDataInner](docs/LeaveManagementGetIndividualAllowancesResponseDataInner.md)
 - [LeaveManagementGetIndividualAllowancesResponseDataInnerEligibilitiesInner](docs/LeaveManagementGetIndividualAllowancesResponseDataInnerEligibilitiesInner.md)
 - [LeaveManagementGetIndividualAllowancesResponseDataInnerEligibilitiesInnerPolicy](docs/LeaveManagementGetIndividualAllowancesResponseDataInnerEligibilitiesInnerPolicy.md)
 - [LeaveManagementGetIndividualAllowancesResponseMeta](docs/LeaveManagementGetIndividualAllowancesResponseMeta.md)
 - [LeaveManagementGetKitDaysResponse](docs/LeaveManagementGetKitDaysResponse.md)
 - [LeaveManagementGetKitDaysResponseDataInner](docs/LeaveManagementGetKitDaysResponseDataInner.md)
 - [LeaveManagementGetTimeOffBalancesResponse](docs/LeaveManagementGetTimeOffBalancesResponse.md)
 - [LeaveManagementGetTimeOffBalancesResponseDataInner](docs/LeaveManagementGetTimeOffBalancesResponseDataInner.md)
 - [LeaveManagementGetTimeOffPolicyByIdResponse](docs/LeaveManagementGetTimeOffPolicyByIdResponse.md)
 - [LeaveManagementGetTimeOffPolicyByIdResponseDataInner](docs/LeaveManagementGetTimeOffPolicyByIdResponseDataInner.md)
 - [LeaveManagementListEmployeesOutTodayResponse](docs/LeaveManagementListEmployeesOutTodayResponse.md)
 - [LeaveManagementListEmployeesOutTodayResponseDataInner](docs/LeaveManagementListEmployeesOutTodayResponseDataInner.md)
 - [LeaveManagementListEmployeesOutTodayResponseDataInnerEmployee](docs/LeaveManagementListEmployeesOutTodayResponseDataInnerEmployee.md)
 - [LeaveManagementListEmployeesOutTodayResponseDataInnerPolicy](docs/LeaveManagementListEmployeesOutTodayResponseDataInnerPolicy.md)
 - [LeaveManagementListTimeOffPoliciesResponse](docs/LeaveManagementListTimeOffPoliciesResponse.md)
 - [LeaveManagementListTimeOffPoliciesResponseDataInner](docs/LeaveManagementListTimeOffPoliciesResponseDataInner.md)
 - [LeaveManagementListTimeOffRequestsResponse](docs/LeaveManagementListTimeOffRequestsResponse.md)
 - [LeaveManagementListTimeOffRequestsResponseDataInner](docs/LeaveManagementListTimeOffRequestsResponseDataInner.md)
 - [LeaveManagementListTimeOffRequestsResponseDataInnerFieldsInner](docs/LeaveManagementListTimeOffRequestsResponseDataInnerFieldsInner.md)
 - [LeaveManagementListTimeOffRequestsResponseMeta](docs/LeaveManagementListTimeOffRequestsResponseMeta.md)
 - [LeaveManagementNewTimeOffRequestRequest](docs/LeaveManagementNewTimeOffRequestRequest.md)
 - [LeaveManagementNewTimeOffRequestResponse](docs/LeaveManagementNewTimeOffRequestResponse.md)
 - [LeaveManagementNewTimeOffRequestResponseData](docs/LeaveManagementNewTimeOffRequestResponseData.md)
 - [LeaveManagementProcessKitDayRequest](docs/LeaveManagementProcessKitDayRequest.md)
 - [LeaveManagementUpdateKitDaysConfigurationRequest](docs/LeaveManagementUpdateKitDaysConfigurationRequest.md)
 - [OffboardingCreateTaskRequest](docs/OffboardingCreateTaskRequest.md)
 - [OffboardingCreateTaskResponse](docs/OffboardingCreateTaskResponse.md)
 - [OffboardingCreateTaskResponseData](docs/OffboardingCreateTaskResponseData.md)
 - [OffboardingListCategoriesResponse](docs/OffboardingListCategoriesResponse.md)
 - [OffboardingListCategoriesResponseDataInner](docs/OffboardingListCategoriesResponseDataInner.md)
 - [OnboardingCreateNewTaskRequest](docs/OnboardingCreateNewTaskRequest.md)
 - [OnboardingCreateNewTaskResponse](docs/OnboardingCreateNewTaskResponse.md)
 - [OnboardingCreateNewTaskResponseData](docs/OnboardingCreateNewTaskResponseData.md)
 - [OnboardingListTaskCategoriesResponse](docs/OnboardingListTaskCategoriesResponse.md)
 - [OnboardingListTaskCategoriesResponseDataInner](docs/OnboardingListTaskCategoriesResponseDataInner.md)
 - [PerformanceGetQuarterlyCompanyGoalsResponse](docs/PerformanceGetQuarterlyCompanyGoalsResponse.md)
 - [PerformanceGetQuarterlyCompanyGoalsResponseDataInner](docs/PerformanceGetQuarterlyCompanyGoalsResponseDataInner.md)
 - [PerformanceGetQuarterlyCompanyGoalsResponseDataInnerProgress](docs/PerformanceGetQuarterlyCompanyGoalsResponseDataInnerProgress.md)
 - [PerformanceGetQuarterlyIndividualGoalsResponse](docs/PerformanceGetQuarterlyIndividualGoalsResponse.md)
 - [PerformanceGetQuarterlyIndividualGoalsResponseDataInner](docs/PerformanceGetQuarterlyIndividualGoalsResponseDataInner.md)
 - [PerformanceGetQuarterlyIndividualGoalsResponseDataInnerGoalsInner](docs/PerformanceGetQuarterlyIndividualGoalsResponseDataInnerGoalsInner.md)
 - [PerformanceGetQuarterlyIndividualGoalsResponseDataInnerGoalsInnerProgress](docs/PerformanceGetQuarterlyIndividualGoalsResponseDataInnerGoalsInnerProgress.md)
 - [PerformanceGetQuarterlyIndividualGoalsResponseDataInnerProgress](docs/PerformanceGetQuarterlyIndividualGoalsResponseDataInnerProgress.md)
 - [PerformanceGetQuarterlyTeamGoalsResponse](docs/PerformanceGetQuarterlyTeamGoalsResponse.md)
 - [PerformanceGetQuarterlyTeamGoalsResponseDataInner](docs/PerformanceGetQuarterlyTeamGoalsResponseDataInner.md)
 - [PerformanceGetQuarterlyTeamGoalsResponseDataInnerGoalsInner](docs/PerformanceGetQuarterlyTeamGoalsResponseDataInnerGoalsInner.md)
 - [PerformanceGetQuarterlyTeamGoalsResponseDataInnerGoalsInnerProgress](docs/PerformanceGetQuarterlyTeamGoalsResponseDataInnerGoalsInnerProgress.md)
 - [PerformanceGetQuarterlyTeamGoalsResponseDataInnerProgress](docs/PerformanceGetQuarterlyTeamGoalsResponseDataInnerProgress.md)
 - [PerformanceOverviewQuarterlyProgressResponse](docs/PerformanceOverviewQuarterlyProgressResponse.md)
 - [PerformanceOverviewQuarterlyProgressResponseData](docs/PerformanceOverviewQuarterlyProgressResponseData.md)
 - [PerformanceOverviewQuarterlyProgressResponseDataCompany](docs/PerformanceOverviewQuarterlyProgressResponseDataCompany.md)
 - [PerformanceOverviewQuarterlyProgressResponseDataIndividual](docs/PerformanceOverviewQuarterlyProgressResponseDataIndividual.md)
 - [PerformanceOverviewQuarterlyProgressResponseDataTeam](docs/PerformanceOverviewQuarterlyProgressResponseDataTeam.md)
 - [PositionsListCompanyPositionsResponse](docs/PositionsListCompanyPositionsResponse.md)
 - [PositionsListCompanyPositionsResponseDataInner](docs/PositionsListCompanyPositionsResponseDataInner.md)
 - [PositionsListCompanyPositionsResponseMeta](docs/PositionsListCompanyPositionsResponseMeta.md)
 - [RecruitmentCreateApplicantWithReferralRequest](docs/RecruitmentCreateApplicantWithReferralRequest.md)
 - [RecruitmentCreateApplicantWithReferralResponse](docs/RecruitmentCreateApplicantWithReferralResponse.md)
 - [RecruitmentCreateApplicantWithReferralResponseData](docs/RecruitmentCreateApplicantWithReferralResponseData.md)
 - [RecruitmentGetApplicantDetailsResponse](docs/RecruitmentGetApplicantDetailsResponse.md)
 - [RecruitmentGetApplicantDetailsResponseData](docs/RecruitmentGetApplicantDetailsResponseData.md)
 - [RecruitmentGetApplicantDetailsResponseDataAddedBy](docs/RecruitmentGetApplicantDetailsResponseDataAddedBy.md)
 - [RecruitmentGetApplicantDetailsResponseDataReferrer](docs/RecruitmentGetApplicantDetailsResponseDataReferrer.md)
 - [RecruitmentGetApplicantDetailsResponseDataStage](docs/RecruitmentGetApplicantDetailsResponseDataStage.md)
 - [RecruitmentGetPositionDetailsResponse](docs/RecruitmentGetPositionDetailsResponse.md)
 - [RecruitmentGetPositionDetailsResponseData](docs/RecruitmentGetPositionDetailsResponseData.md)
 - [RecruitmentGetPositionDetailsResponseDataApplicantsInner](docs/RecruitmentGetPositionDetailsResponseDataApplicantsInner.md)
 - [RecruitmentGetPositionDetailsResponseDataDescriptionBlocksInner](docs/RecruitmentGetPositionDetailsResponseDataDescriptionBlocksInner.md)
 - [RecruitmentGetPositionDetailsResponseDataHiringTeamInner](docs/RecruitmentGetPositionDetailsResponseDataHiringTeamInner.md)
 - [RecruitmentListApplicantActionsResponse](docs/RecruitmentListApplicantActionsResponse.md)
 - [RecruitmentListApplicantActionsResponseDataInner](docs/RecruitmentListApplicantActionsResponseDataInner.md)
 - [RecruitmentListApplicantActionsResponseMeta](docs/RecruitmentListApplicantActionsResponseMeta.md)
 - [RecruitmentListApplicantsResponse](docs/RecruitmentListApplicantsResponse.md)
 - [RecruitmentListApplicantsResponseDataInner](docs/RecruitmentListApplicantsResponseDataInner.md)
 - [RecruitmentListApplicantsResponseDataInnerStage](docs/RecruitmentListApplicantsResponseDataInnerStage.md)
 - [RecruitmentListApplicantsResponseMeta](docs/RecruitmentListApplicantsResponseMeta.md)
 - [RecruitmentListPositionsResponse](docs/RecruitmentListPositionsResponse.md)
 - [RecruitmentListPositionsResponseDataInner](docs/RecruitmentListPositionsResponseDataInner.md)
 - [RecruitmentListPositionsResponseDataInnerDescriptionBlocksInner](docs/RecruitmentListPositionsResponseDataInnerDescriptionBlocksInner.md)
 - [RecruitmentListPositionsResponseMeta](docs/RecruitmentListPositionsResponseMeta.md)
 - [TeamsListInCompanyResponse](docs/TeamsListInCompanyResponse.md)
 - [TeamsListInCompanyResponseDataInner](docs/TeamsListInCompanyResponseDataInner.md)
 - [TeamsListInCompanyResponseMeta](docs/TeamsListInCompanyResponseMeta.md)
 - [TerminationsReasonsListInCompanyResponse](docs/TerminationsReasonsListInCompanyResponse.md)
 - [TerminationsReasonsListInCompanyResponseDataInner](docs/TerminationsReasonsListInCompanyResponseDataInner.md)
 - [TerminationsReasonsListInCompanyResponseMeta](docs/TerminationsReasonsListInCompanyResponseMeta.md)
 - [TimesheetsClockInOutRequest](docs/TimesheetsClockInOutRequest.md)
 - [TimesheetsClockInOutRequestClockedTime](docs/TimesheetsClockInOutRequestClockedTime.md)
 - [TimesheetsClockInOutRequestClockedTimeYYYYMMDD](docs/TimesheetsClockInOutRequestClockedTimeYYYYMMDD.md)
 - [TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner](docs/TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner.md)
 - [TimesheetsClockInOutResponse](docs/TimesheetsClockInOutResponse.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
