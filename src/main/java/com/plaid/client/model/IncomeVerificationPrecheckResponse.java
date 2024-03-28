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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.IncomeVerificationPrecheckConfidence;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IncomeVerificationPrecheckResponse defines the response schema for &#x60;/income/verification/precheck&#x60;.
 */
@ApiModel(description = "IncomeVerificationPrecheckResponse defines the response schema for `/income/verification/precheck`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T21:00:55.745394Z[Etc/UTC]")
public class IncomeVerificationPrecheckResponse {
  public static final String SERIALIZED_NAME_PRECHECK_ID = "precheck_id";
  @SerializedName(SERIALIZED_NAME_PRECHECK_ID)
  private String precheckId;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_CONFIDENCE = "confidence";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE)
  private IncomeVerificationPrecheckConfidence confidence;


  public IncomeVerificationPrecheckResponse precheckId(String precheckId) {
    
    this.precheckId = precheckId;
    return this;
  }

   /**
   * ID of the precheck. Provide this value when calling &#x60;/link/token/create&#x60; in order to optimize Link conversion.
   * @return precheckId
  **/
  @ApiModelProperty(required = true, value = "ID of the precheck. Provide this value when calling `/link/token/create` in order to optimize Link conversion.")

  public String getPrecheckId() {
    return precheckId;
  }


  public void setPrecheckId(String precheckId) {
    this.precheckId = precheckId;
  }


  public IncomeVerificationPrecheckResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public IncomeVerificationPrecheckResponse confidence(IncomeVerificationPrecheckConfidence confidence) {
    
    this.confidence = confidence;
    return this;
  }

   /**
   * Get confidence
   * @return confidence
  **/
  @ApiModelProperty(required = true, value = "")

  public IncomeVerificationPrecheckConfidence getConfidence() {
    return confidence;
  }


  public void setConfidence(IncomeVerificationPrecheckConfidence confidence) {
    this.confidence = confidence;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeVerificationPrecheckResponse incomeVerificationPrecheckResponse = (IncomeVerificationPrecheckResponse) o;
    return Objects.equals(this.precheckId, incomeVerificationPrecheckResponse.precheckId) &&
        Objects.equals(this.requestId, incomeVerificationPrecheckResponse.requestId) &&
        Objects.equals(this.confidence, incomeVerificationPrecheckResponse.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(precheckId, requestId, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeVerificationPrecheckResponse {\n");
    sb.append("    precheckId: ").append(toIndentedString(precheckId)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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

