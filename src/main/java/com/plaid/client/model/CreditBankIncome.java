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
import com.plaid.client.model.CreditBankIncomeItem;
import com.plaid.client.model.CreditBankIncomeSummary;
import com.plaid.client.model.CreditBankIncomeWarning;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * The report of the Bank Income data for an end user.
 */
@ApiModel(description = "The report of the Bank Income data for an end user.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-17T20:31:05.704177Z[Etc/UTC]")
public class CreditBankIncome {
  public static final String SERIALIZED_NAME_BANK_INCOME_ID = "bank_income_id";
  @SerializedName(SERIALIZED_NAME_BANK_INCOME_ID)
  private String bankIncomeId;

  public static final String SERIALIZED_NAME_GENERATED_TIME = "generated_time";
  @SerializedName(SERIALIZED_NAME_GENERATED_TIME)
  private OffsetDateTime generatedTime;

  public static final String SERIALIZED_NAME_DAYS_REQUESTED = "days_requested";
  @SerializedName(SERIALIZED_NAME_DAYS_REQUESTED)
  private Integer daysRequested;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<CreditBankIncomeItem> items = null;

  public static final String SERIALIZED_NAME_BANK_INCOME_SUMMARY = "bank_income_summary";
  @SerializedName(SERIALIZED_NAME_BANK_INCOME_SUMMARY)
  private CreditBankIncomeSummary bankIncomeSummary;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<CreditBankIncomeWarning> warnings = null;


  public CreditBankIncome bankIncomeId(String bankIncomeId) {
    
    this.bankIncomeId = bankIncomeId;
    return this;
  }

   /**
   * The unique identifier associated with the Bank Income Report.
   * @return bankIncomeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier associated with the Bank Income Report.")

  public String getBankIncomeId() {
    return bankIncomeId;
  }


  public void setBankIncomeId(String bankIncomeId) {
    this.bankIncomeId = bankIncomeId;
  }


  public CreditBankIncome generatedTime(OffsetDateTime generatedTime) {
    
    this.generatedTime = generatedTime;
    return this;
  }

   /**
   * The time when the Bank Income Report was generated.
   * @return generatedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time when the Bank Income Report was generated.")

  public OffsetDateTime getGeneratedTime() {
    return generatedTime;
  }


  public void setGeneratedTime(OffsetDateTime generatedTime) {
    this.generatedTime = generatedTime;
  }


  public CreditBankIncome daysRequested(Integer daysRequested) {
    
    this.daysRequested = daysRequested;
    return this;
  }

   /**
   * The number of days requested by the customer for the Bank Income Report.
   * @return daysRequested
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of days requested by the customer for the Bank Income Report.")

  public Integer getDaysRequested() {
    return daysRequested;
  }


  public void setDaysRequested(Integer daysRequested) {
    this.daysRequested = daysRequested;
  }


  public CreditBankIncome items(List<CreditBankIncomeItem> items) {
    
    this.items = items;
    return this;
  }

  public CreditBankIncome addItemsItem(CreditBankIncomeItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * The list of Items in the report along with the associated metadata about the Item.
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of Items in the report along with the associated metadata about the Item.")

  public List<CreditBankIncomeItem> getItems() {
    return items;
  }


  public void setItems(List<CreditBankIncomeItem> items) {
    this.items = items;
  }


  public CreditBankIncome bankIncomeSummary(CreditBankIncomeSummary bankIncomeSummary) {
    
    this.bankIncomeSummary = bankIncomeSummary;
    return this;
  }

   /**
   * Get bankIncomeSummary
   * @return bankIncomeSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreditBankIncomeSummary getBankIncomeSummary() {
    return bankIncomeSummary;
  }


  public void setBankIncomeSummary(CreditBankIncomeSummary bankIncomeSummary) {
    this.bankIncomeSummary = bankIncomeSummary;
  }


  public CreditBankIncome warnings(List<CreditBankIncomeWarning> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public CreditBankIncome addWarningsItem(CreditBankIncomeWarning warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * If data from the Bank Income report was unable to be retrieved, the warnings will contain information about the error that caused the data to be incomplete.
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If data from the Bank Income report was unable to be retrieved, the warnings will contain information about the error that caused the data to be incomplete.")

  public List<CreditBankIncomeWarning> getWarnings() {
    return warnings;
  }


  public void setWarnings(List<CreditBankIncomeWarning> warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditBankIncome creditBankIncome = (CreditBankIncome) o;
    return Objects.equals(this.bankIncomeId, creditBankIncome.bankIncomeId) &&
        Objects.equals(this.generatedTime, creditBankIncome.generatedTime) &&
        Objects.equals(this.daysRequested, creditBankIncome.daysRequested) &&
        Objects.equals(this.items, creditBankIncome.items) &&
        Objects.equals(this.bankIncomeSummary, creditBankIncome.bankIncomeSummary) &&
        Objects.equals(this.warnings, creditBankIncome.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankIncomeId, generatedTime, daysRequested, items, bankIncomeSummary, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditBankIncome {\n");
    sb.append("    bankIncomeId: ").append(toIndentedString(bankIncomeId)).append("\n");
    sb.append("    generatedTime: ").append(toIndentedString(generatedTime)).append("\n");
    sb.append("    daysRequested: ").append(toIndentedString(daysRequested)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    bankIncomeSummary: ").append(toIndentedString(bankIncomeSummary)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

