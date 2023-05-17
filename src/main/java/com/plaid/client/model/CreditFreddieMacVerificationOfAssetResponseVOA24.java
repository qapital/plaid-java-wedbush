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
import com.plaid.client.model.CreditFreddieMacAssetsVOA24;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Documentation not found in the MISMO model viewer and not provided by Freddie Mac.
 */
@ApiModel(description = "Documentation not found in the MISMO model viewer and not provided by Freddie Mac.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-17T20:31:05.704177Z[Etc/UTC]")
public class CreditFreddieMacVerificationOfAssetResponseVOA24 {
  public static final String SERIALIZED_NAME_A_S_S_E_T_S = "ASSETS";
  @SerializedName(SERIALIZED_NAME_A_S_S_E_T_S)
  private CreditFreddieMacAssetsVOA24 ASSETS;


  public CreditFreddieMacVerificationOfAssetResponseVOA24 ASSETS(CreditFreddieMacAssetsVOA24 ASSETS) {
    
    this.ASSETS = ASSETS;
    return this;
  }

   /**
   * Get ASSETS
   * @return ASSETS
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditFreddieMacAssetsVOA24 getASSETS() {
    return ASSETS;
  }


  public void setASSETS(CreditFreddieMacAssetsVOA24 ASSETS) {
    this.ASSETS = ASSETS;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditFreddieMacVerificationOfAssetResponseVOA24 creditFreddieMacVerificationOfAssetResponseVOA24 = (CreditFreddieMacVerificationOfAssetResponseVOA24) o;
    return Objects.equals(this.ASSETS, creditFreddieMacVerificationOfAssetResponseVOA24.ASSETS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ASSETS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditFreddieMacVerificationOfAssetResponseVOA24 {\n");
    sb.append("    ASSETS: ").append(toIndentedString(ASSETS)).append("\n");
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

