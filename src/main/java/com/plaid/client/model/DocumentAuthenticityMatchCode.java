/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.128.4
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
 * High level summary of whether the document in the provided image matches the formatting rules and security checks for the associated jurisdiction.  For example, most identity documents have formatting rules like the following:   The image of the person&#39;s face must have a certain contrast in order to highlight skin tone   The subject in the document&#39;s image must remove eye glasses and pose in a certain way   The informational fields (name, date of birth, ID number, etc.) must be colored and aligned according to specific rules   Security features like watermarks and background patterns must be present  So a &#x60;match&#x60; status for this field indicates that the document in the provided image seems to conform to the various formatting and security rules associated with the detected document.
 */
@JsonAdapter(DocumentAuthenticityMatchCode.Adapter.class)
public enum DocumentAuthenticityMatchCode {
  
  MATCH("match"),
  
  PARTIAL_MATCH("partial_match"),
  
  NO_MATCH("no_match"),
  
  NO_DATA("no_data"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  DocumentAuthenticityMatchCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DocumentAuthenticityMatchCode fromValue(String value) {
    for (DocumentAuthenticityMatchCode b : DocumentAuthenticityMatchCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return DocumentAuthenticityMatchCode.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<DocumentAuthenticityMatchCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final DocumentAuthenticityMatchCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DocumentAuthenticityMatchCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DocumentAuthenticityMatchCode.fromValue(value);
    }
  }
}

