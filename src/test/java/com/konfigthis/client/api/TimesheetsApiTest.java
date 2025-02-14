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
import com.konfigthis.client.model.TimesheetsClockInOutRequest;
import com.konfigthis.client.model.TimesheetsClockInOutRequestClockedTime;
import com.konfigthis.client.model.TimesheetsClockInOutResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TimesheetsApi
 */
@Disabled
public class TimesheetsApiTest {

    private static TimesheetsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TimesheetsApi(apiClient);
    }

    /**
     * Clock in &amp; out employees on specific days
     *
     * Employees will be only clocked in &amp; out if API time clocking is enabled for Timesheet group
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void clockInOutTest() throws ApiException {
        String override = null;
        TimesheetsClockInOutRequestClockedTime clockedTime = null;
        TimesheetsClockInOutResponse response = api.clockInOut()
                .override(override)
                .clockedTime(clockedTime)
                .execute();
        // TODO: test validations
    }

}
