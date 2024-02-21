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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An optional object containing payment details. If set, a payment risk assessment is performed and returned as AccountsBalanceGetResponsePaymentRiskAssessment.
 */
@ApiModel(description = "An optional object containing payment details. If set, a payment risk assessment is performed and returned as AccountsBalanceGetResponsePaymentRiskAssessment.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T20:55:29.933887Z[Etc/UTC]")
public class AccountsBalanceGetRequestPaymentDetails {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_CLIENT_TRANSACTION_ID = "client_transaction_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_TRANSACTION_ID)
  private String clientTransactionId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_BALANCE_THRESHOLD_PERCENTAGE = "balance_threshold_percentage";
  @SerializedName(SERIALIZED_NAME_BALANCE_THRESHOLD_PERCENTAGE)
  private Integer balanceThresholdPercentage = 90;

  public static final String SERIALIZED_NAME_REQUIRES_REAL_TIME_BALANCE_REFRESH = "requires_real_time_balance_refresh";
  @SerializedName(SERIALIZED_NAME_REQUIRES_REAL_TIME_BALANCE_REFRESH)
  private Boolean requiresRealTimeBalanceRefresh;


  public AccountsBalanceGetRequestPaymentDetails accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The Plaid &#x60;account_id&#x60; of the account that is the funding source for the proposed transaction. The &#x60;account_id&#x60; is returned in the &#x60;/accounts/get&#x60; endpoint as well as the [&#x60;onSuccess&#x60;](/docs/link/ios/#link-ios-onsuccess-linkSuccess-metadata-accounts-id) callback metadata.  This will return an [&#x60;INVALID_ACCOUNT_ID&#x60;](/docs/errors/invalid-input/#invalid_account_id) error if the account has been removed at the bank or if the &#x60;account_id&#x60; is no longer valid.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Plaid `account_id` of the account that is the funding source for the proposed transaction. The `account_id` is returned in the `/accounts/get` endpoint as well as the [`onSuccess`](/docs/link/ios/#link-ios-onsuccess-linkSuccess-metadata-accounts-id) callback metadata.  This will return an [`INVALID_ACCOUNT_ID`](/docs/errors/invalid-input/#invalid_account_id) error if the account has been removed at the bank or if the `account_id` is no longer valid.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AccountsBalanceGetRequestPaymentDetails clientTransactionId(String clientTransactionId) {
    
    this.clientTransactionId = clientTransactionId;
    return this;
  }

   /**
   * The unique ID that you would like to use to refer to this transaction. For your convenience mapping your internal data, you could use your internal identifier for this transaction. The max length for this field is 36 characters.
   * @return clientTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID that you would like to use to refer to this transaction. For your convenience mapping your internal data, you could use your internal identifier for this transaction. The max length for this field is 36 characters.")

  public String getClientTransactionId() {
    return clientTransactionId;
  }


  public void setClientTransactionId(String clientTransactionId) {
    this.clientTransactionId = clientTransactionId;
  }


  public AccountsBalanceGetRequestPaymentDetails amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The transaction amount, in USD (e.g. &#x60;102.05&#x60;)
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The transaction amount, in USD (e.g. `102.05`)")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public AccountsBalanceGetRequestPaymentDetails balanceThresholdPercentage(Integer balanceThresholdPercentage) {
    
    this.balanceThresholdPercentage = balanceThresholdPercentage;
    return this;
  }

   /**
   * The threshold percentage of the account balance used for comparison with the requested ACH debit amount.
   * minimum: 1
   * maximum: 100
   * @return balanceThresholdPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The threshold percentage of the account balance used for comparison with the requested ACH debit amount.")

  public Integer getBalanceThresholdPercentage() {
    return balanceThresholdPercentage;
  }


  public void setBalanceThresholdPercentage(Integer balanceThresholdPercentage) {
    this.balanceThresholdPercentage = balanceThresholdPercentage;
  }


  public AccountsBalanceGetRequestPaymentDetails requiresRealTimeBalanceRefresh(Boolean requiresRealTimeBalanceRefresh) {
    
    this.requiresRealTimeBalanceRefresh = requiresRealTimeBalanceRefresh;
    return this;
  }

   /**
   * A boolean that determines whether the balance has to be refreshed in real time as part of the API call.
   * @return requiresRealTimeBalanceRefresh
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean that determines whether the balance has to be refreshed in real time as part of the API call.")

  public Boolean getRequiresRealTimeBalanceRefresh() {
    return requiresRealTimeBalanceRefresh;
  }


  public void setRequiresRealTimeBalanceRefresh(Boolean requiresRealTimeBalanceRefresh) {
    this.requiresRealTimeBalanceRefresh = requiresRealTimeBalanceRefresh;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsBalanceGetRequestPaymentDetails accountsBalanceGetRequestPaymentDetails = (AccountsBalanceGetRequestPaymentDetails) o;
    return Objects.equals(this.accountId, accountsBalanceGetRequestPaymentDetails.accountId) &&
        Objects.equals(this.clientTransactionId, accountsBalanceGetRequestPaymentDetails.clientTransactionId) &&
        Objects.equals(this.amount, accountsBalanceGetRequestPaymentDetails.amount) &&
        Objects.equals(this.balanceThresholdPercentage, accountsBalanceGetRequestPaymentDetails.balanceThresholdPercentage) &&
        Objects.equals(this.requiresRealTimeBalanceRefresh, accountsBalanceGetRequestPaymentDetails.requiresRealTimeBalanceRefresh);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, clientTransactionId, amount, balanceThresholdPercentage, requiresRealTimeBalanceRefresh);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsBalanceGetRequestPaymentDetails {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    clientTransactionId: ").append(toIndentedString(clientTransactionId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balanceThresholdPercentage: ").append(toIndentedString(balanceThresholdPercentage)).append("\n");
    sb.append("    requiresRealTimeBalanceRefresh: ").append(toIndentedString(requiresRealTimeBalanceRefresh)).append("\n");
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

