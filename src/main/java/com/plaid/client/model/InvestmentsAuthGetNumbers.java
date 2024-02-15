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
import com.plaid.client.model.NumbersACATS;
import com.plaid.client.model.NumbersATON;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Identifying information for transferring holdings to an investments account.
 */
@ApiModel(description = "Identifying information for transferring holdings to an investments account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-15T20:08:18.129993Z[Etc/UTC]")
public class InvestmentsAuthGetNumbers {
  public static final String SERIALIZED_NAME_ACATS = "acats";
  @SerializedName(SERIALIZED_NAME_ACATS)
  private List<NumbersACATS> acats = null;

  public static final String SERIALIZED_NAME_ATON = "aton";
  @SerializedName(SERIALIZED_NAME_ATON)
  private List<NumbersATON> aton = null;


  public InvestmentsAuthGetNumbers acats(List<NumbersACATS> acats) {
    
    this.acats = acats;
    return this;
  }

  public InvestmentsAuthGetNumbers addAcatsItem(NumbersACATS acatsItem) {
    if (this.acats == null) {
      this.acats = new ArrayList<>();
    }
    this.acats.add(acatsItem);
    return this;
  }

   /**
   * Get acats
   * @return acats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NumbersACATS> getAcats() {
    return acats;
  }


  public void setAcats(List<NumbersACATS> acats) {
    this.acats = acats;
  }


  public InvestmentsAuthGetNumbers aton(List<NumbersATON> aton) {
    
    this.aton = aton;
    return this;
  }

  public InvestmentsAuthGetNumbers addAtonItem(NumbersATON atonItem) {
    if (this.aton == null) {
      this.aton = new ArrayList<>();
    }
    this.aton.add(atonItem);
    return this;
  }

   /**
   * Get aton
   * @return aton
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NumbersATON> getAton() {
    return aton;
  }


  public void setAton(List<NumbersATON> aton) {
    this.aton = aton;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentsAuthGetNumbers investmentsAuthGetNumbers = (InvestmentsAuthGetNumbers) o;
    return Objects.equals(this.acats, investmentsAuthGetNumbers.acats) &&
        Objects.equals(this.aton, investmentsAuthGetNumbers.aton);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acats, aton);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentsAuthGetNumbers {\n");
    sb.append("    acats: ").append(toIndentedString(acats)).append("\n");
    sb.append("    aton: ").append(toIndentedString(aton)).append("\n");
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

