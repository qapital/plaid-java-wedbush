/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.177.1
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
 * Score found by matching phone number provided by the API with the phone number on the account at the financial institution. If the account contains multiple owners, the maximum match score is filled.
 */
@ApiModel(description = "Score found by matching phone number provided by the API with the phone number on the account at the financial institution. If the account contains multiple owners, the maximum match score is filled.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-20T04:12:52.507993Z[Etc/UTC]")
public class PhoneNumberMatchScore {
  public static final String SERIALIZED_NAME_SCORES = "scores";
  @SerializedName(SERIALIZED_NAME_SCORES)
  private Integer scores;


  public PhoneNumberMatchScore scores(Integer scores) {
    
    this.scores = scores;
    return this;
  }

   /**
   * Match score for normalized phone number. 100 is a perfect match and 0 is a no match. If the phone number is missing from either the API or financial institution, this is empty.
   * @return scores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Match score for normalized phone number. 100 is a perfect match and 0 is a no match. If the phone number is missing from either the API or financial institution, this is empty.")

  public Integer getScores() {
    return scores;
  }


  public void setScores(Integer scores) {
    this.scores = scores;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumberMatchScore phoneNumberMatchScore = (PhoneNumberMatchScore) o;
    return Objects.equals(this.scores, phoneNumberMatchScore.scores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumberMatchScore {\n");
    sb.append("    scores: ").append(toIndentedString(scores)).append("\n");
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

