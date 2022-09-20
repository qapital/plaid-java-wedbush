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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.DocumentRiskSignal;
import com.plaid.client.model.RiskSignalDocumentReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Object containing risk signals and relevant metadata for a set of uploaded documents
 */
@ApiModel(description = "Object containing risk signals and relevant metadata for a set of uploaded documents")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-20T04:12:52.507993Z[Etc/UTC]")
public class MultiDocumentRiskSignal {
  public static final String SERIALIZED_NAME_DOCUMENT_REFERENCES = "document_references";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_REFERENCES)
  private List<RiskSignalDocumentReference> documentReferences = new ArrayList<>();

  public static final String SERIALIZED_NAME_RISK_SIGNALS = "risk_signals";
  @SerializedName(SERIALIZED_NAME_RISK_SIGNALS)
  private List<DocumentRiskSignal> riskSignals = new ArrayList<>();


  public MultiDocumentRiskSignal documentReferences(List<RiskSignalDocumentReference> documentReferences) {
    
    this.documentReferences = documentReferences;
    return this;
  }

  public MultiDocumentRiskSignal addDocumentReferencesItem(RiskSignalDocumentReference documentReferencesItem) {
    this.documentReferences.add(documentReferencesItem);
    return this;
  }

   /**
   * Array of objects containing attributes that could indicate if a document is fraudulent
   * @return documentReferences
  **/
  @ApiModelProperty(required = true, value = "Array of objects containing attributes that could indicate if a document is fraudulent")

  public List<RiskSignalDocumentReference> getDocumentReferences() {
    return documentReferences;
  }


  public void setDocumentReferences(List<RiskSignalDocumentReference> documentReferences) {
    this.documentReferences = documentReferences;
  }


  public MultiDocumentRiskSignal riskSignals(List<DocumentRiskSignal> riskSignals) {
    
    this.riskSignals = riskSignals;
    return this;
  }

  public MultiDocumentRiskSignal addRiskSignalsItem(DocumentRiskSignal riskSignalsItem) {
    this.riskSignals.add(riskSignalsItem);
    return this;
  }

   /**
   * Array of attributes that indicate whether or not there is fraud risk with a set of documents
   * @return riskSignals
  **/
  @ApiModelProperty(required = true, value = "Array of attributes that indicate whether or not there is fraud risk with a set of documents")

  public List<DocumentRiskSignal> getRiskSignals() {
    return riskSignals;
  }


  public void setRiskSignals(List<DocumentRiskSignal> riskSignals) {
    this.riskSignals = riskSignals;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiDocumentRiskSignal multiDocumentRiskSignal = (MultiDocumentRiskSignal) o;
    return Objects.equals(this.documentReferences, multiDocumentRiskSignal.documentReferences) &&
        Objects.equals(this.riskSignals, multiDocumentRiskSignal.riskSignals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentReferences, riskSignals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiDocumentRiskSignal {\n");
    sb.append("    documentReferences: ").append(toIndentedString(documentReferences)).append("\n");
    sb.append("    riskSignals: ").append(toIndentedString(riskSignals)).append("\n");
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

