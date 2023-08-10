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
import com.plaid.client.model.TransactionsRuleField;
import com.plaid.client.model.TransactionsRuleType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A representation of transactions rule details.
 */
@ApiModel(description = "A representation of transactions rule details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-10T22:39:54.038561Z[Etc/UTC]")
public class TransactionsRuleDetails {
  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private TransactionsRuleField field;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TransactionsRuleType type;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;


  public TransactionsRuleDetails field(TransactionsRuleField field) {
    
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @ApiModelProperty(required = true, value = "")

  public TransactionsRuleField getField() {
    return field;
  }


  public void setField(TransactionsRuleField field) {
    this.field = field;
  }


  public TransactionsRuleDetails type(TransactionsRuleType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public TransactionsRuleType getType() {
    return type;
  }


  public void setType(TransactionsRuleType type) {
    this.type = type;
  }


  public TransactionsRuleDetails query(String query) {
    
    this.query = query;
    return this;
  }

   /**
   * For TRANSACTION_ID field, provide transaction_id. For NAME field, provide a string pattern. 
   * @return query
  **/
  @ApiModelProperty(required = true, value = "For TRANSACTION_ID field, provide transaction_id. For NAME field, provide a string pattern. ")

  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsRuleDetails transactionsRuleDetails = (TransactionsRuleDetails) o;
    return Objects.equals(this.field, transactionsRuleDetails.field) &&
        Objects.equals(this.type, transactionsRuleDetails.type) &&
        Objects.equals(this.query, transactionsRuleDetails.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, type, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsRuleDetails {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

