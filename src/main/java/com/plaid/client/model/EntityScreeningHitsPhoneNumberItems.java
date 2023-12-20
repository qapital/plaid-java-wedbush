/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.482.3
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
import com.plaid.client.model.EntityScreeningHitPhoneNumbers;
import com.plaid.client.model.MatchSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Analyzed phone numbers for the associated hit
 */
@ApiModel(description = "Analyzed phone numbers for the associated hit")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T20:46:47.240587Z[Etc/UTC]")
public class EntityScreeningHitsPhoneNumberItems {
  public static final String SERIALIZED_NAME_ANALYSIS = "analysis";
  @SerializedName(SERIALIZED_NAME_ANALYSIS)
  private MatchSummary analysis;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private EntityScreeningHitPhoneNumbers data;


  public EntityScreeningHitsPhoneNumberItems analysis(MatchSummary analysis) {
    
    this.analysis = analysis;
    return this;
  }

   /**
   * Get analysis
   * @return analysis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MatchSummary getAnalysis() {
    return analysis;
  }


  public void setAnalysis(MatchSummary analysis) {
    this.analysis = analysis;
  }


  public EntityScreeningHitsPhoneNumberItems data(EntityScreeningHitPhoneNumbers data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EntityScreeningHitPhoneNumbers getData() {
    return data;
  }


  public void setData(EntityScreeningHitPhoneNumbers data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityScreeningHitsPhoneNumberItems entityScreeningHitsPhoneNumberItems = (EntityScreeningHitsPhoneNumberItems) o;
    return Objects.equals(this.analysis, entityScreeningHitsPhoneNumberItems.analysis) &&
        Objects.equals(this.data, entityScreeningHitsPhoneNumberItems.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysis, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityScreeningHitsPhoneNumberItems {\n");
    sb.append("    analysis: ").append(toIndentedString(analysis)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

