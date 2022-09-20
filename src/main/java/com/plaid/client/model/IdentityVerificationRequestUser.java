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
import com.plaid.client.model.UserAddress;
import com.plaid.client.model.UserIDNumber;
import com.plaid.client.model.UserName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * User information collected outside of Link, most likely via your own onboarding process.  Each of the following identity fields are optional:  &#x60;email_address&#x60;  &#x60;phone_number&#x60;  &#x60;date_of_birth&#x60;  &#x60;name&#x60;  &#x60;address&#x60;  &#x60;id_number&#x60; Specifically, these fields are optional in that they can either be fully provided (satisfying every required field in their subschema) or omitted from the request entirely by not providing the key or value. Providing these fields via the API will result in Link skipping the data collection process for the associated user. All verification steps enabled in the associated Identity Verification Template will still be run. Verification steps will either be run immediately, or once the user completes the &#x60;accept_tos&#x60; step, depending on the value provided to the &#x60;gave_consent&#x60; field.
 */
@ApiModel(description = "User information collected outside of Link, most likely via your own onboarding process.  Each of the following identity fields are optional:  `email_address`  `phone_number`  `date_of_birth`  `name`  `address`  `id_number` Specifically, these fields are optional in that they can either be fully provided (satisfying every required field in their subschema) or omitted from the request entirely by not providing the key or value. Providing these fields via the API will result in Link skipping the data collection process for the associated user. All verification steps enabled in the associated Identity Verification Template will still be run. Verification steps will either be run immediately, or once the user completes the `accept_tos` step, depending on the value provided to the `gave_consent` field.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-20T04:12:52.507993Z[Etc/UTC]")
public class IdentityVerificationRequestUser {
  public static final String SERIALIZED_NAME_CLIENT_USER_ID = "client_user_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_USER_ID)
  private String clientUserId;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private LocalDate dateOfBirth;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private UserName name;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private UserAddress address;

  public static final String SERIALIZED_NAME_ID_NUMBER = "id_number";
  @SerializedName(SERIALIZED_NAME_ID_NUMBER)
  private UserIDNumber idNumber;


  public IdentityVerificationRequestUser clientUserId(String clientUserId) {
    
    this.clientUserId = clientUserId;
    return this;
  }

   /**
   * An identifier to help you connect this object to your internal systems. For example, your database ID corresponding to this object.
   * @return clientUserId
  **/
  @ApiModelProperty(example = "your-db-id-3b24110", required = true, value = "An identifier to help you connect this object to your internal systems. For example, your database ID corresponding to this object.")

  public String getClientUserId() {
    return clientUserId;
  }


  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }


  public IdentityVerificationRequestUser emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * A valid email address.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user@example.com", value = "A valid email address.")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public IdentityVerificationRequestUser phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * A phone number in E.164 format.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+19876543212", value = "A phone number in E.164 format.")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public IdentityVerificationRequestUser dateOfBirth(LocalDate dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * A date in the format YYYY-MM-DD (RFC 3339 Section 5.6).
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue May 29 00:00:00 UTC 1990", value = "A date in the format YYYY-MM-DD (RFC 3339 Section 5.6).")

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public IdentityVerificationRequestUser name(UserName name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserName getName() {
    return name;
  }


  public void setName(UserName name) {
    this.name = name;
  }


  public IdentityVerificationRequestUser address(UserAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserAddress getAddress() {
    return address;
  }


  public void setAddress(UserAddress address) {
    this.address = address;
  }


  public IdentityVerificationRequestUser idNumber(UserIDNumber idNumber) {
    
    this.idNumber = idNumber;
    return this;
  }

   /**
   * Get idNumber
   * @return idNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    IdentityVerificationRequestUser identityVerificationRequestUser = (IdentityVerificationRequestUser) o;
    return Objects.equals(this.clientUserId, identityVerificationRequestUser.clientUserId) &&
        Objects.equals(this.emailAddress, identityVerificationRequestUser.emailAddress) &&
        Objects.equals(this.phoneNumber, identityVerificationRequestUser.phoneNumber) &&
        Objects.equals(this.dateOfBirth, identityVerificationRequestUser.dateOfBirth) &&
        Objects.equals(this.name, identityVerificationRequestUser.name) &&
        Objects.equals(this.address, identityVerificationRequestUser.address) &&
        Objects.equals(this.idNumber, identityVerificationRequestUser.idNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientUserId, emailAddress, phoneNumber, dateOfBirth, name, address, idNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityVerificationRequestUser {\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
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

