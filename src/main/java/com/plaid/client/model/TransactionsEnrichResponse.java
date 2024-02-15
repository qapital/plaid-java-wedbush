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
import com.plaid.client.model.ClientProvidedEnrichedTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TransactionsEnrichResponse defines the response schema for &#x60;/transactions/enrich&#x60;.
 */
@ApiModel(description = "TransactionsEnrichResponse defines the response schema for `/transactions/enrich`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-15T20:08:18.129993Z[Etc/UTC]")
public class TransactionsEnrichResponse {
  public static final String SERIALIZED_NAME_ENRICHED_TRANSACTIONS = "enriched_transactions";
  @SerializedName(SERIALIZED_NAME_ENRICHED_TRANSACTIONS)
  private List<ClientProvidedEnrichedTransaction> enrichedTransactions = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public TransactionsEnrichResponse enrichedTransactions(List<ClientProvidedEnrichedTransaction> enrichedTransactions) {
    
    this.enrichedTransactions = enrichedTransactions;
    return this;
  }

  public TransactionsEnrichResponse addEnrichedTransactionsItem(ClientProvidedEnrichedTransaction enrichedTransactionsItem) {
    this.enrichedTransactions.add(enrichedTransactionsItem);
    return this;
  }

   /**
   * A list of enriched transactions.
   * @return enrichedTransactions
  **/
  @ApiModelProperty(required = true, value = "A list of enriched transactions.")

  public List<ClientProvidedEnrichedTransaction> getEnrichedTransactions() {
    return enrichedTransactions;
  }


  public void setEnrichedTransactions(List<ClientProvidedEnrichedTransaction> enrichedTransactions) {
    this.enrichedTransactions = enrichedTransactions;
  }


  public TransactionsEnrichResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsEnrichResponse transactionsEnrichResponse = (TransactionsEnrichResponse) o;
    return Objects.equals(this.enrichedTransactions, transactionsEnrichResponse.enrichedTransactions) &&
        Objects.equals(this.requestId, transactionsEnrichResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enrichedTransactions, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsEnrichResponse {\n");
    sb.append("    enrichedTransactions: ").append(toIndentedString(enrichedTransactions)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

