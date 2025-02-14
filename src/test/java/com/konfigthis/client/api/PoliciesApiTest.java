/*
 * Sage HR API
 * All requests are required to be sent to your subdomain. To learn how to enable API in your Sage HR account, please visit https://support.sage.hr/en/articles/3246469-how-does-cakehr-api-work
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.LeaveManagementCreateKitDayRequest;
import com.konfigthis.client.model.LeaveManagementCreateKitDayResponse;
import com.konfigthis.client.model.LeaveManagementGetKitDaysResponse;
import com.konfigthis.client.model.LeaveManagementProcessKitDayRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PoliciesApi
 */
@Disabled
public class PoliciesApiTest {

    private static PoliciesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PoliciesApi(apiClient);
    }

    /**
     * Create a KIT day in a leave
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createKitDayTest() throws ApiException {
        Integer policyId = null;
        Integer employeeId = null;
        String date = null;
        String dateFrom = null;
        String dateTo = null;
        LeaveManagementCreateKitDayResponse response = api.createKitDay(policyId, employeeId)
                .date(date)
                .dateFrom(dateFrom)
                .dateTo(dateTo)
                .execute();
        // TODO: test validations
    }

    /**
     * View all the KIT days of an employee in a policy
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getKitDaysTest() throws ApiException {
        Integer policyId = null;
        Integer employeeId = null;
        LeaveManagementGetKitDaysResponse response = api.getKitDays(policyId, employeeId)
                .execute();
        // TODO: test validations
    }

    /**
     * Approve, decline or cancel a KIT day
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void processKitDayTest() throws ApiException {
        Integer id = null;
        String status = null;
        api.processKitDay(id, status)
                .execute();
        // TODO: test validations
    }

}
