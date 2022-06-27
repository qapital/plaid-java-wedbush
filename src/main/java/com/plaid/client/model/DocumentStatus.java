/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.131.3
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
 * An outcome status for this specific document submission. Distinct from the overall &#x60;documentary_verification.status&#x60; that summarizes the verification outcome from one or more documents.
 */
@JsonAdapter(DocumentStatus.Adapter.class)
public enum DocumentStatus {
  
  SUCCESS("success"),
  
  FAILED("failed"),
  
  MANUALLY_APPROVED("manually_approved"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  DocumentStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DocumentStatus fromValue(String value) {
    for (DocumentStatus b : DocumentStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return DocumentStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<DocumentStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final DocumentStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DocumentStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DocumentStatus.fromValue(value);
    }
  }
}

