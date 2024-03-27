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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner {
  public static final String SERIALIZED_NAME_TEAM_ID = "team_id";
  @SerializedName(SERIALIZED_NAME_TEAM_ID)
  private Double teamId;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_TEAM_NAME = "team_name";
  @SerializedName(SERIALIZED_NAME_TEAM_NAME)
  private String teamName;

  public EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner() {
  }

  public EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner teamId(Double teamId) {
    
    
    
    
    this.teamId = teamId;
    return this;
  }

  public EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner teamId(Integer teamId) {
    
    
    
    
    this.teamId = teamId.doubleValue();
    return this;
  }

   /**
   * Get teamId
   * @return teamId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Double getTeamId() {
    return teamId;
  }


  public void setTeamId(Double teamId) {
    
    
    
    this.teamId = teamId;
  }


  public EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner startDate(String startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-01-01", value = "")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    
    
    
    this.startDate = startDate;
  }


  public EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner endDate(String endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201-01-01", value = "")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    
    
    
    this.endDate = endDate;
  }


  public EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner teamName(String teamName) {
    
    
    
    
    this.teamName = teamName;
    return this;
  }

   /**
   * Get teamName
   * @return teamName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Some Team", value = "")

  public String getTeamName() {
    return teamName;
  }


  public void setTeamName(String teamName) {
    
    
    
    this.teamName = teamName;
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
   * @return the EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner instance itself
   */
  public EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner putAdditionalProperty(String key, Object value) {
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
    EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner employeeListActiveEmployeesResponseDataInnerTeamHistoryInner = (EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner) o;
    return Objects.equals(this.teamId, employeeListActiveEmployeesResponseDataInnerTeamHistoryInner.teamId) &&
        Objects.equals(this.startDate, employeeListActiveEmployeesResponseDataInnerTeamHistoryInner.startDate) &&
        Objects.equals(this.endDate, employeeListActiveEmployeesResponseDataInnerTeamHistoryInner.endDate) &&
        Objects.equals(this.teamName, employeeListActiveEmployeesResponseDataInnerTeamHistoryInner.teamName)&&
        Objects.equals(this.additionalProperties, employeeListActiveEmployeesResponseDataInnerTeamHistoryInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamId, startDate, endDate, teamName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner {\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
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
    openapiFields.add("team_id");
    openapiFields.add("start_date");
    openapiFields.add("end_date");
    openapiFields.add("team_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner is not found in the empty JSON string", EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("start_date") != null && !jsonObj.get("start_date").isJsonNull()) && !jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
      if ((jsonObj.get("end_date") != null && !jsonObj.get("end_date").isJsonNull()) && !jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
      if ((jsonObj.get("team_name") != null && !jsonObj.get("team_name").isJsonNull()) && !jsonObj.get("team_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `team_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("team_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner>() {
           @Override
           public void write(JsonWriter out, EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner value) throws IOException {
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
           public EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner
  * @throws IOException if the JSON string is invalid with respect to EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner
  */
  public static EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner.class);
  }

 /**
  * Convert an instance of EmployeeListActiveEmployeesResponseDataInnerTeamHistoryInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

