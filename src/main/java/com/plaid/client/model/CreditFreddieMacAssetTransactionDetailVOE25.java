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
import com.plaid.client.model.AssetTransactionCategoryType;
import com.plaid.client.model.AssetTransactionType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Documentation not found in the MISMO model viewer and not provided by Freddie Mac.
 */
@ApiModel(description = "Documentation not found in the MISMO model viewer and not provided by Freddie Mac.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-10T22:39:54.038561Z[Etc/UTC]")
public class CreditFreddieMacAssetTransactionDetailVOE25 {
  public static final String SERIALIZED_NAME_ASSET_TRANSACTION_UNIQUE_IDENTIFIER = "AssetTransactionUniqueIdentifier";
  @SerializedName(SERIALIZED_NAME_ASSET_TRANSACTION_UNIQUE_IDENTIFIER)
  private String assetTransactionUniqueIdentifier;

  public static final String SERIALIZED_NAME_ASSET_TRANSACTION_DATE = "AssetTransactionDate";
  @SerializedName(SERIALIZED_NAME_ASSET_TRANSACTION_DATE)
  private LocalDate assetTransactionDate;

  public static final String SERIALIZED_NAME_ASSET_TRANSACTION_POST_DATE = "AssetTransactionPostDate";
  @SerializedName(SERIALIZED_NAME_ASSET_TRANSACTION_POST_DATE)
  private LocalDate assetTransactionPostDate;

  public static final String SERIALIZED_NAME_ASSET_TRANSACTION_TYPE = "AssetTransactionType";
  @SerializedName(SERIALIZED_NAME_ASSET_TRANSACTION_TYPE)
  private AssetTransactionType assetTransactionType;

  public static final String SERIALIZED_NAME_ASSET_TRANSACTION_PAID_BY_NAME = "AssetTransactionPaidByName";
  @SerializedName(SERIALIZED_NAME_ASSET_TRANSACTION_PAID_BY_NAME)
  private String assetTransactionPaidByName;

  public static final String SERIALIZED_NAME_ASSET_TRANSACTION_PAID_TO_NAME = "AssetTransactionPaidToName";
  @SerializedName(SERIALIZED_NAME_ASSET_TRANSACTION_PAID_TO_NAME)
  private String assetTransactionPaidToName;

  public static final String SERIALIZED_NAME_ASSET_TRANSACTION_TYPE_ADDITIONAL_DESCRIPTION = "AssetTransactionTypeAdditionalDescription";
  @SerializedName(SERIALIZED_NAME_ASSET_TRANSACTION_TYPE_ADDITIONAL_DESCRIPTION)
  private String assetTransactionTypeAdditionalDescription;

  public static final String SERIALIZED_NAME_ASSET_TRANSACTION_CATEGORY_TYPE = "AssetTransactionCategoryType";
  @SerializedName(SERIALIZED_NAME_ASSET_TRANSACTION_CATEGORY_TYPE)
  private AssetTransactionCategoryType assetTransactionCategoryType;

  public static final String SERIALIZED_NAME_FINANCIAL_INSTITUTION_TRANSACTION_IDENTIFIER = "FinancialInstitutionTransactionIdentifier";
  @SerializedName(SERIALIZED_NAME_FINANCIAL_INSTITUTION_TRANSACTION_IDENTIFIER)
  private String financialInstitutionTransactionIdentifier;


  public CreditFreddieMacAssetTransactionDetailVOE25 assetTransactionUniqueIdentifier(String assetTransactionUniqueIdentifier) {
    
    this.assetTransactionUniqueIdentifier = assetTransactionUniqueIdentifier;
    return this;
  }

   /**
   * A vendor created unique Identifier.
   * @return assetTransactionUniqueIdentifier
  **/
  @ApiModelProperty(required = true, value = "A vendor created unique Identifier.")

  public String getAssetTransactionUniqueIdentifier() {
    return assetTransactionUniqueIdentifier;
  }


  public void setAssetTransactionUniqueIdentifier(String assetTransactionUniqueIdentifier) {
    this.assetTransactionUniqueIdentifier = assetTransactionUniqueIdentifier;
  }


  public CreditFreddieMacAssetTransactionDetailVOE25 assetTransactionDate(LocalDate assetTransactionDate) {
    
    this.assetTransactionDate = assetTransactionDate;
    return this;
  }

   /**
   * Asset Transaction Date.
   * @return assetTransactionDate
  **/
  @ApiModelProperty(required = true, value = "Asset Transaction Date.")

  public LocalDate getAssetTransactionDate() {
    return assetTransactionDate;
  }


  public void setAssetTransactionDate(LocalDate assetTransactionDate) {
    this.assetTransactionDate = assetTransactionDate;
  }


  public CreditFreddieMacAssetTransactionDetailVOE25 assetTransactionPostDate(LocalDate assetTransactionPostDate) {
    
    this.assetTransactionPostDate = assetTransactionPostDate;
    return this;
  }

   /**
   * Asset Transaction Post Date.
   * @return assetTransactionPostDate
  **/
  @ApiModelProperty(required = true, value = "Asset Transaction Post Date.")

  public LocalDate getAssetTransactionPostDate() {
    return assetTransactionPostDate;
  }


  public void setAssetTransactionPostDate(LocalDate assetTransactionPostDate) {
    this.assetTransactionPostDate = assetTransactionPostDate;
  }


  public CreditFreddieMacAssetTransactionDetailVOE25 assetTransactionType(AssetTransactionType assetTransactionType) {
    
    this.assetTransactionType = assetTransactionType;
    return this;
  }

   /**
   * Get assetTransactionType
   * @return assetTransactionType
  **/
  @ApiModelProperty(required = true, value = "")

  public AssetTransactionType getAssetTransactionType() {
    return assetTransactionType;
  }


  public void setAssetTransactionType(AssetTransactionType assetTransactionType) {
    this.assetTransactionType = assetTransactionType;
  }


  public CreditFreddieMacAssetTransactionDetailVOE25 assetTransactionPaidByName(String assetTransactionPaidByName) {
    
    this.assetTransactionPaidByName = assetTransactionPaidByName;
    return this;
  }

   /**
   * Populate with who did the transaction.
   * @return assetTransactionPaidByName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Populate with who did the transaction.")

  public String getAssetTransactionPaidByName() {
    return assetTransactionPaidByName;
  }


  public void setAssetTransactionPaidByName(String assetTransactionPaidByName) {
    this.assetTransactionPaidByName = assetTransactionPaidByName;
  }


  public CreditFreddieMacAssetTransactionDetailVOE25 assetTransactionPaidToName(String assetTransactionPaidToName) {
    
    this.assetTransactionPaidToName = assetTransactionPaidToName;
    return this;
  }

   /**
   * Populate with for whom the transaction is done.
   * @return assetTransactionPaidToName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Populate with for whom the transaction is done.")

  public String getAssetTransactionPaidToName() {
    return assetTransactionPaidToName;
  }


  public void setAssetTransactionPaidToName(String assetTransactionPaidToName) {
    this.assetTransactionPaidToName = assetTransactionPaidToName;
  }


  public CreditFreddieMacAssetTransactionDetailVOE25 assetTransactionTypeAdditionalDescription(String assetTransactionTypeAdditionalDescription) {
    
    this.assetTransactionTypeAdditionalDescription = assetTransactionTypeAdditionalDescription;
    return this;
  }

   /**
   * FI Provided - examples are atm, cash, check, credit, debit, deposit, directDebit, directDeposit, dividend, fee, interest, other, payment, pointOfSale, repeatPayment, serviceCharge, transfer.
   * @return assetTransactionTypeAdditionalDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "FI Provided - examples are atm, cash, check, credit, debit, deposit, directDebit, directDeposit, dividend, fee, interest, other, payment, pointOfSale, repeatPayment, serviceCharge, transfer.")

  public String getAssetTransactionTypeAdditionalDescription() {
    return assetTransactionTypeAdditionalDescription;
  }


  public void setAssetTransactionTypeAdditionalDescription(String assetTransactionTypeAdditionalDescription) {
    this.assetTransactionTypeAdditionalDescription = assetTransactionTypeAdditionalDescription;
  }


  public CreditFreddieMacAssetTransactionDetailVOE25 assetTransactionCategoryType(AssetTransactionCategoryType assetTransactionCategoryType) {
    
    this.assetTransactionCategoryType = assetTransactionCategoryType;
    return this;
  }

   /**
   * Get assetTransactionCategoryType
   * @return assetTransactionCategoryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public AssetTransactionCategoryType getAssetTransactionCategoryType() {
    return assetTransactionCategoryType;
  }


  public void setAssetTransactionCategoryType(AssetTransactionCategoryType assetTransactionCategoryType) {
    this.assetTransactionCategoryType = assetTransactionCategoryType;
  }


  public CreditFreddieMacAssetTransactionDetailVOE25 financialInstitutionTransactionIdentifier(String financialInstitutionTransactionIdentifier) {
    
    this.financialInstitutionTransactionIdentifier = financialInstitutionTransactionIdentifier;
    return this;
  }

   /**
   * FI provided Transaction Identifier.
   * @return financialInstitutionTransactionIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "FI provided Transaction Identifier.")

  public String getFinancialInstitutionTransactionIdentifier() {
    return financialInstitutionTransactionIdentifier;
  }


  public void setFinancialInstitutionTransactionIdentifier(String financialInstitutionTransactionIdentifier) {
    this.financialInstitutionTransactionIdentifier = financialInstitutionTransactionIdentifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditFreddieMacAssetTransactionDetailVOE25 creditFreddieMacAssetTransactionDetailVOE25 = (CreditFreddieMacAssetTransactionDetailVOE25) o;
    return Objects.equals(this.assetTransactionUniqueIdentifier, creditFreddieMacAssetTransactionDetailVOE25.assetTransactionUniqueIdentifier) &&
        Objects.equals(this.assetTransactionDate, creditFreddieMacAssetTransactionDetailVOE25.assetTransactionDate) &&
        Objects.equals(this.assetTransactionPostDate, creditFreddieMacAssetTransactionDetailVOE25.assetTransactionPostDate) &&
        Objects.equals(this.assetTransactionType, creditFreddieMacAssetTransactionDetailVOE25.assetTransactionType) &&
        Objects.equals(this.assetTransactionPaidByName, creditFreddieMacAssetTransactionDetailVOE25.assetTransactionPaidByName) &&
        Objects.equals(this.assetTransactionPaidToName, creditFreddieMacAssetTransactionDetailVOE25.assetTransactionPaidToName) &&
        Objects.equals(this.assetTransactionTypeAdditionalDescription, creditFreddieMacAssetTransactionDetailVOE25.assetTransactionTypeAdditionalDescription) &&
        Objects.equals(this.assetTransactionCategoryType, creditFreddieMacAssetTransactionDetailVOE25.assetTransactionCategoryType) &&
        Objects.equals(this.financialInstitutionTransactionIdentifier, creditFreddieMacAssetTransactionDetailVOE25.financialInstitutionTransactionIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetTransactionUniqueIdentifier, assetTransactionDate, assetTransactionPostDate, assetTransactionType, assetTransactionPaidByName, assetTransactionPaidToName, assetTransactionTypeAdditionalDescription, assetTransactionCategoryType, financialInstitutionTransactionIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditFreddieMacAssetTransactionDetailVOE25 {\n");
    sb.append("    assetTransactionUniqueIdentifier: ").append(toIndentedString(assetTransactionUniqueIdentifier)).append("\n");
    sb.append("    assetTransactionDate: ").append(toIndentedString(assetTransactionDate)).append("\n");
    sb.append("    assetTransactionPostDate: ").append(toIndentedString(assetTransactionPostDate)).append("\n");
    sb.append("    assetTransactionType: ").append(toIndentedString(assetTransactionType)).append("\n");
    sb.append("    assetTransactionPaidByName: ").append(toIndentedString(assetTransactionPaidByName)).append("\n");
    sb.append("    assetTransactionPaidToName: ").append(toIndentedString(assetTransactionPaidToName)).append("\n");
    sb.append("    assetTransactionTypeAdditionalDescription: ").append(toIndentedString(assetTransactionTypeAdditionalDescription)).append("\n");
    sb.append("    assetTransactionCategoryType: ").append(toIndentedString(assetTransactionCategoryType)).append("\n");
    sb.append("    financialInstitutionTransactionIdentifier: ").append(toIndentedString(financialInstitutionTransactionIdentifier)).append("\n");
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

