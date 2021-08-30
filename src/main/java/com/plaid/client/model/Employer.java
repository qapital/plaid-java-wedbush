/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.26.1
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
import com.plaid.client.model.AddressDataNullable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Data about the employer.
 */
@ApiModel(description = "Data about the employer.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-30T20:56:28.111Z[GMT]")
public class Employer {
  public static final String SERIALIZED_NAME_EMPLOYER_ID = "employer_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_ID)
  private String employerId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private AddressDataNullable address = null;

  public static final String SERIALIZED_NAME_CONFIDENCE_SCORE = "confidence_score";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE_SCORE)
  private Double confidenceScore;


  public Employer employerId(String employerId) {
    
    this.employerId = employerId;
    return this;
  }

   /**
   * Plaid&#39;s unique identifier for the employer.
   * @return employerId
  **/
  @ApiModelProperty(required = true, value = "Plaid's unique identifier for the employer.")

  public String getEmployerId() {
    return employerId;
  }


  public void setEmployerId(String employerId) {
    this.employerId = employerId;
  }


  public Employer name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the employer
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the employer")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Employer address(AddressDataNullable address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public AddressDataNullable getAddress() {
    return address;
  }


  public void setAddress(AddressDataNullable address) {
    this.address = address;
  }


  public Employer confidenceScore(Double confidenceScore) {
    
    this.confidenceScore = confidenceScore;
    return this;
  }

   /**
   * A number from 0 to 1 indicating Plaid&#39;s level of confidence in the pairing between the employer and the institution (not yet implemented).
   * @return confidenceScore
  **/
  @ApiModelProperty(required = true, value = "A number from 0 to 1 indicating Plaid's level of confidence in the pairing between the employer and the institution (not yet implemented).")

  public Double getConfidenceScore() {
    return confidenceScore;
  }


  public void setConfidenceScore(Double confidenceScore) {
    this.confidenceScore = confidenceScore;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employer employer = (Employer) o;
    return Objects.equals(this.employerId, employer.employerId) &&
        Objects.equals(this.name, employer.name) &&
        Objects.equals(this.address, employer.address) &&
        Objects.equals(this.confidenceScore, employer.confidenceScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employerId, name, address, confidenceScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employer {\n");
    sb.append("    employerId: ").append(toIndentedString(employerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    confidenceScore: ").append(toIndentedString(confidenceScore)).append("\n");
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

