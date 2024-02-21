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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An institution object. If the Item was created via Same-Day micro-deposit verification, will be &#x60;null&#x60;.
 */
@ApiModel(description = "An institution object. If the Item was created via Same-Day micro-deposit verification, will be `null`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T20:55:29.933887Z[Etc/UTC]")
public class LinkSessionSuccessMetadataInstitution {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;


  public LinkSessionSuccessMetadataInstitution name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The full institution name, such as &#x60;&#39;Wells Fargo&#39;&#x60;
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The full institution name, such as `'Wells Fargo'`")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public LinkSessionSuccessMetadataInstitution institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * The Plaid institution identifier
   * @return institutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Plaid institution identifier")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkSessionSuccessMetadataInstitution linkSessionSuccessMetadataInstitution = (LinkSessionSuccessMetadataInstitution) o;
    return Objects.equals(this.name, linkSessionSuccessMetadataInstitution.name) &&
        Objects.equals(this.institutionId, linkSessionSuccessMetadataInstitution.institutionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, institutionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkSessionSuccessMetadataInstitution {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
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

