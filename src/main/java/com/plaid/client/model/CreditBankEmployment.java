/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.406.1
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
import com.plaid.client.model.CreditBankEmployer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Detailed information for the bank employment.
 */
@ApiModel(description = "Detailed information for the bank employment.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-10T22:39:54.038561Z[Etc/UTC]")
public class CreditBankEmployment {
  public static final String SERIALIZED_NAME_BANK_EMPLOYMENT_ID = "bank_employment_id";
  @SerializedName(SERIALIZED_NAME_BANK_EMPLOYMENT_ID)
  private String bankEmploymentId;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_EMPLOYER = "employer";
  @SerializedName(SERIALIZED_NAME_EMPLOYER)
  private CreditBankEmployer employer;

  public static final String SERIALIZED_NAME_LATEST_DEPOSIT_DATE = "latest_deposit_date";
  @SerializedName(SERIALIZED_NAME_LATEST_DEPOSIT_DATE)
  private LocalDate latestDepositDate;

  public static final String SERIALIZED_NAME_EARLIEST_DEPOSIT_DATE = "earliest_deposit_date";
  @SerializedName(SERIALIZED_NAME_EARLIEST_DEPOSIT_DATE)
  private LocalDate earliestDepositDate;


  public CreditBankEmployment bankEmploymentId(String bankEmploymentId) {
    
    this.bankEmploymentId = bankEmploymentId;
    return this;
  }

   /**
   * A unique identifier for the bank employment.
   * @return bankEmploymentId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the bank employment.")

  public String getBankEmploymentId() {
    return bankEmploymentId;
  }


  public void setBankEmploymentId(String bankEmploymentId) {
    this.bankEmploymentId = bankEmploymentId;
  }


  public CreditBankEmployment accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Plaid&#39;s unique identifier for the account.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "Plaid's unique identifier for the account.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public CreditBankEmployment employer(CreditBankEmployer employer) {
    
    this.employer = employer;
    return this;
  }

   /**
   * Get employer
   * @return employer
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditBankEmployer getEmployer() {
    return employer;
  }


  public void setEmployer(CreditBankEmployer employer) {
    this.employer = employer;
  }


  public CreditBankEmployment latestDepositDate(LocalDate latestDepositDate) {
    
    this.latestDepositDate = latestDepositDate;
    return this;
  }

   /**
   * The date of the most recent deposit from this employer.
   * @return latestDepositDate
  **/
  @ApiModelProperty(required = true, value = "The date of the most recent deposit from this employer.")

  public LocalDate getLatestDepositDate() {
    return latestDepositDate;
  }


  public void setLatestDepositDate(LocalDate latestDepositDate) {
    this.latestDepositDate = latestDepositDate;
  }


  public CreditBankEmployment earliestDepositDate(LocalDate earliestDepositDate) {
    
    this.earliestDepositDate = earliestDepositDate;
    return this;
  }

   /**
   * The date of the earliest deposit from this employer from within the period of the days requested.
   * @return earliestDepositDate
  **/
  @ApiModelProperty(required = true, value = "The date of the earliest deposit from this employer from within the period of the days requested.")

  public LocalDate getEarliestDepositDate() {
    return earliestDepositDate;
  }


  public void setEarliestDepositDate(LocalDate earliestDepositDate) {
    this.earliestDepositDate = earliestDepositDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditBankEmployment creditBankEmployment = (CreditBankEmployment) o;
    return Objects.equals(this.bankEmploymentId, creditBankEmployment.bankEmploymentId) &&
        Objects.equals(this.accountId, creditBankEmployment.accountId) &&
        Objects.equals(this.employer, creditBankEmployment.employer) &&
        Objects.equals(this.latestDepositDate, creditBankEmployment.latestDepositDate) &&
        Objects.equals(this.earliestDepositDate, creditBankEmployment.earliestDepositDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankEmploymentId, accountId, employer, latestDepositDate, earliestDepositDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditBankEmployment {\n");
    sb.append("    bankEmploymentId: ").append(toIndentedString(bankEmploymentId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    latestDepositDate: ").append(toIndentedString(latestDepositDate)).append("\n");
    sb.append("    earliestDepositDate: ").append(toIndentedString(earliestDepositDate)).append("\n");
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

