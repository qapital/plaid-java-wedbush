/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.503.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Status of the Bank Income Link session.  &#x60;APPROVED&#x60;: User has approved and verified their income  &#x60;NO_DEPOSITS_FOUND&#x60;: We attempted, but were unable to find any income in the connected account.  &#x60;USER_REPORTED_NO_INCOME&#x60;: The user explicitly indicated that they don&#39;t receive income in the connected account.  &#x60;STARTED&#x60;: The user began the bank income portion of the link flow.  &#x60;INTERNAL_ERROR&#x60;: The user encountered an internal error.
 */
@JsonAdapter(CreditSessionBankIncomeStatus.Adapter.class)
public enum CreditSessionBankIncomeStatus {
  
  APPROVED("APPROVED"),
  
  NO_DEPOSITS_FOUND("NO_DEPOSITS_FOUND"),
  
  USER_REPORTED_NO_INCOME("USER_REPORTED_NO_INCOME"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  CreditSessionBankIncomeStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreditSessionBankIncomeStatus fromValue(String value) {
    for (CreditSessionBankIncomeStatus b : CreditSessionBankIncomeStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return CreditSessionBankIncomeStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<CreditSessionBankIncomeStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreditSessionBankIncomeStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreditSessionBankIncomeStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreditSessionBankIncomeStatus.fromValue(value);
    }
  }
}

