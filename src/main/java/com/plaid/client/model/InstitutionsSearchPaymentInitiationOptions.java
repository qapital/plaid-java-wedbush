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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Additional options that will be used to filter institutions by various Payment Initiation configurations.
 */
@ApiModel(description = "Additional options that will be used to filter institutions by various Payment Initiation configurations.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T20:55:29.933887Z[Etc/UTC]")
public class InstitutionsSearchPaymentInitiationOptions {
  public static final String SERIALIZED_NAME_PAYMENT_ID = "payment_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
  private String paymentId;

  public static final String SERIALIZED_NAME_CONSENT_ID = "consent_id";
  @SerializedName(SERIALIZED_NAME_CONSENT_ID)
  private String consentId;


  public InstitutionsSearchPaymentInitiationOptions paymentId(String paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

   /**
   * A unique ID identifying the payment
   * @return paymentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique ID identifying the payment")

  public String getPaymentId() {
    return paymentId;
  }


  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  public InstitutionsSearchPaymentInitiationOptions consentId(String consentId) {
    
    this.consentId = consentId;
    return this;
  }

   /**
   * A unique ID identifying the payment consent
   * @return consentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique ID identifying the payment consent")

  public String getConsentId() {
    return consentId;
  }


  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionsSearchPaymentInitiationOptions institutionsSearchPaymentInitiationOptions = (InstitutionsSearchPaymentInitiationOptions) o;
    return Objects.equals(this.paymentId, institutionsSearchPaymentInitiationOptions.paymentId) &&
        Objects.equals(this.consentId, institutionsSearchPaymentInitiationOptions.consentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, consentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionsSearchPaymentInitiationOptions {\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
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

