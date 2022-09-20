/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.177.1
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
 * The current status of the transaction stream.  &#x60;MATURE&#x60;: A &#x60;MATURE&#x60; recurring stream should have at least 3 transactions and happen on a regular cadence.  &#x60;EARLY_DETECTION&#x60;: When a recurring transaction first appears in the transaction history and before it fulfills the requirement of a mature stream, the status will be &#x60;EARLY_DETECTION&#x60;.  &#x60;TOMBSTONED&#x60;: A stream that was previously in the &#x60;EARLY_DETECTION&#x60; status will move to the &#x60;TOMBSTONED&#x60; status when no further transactions were found at the next expected date.  &#x60;UNKNOWN&#x60;: A stream is assigned an &#x60;UNKNOWN&#x60; status when none of the other statuses are applicable.
 */
@JsonAdapter(TransactionStreamStatus.Adapter.class)
public enum TransactionStreamStatus {
  
  UNKNOWN("UNKNOWN"),
  
  MATURE("MATURE"),
  
  EARLY_DETECTION("EARLY_DETECTION"),
  
  TOMBSTONED("TOMBSTONED"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  TransactionStreamStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransactionStreamStatus fromValue(String value) {
    for (TransactionStreamStatus b : TransactionStreamStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return TransactionStreamStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<TransactionStreamStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransactionStreamStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransactionStreamStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransactionStreamStatus.fromValue(value);
    }
  }
}

