/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.406.1
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
import com.plaid.client.model.SignalEvaluateCoreAttributes;
import com.plaid.client.model.SignalScores;
import com.plaid.client.model.SignalWarning;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ProcessorSignalEvaluateResponse defines the response schema for &#x60;/processor/signal/evaluate&#x60;
 */
@ApiModel(description = "ProcessorSignalEvaluateResponse defines the response schema for `/processor/signal/evaluate`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-10T22:39:54.038561Z[Etc/UTC]")
public class ProcessorSignalEvaluateResponse {
  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_SCORES = "scores";
  @SerializedName(SERIALIZED_NAME_SCORES)
  private SignalScores scores;

  public static final String SERIALIZED_NAME_CORE_ATTRIBUTES = "core_attributes";
  @SerializedName(SERIALIZED_NAME_CORE_ATTRIBUTES)
  private SignalEvaluateCoreAttributes coreAttributes;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<SignalWarning> warnings = null;


  public ProcessorSignalEvaluateResponse requestId(String requestId) {
    
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


  public ProcessorSignalEvaluateResponse scores(SignalScores scores) {
    
    this.scores = scores;
    return this;
  }

   /**
   * Get scores
   * @return scores
  **/
  @ApiModelProperty(required = true, value = "")

  public SignalScores getScores() {
    return scores;
  }


  public void setScores(SignalScores scores) {
    this.scores = scores;
  }


  public ProcessorSignalEvaluateResponse coreAttributes(SignalEvaluateCoreAttributes coreAttributes) {
    
    this.coreAttributes = coreAttributes;
    return this;
  }

   /**
   * Get coreAttributes
   * @return coreAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SignalEvaluateCoreAttributes getCoreAttributes() {
    return coreAttributes;
  }


  public void setCoreAttributes(SignalEvaluateCoreAttributes coreAttributes) {
    this.coreAttributes = coreAttributes;
  }


  public ProcessorSignalEvaluateResponse warnings(List<SignalWarning> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public ProcessorSignalEvaluateResponse addWarningsItem(SignalWarning warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * If bank information was not available to be used in the Signal model, this array contains warnings describing why bank data is missing. If you want to receive an API error instead of Signal scores in the case of missing bank data, file a support ticket or contact your Plaid account manager.
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If bank information was not available to be used in the Signal model, this array contains warnings describing why bank data is missing. If you want to receive an API error instead of Signal scores in the case of missing bank data, file a support ticket or contact your Plaid account manager.")

  public List<SignalWarning> getWarnings() {
    return warnings;
  }


  public void setWarnings(List<SignalWarning> warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorSignalEvaluateResponse processorSignalEvaluateResponse = (ProcessorSignalEvaluateResponse) o;
    return Objects.equals(this.requestId, processorSignalEvaluateResponse.requestId) &&
        Objects.equals(this.scores, processorSignalEvaluateResponse.scores) &&
        Objects.equals(this.coreAttributes, processorSignalEvaluateResponse.coreAttributes) &&
        Objects.equals(this.warnings, processorSignalEvaluateResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, scores, coreAttributes, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorSignalEvaluateResponse {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    scores: ").append(toIndentedString(scores)).append("\n");
    sb.append("    coreAttributes: ").append(toIndentedString(coreAttributes)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

