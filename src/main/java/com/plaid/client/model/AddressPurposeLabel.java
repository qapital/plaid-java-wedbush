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
 * Field describing whether the associated address is being used for commercial or residential purposes.  Note: This value will be &#x60;no_data&#x60; when Plaid does not have sufficient data to determine the address&#39;s use.
 */
@JsonAdapter(AddressPurposeLabel.Adapter.class)
public enum AddressPurposeLabel {
  
  RESIDENTIAL("residential"),
  
  COMMERCIAL("commercial"),
  
  NO_DATA("no_data"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  AddressPurposeLabel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AddressPurposeLabel fromValue(String value) {
    for (AddressPurposeLabel b : AddressPurposeLabel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return AddressPurposeLabel.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<AddressPurposeLabel> {
    @Override
    public void write(final JsonWriter jsonWriter, final AddressPurposeLabel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AddressPurposeLabel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AddressPurposeLabel.fromValue(value);
    }
  }
}

