/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.61.0
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
import com.plaid.client.model.TransferAuthorizationDecisionRationale;
import com.plaid.client.model.TransferAuthorizationProposedTransfer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * TransferAuthorization contains the authorization decision for a proposed transfer
 */
@ApiModel(description = "TransferAuthorization contains the authorization decision for a proposed transfer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-05T20:07:39.230Z[GMT]")
public class TransferAuthorization {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  /**
   *  A decision regarding the proposed transfer.  &#x60;approved&#x60; – The proposed transfer has received the end user&#39;s consent and has been approved for processing. Plaid has also reviewed the proposed transfer and has approved it for processing.   &#x60;permitted&#x60; – Plaid was unable to fetch the information required to approve or decline the proposed transfer. You may proceed with the transfer, but further review is recommended. Plaid is awaiting further instructions from the client.  &#x60;declined&#x60; – Plaid reviewed the proposed transfer and declined processing. Refer to the &#x60;code&#x60; field in the &#x60;decision_rationale&#x60; object for details.
   */
  @JsonAdapter(DecisionEnum.Adapter.class)
  public enum DecisionEnum {
    APPROVED("approved"),
    
    PERMITTED("permitted"),
    
    DECLINED("declined");

    private String value;

    DecisionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DecisionEnum fromValue(String value) {
      for (DecisionEnum b : DecisionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DecisionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DecisionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DecisionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DecisionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DECISION = "decision";
  @SerializedName(SERIALIZED_NAME_DECISION)
  private DecisionEnum decision;

  public static final String SERIALIZED_NAME_DECISION_RATIONALE = "decision_rationale";
  @SerializedName(SERIALIZED_NAME_DECISION_RATIONALE)
  private TransferAuthorizationDecisionRationale decisionRationale;

  public static final String SERIALIZED_NAME_PROPOSED_TRANSFER = "proposed_transfer";
  @SerializedName(SERIALIZED_NAME_PROPOSED_TRANSFER)
  private TransferAuthorizationProposedTransfer proposedTransfer;


  public TransferAuthorization id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Plaid’s unique identifier for a transfer authorization.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for a transfer authorization.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TransferAuthorization created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The datetime representing when the authorization was created, in the format &#x60;2006-01-02T15:04:05Z&#x60;.
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The datetime representing when the authorization was created, in the format `2006-01-02T15:04:05Z`.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public TransferAuthorization decision(DecisionEnum decision) {
    
    this.decision = decision;
    return this;
  }

   /**
   *  A decision regarding the proposed transfer.  &#x60;approved&#x60; – The proposed transfer has received the end user&#39;s consent and has been approved for processing. Plaid has also reviewed the proposed transfer and has approved it for processing.   &#x60;permitted&#x60; – Plaid was unable to fetch the information required to approve or decline the proposed transfer. You may proceed with the transfer, but further review is recommended. Plaid is awaiting further instructions from the client.  &#x60;declined&#x60; – Plaid reviewed the proposed transfer and declined processing. Refer to the &#x60;code&#x60; field in the &#x60;decision_rationale&#x60; object for details.
   * @return decision
  **/
  @ApiModelProperty(required = true, value = " A decision regarding the proposed transfer.  `approved` – The proposed transfer has received the end user's consent and has been approved for processing. Plaid has also reviewed the proposed transfer and has approved it for processing.   `permitted` – Plaid was unable to fetch the information required to approve or decline the proposed transfer. You may proceed with the transfer, but further review is recommended. Plaid is awaiting further instructions from the client.  `declined` – Plaid reviewed the proposed transfer and declined processing. Refer to the `code` field in the `decision_rationale` object for details.")

  public DecisionEnum getDecision() {
    return decision;
  }


  public void setDecision(DecisionEnum decision) {
    this.decision = decision;
  }


  public TransferAuthorization decisionRationale(TransferAuthorizationDecisionRationale decisionRationale) {
    
    this.decisionRationale = decisionRationale;
    return this;
  }

   /**
   * Get decisionRationale
   * @return decisionRationale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransferAuthorizationDecisionRationale getDecisionRationale() {
    return decisionRationale;
  }


  public void setDecisionRationale(TransferAuthorizationDecisionRationale decisionRationale) {
    this.decisionRationale = decisionRationale;
  }


  public TransferAuthorization proposedTransfer(TransferAuthorizationProposedTransfer proposedTransfer) {
    
    this.proposedTransfer = proposedTransfer;
    return this;
  }

   /**
   * Get proposedTransfer
   * @return proposedTransfer
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferAuthorizationProposedTransfer getProposedTransfer() {
    return proposedTransfer;
  }


  public void setProposedTransfer(TransferAuthorizationProposedTransfer proposedTransfer) {
    this.proposedTransfer = proposedTransfer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferAuthorization transferAuthorization = (TransferAuthorization) o;
    return Objects.equals(this.id, transferAuthorization.id) &&
        Objects.equals(this.created, transferAuthorization.created) &&
        Objects.equals(this.decision, transferAuthorization.decision) &&
        Objects.equals(this.decisionRationale, transferAuthorization.decisionRationale) &&
        Objects.equals(this.proposedTransfer, transferAuthorization.proposedTransfer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, decision, decisionRationale, proposedTransfer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferAuthorization {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("    decisionRationale: ").append(toIndentedString(decisionRationale)).append("\n");
    sb.append("    proposedTransfer: ").append(toIndentedString(proposedTransfer)).append("\n");
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

