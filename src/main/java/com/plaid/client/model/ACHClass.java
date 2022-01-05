/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.61.0
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
 * Specifies the use case of the transfer.  Required for transfers on an ACH network.  &#x60;\&quot;arc\&quot;&#x60; - Accounts Receivable Entry  &#x60;\&quot;cbr&#x60;\&quot; - Cross Border Entry  &#x60;\&quot;ccd\&quot;&#x60; - Corporate Credit or Debit - fund transfer between two corporate bank accounts  &#x60;\&quot;cie\&quot;&#x60; - Customer Initiated Entry  &#x60;\&quot;cor\&quot;&#x60; - Automated Notification of Change  &#x60;\&quot;ctx\&quot;&#x60; - Corporate Trade Exchange  &#x60;\&quot;iat\&quot;&#x60; - International  &#x60;\&quot;mte\&quot;&#x60; - Machine Transfer Entry  &#x60;\&quot;pbr\&quot;&#x60; - Cross Border Entry  &#x60;\&quot;pop\&quot;&#x60; - Point-of-Purchase Entry  &#x60;\&quot;pos\&quot;&#x60; - Point-of-Sale Entry  &#x60;\&quot;ppd\&quot;&#x60; - Prearranged Payment or Deposit - the transfer is part of a pre-existing relationship with a consumer, eg. bill payment  &#x60;\&quot;rck\&quot;&#x60; - Re-presented Check Entry  &#x60;\&quot;tel\&quot;&#x60; - Telephone-Initiated Entry  &#x60;\&quot;web\&quot;&#x60; - Internet-Initiated Entry - debits from a consumer’s account where their authorization is obtained over the Internet
 */
@JsonAdapter(ACHClass.Adapter.class)
public enum ACHClass {
  
  ARC("arc"),
  
  CBR("cbr"),
  
  CCD("ccd"),
  
  CIE("cie"),
  
  COR("cor"),
  
  CTX("ctx"),
  
  IAT("iat"),
  
  MTE("mte"),
  
  PBR("pbr"),
  
  POP("pop"),
  
  POS("pos"),
  
  PPD("ppd"),
  
  RCK("rck"),
  
  TEL("tel"),
  
  WEB("web"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  ACHClass(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ACHClass fromValue(String value) {
    for (ACHClass b : ACHClass.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return ACHClass.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<ACHClass> {
    @Override
    public void write(final JsonWriter jsonWriter, final ACHClass enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ACHClass read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ACHClass.fromValue(value);
    }
  }
}

