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
import java.io.File;
import com.konfigthis.client.model.RecruitmentCreateApplicantWithReferralRequest;
import com.konfigthis.client.model.RecruitmentCreateApplicantWithReferralResponse;
import com.konfigthis.client.model.RecruitmentGetApplicantDetailsResponse;
import com.konfigthis.client.model.RecruitmentGetPositionDetailsResponse;
import com.konfigthis.client.model.RecruitmentListApplicantActionsResponse;
import com.konfigthis.client.model.RecruitmentListApplicantsResponse;
import com.konfigthis.client.model.RecruitmentListPositionsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RecruitmentApi
 */
@Disabled
public class RecruitmentApiTest {

    private static RecruitmentApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new RecruitmentApi(apiClient);
    }

    /**
     * Create new applicant
     *
     * Tracking applicant&#39;s source:  * if left blank, source will be automatically set to &#x60;api&#x60;  * set source to a special keyword (&#x60;company_marketing&#x60;, &#x60;recruiters&#x60;, &#x60;referral&#x60;, &#x60;sourced&#x60;) to have it mapped to corresponding values   * set source to a desired reference to create a custom source, e.g. &#x60;source&#x3D;linkedin&#x60; will create a custom source called linkedin if it does not exist already  * passing a referral object as a parameter will set the source to &#x60;referral&#x60;    Example of creating an applicant with a refferal object: &#x60;&#x60;&#x60; curl -X POST -H &#39;X-AUTH-TOKEN:***&#39; -H &#39;Content-Type:application/json&#39; \\   \&quot;https://_***_/api/recruitment/positions/2/applicants\&quot; \\   -d &#39;{\&quot;applicant\&quot;: \\           {\&quot;referral\&quot;: {\&quot;email\&quot;: \&quot;recruitment@example.com\&quot;, \&quot;full_name\&quot;: \&quot;Alice L\&quot;}, \\            \&quot;address\&quot;: \&quot;BD23 8UL\&quot;, \&quot;summary\&quot;:\&quot;An applicant\&quot;, \\            \&quot;first_name\&quot;: \&quot;Applicant Name\&quot;}}&#39; &#x60;&#x60;&#x60; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createApplicantWithReferralTest() throws ApiException {
        Integer id = null;
        String applicantFirstName = null;
        String sendThankYouEmail = null;
        String applicantLastName = null;
        String applicantEmail = null;
        String applicantReferral = null;
        String applicantPhoneNumber = null;
        String applicantSource = null;
        String applicantAddress = null;
        String applicantSummary = null;
        File applicantAttachment = null;
        RecruitmentCreateApplicantWithReferralResponse response = api.createApplicantWithReferral(id, applicantFirstName)
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
        // TODO: test validations
    }

    /**
     * Applicant details
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getApplicantDetailsTest() throws ApiException {
        Integer id = null;
        RecruitmentGetApplicantDetailsResponse response = api.getApplicantDetails(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Position details
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPositionDetailsTest() throws ApiException {
        Integer id = null;
        RecruitmentGetPositionDetailsResponse response = api.getPositionDetails(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Applicant actions
     *
     * List applicant&#39;s process throught the recruitment pipeline. Newest, first. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listApplicantActionsTest() throws ApiException {
        Integer id = null;
        Integer page = null;
        Integer perPage = null;
        RecruitmentListApplicantActionsResponse response = api.listApplicantActions(id)
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

    /**
     * List applicants
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listApplicantsTest() throws ApiException {
        Integer id = null;
        Integer stageId = null;
        Integer page = null;
        Integer perPage = null;
        RecruitmentListApplicantsResponse response = api.listApplicants(id)
                .stageId(stageId)
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

    /**
     * List recruitment positions
     *
     * Posible recruitment position statuses: &#x60;draft&#x60;, &#x60;published&#x60;, &#x60;internal&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listPositionsTest() throws ApiException {
        String status = null;
        List<String> hiringManagerIds = null;
        List<String> groupIds = null;
        List<String> locationIds = null;
        Integer page = null;
        Integer perPage = null;
        RecruitmentListPositionsResponse response = api.listPositions()
                .status(status)
                .hiringManagerIds(hiringManagerIds)
                .groupIds(groupIds)
                .locationIds(locationIds)
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

}
