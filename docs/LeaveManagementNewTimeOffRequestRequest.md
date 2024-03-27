

# LeaveManagementNewTimeOffRequestRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**timeOffPolicyId** | **Integer** |  |  |
|**employeeId** | **Integer** |  |  |
|**date** | **String** | format: YYYY-MM-DD; required if type is single |  [optional] |
|**dateFrom** | **String** | format: YYYY-MM-DD; required if type is multi |  [optional] |
|**dateTo** | **String** | format: YYYY-MM-DD; required if type is multi |  [optional] |
|**partOfDay** | [**PartOfDayEnum**](#PartOfDayEnum) | required if type is single |  |
|**hours** | **Double** | required if type is single &amp; part_of_day is first_part_of_day or second_part_of_day |  [optional] |
|**timeFrom** | **String** | format: H:M; required if part_of_day is specific_timespan |  [optional] |
|**timeTo** | **String** | format: H:M; required if part_of_day is specific_timespan |  [optional] |
|**details** | **String** | required based on policy settings |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;single&quot; |
| MULTI | &quot;multi&quot; |



## Enum: PartOfDayEnum

| Name | Value |
|---- | -----|
| ALL_DAY | &quot;all_day&quot; |
| FIRST_PART_OF_DAY | &quot;first_part_of_day&quot; |
| SECOND_PART_OF_DAY | &quot;second_part_of_day&quot; |
| SPECIFIC_TIMESPAN | &quot;specific_timespan&quot; |



