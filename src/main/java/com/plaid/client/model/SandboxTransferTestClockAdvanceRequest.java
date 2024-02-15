/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.496.0
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
import java.time.OffsetDateTime;

/**
 * Defines the request schema for &#x60;/sandbox/transfer/test_clock/advance&#x60;
 */
@ApiModel(description = "Defines the request schema for `/sandbox/transfer/test_clock/advance`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-15T20:08:18.129993Z[Etc/UTC]")
public class SandboxTransferTestClockAdvanceRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_TEST_CLOCK_ID = "test_clock_id";
  @SerializedName(SERIALIZED_NAME_TEST_CLOCK_ID)
  private String testClockId;

  public static final String SERIALIZED_NAME_NEW_VIRTUAL_TIME = "new_virtual_time";
  @SerializedName(SERIALIZED_NAME_NEW_VIRTUAL_TIME)
  private OffsetDateTime newVirtualTime;


  public SandboxTransferTestClockAdvanceRequest clientId(String clientId) {
    
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


  public SandboxTransferTestClockAdvanceRequest secret(String secret) {
    
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


  public SandboxTransferTestClockAdvanceRequest testClockId(String testClockId) {
    
    this.testClockId = testClockId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a test clock.
   * @return testClockId
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for a test clock.")

  public String getTestClockId() {
    return testClockId;
  }


  public void setTestClockId(String testClockId) {
    this.testClockId = testClockId;
  }


  public SandboxTransferTestClockAdvanceRequest newVirtualTime(OffsetDateTime newVirtualTime) {
    
    this.newVirtualTime = newVirtualTime;
    return this;
  }

   /**
   * The virtual timestamp on the test clock. This will be of the form &#x60;2006-01-02T15:04:05Z&#x60;.
   * @return newVirtualTime
  **/
  @ApiModelProperty(required = true, value = "The virtual timestamp on the test clock. This will be of the form `2006-01-02T15:04:05Z`.")

  public OffsetDateTime getNewVirtualTime() {
    return newVirtualTime;
  }


  public void setNewVirtualTime(OffsetDateTime newVirtualTime) {
    this.newVirtualTime = newVirtualTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxTransferTestClockAdvanceRequest sandboxTransferTestClockAdvanceRequest = (SandboxTransferTestClockAdvanceRequest) o;
    return Objects.equals(this.clientId, sandboxTransferTestClockAdvanceRequest.clientId) &&
        Objects.equals(this.secret, sandboxTransferTestClockAdvanceRequest.secret) &&
        Objects.equals(this.testClockId, sandboxTransferTestClockAdvanceRequest.testClockId) &&
        Objects.equals(this.newVirtualTime, sandboxTransferTestClockAdvanceRequest.newVirtualTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, testClockId, newVirtualTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxTransferTestClockAdvanceRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    testClockId: ").append(toIndentedString(testClockId)).append("\n");
    sb.append("    newVirtualTime: ").append(toIndentedString(newVirtualTime)).append("\n");
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

