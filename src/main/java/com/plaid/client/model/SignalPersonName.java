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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The user&#39;s legal name
 */
@ApiModel(description = "The user's legal name")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-15T20:08:18.129993Z[Etc/UTC]")
public class SignalPersonName {
  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_GIVEN_NAME = "given_name";
  @SerializedName(SERIALIZED_NAME_GIVEN_NAME)
  private String givenName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middle_name";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_FAMILY_NAME = "family_name";
  @SerializedName(SERIALIZED_NAME_FAMILY_NAME)
  private String familyName;

  public static final String SERIALIZED_NAME_SUFFIX = "suffix";
  @SerializedName(SERIALIZED_NAME_SUFFIX)
  private String suffix;


  public SignalPersonName prefix(String prefix) {
    
    this.prefix = prefix;
    return this;
  }

   /**
   * The user&#39;s name prefix (e.g. \&quot;Mr.\&quot;)
   * @return prefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's name prefix (e.g. \"Mr.\")")

  public String getPrefix() {
    return prefix;
  }


  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public SignalPersonName givenName(String givenName) {
    
    this.givenName = givenName;
    return this;
  }

   /**
   * The user&#39;s given name. If the user has a one-word name, it should be provided in this field.
   * @return givenName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's given name. If the user has a one-word name, it should be provided in this field.")

  public String getGivenName() {
    return givenName;
  }


  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }


  public SignalPersonName middleName(String middleName) {
    
    this.middleName = middleName;
    return this;
  }

   /**
   * The user&#39;s middle name
   * @return middleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's middle name")

  public String getMiddleName() {
    return middleName;
  }


  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  public SignalPersonName familyName(String familyName) {
    
    this.familyName = familyName;
    return this;
  }

   /**
   * The user&#39;s family name / surname
   * @return familyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's family name / surname")

  public String getFamilyName() {
    return familyName;
  }


  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }


  public SignalPersonName suffix(String suffix) {
    
    this.suffix = suffix;
    return this;
  }

   /**
   * The user&#39;s name suffix (e.g. \&quot;II\&quot;)
   * @return suffix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's name suffix (e.g. \"II\")")

  public String getSuffix() {
    return suffix;
  }


  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignalPersonName signalPersonName = (SignalPersonName) o;
    return Objects.equals(this.prefix, signalPersonName.prefix) &&
        Objects.equals(this.givenName, signalPersonName.givenName) &&
        Objects.equals(this.middleName, signalPersonName.middleName) &&
        Objects.equals(this.familyName, signalPersonName.familyName) &&
        Objects.equals(this.suffix, signalPersonName.suffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefix, givenName, middleName, familyName, suffix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignalPersonName {\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
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

