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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ItemAccessTokenInvalidateResponse defines the response schema for &#x60;/item/access_token/invalidate&#x60;
 */
@ApiModel(description = "ItemAccessTokenInvalidateResponse defines the response schema for `/item/access_token/invalidate`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T21:00:55.745394Z[Etc/UTC]")
public class ItemAccessTokenInvalidateResponse {
  public static final String SERIALIZED_NAME_NEW_ACCESS_TOKEN = "new_access_token";
  @SerializedName(SERIALIZED_NAME_NEW_ACCESS_TOKEN)
  private String newAccessToken;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public ItemAccessTokenInvalidateResponse newAccessToken(String newAccessToken) {
    
    this.newAccessToken = newAccessToken;
    return this;
  }

   /**
   * The access token associated with the Item data is being requested for.
   * @return newAccessToken
  **/
  @ApiModelProperty(required = true, value = "The access token associated with the Item data is being requested for.")

  public String getNewAccessToken() {
    return newAccessToken;
  }


  public void setNewAccessToken(String newAccessToken) {
    this.newAccessToken = newAccessToken;
  }


  public ItemAccessTokenInvalidateResponse requestId(String requestId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemAccessTokenInvalidateResponse itemAccessTokenInvalidateResponse = (ItemAccessTokenInvalidateResponse) o;
    return Objects.equals(this.newAccessToken, itemAccessTokenInvalidateResponse.newAccessToken) &&
        Objects.equals(this.requestId, itemAccessTokenInvalidateResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newAccessToken, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemAccessTokenInvalidateResponse {\n");
    sb.append("    newAccessToken: ").append(toIndentedString(newAccessToken)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

