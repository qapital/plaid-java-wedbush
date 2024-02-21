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
import com.plaid.client.model.LoanIdentifier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Collection of current and previous identifiers for this loan.
 */
@ApiModel(description = "Collection of current and previous identifiers for this loan.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T20:55:29.933887Z[Etc/UTC]")
public class CreditFreddieMacLoanIdentifiers {
  public static final String SERIALIZED_NAME_L_O_A_N_I_D_E_N_T_I_F_I_E_R = "LOAN_IDENTIFIER";
  @SerializedName(SERIALIZED_NAME_L_O_A_N_I_D_E_N_T_I_F_I_E_R)
  private List<LoanIdentifier> LOAN_IDENTIFIER = new ArrayList<>();


  public CreditFreddieMacLoanIdentifiers LOAN_IDENTIFIER(List<LoanIdentifier> LOAN_IDENTIFIER) {
    
    this.LOAN_IDENTIFIER = LOAN_IDENTIFIER;
    return this;
  }

  public CreditFreddieMacLoanIdentifiers addLOANIDENTIFIERItem(LoanIdentifier LOAN_IDENTIFIERItem) {
    this.LOAN_IDENTIFIER.add(LOAN_IDENTIFIERItem);
    return this;
  }

   /**
   * Get LOAN_IDENTIFIER
   * @return LOAN_IDENTIFIER
  **/
  @ApiModelProperty(required = true, value = "")

  public List<LoanIdentifier> getLOANIDENTIFIER() {
    return LOAN_IDENTIFIER;
  }


  public void setLOANIDENTIFIER(List<LoanIdentifier> LOAN_IDENTIFIER) {
    this.LOAN_IDENTIFIER = LOAN_IDENTIFIER;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditFreddieMacLoanIdentifiers creditFreddieMacLoanIdentifiers = (CreditFreddieMacLoanIdentifiers) o;
    return Objects.equals(this.LOAN_IDENTIFIER, creditFreddieMacLoanIdentifiers.LOAN_IDENTIFIER);
  }

  @Override
  public int hashCode() {
    return Objects.hash(LOAN_IDENTIFIER);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditFreddieMacLoanIdentifiers {\n");
    sb.append("    LOAN_IDENTIFIER: ").append(toIndentedString(LOAN_IDENTIFIER)).append("\n");
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

