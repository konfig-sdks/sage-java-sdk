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
 * LeaveManagementListTimeOffRequestsResponseMeta
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LeaveManagementListTimeOffRequestsResponseMeta {
  public static final String SERIALIZED_NAME_CURRENT_PAGE = "current_page";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE)
  private Double currentPage;

  public static final String SERIALIZED_NAME_NEXT_PAGE = "next_page";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE)
  private Double nextPage;

  public static final String SERIALIZED_NAME_PREVIOUS_PAGE = "previous_page";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_PAGE)
  private String previousPage;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "total_pages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private Double totalPages;

  public static final String SERIALIZED_NAME_PER_PAGE = "per_page";
  @SerializedName(SERIALIZED_NAME_PER_PAGE)
  private Double perPage;

  public static final String SERIALIZED_NAME_TOTAL_ENTRIES = "total_entries";
  @SerializedName(SERIALIZED_NAME_TOTAL_ENTRIES)
  private Double totalEntries;

  public LeaveManagementListTimeOffRequestsResponseMeta() {
  }

  public LeaveManagementListTimeOffRequestsResponseMeta currentPage(Double currentPage) {
    
    
    
    
    this.currentPage = currentPage;
    return this;
  }

  public LeaveManagementListTimeOffRequestsResponseMeta currentPage(Integer currentPage) {
    
    
    
    
    this.currentPage = currentPage.doubleValue();
    return this;
  }

   /**
   * Get currentPage
   * @return currentPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Double getCurrentPage() {
    return currentPage;
  }


  public void setCurrentPage(Double currentPage) {
    
    
    
    this.currentPage = currentPage;
  }


  public LeaveManagementListTimeOffRequestsResponseMeta nextPage(Double nextPage) {
    
    
    
    
    this.nextPage = nextPage;
    return this;
  }

  public LeaveManagementListTimeOffRequestsResponseMeta nextPage(Integer nextPage) {
    
    
    
    
    this.nextPage = nextPage.doubleValue();
    return this;
  }

   /**
   * Get nextPage
   * @return nextPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Double getNextPage() {
    return nextPage;
  }


  public void setNextPage(Double nextPage) {
    
    
    
    this.nextPage = nextPage;
  }


  public LeaveManagementListTimeOffRequestsResponseMeta previousPage(String previousPage) {
    
    
    
    
    this.previousPage = previousPage;
    return this;
  }

   /**
   * Get previousPage
   * @return previousPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPreviousPage() {
    return previousPage;
  }


  public void setPreviousPage(String previousPage) {
    
    
    
    this.previousPage = previousPage;
  }


  public LeaveManagementListTimeOffRequestsResponseMeta totalPages(Double totalPages) {
    
    
    
    
    this.totalPages = totalPages;
    return this;
  }

  public LeaveManagementListTimeOffRequestsResponseMeta totalPages(Integer totalPages) {
    
    
    
    
    this.totalPages = totalPages.doubleValue();
    return this;
  }

   /**
   * Get totalPages
   * @return totalPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Double getTotalPages() {
    return totalPages;
  }


  public void setTotalPages(Double totalPages) {
    
    
    
    this.totalPages = totalPages;
  }


  public LeaveManagementListTimeOffRequestsResponseMeta perPage(Double perPage) {
    
    
    
    
    this.perPage = perPage;
    return this;
  }

  public LeaveManagementListTimeOffRequestsResponseMeta perPage(Integer perPage) {
    
    
    
    
    this.perPage = perPage.doubleValue();
    return this;
  }

   /**
   * Get perPage
   * @return perPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50", value = "")

  public Double getPerPage() {
    return perPage;
  }


  public void setPerPage(Double perPage) {
    
    
    
    this.perPage = perPage;
  }


  public LeaveManagementListTimeOffRequestsResponseMeta totalEntries(Double totalEntries) {
    
    
    
    
    this.totalEntries = totalEntries;
    return this;
  }

  public LeaveManagementListTimeOffRequestsResponseMeta totalEntries(Integer totalEntries) {
    
    
    
    
    this.totalEntries = totalEntries.doubleValue();
    return this;
  }

   /**
   * Get totalEntries
   * @return totalEntries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "75", value = "")

  public Double getTotalEntries() {
    return totalEntries;
  }


  public void setTotalEntries(Double totalEntries) {
    
    
    
    this.totalEntries = totalEntries;
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
   * @return the LeaveManagementListTimeOffRequestsResponseMeta instance itself
   */
  public LeaveManagementListTimeOffRequestsResponseMeta putAdditionalProperty(String key, Object value) {
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
    LeaveManagementListTimeOffRequestsResponseMeta leaveManagementListTimeOffRequestsResponseMeta = (LeaveManagementListTimeOffRequestsResponseMeta) o;
    return Objects.equals(this.currentPage, leaveManagementListTimeOffRequestsResponseMeta.currentPage) &&
        Objects.equals(this.nextPage, leaveManagementListTimeOffRequestsResponseMeta.nextPage) &&
        Objects.equals(this.previousPage, leaveManagementListTimeOffRequestsResponseMeta.previousPage) &&
        Objects.equals(this.totalPages, leaveManagementListTimeOffRequestsResponseMeta.totalPages) &&
        Objects.equals(this.perPage, leaveManagementListTimeOffRequestsResponseMeta.perPage) &&
        Objects.equals(this.totalEntries, leaveManagementListTimeOffRequestsResponseMeta.totalEntries)&&
        Objects.equals(this.additionalProperties, leaveManagementListTimeOffRequestsResponseMeta.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, nextPage, previousPage, totalPages, perPage, totalEntries, additionalProperties);
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
    sb.append("class LeaveManagementListTimeOffRequestsResponseMeta {\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    previousPage: ").append(toIndentedString(previousPage)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    totalEntries: ").append(toIndentedString(totalEntries)).append("\n");
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
    openapiFields.add("current_page");
    openapiFields.add("next_page");
    openapiFields.add("previous_page");
    openapiFields.add("total_pages");
    openapiFields.add("per_page");
    openapiFields.add("total_entries");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LeaveManagementListTimeOffRequestsResponseMeta
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LeaveManagementListTimeOffRequestsResponseMeta.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LeaveManagementListTimeOffRequestsResponseMeta is not found in the empty JSON string", LeaveManagementListTimeOffRequestsResponseMeta.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("previous_page").isJsonNull() && (jsonObj.get("previous_page") != null && !jsonObj.get("previous_page").isJsonNull()) && !jsonObj.get("previous_page").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previous_page` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previous_page").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LeaveManagementListTimeOffRequestsResponseMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LeaveManagementListTimeOffRequestsResponseMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LeaveManagementListTimeOffRequestsResponseMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LeaveManagementListTimeOffRequestsResponseMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<LeaveManagementListTimeOffRequestsResponseMeta>() {
           @Override
           public void write(JsonWriter out, LeaveManagementListTimeOffRequestsResponseMeta value) throws IOException {
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
           public LeaveManagementListTimeOffRequestsResponseMeta read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LeaveManagementListTimeOffRequestsResponseMeta instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LeaveManagementListTimeOffRequestsResponseMeta given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LeaveManagementListTimeOffRequestsResponseMeta
  * @throws IOException if the JSON string is invalid with respect to LeaveManagementListTimeOffRequestsResponseMeta
  */
  public static LeaveManagementListTimeOffRequestsResponseMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LeaveManagementListTimeOffRequestsResponseMeta.class);
  }

 /**
  * Convert an instance of LeaveManagementListTimeOffRequestsResponseMeta to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

