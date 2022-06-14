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
import com.plaid.client.model.DeductionsBreakdown;
import com.plaid.client.model.DeductionsTotal;
import com.plaid.client.model.Total;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An object with the deduction information found on a paystub.
 */
@ApiModel(description = "An object with the deduction information found on a paystub.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-14T04:41:23.248820Z[Etc/UTC]")
public class Deductions {
  public static final String SERIALIZED_NAME_SUBTOTALS = "subtotals";
  @SerializedName(SERIALIZED_NAME_SUBTOTALS)
  private List<Total> subtotals = null;

  public static final String SERIALIZED_NAME_BREAKDOWN = "breakdown";
  @SerializedName(SERIALIZED_NAME_BREAKDOWN)
  private List<DeductionsBreakdown> breakdown = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTALS = "totals";
  @SerializedName(SERIALIZED_NAME_TOTALS)
  private List<Total> totals = null;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private DeductionsTotal total;


  public Deductions subtotals(List<Total> subtotals) {
    
    this.subtotals = subtotals;
    return this;
  }

  public Deductions addSubtotalsItem(Total subtotalsItem) {
    if (this.subtotals == null) {
      this.subtotals = new ArrayList<>();
    }
    this.subtotals.add(subtotalsItem);
    return this;
  }

   /**
   * Get subtotals
   * @return subtotals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Total> getSubtotals() {
    return subtotals;
  }


  public void setSubtotals(List<Total> subtotals) {
    this.subtotals = subtotals;
  }


  public Deductions breakdown(List<DeductionsBreakdown> breakdown) {
    
    this.breakdown = breakdown;
    return this;
  }

  public Deductions addBreakdownItem(DeductionsBreakdown breakdownItem) {
    this.breakdown.add(breakdownItem);
    return this;
  }

   /**
   * Get breakdown
   * @return breakdown
  **/
  @ApiModelProperty(required = true, value = "")

  public List<DeductionsBreakdown> getBreakdown() {
    return breakdown;
  }


  public void setBreakdown(List<DeductionsBreakdown> breakdown) {
    this.breakdown = breakdown;
  }


  public Deductions totals(List<Total> totals) {
    
    this.totals = totals;
    return this;
  }

  public Deductions addTotalsItem(Total totalsItem) {
    if (this.totals == null) {
      this.totals = new ArrayList<>();
    }
    this.totals.add(totalsItem);
    return this;
  }

   /**
   * Get totals
   * @return totals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Total> getTotals() {
    return totals;
  }


  public void setTotals(List<Total> totals) {
    this.totals = totals;
  }


  public Deductions total(DeductionsTotal total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(required = true, value = "")

  public DeductionsTotal getTotal() {
    return total;
  }


  public void setTotal(DeductionsTotal total) {
    this.total = total;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deductions deductions = (Deductions) o;
    return Objects.equals(this.subtotals, deductions.subtotals) &&
        Objects.equals(this.breakdown, deductions.breakdown) &&
        Objects.equals(this.totals, deductions.totals) &&
        Objects.equals(this.total, deductions.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subtotals, breakdown, totals, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deductions {\n");
    sb.append("    subtotals: ").append(toIndentedString(subtotals)).append("\n");
    sb.append("    breakdown: ").append(toIndentedString(breakdown)).append("\n");
    sb.append("    totals: ").append(toIndentedString(totals)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

