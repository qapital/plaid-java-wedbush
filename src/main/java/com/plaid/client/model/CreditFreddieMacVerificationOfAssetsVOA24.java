/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.370.0
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
import com.plaid.client.model.CreditFreddieMacVerificationOfAssetsDealVOA24;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Verification of Assets Report
 */
@ApiModel(description = "Verification of Assets Report")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-17T20:31:05.704177Z[Etc/UTC]")
public class CreditFreddieMacVerificationOfAssetsVOA24 {
  public static final String SERIALIZED_NAME_D_E_A_L = "DEAL";
  @SerializedName(SERIALIZED_NAME_D_E_A_L)
  private CreditFreddieMacVerificationOfAssetsDealVOA24 DEAL;

  public static final String SERIALIZED_NAME_SCHEMA_VERSION = "SchemaVersion";
  @SerializedName(SERIALIZED_NAME_SCHEMA_VERSION)
  private Double schemaVersion;


  public CreditFreddieMacVerificationOfAssetsVOA24 DEAL(CreditFreddieMacVerificationOfAssetsDealVOA24 DEAL) {
    
    this.DEAL = DEAL;
    return this;
  }

   /**
   * Get DEAL
   * @return DEAL
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditFreddieMacVerificationOfAssetsDealVOA24 getDEAL() {
    return DEAL;
  }


  public void setDEAL(CreditFreddieMacVerificationOfAssetsDealVOA24 DEAL) {
    this.DEAL = DEAL;
  }


  public CreditFreddieMacVerificationOfAssetsVOA24 schemaVersion(Double schemaVersion) {
    
    this.schemaVersion = schemaVersion;
    return this;
  }

   /**
   * The Verification Of Assets (VOA) schema version.
   * @return schemaVersion
  **/
  @ApiModelProperty(required = true, value = "The Verification Of Assets (VOA) schema version.")

  public Double getSchemaVersion() {
    return schemaVersion;
  }


  public void setSchemaVersion(Double schemaVersion) {
    this.schemaVersion = schemaVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditFreddieMacVerificationOfAssetsVOA24 creditFreddieMacVerificationOfAssetsVOA24 = (CreditFreddieMacVerificationOfAssetsVOA24) o;
    return Objects.equals(this.DEAL, creditFreddieMacVerificationOfAssetsVOA24.DEAL) &&
        Objects.equals(this.schemaVersion, creditFreddieMacVerificationOfAssetsVOA24.schemaVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(DEAL, schemaVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditFreddieMacVerificationOfAssetsVOA24 {\n");
    sb.append("    DEAL: ").append(toIndentedString(DEAL)).append("\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
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

