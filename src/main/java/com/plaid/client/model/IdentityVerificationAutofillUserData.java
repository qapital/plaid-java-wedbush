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
import com.plaid.client.model.IdentityVerificationAutofillAddress;
import com.plaid.client.model.IdentityVerificationResponseUserName;
import com.plaid.client.model.UserIDNumber;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * User information that was autofilled. All this information should be confirmed by the user before using.
 */
@ApiModel(description = "User information that was autofilled. All this information should be confirmed by the user before using.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T20:55:29.933887Z[Etc/UTC]")
public class IdentityVerificationAutofillUserData {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private IdentityVerificationResponseUserName name;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private IdentityVerificationAutofillAddress address;

  public static final String SERIALIZED_NAME_ID_NUMBER = "id_number";
  @SerializedName(SERIALIZED_NAME_ID_NUMBER)
  private UserIDNumber idNumber;


  public IdentityVerificationAutofillUserData name(IdentityVerificationResponseUserName name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public IdentityVerificationResponseUserName getName() {
    return name;
  }


  public void setName(IdentityVerificationResponseUserName name) {
    this.name = name;
  }


  public IdentityVerificationAutofillUserData address(IdentityVerificationAutofillAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public IdentityVerificationAutofillAddress getAddress() {
    return address;
  }


  public void setAddress(IdentityVerificationAutofillAddress address) {
    this.address = address;
  }


  public IdentityVerificationAutofillUserData idNumber(UserIDNumber idNumber) {
    
    this.idNumber = idNumber;
    return this;
  }

   /**
   * Get idNumber
   * @return idNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public UserIDNumber getIdNumber() {
    return idNumber;
  }


  public void setIdNumber(UserIDNumber idNumber) {
    this.idNumber = idNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityVerificationAutofillUserData identityVerificationAutofillUserData = (IdentityVerificationAutofillUserData) o;
    return Objects.equals(this.name, identityVerificationAutofillUserData.name) &&
        Objects.equals(this.address, identityVerificationAutofillUserData.address) &&
        Objects.equals(this.idNumber, identityVerificationAutofillUserData.idNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address, idNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityVerificationAutofillUserData {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
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

