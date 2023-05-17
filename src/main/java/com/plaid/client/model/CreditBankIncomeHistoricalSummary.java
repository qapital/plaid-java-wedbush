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
import com.plaid.client.model.CreditAmountWithCurrency;
import com.plaid.client.model.CreditBankIncomeTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * The end user&#39;s monthly summary for the income source(s).
 */
@ApiModel(description = "The end user's monthly summary for the income source(s).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-17T20:31:05.704177Z[Etc/UTC]")
public class CreditBankIncomeHistoricalSummary {
  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private Double totalAmount;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE = "unofficial_currency_code";
  @SerializedName(SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE)
  private String unofficialCurrencyCode;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNTS = "total_amounts";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNTS)
  private List<CreditAmountWithCurrency> totalAmounts = null;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<CreditBankIncomeTransaction> transactions = null;


  public CreditBankIncomeHistoricalSummary totalAmount(Double totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Total amount of earnings for the income source(s) of the user for the month in the summary. This may return an incorrect value if the summary includes income sources in multiple currencies. Please use [&#x60;total_amounts&#x60;](https://plaid.com/docs/api/products/income/#credit-bank_income-get-response-bank-income-items-bank-income-sources-historical-summary-total-amounts) instead.
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount of earnings for the income source(s) of the user for the month in the summary. This may return an incorrect value if the summary includes income sources in multiple currencies. Please use [`total_amounts`](https://plaid.com/docs/api/products/income/#credit-bank_income-get-response-bank-income-items-bank-income-sources-historical-summary-total-amounts) instead.")

  public Double getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }


  public CreditBankIncomeHistoricalSummary isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The ISO 4217 currency code of the amount or balance. Please use [&#x60;total_amounts&#x60;](https://plaid.com/docs/api/products/income/#credit-bank_income-get-response-bank-income-items-bank-income-sources-historical-summary-total-amounts) instead.
   * @return isoCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISO 4217 currency code of the amount or balance. Please use [`total_amounts`](https://plaid.com/docs/api/products/income/#credit-bank_income-get-response-bank-income-items-bank-income-sources-historical-summary-total-amounts) instead.")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public CreditBankIncomeHistoricalSummary unofficialCurrencyCode(String unofficialCurrencyCode) {
    
    this.unofficialCurrencyCode = unofficialCurrencyCode;
    return this;
  }

   /**
   * The unofficial currency code associated with the amount or balance. Always &#x60;null&#x60; if &#x60;iso_currency_code&#x60; is non-null. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries. Please use [&#x60;total_amounts&#x60;](https://plaid.com/docs/api/products/income/#credit-bank_income-get-response-bank-income-items-bank-income-sources-historical-summary-total-amounts) instead.
   * @return unofficialCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unofficial currency code associated with the amount or balance. Always `null` if `iso_currency_code` is non-null. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries. Please use [`total_amounts`](https://plaid.com/docs/api/products/income/#credit-bank_income-get-response-bank-income-items-bank-income-sources-historical-summary-total-amounts) instead.")

  public String getUnofficialCurrencyCode() {
    return unofficialCurrencyCode;
  }


  public void setUnofficialCurrencyCode(String unofficialCurrencyCode) {
    this.unofficialCurrencyCode = unofficialCurrencyCode;
  }


  public CreditBankIncomeHistoricalSummary totalAmounts(List<CreditAmountWithCurrency> totalAmounts) {
    
    this.totalAmounts = totalAmounts;
    return this;
  }

  public CreditBankIncomeHistoricalSummary addTotalAmountsItem(CreditAmountWithCurrency totalAmountsItem) {
    if (this.totalAmounts == null) {
      this.totalAmounts = new ArrayList<>();
    }
    this.totalAmounts.add(totalAmountsItem);
    return this;
  }

   /**
   * Total amount of earnings for the income source(s) of the user for the month in the summary. This can contain multiple amounts, with each amount denominated in one unique currency.
   * @return totalAmounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount of earnings for the income source(s) of the user for the month in the summary. This can contain multiple amounts, with each amount denominated in one unique currency.")

  public List<CreditAmountWithCurrency> getTotalAmounts() {
    return totalAmounts;
  }


  public void setTotalAmounts(List<CreditAmountWithCurrency> totalAmounts) {
    this.totalAmounts = totalAmounts;
  }


  public CreditBankIncomeHistoricalSummary startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of the period covered in this monthly summary. This date will be the first day of the month, unless the month being covered is a partial month because it is the first month included in the summary and the date range being requested does not begin with the first day of the month. The date will be returned in an ISO 8601 format (YYYY-MM-DD).
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start date of the period covered in this monthly summary. This date will be the first day of the month, unless the month being covered is a partial month because it is the first month included in the summary and the date range being requested does not begin with the first day of the month. The date will be returned in an ISO 8601 format (YYYY-MM-DD).")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public CreditBankIncomeHistoricalSummary endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date of the period included in this monthly summary. This date will be the last day of the month, unless the month being covered is a partial month because it is the last month included in the summary and the date range being requested does not end with the last day of the month. The date will be returned in an ISO 8601 format (YYYY-MM-DD).
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end date of the period included in this monthly summary. This date will be the last day of the month, unless the month being covered is a partial month because it is the last month included in the summary and the date range being requested does not end with the last day of the month. The date will be returned in an ISO 8601 format (YYYY-MM-DD).")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public CreditBankIncomeHistoricalSummary transactions(List<CreditBankIncomeTransaction> transactions) {
    
    this.transactions = transactions;
    return this;
  }

  public CreditBankIncomeHistoricalSummary addTransactionsItem(CreditBankIncomeTransaction transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CreditBankIncomeTransaction> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<CreditBankIncomeTransaction> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditBankIncomeHistoricalSummary creditBankIncomeHistoricalSummary = (CreditBankIncomeHistoricalSummary) o;
    return Objects.equals(this.totalAmount, creditBankIncomeHistoricalSummary.totalAmount) &&
        Objects.equals(this.isoCurrencyCode, creditBankIncomeHistoricalSummary.isoCurrencyCode) &&
        Objects.equals(this.unofficialCurrencyCode, creditBankIncomeHistoricalSummary.unofficialCurrencyCode) &&
        Objects.equals(this.totalAmounts, creditBankIncomeHistoricalSummary.totalAmounts) &&
        Objects.equals(this.startDate, creditBankIncomeHistoricalSummary.startDate) &&
        Objects.equals(this.endDate, creditBankIncomeHistoricalSummary.endDate) &&
        Objects.equals(this.transactions, creditBankIncomeHistoricalSummary.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmount, isoCurrencyCode, unofficialCurrencyCode, totalAmounts, startDate, endDate, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditBankIncomeHistoricalSummary {\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    unofficialCurrencyCode: ").append(toIndentedString(unofficialCurrencyCode)).append("\n");
    sb.append("    totalAmounts: ").append(toIndentedString(totalAmounts)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

