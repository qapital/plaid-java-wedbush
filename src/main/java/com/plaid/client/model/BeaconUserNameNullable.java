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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The full name for a given Beacon User.
 */
@ApiModel(description = "The full name for a given Beacon User.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T20:46:47.240587Z[Etc/UTC]")
public class BeaconUserNameNullable {
  public static final String SERIALIZED_NAME_GIVEN_NAME = "given_name";
  @SerializedName(SERIALIZED_NAME_GIVEN_NAME)
  private String givenName;

  public static final String SERIALIZED_NAME_FAMILY_NAME = "family_name";
  @SerializedName(SERIALIZED_NAME_FAMILY_NAME)
  private String familyName;


  public BeaconUserNameNullable givenName(String givenName) {
    
    this.givenName = givenName;
    return this;
  }

   /**
   * A string with at least one non-whitespace character, with a max length of 100 characters.
   * @return givenName
  **/
  @ApiModelProperty(example = "Leslie", required = true, value = "A string with at least one non-whitespace character, with a max length of 100 characters.")

  public String getGivenName() {
    return givenName;
  }


  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }


  public BeaconUserNameNullable familyName(String familyName) {
    
    this.familyName = familyName;
    return this;
  }

   /**
   * A string with at least one non-whitespace character, with a max length of 100 characters.
   * @return familyName
  **/
  @ApiModelProperty(example = "Knope", required = true, value = "A string with at least one non-whitespace character, with a max length of 100 characters.")

  public String getFamilyName() {
    return familyName;
  }


  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeaconUserNameNullable beaconUserNameNullable = (BeaconUserNameNullable) o;
    return Objects.equals(this.givenName, beaconUserNameNullable.givenName) &&
        Objects.equals(this.familyName, beaconUserNameNullable.familyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(givenName, familyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconUserNameNullable {\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
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

