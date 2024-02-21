/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.496.2
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
import com.plaid.client.model.PlaidError;
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * This webhook is only sent to [Plaid processor partners](https://plaid.com/docs/auth/partnerships/).  Fired when an Item&#39;s historical transaction pull is completed and Plaid has prepared as much historical transaction data as possible for the Item. Once this webhook has been fired, transaction data beyond the most recent 30 days can be fetched for the Item. If [Account Select v2](https://plaid.com/docs/link/customization/#account-select) is enabled, this webhook will also be fired if account selections for the Item are updated, with &#x60;new_transactions&#x60; set to the number of net new transactions pulled after the account selection update.  This webhook is intended for use with &#x60;/processor/transactions/get&#x60;; if you are using the newer &#x60;/processor/transactions/sync&#x60; endpoint, this webhook will still be fired to maintain backwards compatibility, but it is recommended to listen for and respond to the &#x60;SYNC_UPDATES_AVAILABLE&#x60; webhook instead.
 */
@ApiModel(description = "This webhook is only sent to [Plaid processor partners](https://plaid.com/docs/auth/partnerships/).  Fired when an Item's historical transaction pull is completed and Plaid has prepared as much historical transaction data as possible for the Item. Once this webhook has been fired, transaction data beyond the most recent 30 days can be fetched for the Item. If [Account Select v2](https://plaid.com/docs/link/customization/#account-select) is enabled, this webhook will also be fired if account selections for the Item are updated, with `new_transactions` set to the number of net new transactions pulled after the account selection update.  This webhook is intended for use with `/processor/transactions/get`; if you are using the newer `/processor/transactions/sync` endpoint, this webhook will still be fired to maintain backwards compatibility, but it is recommended to listen for and respond to the `SYNC_UPDATES_AVAILABLE` webhook instead.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T20:55:29.933887Z[Etc/UTC]")
public class ProcessorHistoricalUpdateWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private PlaidError error;

  public static final String SERIALIZED_NAME_NEW_TRANSACTIONS = "new_transactions";
  @SerializedName(SERIALIZED_NAME_NEW_TRANSACTIONS)
  private Double newTransactions;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public ProcessorHistoricalUpdateWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;TRANSACTIONS&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`TRANSACTIONS`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public ProcessorHistoricalUpdateWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;HISTORICAL_UPDATE&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`HISTORICAL_UPDATE`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public ProcessorHistoricalUpdateWebhook error(PlaidError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PlaidError getError() {
    return error;
  }


  public void setError(PlaidError error) {
    this.error = error;
  }


  public ProcessorHistoricalUpdateWebhook newTransactions(Double newTransactions) {
    
    this.newTransactions = newTransactions;
    return this;
  }

   /**
   * The number of new, unfetched transactions available
   * @return newTransactions
  **/
  @ApiModelProperty(required = true, value = "The number of new, unfetched transactions available")

  public Double getNewTransactions() {
    return newTransactions;
  }


  public void setNewTransactions(Double newTransactions) {
    this.newTransactions = newTransactions;
  }


  public ProcessorHistoricalUpdateWebhook accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The ID of the account.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public ProcessorHistoricalUpdateWebhook environment(WebhookEnvironmentValues environment) {
    
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
    ProcessorHistoricalUpdateWebhook processorHistoricalUpdateWebhook = (ProcessorHistoricalUpdateWebhook) o;
    return Objects.equals(this.webhookType, processorHistoricalUpdateWebhook.webhookType) &&
        Objects.equals(this.webhookCode, processorHistoricalUpdateWebhook.webhookCode) &&
        Objects.equals(this.error, processorHistoricalUpdateWebhook.error) &&
        Objects.equals(this.newTransactions, processorHistoricalUpdateWebhook.newTransactions) &&
        Objects.equals(this.accountId, processorHistoricalUpdateWebhook.accountId) &&
        Objects.equals(this.environment, processorHistoricalUpdateWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, error, newTransactions, accountId, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorHistoricalUpdateWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    newTransactions: ").append(toIndentedString(newTransactions)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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

