/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.128.4
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
import java.time.OffsetDateTime;

/**
 * BankTransferSweep describes a sweep transfer.
 */
@ApiModel(description = "BankTransferSweep describes a sweep transfer.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-14T04:41:23.248820Z[Etc/UTC]")
public class BankTransferSweep {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;


  public BankTransferSweep id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Identifier of the sweep.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Identifier of the sweep.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public BankTransferSweep createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The datetime when the sweep occurred, in RFC 3339 format.
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "The datetime when the sweep occurred, in RFC 3339 format.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public BankTransferSweep amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the sweep.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The amount of the sweep.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public BankTransferSweep isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The currency of the sweep, e.g. \&quot;USD\&quot;.
   * @return isoCurrencyCode
  **/
  @ApiModelProperty(required = true, value = "The currency of the sweep, e.g. \"USD\".")

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
    BankTransferSweep bankTransferSweep = (BankTransferSweep) o;
    return Objects.equals(this.id, bankTransferSweep.id) &&
        Objects.equals(this.createdAt, bankTransferSweep.createdAt) &&
        Objects.equals(this.amount, bankTransferSweep.amount) &&
        Objects.equals(this.isoCurrencyCode, bankTransferSweep.isoCurrencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, amount, isoCurrencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransferSweep {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

