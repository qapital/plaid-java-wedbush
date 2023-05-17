/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.370.0
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
 * Valid account subtypes for loan accounts. For a list containing descriptions of each subtype, see [Account schemas](https://plaid.com/docs/api/accounts/#StandaloneAccountType-loan).
 */
@JsonAdapter(LoanAccountSubtype.Adapter.class)
public enum LoanAccountSubtype {
  
  AUTO("auto"),
  
  BUSINESS("business"),
  
  COMMERCIAL("commercial"),
  
  CONSTRUCTION("construction"),
  
  CONSUMER("consumer"),
  
  HOME_EQUITY("home equity"),
  
  LOAN("loan"),
  
  MORTGAGE("mortgage"),
  
  LINE_OF_CREDIT("line of credit"),
  
  STUDENT("student"),
  
  OTHER("other"),
  
  ALL("all"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  LoanAccountSubtype(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LoanAccountSubtype fromValue(String value) {
    for (LoanAccountSubtype b : LoanAccountSubtype.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return LoanAccountSubtype.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<LoanAccountSubtype> {
    @Override
    public void write(final JsonWriter jsonWriter, final LoanAccountSubtype enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LoanAccountSubtype read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LoanAccountSubtype.fromValue(value);
    }
  }
}

