

# OffboardingCreateTaskRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**boardingTaskTemplateCategoryId** | **Double** |  |  |
|**dueIn** | **Double** | Due date in days before employee last working day |  |
|**defaultAssigneeType** | [**DefaultAssigneeTypeEnum**](#DefaultAssigneeTypeEnum) | Default: self; leader - direct manager; employee - specific employee via assignee_id |  [optional] |
|**assigneeId** | **Double** | Specific assignee if default_assignee_type is &#39;employee&#39; |  [optional] |
|**requireAttachment** | **String** | &#39;true&#39; to enabled required attachment |  [optional] |



## Enum: DefaultAssigneeTypeEnum

| Name | Value |
|---- | -----|
| SELF | &quot;self&quot; |
| LEADER | &quot;leader&quot; |
| EMPLOYEE | &quot;employee&quot; |



