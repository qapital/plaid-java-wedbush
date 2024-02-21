/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.496.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.RecurringFrequency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Insights relating to expenses and deposits that are predicted to occur on a scheduled basis, such as biweekly, monthly, or annually.  Common examples include loan payments, bill payments, subscriptions, and payroll income.  This is a beta field, available to all users.
 */
@ApiModel(description = "Insights relating to expenses and deposits that are predicted to occur on a scheduled basis, such as biweekly, monthly, or annually.  Common examples include loan payments, bill payments, subscriptions, and payroll income.  This is a beta field, available to all users.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T20:55:29.933887Z[Etc/UTC]")
public class Recurrence {
  public static final String SERIALIZED_NAME_IS_RECURRING = "is_recurring";
  @SerializedName(SERIALIZED_NAME_IS_RECURRING)
  private Boolean isRecurring;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private RecurringFrequency frequency;


  public Recurrence isRecurring(Boolean isRecurring) {
    
    this.isRecurring = isRecurring;
    return this;
  }

   /**
   * Whether or not the transaction is periodically recurring.
   * @return isRecurring
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the transaction is periodically recurring.")

  public Boolean getIsRecurring() {
    return isRecurring;
  }


  public void setIsRecurring(Boolean isRecurring) {
    this.isRecurring = isRecurring;
  }


  public Recurrence frequency(RecurringFrequency frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecurringFrequency getFrequency() {
    return frequency;
  }


  public void setFrequency(RecurringFrequency frequency) {
    this.frequency = frequency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recurrence recurrence = (Recurrence) o;
    return Objects.equals(this.isRecurring, recurrence.isRecurring) &&
        Objects.equals(this.frequency, recurrence.frequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isRecurring, frequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recurrence {\n");
    sb.append("    isRecurring: ").append(toIndentedString(isRecurring)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
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

}

