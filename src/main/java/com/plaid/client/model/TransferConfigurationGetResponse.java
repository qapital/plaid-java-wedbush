/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.482.3
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
 * Defines the response schema for &#x60;/transfer/configuration/get&#x60;
 */
@ApiModel(description = "Defines the response schema for `/transfer/configuration/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T20:46:47.240587Z[Etc/UTC]")
public class TransferConfigurationGetResponse {
  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_MAX_SINGLE_TRANSFER_AMOUNT = "max_single_transfer_amount";
  @SerializedName(SERIALIZED_NAME_MAX_SINGLE_TRANSFER_AMOUNT)
  private String maxSingleTransferAmount;

  public static final String SERIALIZED_NAME_MAX_SINGLE_TRANSFER_CREDIT_AMOUNT = "max_single_transfer_credit_amount";
  @SerializedName(SERIALIZED_NAME_MAX_SINGLE_TRANSFER_CREDIT_AMOUNT)
  private String maxSingleTransferCreditAmount;

  public static final String SERIALIZED_NAME_MAX_SINGLE_TRANSFER_DEBIT_AMOUNT = "max_single_transfer_debit_amount";
  @SerializedName(SERIALIZED_NAME_MAX_SINGLE_TRANSFER_DEBIT_AMOUNT)
  private String maxSingleTransferDebitAmount;

  public static final String SERIALIZED_NAME_MAX_DAILY_CREDIT_AMOUNT = "max_daily_credit_amount";
  @SerializedName(SERIALIZED_NAME_MAX_DAILY_CREDIT_AMOUNT)
  private String maxDailyCreditAmount;

  public static final String SERIALIZED_NAME_MAX_DAILY_DEBIT_AMOUNT = "max_daily_debit_amount";
  @SerializedName(SERIALIZED_NAME_MAX_DAILY_DEBIT_AMOUNT)
  private String maxDailyDebitAmount;

  public static final String SERIALIZED_NAME_MAX_MONTHLY_AMOUNT = "max_monthly_amount";
  @SerializedName(SERIALIZED_NAME_MAX_MONTHLY_AMOUNT)
  private String maxMonthlyAmount;

  public static final String SERIALIZED_NAME_MAX_MONTHLY_CREDIT_AMOUNT = "max_monthly_credit_amount";
  @SerializedName(SERIALIZED_NAME_MAX_MONTHLY_CREDIT_AMOUNT)
  private String maxMonthlyCreditAmount;

  public static final String SERIALIZED_NAME_MAX_MONTHLY_DEBIT_AMOUNT = "max_monthly_debit_amount";
  @SerializedName(SERIALIZED_NAME_MAX_MONTHLY_DEBIT_AMOUNT)
  private String maxMonthlyDebitAmount;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;


  public TransferConfigurationGetResponse requestId(String requestId) {
    
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


  public TransferConfigurationGetResponse maxSingleTransferAmount(String maxSingleTransferAmount) {
    
    this.maxSingleTransferAmount = maxSingleTransferAmount;
    return this;
  }

   /**
   * The max limit of dollar amount of a single transfer (decimal string with two digits of precision e.g. \&quot;10.00\&quot;).
   * @return maxSingleTransferAmount
  **/
  @ApiModelProperty(required = true, value = "The max limit of dollar amount of a single transfer (decimal string with two digits of precision e.g. \"10.00\").")

  public String getMaxSingleTransferAmount() {
    return maxSingleTransferAmount;
  }


  public void setMaxSingleTransferAmount(String maxSingleTransferAmount) {
    this.maxSingleTransferAmount = maxSingleTransferAmount;
  }


  public TransferConfigurationGetResponse maxSingleTransferCreditAmount(String maxSingleTransferCreditAmount) {
    
    this.maxSingleTransferCreditAmount = maxSingleTransferCreditAmount;
    return this;
  }

   /**
   * The max limit of dollar amount of a single credit transfer (decimal string with two digits of precision e.g. \&quot;10.00\&quot;).
   * @return maxSingleTransferCreditAmount
  **/
  @ApiModelProperty(required = true, value = "The max limit of dollar amount of a single credit transfer (decimal string with two digits of precision e.g. \"10.00\").")

  public String getMaxSingleTransferCreditAmount() {
    return maxSingleTransferCreditAmount;
  }


  public void setMaxSingleTransferCreditAmount(String maxSingleTransferCreditAmount) {
    this.maxSingleTransferCreditAmount = maxSingleTransferCreditAmount;
  }


  public TransferConfigurationGetResponse maxSingleTransferDebitAmount(String maxSingleTransferDebitAmount) {
    
    this.maxSingleTransferDebitAmount = maxSingleTransferDebitAmount;
    return this;
  }

   /**
   * The max limit of dollar amount of a single debit transfer (decimal string with two digits of precision e.g. \&quot;10.00\&quot;).
   * @return maxSingleTransferDebitAmount
  **/
  @ApiModelProperty(required = true, value = "The max limit of dollar amount of a single debit transfer (decimal string with two digits of precision e.g. \"10.00\").")

  public String getMaxSingleTransferDebitAmount() {
    return maxSingleTransferDebitAmount;
  }


  public void setMaxSingleTransferDebitAmount(String maxSingleTransferDebitAmount) {
    this.maxSingleTransferDebitAmount = maxSingleTransferDebitAmount;
  }


  public TransferConfigurationGetResponse maxDailyCreditAmount(String maxDailyCreditAmount) {
    
    this.maxDailyCreditAmount = maxDailyCreditAmount;
    return this;
  }

   /**
   * The max limit of sum of dollar amount of credit transfers in last 24 hours (decimal string with two digits of precision e.g. \&quot;10.00\&quot;).
   * @return maxDailyCreditAmount
  **/
  @ApiModelProperty(required = true, value = "The max limit of sum of dollar amount of credit transfers in last 24 hours (decimal string with two digits of precision e.g. \"10.00\").")

  public String getMaxDailyCreditAmount() {
    return maxDailyCreditAmount;
  }


  public void setMaxDailyCreditAmount(String maxDailyCreditAmount) {
    this.maxDailyCreditAmount = maxDailyCreditAmount;
  }


  public TransferConfigurationGetResponse maxDailyDebitAmount(String maxDailyDebitAmount) {
    
    this.maxDailyDebitAmount = maxDailyDebitAmount;
    return this;
  }

   /**
   * The max limit of sum of dollar amount of debit transfers in last 24 hours (decimal string with two digits of precision e.g. \&quot;10.00\&quot;).
   * @return maxDailyDebitAmount
  **/
  @ApiModelProperty(required = true, value = "The max limit of sum of dollar amount of debit transfers in last 24 hours (decimal string with two digits of precision e.g. \"10.00\").")

  public String getMaxDailyDebitAmount() {
    return maxDailyDebitAmount;
  }


  public void setMaxDailyDebitAmount(String maxDailyDebitAmount) {
    this.maxDailyDebitAmount = maxDailyDebitAmount;
  }


  public TransferConfigurationGetResponse maxMonthlyAmount(String maxMonthlyAmount) {
    
    this.maxMonthlyAmount = maxMonthlyAmount;
    return this;
  }

   /**
   * The max limit of sum of dollar amount of credit and debit transfers in one calendar month (decimal string with two digits of precision e.g. \&quot;10.00\&quot;).
   * @return maxMonthlyAmount
  **/
  @ApiModelProperty(required = true, value = "The max limit of sum of dollar amount of credit and debit transfers in one calendar month (decimal string with two digits of precision e.g. \"10.00\").")

  public String getMaxMonthlyAmount() {
    return maxMonthlyAmount;
  }


  public void setMaxMonthlyAmount(String maxMonthlyAmount) {
    this.maxMonthlyAmount = maxMonthlyAmount;
  }


  public TransferConfigurationGetResponse maxMonthlyCreditAmount(String maxMonthlyCreditAmount) {
    
    this.maxMonthlyCreditAmount = maxMonthlyCreditAmount;
    return this;
  }

   /**
   * The max limit of sum of dollar amount of credit transfers in one calendar month (decimal string with two digits of precision e.g. \&quot;10.00\&quot;).
   * @return maxMonthlyCreditAmount
  **/
  @ApiModelProperty(required = true, value = "The max limit of sum of dollar amount of credit transfers in one calendar month (decimal string with two digits of precision e.g. \"10.00\").")

  public String getMaxMonthlyCreditAmount() {
    return maxMonthlyCreditAmount;
  }


  public void setMaxMonthlyCreditAmount(String maxMonthlyCreditAmount) {
    this.maxMonthlyCreditAmount = maxMonthlyCreditAmount;
  }


  public TransferConfigurationGetResponse maxMonthlyDebitAmount(String maxMonthlyDebitAmount) {
    
    this.maxMonthlyDebitAmount = maxMonthlyDebitAmount;
    return this;
  }

   /**
   * The max limit of sum of dollar amount of debit transfers in one calendar month (decimal string with two digits of precision e.g. \&quot;10.00\&quot;).
   * @return maxMonthlyDebitAmount
  **/
  @ApiModelProperty(required = true, value = "The max limit of sum of dollar amount of debit transfers in one calendar month (decimal string with two digits of precision e.g. \"10.00\").")

  public String getMaxMonthlyDebitAmount() {
    return maxMonthlyDebitAmount;
  }


  public void setMaxMonthlyDebitAmount(String maxMonthlyDebitAmount) {
    this.maxMonthlyDebitAmount = maxMonthlyDebitAmount;
  }


  public TransferConfigurationGetResponse isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The currency of the dollar amount, e.g. \&quot;USD\&quot;.
   * @return isoCurrencyCode
  **/
  @ApiModelProperty(required = true, value = "The currency of the dollar amount, e.g. \"USD\".")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferConfigurationGetResponse transferConfigurationGetResponse = (TransferConfigurationGetResponse) o;
    return Objects.equals(this.requestId, transferConfigurationGetResponse.requestId) &&
        Objects.equals(this.maxSingleTransferAmount, transferConfigurationGetResponse.maxSingleTransferAmount) &&
        Objects.equals(this.maxSingleTransferCreditAmount, transferConfigurationGetResponse.maxSingleTransferCreditAmount) &&
        Objects.equals(this.maxSingleTransferDebitAmount, transferConfigurationGetResponse.maxSingleTransferDebitAmount) &&
        Objects.equals(this.maxDailyCreditAmount, transferConfigurationGetResponse.maxDailyCreditAmount) &&
        Objects.equals(this.maxDailyDebitAmount, transferConfigurationGetResponse.maxDailyDebitAmount) &&
        Objects.equals(this.maxMonthlyAmount, transferConfigurationGetResponse.maxMonthlyAmount) &&
        Objects.equals(this.maxMonthlyCreditAmount, transferConfigurationGetResponse.maxMonthlyCreditAmount) &&
        Objects.equals(this.maxMonthlyDebitAmount, transferConfigurationGetResponse.maxMonthlyDebitAmount) &&
        Objects.equals(this.isoCurrencyCode, transferConfigurationGetResponse.isoCurrencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, maxSingleTransferAmount, maxSingleTransferCreditAmount, maxSingleTransferDebitAmount, maxDailyCreditAmount, maxDailyDebitAmount, maxMonthlyAmount, maxMonthlyCreditAmount, maxMonthlyDebitAmount, isoCurrencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferConfigurationGetResponse {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    maxSingleTransferAmount: ").append(toIndentedString(maxSingleTransferAmount)).append("\n");
    sb.append("    maxSingleTransferCreditAmount: ").append(toIndentedString(maxSingleTransferCreditAmount)).append("\n");
    sb.append("    maxSingleTransferDebitAmount: ").append(toIndentedString(maxSingleTransferDebitAmount)).append("\n");
    sb.append("    maxDailyCreditAmount: ").append(toIndentedString(maxDailyCreditAmount)).append("\n");
    sb.append("    maxDailyDebitAmount: ").append(toIndentedString(maxDailyDebitAmount)).append("\n");
    sb.append("    maxMonthlyAmount: ").append(toIndentedString(maxMonthlyAmount)).append("\n");
    sb.append("    maxMonthlyCreditAmount: ").append(toIndentedString(maxMonthlyCreditAmount)).append("\n");
    sb.append("    maxMonthlyDebitAmount: ").append(toIndentedString(maxMonthlyDebitAmount)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
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

