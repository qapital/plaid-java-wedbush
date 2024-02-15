/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.496.0
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
 * Field describing whether the associated address is a post office box. Will be &#x60;yes&#x60; when a P.O. box is detected, &#x60;no&#x60; when Plaid confirmed the address is not a P.O. box, and &#x60;no_data&#x60; when Plaid was not able to determine if the address is a P.O. box.
 */
@JsonAdapter(POBoxStatus.Adapter.class)
public enum POBoxStatus {
  
  YES("yes"),
  
  NO("no"),
  
  NO_DATA("no_data"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  POBoxStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static POBoxStatus fromValue(String value) {
    for (POBoxStatus b : POBoxStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return POBoxStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<POBoxStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final POBoxStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public POBoxStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return POBoxStatus.fromValue(value);
    }
  }
}

