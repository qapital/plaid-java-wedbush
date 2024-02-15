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
import com.plaid.client.model.CreditPayStubAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An object representing a filer used by 1099-K tax documents.
 */
@ApiModel(description = "An object representing a filer used by 1099-K tax documents.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-15T20:08:18.129993Z[Etc/UTC]")
public class Credit1099Filer {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private CreditPayStubAddress address;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TIN = "tin";
  @SerializedName(SERIALIZED_NAME_TIN)
  private String tin;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public Credit1099Filer address(CreditPayStubAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreditPayStubAddress getAddress() {
    return address;
  }


  public void setAddress(CreditPayStubAddress address) {
    this.address = address;
  }


  public Credit1099Filer name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of filer.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of filer.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Credit1099Filer tin(String tin) {
    
    this.tin = tin;
    return this;
  }

   /**
   * Tax identification number of filer.
   * @return tin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tax identification number of filer.")

  public String getTin() {
    return tin;
  }


  public void setTin(String tin) {
    this.tin = tin;
  }


  public Credit1099Filer type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * One of the following values will be provided: Payment Settlement Entity (PSE), Electronic Payment Facilitator (EPF), Other Third Party
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One of the following values will be provided: Payment Settlement Entity (PSE), Electronic Payment Facilitator (EPF), Other Third Party")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Credit1099Filer credit1099Filer = (Credit1099Filer) o;
    return Objects.equals(this.address, credit1099Filer.address) &&
        Objects.equals(this.name, credit1099Filer.name) &&
        Objects.equals(this.tin, credit1099Filer.tin) &&
        Objects.equals(this.type, credit1099Filer.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, name, tin, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Credit1099Filer {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

