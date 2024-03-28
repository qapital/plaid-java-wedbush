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
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Fires when an account is automatically verified using micro-deposits
 */
@ApiModel(description = "Fires when an account is automatically verified using micro-deposits")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T21:00:55.745394Z[Etc/UTC]")
public class FallbackAuthMicrodepositAutoVerifiedWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public FallbackAuthMicrodepositAutoVerifiedWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;AUTH&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`AUTH`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public FallbackAuthMicrodepositAutoVerifiedWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;AUTOMATICALLY_VERIFIED&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`AUTOMATICALLY_VERIFIED`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public FallbackAuthMicrodepositAutoVerifiedWebhook error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * The error code associated with the webhook.
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The error code associated with the webhook.")

  public String getError() {
    return error;
  }


  public void setError(String error) {
    this.error = error;
  }


  public FallbackAuthMicrodepositAutoVerifiedWebhook accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The external account ID associated with the micro-deposit
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The external account ID associated with the micro-deposit")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public FallbackAuthMicrodepositAutoVerifiedWebhook itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "The `item_id` of the Item associated with this webhook, warning, or error")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public FallbackAuthMicrodepositAutoVerifiedWebhook environment(WebhookEnvironmentValues environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @ApiModelProperty(required = true, value = "")

  public WebhookEnvironmentValues getEnvironment() {
    return environment;
  }


  public void setEnvironment(WebhookEnvironmentValues environment) {
    this.environment = environment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FallbackAuthMicrodepositAutoVerifiedWebhook fallbackAuthMicrodepositAutoVerifiedWebhook = (FallbackAuthMicrodepositAutoVerifiedWebhook) o;
    return Objects.equals(this.webhookType, fallbackAuthMicrodepositAutoVerifiedWebhook.webhookType) &&
        Objects.equals(this.webhookCode, fallbackAuthMicrodepositAutoVerifiedWebhook.webhookCode) &&
        Objects.equals(this.error, fallbackAuthMicrodepositAutoVerifiedWebhook.error) &&
        Objects.equals(this.accountId, fallbackAuthMicrodepositAutoVerifiedWebhook.accountId) &&
        Objects.equals(this.itemId, fallbackAuthMicrodepositAutoVerifiedWebhook.itemId) &&
        Objects.equals(this.environment, fallbackAuthMicrodepositAutoVerifiedWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, error, accountId, itemId, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FallbackAuthMicrodepositAutoVerifiedWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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

