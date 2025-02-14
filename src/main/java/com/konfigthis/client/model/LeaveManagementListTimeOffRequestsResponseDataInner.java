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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.LeaveManagementListTimeOffRequestsResponseDataInnerFieldsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * LeaveManagementListTimeOffRequestsResponseDataInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LeaveManagementListTimeOffRequestsResponseDataInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Double id;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private String statusCode;

  public static final String SERIALIZED_NAME_POLICY_ID = "policy_id";
  @SerializedName(SERIALIZED_NAME_POLICY_ID)
  private Double policyId;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employee_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private Double employeeId;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

  public static final String SERIALIZED_NAME_IS_MULTI_DATE = "is_multi_date";
  @SerializedName(SERIALIZED_NAME_IS_MULTI_DATE)
  private Boolean isMultiDate;

  public static final String SERIALIZED_NAME_IS_SINGLE_DAY = "is_single_day";
  @SerializedName(SERIALIZED_NAME_IS_SINGLE_DAY)
  private Boolean isSingleDay;

  public static final String SERIALIZED_NAME_IS_PART_OF_DAY = "is_part_of_day";
  @SerializedName(SERIALIZED_NAME_IS_PART_OF_DAY)
  private Boolean isPartOfDay;

  public static final String SERIALIZED_NAME_FIRST_PART_OF_DAY = "first_part_of_day";
  @SerializedName(SERIALIZED_NAME_FIRST_PART_OF_DAY)
  private Boolean firstPartOfDay;

  public static final String SERIALIZED_NAME_SECOND_PART_OF_DAY = "second_part_of_day";
  @SerializedName(SERIALIZED_NAME_SECOND_PART_OF_DAY)
  private Boolean secondPartOfDay;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_REQUEST_DATE = "request_date";
  @SerializedName(SERIALIZED_NAME_REQUEST_DATE)
  private String requestDate;

  public static final String SERIALIZED_NAME_APPROVAL_DATE = "approval_date";
  @SerializedName(SERIALIZED_NAME_APPROVAL_DATE)
  private String approvalDate;

  public static final String SERIALIZED_NAME_HOURS = "hours";
  @SerializedName(SERIALIZED_NAME_HOURS)
  private Double hours;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<LeaveManagementListTimeOffRequestsResponseDataInnerFieldsInner> fields = null;

  public LeaveManagementListTimeOffRequestsResponseDataInner() {
  }

  public LeaveManagementListTimeOffRequestsResponseDataInner id(Double id) {
    
    
    
    
    this.id = id;
    return this;
  }

  public LeaveManagementListTimeOffRequestsResponseDataInner id(Integer id) {
    
    
    
    
    this.id = id.doubleValue();
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2902504", value = "")

  public Double getId() {
    return id;
  }


  public void setId(Double id) {
    
    
    
    this.id = id;
  }


  public LeaveManagementListTimeOffRequestsResponseDataInner status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Approved", value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public LeaveManagementListTimeOffRequestsResponseDataInner statusCode(String statusCode) {
    
    
    
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "approved", value = "")

  public String getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(String statusCode) {
    
    
    
    this.statusCode = statusCode;
  }


  public LeaveManagementListTimeOffRequestsResponseDataInner policyId(Double policyId) {
    
    
    
    
    this.policyId = policyId;
    return this;
  }

  public LeaveManagementListTimeOffRequestsResponseDataInner policyId(Integer policyId) {
    
    
    
    
    this.policyId = policyId.doubleValue();
    return this;
  }

   /**
   * Get policyId
   * @return policyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Double getPolicyId() {
    return policyId;
  }


  public void setPolicyId(Double policyId) {
    
    
    
    this.policyId = policyId;
  }


  public LeaveManagementListTimeOffRequestsResponseDataInner employeeId(Double employeeId) {
    
    
    
    
    this.employeeId = employeeId;
    return this;
  }

  public LeaveManagementListTimeOffRequestsResponseDataInner employeeId(Integer employeeId) {
    
    
    
    
    this.employeeId = employeeId.doubleValue();
    return this;
  }

   /**
   * Get employeeId
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Double getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(Double employeeId) {
    
    
    
    this.employeeId = employeeId;
  }


  public LeaveManagementListTimeOffRequestsResponseDataInner details(String details) {
    
    
    
    
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Birthday lunch", value = "")

  public String getDetails() {
    return details;
  }


  public void setDetails(String details) {
    
    
    
    this.details = details;
  }


  public LeaveManagementListTimeOffRequestsResponseDataInner isMultiDate(Boolean isMultiDate) {
    
    
    
    
    this.isMultiDate = isMultiDate;
    return this;
  }

   /**
   * Get isMultiDate
   * @return isMultiDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIsMultiDate() {
    return isMultiDate;
  }


  public void setIsMultiDate(Boolean isMultiDate) {
    
    
    
    this.isMultiDate = isMultiDate;
  }


  public LeaveManagementListTimeOffRequestsResponseDataInner isSingleDay(Boolean isSingleDay) {
    
    
    
    
    this.isSingleDay = isSingleDay;
    return this;
  }

   /**
   * Get isSingleDay
   * @return isSingleDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getIsSingleDay() {
    return isSingleDay;
  }


  public void setIsSingleDay(Boolean isSingleDay) {
    
    
    
    this.isSingleDay = isSingleDay;
  }


  public LeaveManagementListTimeOffRequestsResponseDataInner isPartOfDay(Boolean isPartOfDay) {
    
    
    
    
    this.isPartOfDay = isPartOfDay;
    return this;
  }

   /**
   * Get isPartOfDay
   * @return isPartOfDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getIsPartOfDay() {
    return isPartOfDay;
  }


  public void setIsPartOfDay(Boolean isPartOfDay) {
    
    
    
    this.isPartOfDay = isPartOfDay;
  }


  public LeaveManagementListTimeOffRequestsResponseDataInner firstPartOfDay(Boolean firstPartOfDay) {
    
    
    
    
    this.firstPartOfDay = firstPartOfDay;
    return this;
  }

   /**
   * Get firstPartOfDay
   * @return firstPartOfDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getFirstPartOfDay() {
    return firstPartOfDay;
  }


  public void setFirstPartOfDay(Boolean firstPartOfDay) {
    
    
    
    this.firstPartOfDay = firstPartOfDay;
  }


  public LeaveManagementListTimeOffRequestsResponseDataInner secondPartOfDay(Boolean secondPartOfDay) {
    
    
    
    
    this.secondPartOfDay = secondPartOfDay;
    return this;
  }

   /**
   * Get secondPartOfDay
   * @return secondPartOfDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getSecondPartOfDay() {
    return secondPartOfDay;
  }


  public void setSecondPartOfDay(Boolean secondPartOfDay) {
    
    
    
    this.secondPartOfDay = secondPartOfDay;
  }


  public LeaveManagementListTimeOffRequestsResponseDataInner startDate(String startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-05-24", value = "")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    
    
    
    this.startDate = startDate;
  }


  public LeaveManagementListTimeOffRequestsResponseDataInner endDate(String endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-05-24", value = "")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    
    
    
    this.endDate = endDate;
  }


  public LeaveManagementListTimeOffRequestsResponseDataInner requestDate(String requestDate) {
    
    
    
    
    this.requestDate = requestDate;
    return this;
  }

   /**
   * Get requestDate
   * @return requestDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-05-22", value = "")

  public String getRequestDate() {
    return requestDate;
  }


  public void setRequestDate(String requestDate) {
    
    
    
    this.requestDate = requestDate;
  }


  public LeaveManagementListTimeOffRequestsResponseDataInner approvalDate(String approvalDate) {
    
    
    
    
    this.approvalDate = approvalDate;
    return this;
  }

   /**
   * Get approvalDate
   * @return approvalDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApprovalDate() {
    return approvalDate;
  }


  public void setApprovalDate(String approvalDate) {
    
    
    
    this.approvalDate = approvalDate;
  }


  public LeaveManagementListTimeOffRequestsResponseDataInner hours(Double hours) {
    
    
    
    
    this.hours = hours;
    return this;
  }

  public LeaveManagementListTimeOffRequestsResponseDataInner hours(Integer hours) {
    
    
    
    
    this.hours = hours.doubleValue();
    return this;
  }

   /**
   * Get hours
   * @return hours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.5", value = "")

  public Double getHours() {
    return hours;
  }


  public void setHours(Double hours) {
    
    
    
    this.hours = hours;
  }


  public LeaveManagementListTimeOffRequestsResponseDataInner fields(List<LeaveManagementListTimeOffRequestsResponseDataInnerFieldsInner> fields) {
    
    
    
    
    this.fields = fields;
    return this;
  }

  public LeaveManagementListTimeOffRequestsResponseDataInner addFieldsItem(LeaveManagementListTimeOffRequestsResponseDataInnerFieldsInner fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<LeaveManagementListTimeOffRequestsResponseDataInnerFieldsInner> getFields() {
    return fields;
  }


  public void setFields(List<LeaveManagementListTimeOffRequestsResponseDataInnerFieldsInner> fields) {
    
    
    
    this.fields = fields;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the LeaveManagementListTimeOffRequestsResponseDataInner instance itself
   */
  public LeaveManagementListTimeOffRequestsResponseDataInner putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaveManagementListTimeOffRequestsResponseDataInner leaveManagementListTimeOffRequestsResponseDataInner = (LeaveManagementListTimeOffRequestsResponseDataInner) o;
    return Objects.equals(this.id, leaveManagementListTimeOffRequestsResponseDataInner.id) &&
        Objects.equals(this.status, leaveManagementListTimeOffRequestsResponseDataInner.status) &&
        Objects.equals(this.statusCode, leaveManagementListTimeOffRequestsResponseDataInner.statusCode) &&
        Objects.equals(this.policyId, leaveManagementListTimeOffRequestsResponseDataInner.policyId) &&
        Objects.equals(this.employeeId, leaveManagementListTimeOffRequestsResponseDataInner.employeeId) &&
        Objects.equals(this.details, leaveManagementListTimeOffRequestsResponseDataInner.details) &&
        Objects.equals(this.isMultiDate, leaveManagementListTimeOffRequestsResponseDataInner.isMultiDate) &&
        Objects.equals(this.isSingleDay, leaveManagementListTimeOffRequestsResponseDataInner.isSingleDay) &&
        Objects.equals(this.isPartOfDay, leaveManagementListTimeOffRequestsResponseDataInner.isPartOfDay) &&
        Objects.equals(this.firstPartOfDay, leaveManagementListTimeOffRequestsResponseDataInner.firstPartOfDay) &&
        Objects.equals(this.secondPartOfDay, leaveManagementListTimeOffRequestsResponseDataInner.secondPartOfDay) &&
        Objects.equals(this.startDate, leaveManagementListTimeOffRequestsResponseDataInner.startDate) &&
        Objects.equals(this.endDate, leaveManagementListTimeOffRequestsResponseDataInner.endDate) &&
        Objects.equals(this.requestDate, leaveManagementListTimeOffRequestsResponseDataInner.requestDate) &&
        Objects.equals(this.approvalDate, leaveManagementListTimeOffRequestsResponseDataInner.approvalDate) &&
        Objects.equals(this.hours, leaveManagementListTimeOffRequestsResponseDataInner.hours) &&
        Objects.equals(this.fields, leaveManagementListTimeOffRequestsResponseDataInner.fields)&&
        Objects.equals(this.additionalProperties, leaveManagementListTimeOffRequestsResponseDataInner.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, statusCode, policyId, employeeId, details, isMultiDate, isSingleDay, isPartOfDay, firstPartOfDay, secondPartOfDay, startDate, endDate, requestDate, approvalDate, hours, fields, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveManagementListTimeOffRequestsResponseDataInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    isMultiDate: ").append(toIndentedString(isMultiDate)).append("\n");
    sb.append("    isSingleDay: ").append(toIndentedString(isSingleDay)).append("\n");
    sb.append("    isPartOfDay: ").append(toIndentedString(isPartOfDay)).append("\n");
    sb.append("    firstPartOfDay: ").append(toIndentedString(firstPartOfDay)).append("\n");
    sb.append("    secondPartOfDay: ").append(toIndentedString(secondPartOfDay)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    requestDate: ").append(toIndentedString(requestDate)).append("\n");
    sb.append("    approvalDate: ").append(toIndentedString(approvalDate)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("status");
    openapiFields.add("status_code");
    openapiFields.add("policy_id");
    openapiFields.add("employee_id");
    openapiFields.add("details");
    openapiFields.add("is_multi_date");
    openapiFields.add("is_single_day");
    openapiFields.add("is_part_of_day");
    openapiFields.add("first_part_of_day");
    openapiFields.add("second_part_of_day");
    openapiFields.add("start_date");
    openapiFields.add("end_date");
    openapiFields.add("request_date");
    openapiFields.add("approval_date");
    openapiFields.add("hours");
    openapiFields.add("fields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LeaveManagementListTimeOffRequestsResponseDataInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LeaveManagementListTimeOffRequestsResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LeaveManagementListTimeOffRequestsResponseDataInner is not found in the empty JSON string", LeaveManagementListTimeOffRequestsResponseDataInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("status_code") != null && !jsonObj.get("status_code").isJsonNull()) && !jsonObj.get("status_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status_code").toString()));
      }
      if ((jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) && !jsonObj.get("details").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `details` to be a primitive type in the JSON string but got `%s`", jsonObj.get("details").toString()));
      }
      if ((jsonObj.get("start_date") != null && !jsonObj.get("start_date").isJsonNull()) && !jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
      if ((jsonObj.get("end_date") != null && !jsonObj.get("end_date").isJsonNull()) && !jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
      if ((jsonObj.get("request_date") != null && !jsonObj.get("request_date").isJsonNull()) && !jsonObj.get("request_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_date").toString()));
      }
      if (!jsonObj.get("approval_date").isJsonNull() && (jsonObj.get("approval_date") != null && !jsonObj.get("approval_date").isJsonNull()) && !jsonObj.get("approval_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `approval_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("approval_date").toString()));
      }
      if (jsonObj.get("fields") != null && !jsonObj.get("fields").isJsonNull()) {
        JsonArray jsonArrayfields = jsonObj.getAsJsonArray("fields");
        if (jsonArrayfields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
          }

          // validate the optional field `fields` (array)
          for (int i = 0; i < jsonArrayfields.size(); i++) {
            LeaveManagementListTimeOffRequestsResponseDataInnerFieldsInner.validateJsonObject(jsonArrayfields.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LeaveManagementListTimeOffRequestsResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LeaveManagementListTimeOffRequestsResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LeaveManagementListTimeOffRequestsResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LeaveManagementListTimeOffRequestsResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<LeaveManagementListTimeOffRequestsResponseDataInner>() {
           @Override
           public void write(JsonWriter out, LeaveManagementListTimeOffRequestsResponseDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public LeaveManagementListTimeOffRequestsResponseDataInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LeaveManagementListTimeOffRequestsResponseDataInner instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LeaveManagementListTimeOffRequestsResponseDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LeaveManagementListTimeOffRequestsResponseDataInner
  * @throws IOException if the JSON string is invalid with respect to LeaveManagementListTimeOffRequestsResponseDataInner
  */
  public static LeaveManagementListTimeOffRequestsResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LeaveManagementListTimeOffRequestsResponseDataInner.class);
  }

 /**
  * Convert an instance of LeaveManagementListTimeOffRequestsResponseDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

