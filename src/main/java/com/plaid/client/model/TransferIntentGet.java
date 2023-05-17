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
import com.plaid.client.model.ACHClass;
import com.plaid.client.model.TransferAuthorizationDecisionRationale;
import com.plaid.client.model.TransferAuthorizationGuaranteeDecision;
import com.plaid.client.model.TransferAuthorizationGuaranteeDecisionRationale;
import com.plaid.client.model.TransferIntentAuthorizationDecision;
import com.plaid.client.model.TransferIntentCreateMode;
import com.plaid.client.model.TransferIntentCreateNetwork;
import com.plaid.client.model.TransferIntentGetFailureReason;
import com.plaid.client.model.TransferIntentStatus;
import com.plaid.client.model.TransferUserInResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents a transfer intent within Transfer UI.
 */
@ApiModel(description = "Represents a transfer intent within Transfer UI.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-17T20:31:05.704177Z[Etc/UTC]")
public class TransferIntentGet {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TransferIntentStatus status;

  public static final String SERIALIZED_NAME_TRANSFER_ID = "transfer_id";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ID)
  private String transferId;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failure_reason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private TransferIntentGetFailureReason failureReason;

  public static final String SERIALIZED_NAME_AUTHORIZATION_DECISION = "authorization_decision";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_DECISION)
  private TransferIntentAuthorizationDecision authorizationDecision;

  public static final String SERIALIZED_NAME_AUTHORIZATION_DECISION_RATIONALE = "authorization_decision_rationale";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_DECISION_RATIONALE)
  private TransferAuthorizationDecisionRationale authorizationDecisionRationale;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID = "origination_account_id";
  @SerializedName(SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID)
  private String originationAccountId;

  public static final String SERIALIZED_NAME_FUNDING_ACCOUNT_ID = "funding_account_id";
  @SerializedName(SERIALIZED_NAME_FUNDING_ACCOUNT_ID)
  private String fundingAccountId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private TransferIntentCreateMode mode;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private TransferIntentCreateNetwork network = TransferIntentCreateNetwork.SAME_DAY_ACH;

  public static final String SERIALIZED_NAME_ACH_CLASS = "ach_class";
  @SerializedName(SERIALIZED_NAME_ACH_CLASS)
  private ACHClass achClass;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private TransferUserInResponse user;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_REQUIRE_GUARANTEE = "require_guarantee";
  @SerializedName(SERIALIZED_NAME_REQUIRE_GUARANTEE)
  private Boolean requireGuarantee;

  public static final String SERIALIZED_NAME_GUARANTEE_DECISION = "guarantee_decision";
  @SerializedName(SERIALIZED_NAME_GUARANTEE_DECISION)
  private TransferAuthorizationGuaranteeDecision guaranteeDecision;

  public static final String SERIALIZED_NAME_GUARANTEE_DECISION_RATIONALE = "guarantee_decision_rationale";
  @SerializedName(SERIALIZED_NAME_GUARANTEE_DECISION_RATIONALE)
  private TransferAuthorizationGuaranteeDecisionRationale guaranteeDecisionRationale;


  public TransferIntentGet id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Plaid&#39;s unique identifier for a transfer intent object.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Plaid's unique identifier for a transfer intent object.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TransferIntentGet created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The datetime the transfer was created. This will be of the form &#x60;2006-01-02T15:04:05Z&#x60;.
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The datetime the transfer was created. This will be of the form `2006-01-02T15:04:05Z`.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public TransferIntentGet status(TransferIntentStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferIntentStatus getStatus() {
    return status;
  }


  public void setStatus(TransferIntentStatus status) {
    this.status = status;
  }


  public TransferIntentGet transferId(String transferId) {
    
    this.transferId = transferId;
    return this;
  }

   /**
   * Plaid&#39;s unique identifier for the transfer created through the UI. Returned only if the transfer was successfully created. Null value otherwise.
   * @return transferId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Plaid's unique identifier for the transfer created through the UI. Returned only if the transfer was successfully created. Null value otherwise.")

  public String getTransferId() {
    return transferId;
  }


  public void setTransferId(String transferId) {
    this.transferId = transferId;
  }


  public TransferIntentGet failureReason(TransferIntentGetFailureReason failureReason) {
    
    this.failureReason = failureReason;
    return this;
  }

   /**
   * Get failureReason
   * @return failureReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransferIntentGetFailureReason getFailureReason() {
    return failureReason;
  }


  public void setFailureReason(TransferIntentGetFailureReason failureReason) {
    this.failureReason = failureReason;
  }


  public TransferIntentGet authorizationDecision(TransferIntentAuthorizationDecision authorizationDecision) {
    
    this.authorizationDecision = authorizationDecision;
    return this;
  }

   /**
   * Get authorizationDecision
   * @return authorizationDecision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransferIntentAuthorizationDecision getAuthorizationDecision() {
    return authorizationDecision;
  }


  public void setAuthorizationDecision(TransferIntentAuthorizationDecision authorizationDecision) {
    this.authorizationDecision = authorizationDecision;
  }


  public TransferIntentGet authorizationDecisionRationale(TransferAuthorizationDecisionRationale authorizationDecisionRationale) {
    
    this.authorizationDecisionRationale = authorizationDecisionRationale;
    return this;
  }

   /**
   * Get authorizationDecisionRationale
   * @return authorizationDecisionRationale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransferAuthorizationDecisionRationale getAuthorizationDecisionRationale() {
    return authorizationDecisionRationale;
  }


  public void setAuthorizationDecisionRationale(TransferAuthorizationDecisionRationale authorizationDecisionRationale) {
    this.authorizationDecisionRationale = authorizationDecisionRationale;
  }


  public TransferIntentGet accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The Plaid &#x60;account_id&#x60; for the account that will be debited or credited. Returned only if &#x60;account_id&#x60; was set on intent creation.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Plaid `account_id` for the account that will be debited or credited. Returned only if `account_id` was set on intent creation.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public TransferIntentGet originationAccountId(String originationAccountId) {
    
    this.originationAccountId = originationAccountId;
    return this;
  }

   /**
   * Plaid’s unique identifier for the origination account used for the transfer.
   * @return originationAccountId
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for the origination account used for the transfer.")

  public String getOriginationAccountId() {
    return originationAccountId;
  }


  public void setOriginationAccountId(String originationAccountId) {
    this.originationAccountId = originationAccountId;
  }


  public TransferIntentGet fundingAccountId(String fundingAccountId) {
    
    this.fundingAccountId = fundingAccountId;
    return this;
  }

   /**
   * The id of the funding account to use, available in the Plaid Dashboard. This determines which of your business checking accounts will be credited or debited.
   * @return fundingAccountId
  **/
  @ApiModelProperty(required = true, value = "The id of the funding account to use, available in the Plaid Dashboard. This determines which of your business checking accounts will be credited or debited.")

  public String getFundingAccountId() {
    return fundingAccountId;
  }


  public void setFundingAccountId(String fundingAccountId) {
    this.fundingAccountId = fundingAccountId;
  }


  public TransferIntentGet amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the transfer (decimal string with two digits of precision e.g. \&quot;10.00\&quot;).
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The amount of the transfer (decimal string with two digits of precision e.g. \"10.00\").")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public TransferIntentGet mode(TransferIntentCreateMode mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferIntentCreateMode getMode() {
    return mode;
  }


  public void setMode(TransferIntentCreateMode mode) {
    this.mode = mode;
  }


  public TransferIntentGet network(TransferIntentCreateNetwork network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransferIntentCreateNetwork getNetwork() {
    return network;
  }


  public void setNetwork(TransferIntentCreateNetwork network) {
    this.network = network;
  }


  public TransferIntentGet achClass(ACHClass achClass) {
    
    this.achClass = achClass;
    return this;
  }

   /**
   * Get achClass
   * @return achClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ACHClass getAchClass() {
    return achClass;
  }


  public void setAchClass(ACHClass achClass) {
    this.achClass = achClass;
  }


  public TransferIntentGet user(TransferUserInResponse user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferUserInResponse getUser() {
    return user;
  }


  public void setUser(TransferUserInResponse user) {
    this.user = user;
  }


  public TransferIntentGet description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description for the underlying transfer. Maximum of 8 characters.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "A description for the underlying transfer. Maximum of 8 characters.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TransferIntentGet metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public TransferIntentGet putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * The Metadata object is a mapping of client-provided string fields to any string value. The following limitations apply: The JSON values must be Strings (no nested JSON objects allowed) Only ASCII characters may be used Maximum of 50 key/value pairs Maximum key length of 40 characters Maximum value length of 500 characters 
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Metadata object is a mapping of client-provided string fields to any string value. The following limitations apply: The JSON values must be Strings (no nested JSON objects allowed) Only ASCII characters may be used Maximum of 50 key/value pairs Maximum key length of 40 characters Maximum value length of 500 characters ")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public TransferIntentGet isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The currency of the transfer amount, e.g. \&quot;USD\&quot;
   * @return isoCurrencyCode
  **/
  @ApiModelProperty(required = true, value = "The currency of the transfer amount, e.g. \"USD\"")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public TransferIntentGet requireGuarantee(Boolean requireGuarantee) {
    
    this.requireGuarantee = requireGuarantee;
    return this;
  }

   /**
   * When &#x60;true&#x60;, the transfer requires a &#x60;GUARANTEED&#x60; decision by Plaid to proceed (Guarantee customers only).
   * @return requireGuarantee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When `true`, the transfer requires a `GUARANTEED` decision by Plaid to proceed (Guarantee customers only).")

  public Boolean getRequireGuarantee() {
    return requireGuarantee;
  }


  public void setRequireGuarantee(Boolean requireGuarantee) {
    this.requireGuarantee = requireGuarantee;
  }


  public TransferIntentGet guaranteeDecision(TransferAuthorizationGuaranteeDecision guaranteeDecision) {
    
    this.guaranteeDecision = guaranteeDecision;
    return this;
  }

   /**
   * Get guaranteeDecision
   * @return guaranteeDecision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransferAuthorizationGuaranteeDecision getGuaranteeDecision() {
    return guaranteeDecision;
  }


  public void setGuaranteeDecision(TransferAuthorizationGuaranteeDecision guaranteeDecision) {
    this.guaranteeDecision = guaranteeDecision;
  }


  public TransferIntentGet guaranteeDecisionRationale(TransferAuthorizationGuaranteeDecisionRationale guaranteeDecisionRationale) {
    
    this.guaranteeDecisionRationale = guaranteeDecisionRationale;
    return this;
  }

   /**
   * Get guaranteeDecisionRationale
   * @return guaranteeDecisionRationale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransferAuthorizationGuaranteeDecisionRationale getGuaranteeDecisionRationale() {
    return guaranteeDecisionRationale;
  }


  public void setGuaranteeDecisionRationale(TransferAuthorizationGuaranteeDecisionRationale guaranteeDecisionRationale) {
    this.guaranteeDecisionRationale = guaranteeDecisionRationale;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferIntentGet transferIntentGet = (TransferIntentGet) o;
    return Objects.equals(this.id, transferIntentGet.id) &&
        Objects.equals(this.created, transferIntentGet.created) &&
        Objects.equals(this.status, transferIntentGet.status) &&
        Objects.equals(this.transferId, transferIntentGet.transferId) &&
        Objects.equals(this.failureReason, transferIntentGet.failureReason) &&
        Objects.equals(this.authorizationDecision, transferIntentGet.authorizationDecision) &&
        Objects.equals(this.authorizationDecisionRationale, transferIntentGet.authorizationDecisionRationale) &&
        Objects.equals(this.accountId, transferIntentGet.accountId) &&
        Objects.equals(this.originationAccountId, transferIntentGet.originationAccountId) &&
        Objects.equals(this.fundingAccountId, transferIntentGet.fundingAccountId) &&
        Objects.equals(this.amount, transferIntentGet.amount) &&
        Objects.equals(this.mode, transferIntentGet.mode) &&
        Objects.equals(this.network, transferIntentGet.network) &&
        Objects.equals(this.achClass, transferIntentGet.achClass) &&
        Objects.equals(this.user, transferIntentGet.user) &&
        Objects.equals(this.description, transferIntentGet.description) &&
        Objects.equals(this.metadata, transferIntentGet.metadata) &&
        Objects.equals(this.isoCurrencyCode, transferIntentGet.isoCurrencyCode) &&
        Objects.equals(this.requireGuarantee, transferIntentGet.requireGuarantee) &&
        Objects.equals(this.guaranteeDecision, transferIntentGet.guaranteeDecision) &&
        Objects.equals(this.guaranteeDecisionRationale, transferIntentGet.guaranteeDecisionRationale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, status, transferId, failureReason, authorizationDecision, authorizationDecisionRationale, accountId, originationAccountId, fundingAccountId, amount, mode, network, achClass, user, description, metadata, isoCurrencyCode, requireGuarantee, guaranteeDecision, guaranteeDecisionRationale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferIntentGet {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    authorizationDecision: ").append(toIndentedString(authorizationDecision)).append("\n");
    sb.append("    authorizationDecisionRationale: ").append(toIndentedString(authorizationDecisionRationale)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    originationAccountId: ").append(toIndentedString(originationAccountId)).append("\n");
    sb.append("    fundingAccountId: ").append(toIndentedString(fundingAccountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    achClass: ").append(toIndentedString(achClass)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    requireGuarantee: ").append(toIndentedString(requireGuarantee)).append("\n");
    sb.append("    guaranteeDecision: ").append(toIndentedString(guaranteeDecision)).append("\n");
    sb.append("    guaranteeDecisionRationale: ").append(toIndentedString(guaranteeDecisionRationale)).append("\n");
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

