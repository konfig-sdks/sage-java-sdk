

# OnboardingCreateNewTaskRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**boardingTaskTemplateCategoryId** | **Double** |  |  |
|**dueIn** | **Double** | Due date in days after employee start date |  |
|**defaultAssigneeType** | [**DefaultAssigneeTypeEnum**](#DefaultAssigneeTypeEnum) | Default: self; leader - direct manager; employee - specific employee via assignee_id |  [optional] |
|**assigneeId** | **Double** | Specific assignee if default_assignee_type is &#39;employee&#39; |  [optional] |
|**requireAttachment** | **String** | &#39;true&#39; to enabled required attachment |  [optional] |
|**addAfter** | **Double** | Task start date in days after employee start date |  [optional] |



## Enum: DefaultAssigneeTypeEnum

| Name | Value |
|---- | -----|
| SELF | &quot;self&quot; |
| LEADER | &quot;leader&quot; |
| EMPLOYEE | &quot;employee&quot; |



