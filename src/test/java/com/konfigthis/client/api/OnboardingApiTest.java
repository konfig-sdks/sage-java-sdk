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
import com.konfigthis.client.model.OnboardingCreateNewTaskRequest;
import com.konfigthis.client.model.OnboardingCreateNewTaskResponse;
import com.konfigthis.client.model.OnboardingListTaskCategoriesResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OnboardingApi
 */
@Disabled
public class OnboardingApiTest {

    private static OnboardingApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new OnboardingApi(apiClient);
    }

    /**
     * Create new onboarding task
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewTaskTest() throws ApiException {
        String title = null;
        Double boardingTaskTemplateCategoryId = null;
        Double dueIn = null;
        String description = null;
        String defaultAssigneeType = null;
        Double assigneeId = null;
        String requireAttachment = null;
        Double addAfter = null;
        OnboardingCreateNewTaskResponse response = api.createNewTask(title, boardingTaskTemplateCategoryId, dueIn)
                .description(description)
                .defaultAssigneeType(defaultAssigneeType)
                .assigneeId(assigneeId)
                .requireAttachment(requireAttachment)
                .addAfter(addAfter)
                .execute();
        // TODO: test validations
    }

    /**
     * List onboarding task categories
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTaskCategoriesTest() throws ApiException {
        OnboardingListTaskCategoriesResponse response = api.listTaskCategories()
                .execute();
        // TODO: test validations
    }

}
