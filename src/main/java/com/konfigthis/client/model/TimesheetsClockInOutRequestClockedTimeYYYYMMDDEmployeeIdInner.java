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
 * TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner {
  public static final String SERIALIZED_NAME_CLOCK_IN = "clock_in";
  @SerializedName(SERIALIZED_NAME_CLOCK_IN)
  private String clockIn;

  public static final String SERIALIZED_NAME_CLOCK_OUT = "clock_out";
  @SerializedName(SERIALIZED_NAME_CLOCK_OUT)
  private String clockOut;

  public TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner() {
  }

  public TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner clockIn(String clockIn) {
    
    
    
    
    this.clockIn = clockIn;
    return this;
  }

   /**
   * YYYY/MM/DD HH:MM
   * @return clockIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "YYYY/MM/DD HH:MM")

  public String getClockIn() {
    return clockIn;
  }


  public void setClockIn(String clockIn) {
    
    
    
    this.clockIn = clockIn;
  }


  public TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner clockOut(String clockOut) {
    
    
    
    
    this.clockOut = clockOut;
    return this;
  }

   /**
   * YYYY/MM/DD HH:MM
   * @return clockOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "YYYY/MM/DD HH:MM")

  public String getClockOut() {
    return clockOut;
  }


  public void setClockOut(String clockOut) {
    
    
    
    this.clockOut = clockOut;
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
   * @return the TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner instance itself
   */
  public TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner putAdditionalProperty(String key, Object value) {
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
    TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner timesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner = (TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner) o;
    return Objects.equals(this.clockIn, timesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner.clockIn) &&
        Objects.equals(this.clockOut, timesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner.clockOut)&&
        Objects.equals(this.additionalProperties, timesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clockIn, clockOut, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner {\n");
    sb.append("    clockIn: ").append(toIndentedString(clockIn)).append("\n");
    sb.append("    clockOut: ").append(toIndentedString(clockOut)).append("\n");
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
    openapiFields.add("clock_in");
    openapiFields.add("clock_out");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner is not found in the empty JSON string", TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("clock_in") != null && !jsonObj.get("clock_in").isJsonNull()) && !jsonObj.get("clock_in").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clock_in` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clock_in").toString()));
      }
      if ((jsonObj.get("clock_out") != null && !jsonObj.get("clock_out").isJsonNull()) && !jsonObj.get("clock_out").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clock_out` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clock_out").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner>() {
           @Override
           public void write(JsonWriter out, TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner value) throws IOException {
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
           public TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner
  * @throws IOException if the JSON string is invalid with respect to TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner
  */
  public static TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner.class);
  }

 /**
  * Convert an instance of TimesheetsClockInOutRequestClockedTimeYYYYMMDDEmployeeIdInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

