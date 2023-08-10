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
import com.plaid.client.model.TransferDiligenceStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Originator and their status.
 */
@ApiModel(description = "Originator and their status.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-10T22:39:54.038561Z[Etc/UTC]")
public class DetailedOriginator {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_TRANSFER_DILIGENCE_STATUS = "transfer_diligence_status";
  @SerializedName(SERIALIZED_NAME_TRANSFER_DILIGENCE_STATUS)
  private TransferDiligenceStatus transferDiligenceStatus;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;


  public DetailedOriginator clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Originator’s client ID.
   * @return clientId
  **/
  @ApiModelProperty(required = true, value = "Originator’s client ID.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public DetailedOriginator transferDiligenceStatus(TransferDiligenceStatus transferDiligenceStatus) {
    
    this.transferDiligenceStatus = transferDiligenceStatus;
    return this;
  }

   /**
   * Get transferDiligenceStatus
   * @return transferDiligenceStatus
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferDiligenceStatus getTransferDiligenceStatus() {
    return transferDiligenceStatus;
  }


  public void setTransferDiligenceStatus(TransferDiligenceStatus transferDiligenceStatus) {
    this.transferDiligenceStatus = transferDiligenceStatus;
  }


  public DetailedOriginator companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(required = true, value = "")

  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedOriginator detailedOriginator = (DetailedOriginator) o;
    return Objects.equals(this.clientId, detailedOriginator.clientId) &&
        Objects.equals(this.transferDiligenceStatus, detailedOriginator.transferDiligenceStatus) &&
        Objects.equals(this.companyName, detailedOriginator.companyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, transferDiligenceStatus, companyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedOriginator {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    transferDiligenceStatus: ").append(toIndentedString(transferDiligenceStatus)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
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

