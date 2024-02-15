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
import com.plaid.client.model.BalancePlusAttributes;
import com.plaid.client.model.RiskReason;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * This object provides detailed risk assessment for the requested transaction
 */
@ApiModel(description = "This object provides detailed risk assessment for the requested transaction")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-15T20:08:18.129993Z[Etc/UTC]")
public class AccountsBalanceGetResponsePaymentRiskAssessment {
  public static final String SERIALIZED_NAME_RISK_LEVEL = "risk_level";
  @SerializedName(SERIALIZED_NAME_RISK_LEVEL)
  private String riskLevel;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private BalancePlusAttributes attributes;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Integer score;

  public static final String SERIALIZED_NAME_BALANCE_LAST_UPDATED = "balance_last_updated";
  @SerializedName(SERIALIZED_NAME_BALANCE_LAST_UPDATED)
  private OffsetDateTime balanceLastUpdated;

  public static final String SERIALIZED_NAME_RISK_REASONS = "risk_reasons";
  @SerializedName(SERIALIZED_NAME_RISK_REASONS)
  private List<RiskReason> riskReasons = null;

  public static final String SERIALIZED_NAME_EXCEEDS_BALANCE_THRESHOLD = "exceeds_balance_threshold";
  @SerializedName(SERIALIZED_NAME_EXCEEDS_BALANCE_THRESHOLD)
  private Boolean exceedsBalanceThreshold;


  public AccountsBalanceGetResponsePaymentRiskAssessment riskLevel(String riskLevel) {
    
    this.riskLevel = riskLevel;
    return this;
  }

   /**
   * A five-tier risk assessment for the transaction based on the probability of return.
   * @return riskLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A five-tier risk assessment for the transaction based on the probability of return.")

  public String getRiskLevel() {
    return riskLevel;
  }


  public void setRiskLevel(String riskLevel) {
    this.riskLevel = riskLevel;
  }


  public AccountsBalanceGetResponsePaymentRiskAssessment attributes(BalancePlusAttributes attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BalancePlusAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(BalancePlusAttributes attributes) {
    this.attributes = attributes;
  }


  public AccountsBalanceGetResponsePaymentRiskAssessment score(Integer score) {
    
    this.score = score;
    return this;
  }

   /**
   * A score from 1-99 that indicates the transaction return risk: a higher risk score suggests a higher return likelihood.  The score evaluates the transaction return risk because an account is overdrawn or because an ineligible account is used and covers return codes: \&quot;R01\&quot;, \&quot;R02\&quot;, \&quot;R03\&quot;, \&quot;R04\&quot;, \&quot;R06\&quot;, \&quot;R08\&quot;,  \&quot;R09\&quot;, \&quot;R13\&quot;, \&quot;R16\&quot;, \&quot;R17\&quot;, \&quot;R20\&quot;, \&quot;R23\&quot;. These returns have a turnaround time of 2 banking days.
   * minimum: 1
   * maximum: 99
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A score from 1-99 that indicates the transaction return risk: a higher risk score suggests a higher return likelihood.  The score evaluates the transaction return risk because an account is overdrawn or because an ineligible account is used and covers return codes: \"R01\", \"R02\", \"R03\", \"R04\", \"R06\", \"R08\",  \"R09\", \"R13\", \"R16\", \"R17\", \"R20\", \"R23\". These returns have a turnaround time of 2 banking days.")

  public Integer getScore() {
    return score;
  }


  public void setScore(Integer score) {
    this.score = score;
  }


  public AccountsBalanceGetResponsePaymentRiskAssessment balanceLastUpdated(OffsetDateTime balanceLastUpdated) {
    
    this.balanceLastUpdated = balanceLastUpdated;
    return this;
  }

   /**
   * Timestamp of the last successful balance update, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.
   * @return balanceLastUpdated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp of the last successful balance update, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.")

  public OffsetDateTime getBalanceLastUpdated() {
    return balanceLastUpdated;
  }


  public void setBalanceLastUpdated(OffsetDateTime balanceLastUpdated) {
    this.balanceLastUpdated = balanceLastUpdated;
  }


  public AccountsBalanceGetResponsePaymentRiskAssessment riskReasons(List<RiskReason> riskReasons) {
    
    this.riskReasons = riskReasons;
    return this;
  }

  public AccountsBalanceGetResponsePaymentRiskAssessment addRiskReasonsItem(RiskReason riskReasonsItem) {
    if (this.riskReasons == null) {
      this.riskReasons = new ArrayList<>();
    }
    this.riskReasons.add(riskReasonsItem);
    return this;
  }

   /**
   * An array of objects, each representing a specific reason contributing to the risk assessment of an ACH transaction. This field is particularly useful for understanding risk factors affecting the risk level assigned to a transaction classified as “high”, “medium-high”, and “medium” risk.
   * @return riskReasons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of objects, each representing a specific reason contributing to the risk assessment of an ACH transaction. This field is particularly useful for understanding risk factors affecting the risk level assigned to a transaction classified as “high”, “medium-high”, and “medium” risk.")

  public List<RiskReason> getRiskReasons() {
    return riskReasons;
  }


  public void setRiskReasons(List<RiskReason> riskReasons) {
    this.riskReasons = riskReasons;
  }


  public AccountsBalanceGetResponsePaymentRiskAssessment exceedsBalanceThreshold(Boolean exceedsBalanceThreshold) {
    
    this.exceedsBalanceThreshold = exceedsBalanceThreshold;
    return this;
  }

   /**
   * This boolean field denotes if the requested ACH debit amount exceeds the calculated threshold based on either the available or current balance of the bank account. Specifically, it checks if the amount is greater than the account balance multiplied by \&quot;balance_threshold_percentage\&quot;/100. In cases where available_balance is not accessible, current_balance is used. This field is particularly useful for clients handling indirect items who lack direct access to raw balance data.
   * @return exceedsBalanceThreshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This boolean field denotes if the requested ACH debit amount exceeds the calculated threshold based on either the available or current balance of the bank account. Specifically, it checks if the amount is greater than the account balance multiplied by \"balance_threshold_percentage\"/100. In cases where available_balance is not accessible, current_balance is used. This field is particularly useful for clients handling indirect items who lack direct access to raw balance data.")

  public Boolean getExceedsBalanceThreshold() {
    return exceedsBalanceThreshold;
  }


  public void setExceedsBalanceThreshold(Boolean exceedsBalanceThreshold) {
    this.exceedsBalanceThreshold = exceedsBalanceThreshold;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsBalanceGetResponsePaymentRiskAssessment accountsBalanceGetResponsePaymentRiskAssessment = (AccountsBalanceGetResponsePaymentRiskAssessment) o;
    return Objects.equals(this.riskLevel, accountsBalanceGetResponsePaymentRiskAssessment.riskLevel) &&
        Objects.equals(this.attributes, accountsBalanceGetResponsePaymentRiskAssessment.attributes) &&
        Objects.equals(this.score, accountsBalanceGetResponsePaymentRiskAssessment.score) &&
        Objects.equals(this.balanceLastUpdated, accountsBalanceGetResponsePaymentRiskAssessment.balanceLastUpdated) &&
        Objects.equals(this.riskReasons, accountsBalanceGetResponsePaymentRiskAssessment.riskReasons) &&
        Objects.equals(this.exceedsBalanceThreshold, accountsBalanceGetResponsePaymentRiskAssessment.exceedsBalanceThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(riskLevel, attributes, score, balanceLastUpdated, riskReasons, exceedsBalanceThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsBalanceGetResponsePaymentRiskAssessment {\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    balanceLastUpdated: ").append(toIndentedString(balanceLastUpdated)).append("\n");
    sb.append("    riskReasons: ").append(toIndentedString(riskReasons)).append("\n");
    sb.append("    exceedsBalanceThreshold: ").append(toIndentedString(exceedsBalanceThreshold)).append("\n");
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

