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
 * IntegrationsTransferBankAccountInfoResponseData
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class IntegrationsTransferBankAccountInfoResponseData {
  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employee_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private Double employeeId;

  public static final String SERIALIZED_NAME_EMPLOYEE_NUMBER = "employee_number";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NUMBER)
  private Double employeeNumber;

  public static final String SERIALIZED_NAME_BANK_CODE = "bank_code";
  @SerializedName(SERIALIZED_NAME_BANK_CODE)
  private String bankCode;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT = "bank_account";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT)
  private String bankAccount;

  public static final String SERIALIZED_NAME_LAST_CHANGE = "last_change";
  @SerializedName(SERIALIZED_NAME_LAST_CHANGE)
  private String lastChange;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Double status;

  public IntegrationsTransferBankAccountInfoResponseData() {
  }

  public IntegrationsTransferBankAccountInfoResponseData employeeId(Double employeeId) {
    
    
    
    
    this.employeeId = employeeId;
    return this;
  }

  public IntegrationsTransferBankAccountInfoResponseData employeeId(Integer employeeId) {
    
    
    
    
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


  public IntegrationsTransferBankAccountInfoResponseData employeeNumber(Double employeeNumber) {
    
    
    
    
    this.employeeNumber = employeeNumber;
    return this;
  }

  public IntegrationsTransferBankAccountInfoResponseData employeeNumber(Integer employeeNumber) {
    
    
    
    
    this.employeeNumber = employeeNumber.doubleValue();
    return this;
  }

   /**
   * Get employeeNumber
   * @return employeeNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "")

  public Double getEmployeeNumber() {
    return employeeNumber;
  }


  public void setEmployeeNumber(Double employeeNumber) {
    
    
    
    this.employeeNumber = employeeNumber;
  }


  public IntegrationsTransferBankAccountInfoResponseData bankCode(String bankCode) {
    
    
    
    
    this.bankCode = bankCode;
    return this;
  }

   /**
   * Get bankCode
   * @return bankCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bank code (custom_field)", value = "")

  public String getBankCode() {
    return bankCode;
  }


  public void setBankCode(String bankCode) {
    
    
    
    this.bankCode = bankCode;
  }


  public IntegrationsTransferBankAccountInfoResponseData bankAccount(String bankAccount) {
    
    
    
    
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bank account (custom_field)", value = "")

  public String getBankAccount() {
    return bankAccount;
  }


  public void setBankAccount(String bankAccount) {
    
    
    
    this.bankAccount = bankAccount;
  }


  public IntegrationsTransferBankAccountInfoResponseData lastChange(String lastChange) {
    
    
    
    
    this.lastChange = lastChange;
    return this;
  }

   /**
   * Get lastChange
   * @return lastChange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-09-10", value = "")

  public String getLastChange() {
    return lastChange;
  }


  public void setLastChange(String lastChange) {
    
    
    
    this.lastChange = lastChange;
  }


  public IntegrationsTransferBankAccountInfoResponseData status(Double status) {
    
    
    
    
    this.status = status;
    return this;
  }

  public IntegrationsTransferBankAccountInfoResponseData status(Integer status) {
    
    
    
    
    this.status = status.doubleValue();
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Double getStatus() {
    return status;
  }


  public void setStatus(Double status) {
    
    
    
    this.status = status;
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
   * @return the IntegrationsTransferBankAccountInfoResponseData instance itself
   */
  public IntegrationsTransferBankAccountInfoResponseData putAdditionalProperty(String key, Object value) {
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
    IntegrationsTransferBankAccountInfoResponseData integrationsTransferBankAccountInfoResponseData = (IntegrationsTransferBankAccountInfoResponseData) o;
    return Objects.equals(this.employeeId, integrationsTransferBankAccountInfoResponseData.employeeId) &&
        Objects.equals(this.employeeNumber, integrationsTransferBankAccountInfoResponseData.employeeNumber) &&
        Objects.equals(this.bankCode, integrationsTransferBankAccountInfoResponseData.bankCode) &&
        Objects.equals(this.bankAccount, integrationsTransferBankAccountInfoResponseData.bankAccount) &&
        Objects.equals(this.lastChange, integrationsTransferBankAccountInfoResponseData.lastChange) &&
        Objects.equals(this.status, integrationsTransferBankAccountInfoResponseData.status)&&
        Objects.equals(this.additionalProperties, integrationsTransferBankAccountInfoResponseData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, employeeNumber, bankCode, bankAccount, lastChange, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationsTransferBankAccountInfoResponseData {\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    employeeNumber: ").append(toIndentedString(employeeNumber)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    lastChange: ").append(toIndentedString(lastChange)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("employee_id");
    openapiFields.add("employee_number");
    openapiFields.add("bank_code");
    openapiFields.add("bank_account");
    openapiFields.add("last_change");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IntegrationsTransferBankAccountInfoResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IntegrationsTransferBankAccountInfoResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntegrationsTransferBankAccountInfoResponseData is not found in the empty JSON string", IntegrationsTransferBankAccountInfoResponseData.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("bank_code") != null && !jsonObj.get("bank_code").isJsonNull()) && !jsonObj.get("bank_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_code").toString()));
      }
      if ((jsonObj.get("bank_account") != null && !jsonObj.get("bank_account").isJsonNull()) && !jsonObj.get("bank_account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_account").toString()));
      }
      if ((jsonObj.get("last_change") != null && !jsonObj.get("last_change").isJsonNull()) && !jsonObj.get("last_change").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_change` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_change").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntegrationsTransferBankAccountInfoResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntegrationsTransferBankAccountInfoResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntegrationsTransferBankAccountInfoResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntegrationsTransferBankAccountInfoResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<IntegrationsTransferBankAccountInfoResponseData>() {
           @Override
           public void write(JsonWriter out, IntegrationsTransferBankAccountInfoResponseData value) throws IOException {
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
           public IntegrationsTransferBankAccountInfoResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IntegrationsTransferBankAccountInfoResponseData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of IntegrationsTransferBankAccountInfoResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IntegrationsTransferBankAccountInfoResponseData
  * @throws IOException if the JSON string is invalid with respect to IntegrationsTransferBankAccountInfoResponseData
  */
  public static IntegrationsTransferBankAccountInfoResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntegrationsTransferBankAccountInfoResponseData.class);
  }

 /**
  * Convert an instance of IntegrationsTransferBankAccountInfoResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

