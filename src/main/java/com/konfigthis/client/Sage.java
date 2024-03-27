package com.konfigthis.client;

import com.konfigthis.client.api.DocumentsApi;
import com.konfigthis.client.api.EmployeeApi;
import com.konfigthis.client.api.IntegrationsApi;
import com.konfigthis.client.api.KitDaysApi;
import com.konfigthis.client.api.LeaveManagementApi;
import com.konfigthis.client.api.OffboardingApi;
import com.konfigthis.client.api.OnboardingApi;
import com.konfigthis.client.api.PerformanceApi;
import com.konfigthis.client.api.PoliciesApi;
import com.konfigthis.client.api.PositionsApi;
import com.konfigthis.client.api.RecruitmentApi;
import com.konfigthis.client.api.TeamsApi;
import com.konfigthis.client.api.TerminationsReasonsApi;
import com.konfigthis.client.api.TimesheetsApi;

public class Sage {
    private ApiClient apiClient;
    public final DocumentsApi documents;
    public final EmployeeApi employee;
    public final IntegrationsApi integrations;
    public final KitDaysApi kitDays;
    public final LeaveManagementApi leaveManagement;
    public final OffboardingApi offboarding;
    public final OnboardingApi onboarding;
    public final PerformanceApi performance;
    public final PoliciesApi policies;
    public final PositionsApi positions;
    public final RecruitmentApi recruitment;
    public final TeamsApi teams;
    public final TerminationsReasonsApi terminationsReasons;
    public final TimesheetsApi timesheets;

    public Sage() {
        this(null);
    }

    public Sage(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.documents = new DocumentsApi(this.apiClient);
        this.employee = new EmployeeApi(this.apiClient);
        this.integrations = new IntegrationsApi(this.apiClient);
        this.kitDays = new KitDaysApi(this.apiClient);
        this.leaveManagement = new LeaveManagementApi(this.apiClient);
        this.offboarding = new OffboardingApi(this.apiClient);
        this.onboarding = new OnboardingApi(this.apiClient);
        this.performance = new PerformanceApi(this.apiClient);
        this.policies = new PoliciesApi(this.apiClient);
        this.positions = new PositionsApi(this.apiClient);
        this.recruitment = new RecruitmentApi(this.apiClient);
        this.teams = new TeamsApi(this.apiClient);
        this.terminationsReasons = new TerminationsReasonsApi(this.apiClient);
        this.timesheets = new TimesheetsApi(this.apiClient);
    }

}
