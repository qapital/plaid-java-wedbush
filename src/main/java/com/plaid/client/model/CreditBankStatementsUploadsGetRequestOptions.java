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
import java.util.ArrayList;
import java.util.List;

/**
 * An optional object for &#x60;/credit/bank_statements/uploads/get&#x60; request options.
 */
@ApiModel(description = "An optional object for `/credit/bank_statements/uploads/get` request options.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T20:55:29.933887Z[Etc/UTC]")
public class CreditBankStatementsUploadsGetRequestOptions {
  public static final String SERIALIZED_NAME_ITEM_IDS = "item_ids";
  @SerializedName(SERIALIZED_NAME_ITEM_IDS)
  private List<String> itemIds = null;


  public CreditBankStatementsUploadsGetRequestOptions itemIds(List<String> itemIds) {
    
    this.itemIds = itemIds;
    return this;
  }

  public CreditBankStatementsUploadsGetRequestOptions addItemIdsItem(String itemIdsItem) {
    if (this.itemIds == null) {
      this.itemIds = new ArrayList<>();
    }
    this.itemIds.add(itemIdsItem);
    return this;
  }

   /**
   * An array of &#x60;item_id&#x60;s whose bank statements information is returned. Each &#x60;item_id&#x60; should uniquely identify a bank statements uploaded item. If this field is not provided, all &#x60;item_id&#x60;s associated with the &#x60;user_token&#x60; will returned in the response.
   * @return itemIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of `item_id`s whose bank statements information is returned. Each `item_id` should uniquely identify a bank statements uploaded item. If this field is not provided, all `item_id`s associated with the `user_token` will returned in the response.")

  public List<String> getItemIds() {
    return itemIds;
  }


  public void setItemIds(List<String> itemIds) {
    this.itemIds = itemIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditBankStatementsUploadsGetRequestOptions creditBankStatementsUploadsGetRequestOptions = (CreditBankStatementsUploadsGetRequestOptions) o;
    return Objects.equals(this.itemIds, creditBankStatementsUploadsGetRequestOptions.itemIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditBankStatementsUploadsGetRequestOptions {\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
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

