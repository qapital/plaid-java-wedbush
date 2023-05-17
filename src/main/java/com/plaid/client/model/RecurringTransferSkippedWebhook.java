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
import com.plaid.client.model.TransferAuthorizationDecision;
import com.plaid.client.model.TransferAuthorizationDecisionRationaleCode;
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Fired when Plaid is unable to originate a new ACH transaction of the recurring transfer on the planned date.
 */
@ApiModel(description = "Fired when Plaid is unable to originate a new ACH transaction of the recurring transfer on the planned date.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-17T20:31:05.704177Z[Etc/UTC]")
public class RecurringTransferSkippedWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_RECURRING_TRANSFER_ID = "recurring_transfer_id";
  @SerializedName(SERIALIZED_NAME_RECURRING_TRANSFER_ID)
  private String recurringTransferId;

  public static final String SERIALIZED_NAME_AUTHORIZATION_DECISION = "authorization_decision";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_DECISION)
  private TransferAuthorizationDecision authorizationDecision;

  public static final String SERIALIZED_NAME_AUTHORIZATION_DECISION_RATIONALE_CODE = "authorization_decision_rationale_code";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_DECISION_RATIONALE_CODE)
  private TransferAuthorizationDecisionRationaleCode authorizationDecisionRationaleCode;

  public static final String SERIALIZED_NAME_SKIPPED_ORIGINATION_DATE = "skipped_origination_date";
  @SerializedName(SERIALIZED_NAME_SKIPPED_ORIGINATION_DATE)
  private LocalDate skippedOriginationDate;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public RecurringTransferSkippedWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;TRANSFER&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`TRANSFER`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public RecurringTransferSkippedWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;RECURRING_TRANSFER_SKIPPED&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`RECURRING_TRANSFER_SKIPPED`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public RecurringTransferSkippedWebhook recurringTransferId(String recurringTransferId) {
    
    this.recurringTransferId = recurringTransferId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a recurring transfer.
   * @return recurringTransferId
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for a recurring transfer.")

  public String getRecurringTransferId() {
    return recurringTransferId;
  }


  public void setRecurringTransferId(String recurringTransferId) {
    this.recurringTransferId = recurringTransferId;
  }


  public RecurringTransferSkippedWebhook authorizationDecision(TransferAuthorizationDecision authorizationDecision) {
    
    this.authorizationDecision = authorizationDecision;
    return this;
  }

   /**
   * Get authorizationDecision
   * @return authorizationDecision
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferAuthorizationDecision getAuthorizationDecision() {
    return authorizationDecision;
  }


  public void setAuthorizationDecision(TransferAuthorizationDecision authorizationDecision) {
    this.authorizationDecision = authorizationDecision;
  }


  public RecurringTransferSkippedWebhook authorizationDecisionRationaleCode(TransferAuthorizationDecisionRationaleCode authorizationDecisionRationaleCode) {
    
    this.authorizationDecisionRationaleCode = authorizationDecisionRationaleCode;
    return this;
  }

   /**
   * Get authorizationDecisionRationaleCode
   * @return authorizationDecisionRationaleCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransferAuthorizationDecisionRationaleCode getAuthorizationDecisionRationaleCode() {
    return authorizationDecisionRationaleCode;
  }


  public void setAuthorizationDecisionRationaleCode(TransferAuthorizationDecisionRationaleCode authorizationDecisionRationaleCode) {
    this.authorizationDecisionRationaleCode = authorizationDecisionRationaleCode;
  }


  public RecurringTransferSkippedWebhook skippedOriginationDate(LocalDate skippedOriginationDate) {
    
    this.skippedOriginationDate = skippedOriginationDate;
    return this;
  }

   /**
   * The planned date on which Plaid is unable to originate a new ACH transaction of the recurring transfer. This will be of the form YYYY-MM-DD.
   * @return skippedOriginationDate
  **/
  @ApiModelProperty(required = true, value = "The planned date on which Plaid is unable to originate a new ACH transaction of the recurring transfer. This will be of the form YYYY-MM-DD.")

  public LocalDate getSkippedOriginationDate() {
    return skippedOriginationDate;
  }


  public void setSkippedOriginationDate(LocalDate skippedOriginationDate) {
    this.skippedOriginationDate = skippedOriginationDate;
  }


  public RecurringTransferSkippedWebhook environment(WebhookEnvironmentValues environment) {
    
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
    RecurringTransferSkippedWebhook recurringTransferSkippedWebhook = (RecurringTransferSkippedWebhook) o;
    return Objects.equals(this.webhookType, recurringTransferSkippedWebhook.webhookType) &&
        Objects.equals(this.webhookCode, recurringTransferSkippedWebhook.webhookCode) &&
        Objects.equals(this.recurringTransferId, recurringTransferSkippedWebhook.recurringTransferId) &&
        Objects.equals(this.authorizationDecision, recurringTransferSkippedWebhook.authorizationDecision) &&
        Objects.equals(this.authorizationDecisionRationaleCode, recurringTransferSkippedWebhook.authorizationDecisionRationaleCode) &&
        Objects.equals(this.skippedOriginationDate, recurringTransferSkippedWebhook.skippedOriginationDate) &&
        Objects.equals(this.environment, recurringTransferSkippedWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, recurringTransferId, authorizationDecision, authorizationDecisionRationaleCode, skippedOriginationDate, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringTransferSkippedWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    recurringTransferId: ").append(toIndentedString(recurringTransferId)).append("\n");
    sb.append("    authorizationDecision: ").append(toIndentedString(authorizationDecision)).append("\n");
    sb.append("    authorizationDecisionRationaleCode: ").append(toIndentedString(authorizationDecisionRationaleCode)).append("\n");
    sb.append("    skippedOriginationDate: ").append(toIndentedString(skippedOriginationDate)).append("\n");
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

