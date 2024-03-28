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
import com.plaid.client.model.AssetReportPDFGetRequestOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AssetReportPDFGetRequest defines the request schema for &#x60;/asset_report/pdf/get&#x60;
 */
@ApiModel(description = "AssetReportPDFGetRequest defines the request schema for `/asset_report/pdf/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T21:00:55.745394Z[Etc/UTC]")
public class AssetReportPDFGetRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_ASSET_REPORT_TOKEN = "asset_report_token";
  @SerializedName(SERIALIZED_NAME_ASSET_REPORT_TOKEN)
  private String assetReportToken;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private AssetReportPDFGetRequestOptions options;


  public AssetReportPDFGetRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public AssetReportPDFGetRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public AssetReportPDFGetRequest assetReportToken(String assetReportToken) {
    
    this.assetReportToken = assetReportToken;
    return this;
  }

   /**
   * A token that can be provided to endpoints such as &#x60;/asset_report/get&#x60; or &#x60;/asset_report/pdf/get&#x60; to fetch or update an Asset Report.
   * @return assetReportToken
  **/
  @ApiModelProperty(required = true, value = "A token that can be provided to endpoints such as `/asset_report/get` or `/asset_report/pdf/get` to fetch or update an Asset Report.")

  public String getAssetReportToken() {
    return assetReportToken;
  }


  public void setAssetReportToken(String assetReportToken) {
    this.assetReportToken = assetReportToken;
  }


  public AssetReportPDFGetRequest options(AssetReportPDFGetRequestOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AssetReportPDFGetRequestOptions getOptions() {
    return options;
  }


  public void setOptions(AssetReportPDFGetRequestOptions options) {
    this.options = options;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReportPDFGetRequest assetReportPDFGetRequest = (AssetReportPDFGetRequest) o;
    return Objects.equals(this.clientId, assetReportPDFGetRequest.clientId) &&
        Objects.equals(this.secret, assetReportPDFGetRequest.secret) &&
        Objects.equals(this.assetReportToken, assetReportPDFGetRequest.assetReportToken) &&
        Objects.equals(this.options, assetReportPDFGetRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, assetReportToken, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReportPDFGetRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    assetReportToken: ").append(toIndentedString(assetReportToken)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

