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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Largest number of days between sequential transactions per calendar month
 */
@ApiModel(description = "Largest number of days between sequential transactions per calendar month")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-10T22:39:54.038561Z[Etc/UTC]")
public class BaseReportLongestGapInsights {
  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_DAYS = "days";
  @SerializedName(SERIALIZED_NAME_DAYS)
  private Integer days;


  public BaseReportLongestGapInsights startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of this time period. The date will be returned in an ISO 8601 format (YYYY-MM-DD).
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start date of this time period. The date will be returned in an ISO 8601 format (YYYY-MM-DD).")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public BaseReportLongestGapInsights endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date of this time period. The date will be returned in an ISO 8601 format (YYYY-MM-DD).
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end date of this time period. The date will be returned in an ISO 8601 format (YYYY-MM-DD).")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public BaseReportLongestGapInsights days(Integer days) {
    
    this.days = days;
    return this;
  }

   /**
   * Largest number of days between sequential transactions for this time period.
   * @return days
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Largest number of days between sequential transactions for this time period.")

  public Integer getDays() {
    return days;
  }


  public void setDays(Integer days) {
    this.days = days;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseReportLongestGapInsights baseReportLongestGapInsights = (BaseReportLongestGapInsights) o;
    return Objects.equals(this.startDate, baseReportLongestGapInsights.startDate) &&
        Objects.equals(this.endDate, baseReportLongestGapInsights.endDate) &&
        Objects.equals(this.days, baseReportLongestGapInsights.days);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, days);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseReportLongestGapInsights {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
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

