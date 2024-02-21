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
import com.plaid.client.model.BeaconMatchSummaryCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Analysis of which fields matched between the originally reported Beacon User and the Beacon User that the report was syndicated to.
 */
@ApiModel(description = "Analysis of which fields matched between the originally reported Beacon User and the Beacon User that the report was syndicated to.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T20:55:29.933887Z[Etc/UTC]")
public class BeaconReportSyndicationAnalysis {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private BeaconMatchSummaryCode address;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private BeaconMatchSummaryCode dateOfBirth;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private BeaconMatchSummaryCode emailAddress;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private BeaconMatchSummaryCode name;

  public static final String SERIALIZED_NAME_ID_NUMBER = "id_number";
  @SerializedName(SERIALIZED_NAME_ID_NUMBER)
  private BeaconMatchSummaryCode idNumber;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private BeaconMatchSummaryCode ipAddress;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private BeaconMatchSummaryCode phoneNumber;


  public BeaconReportSyndicationAnalysis address(BeaconMatchSummaryCode address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(required = true, value = "")

  public BeaconMatchSummaryCode getAddress() {
    return address;
  }


  public void setAddress(BeaconMatchSummaryCode address) {
    this.address = address;
  }


  public BeaconReportSyndicationAnalysis dateOfBirth(BeaconMatchSummaryCode dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @ApiModelProperty(required = true, value = "")

  public BeaconMatchSummaryCode getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(BeaconMatchSummaryCode dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public BeaconReportSyndicationAnalysis emailAddress(BeaconMatchSummaryCode emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @ApiModelProperty(required = true, value = "")

  public BeaconMatchSummaryCode getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(BeaconMatchSummaryCode emailAddress) {
    this.emailAddress = emailAddress;
  }


  public BeaconReportSyndicationAnalysis name(BeaconMatchSummaryCode name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public BeaconMatchSummaryCode getName() {
    return name;
  }


  public void setName(BeaconMatchSummaryCode name) {
    this.name = name;
  }


  public BeaconReportSyndicationAnalysis idNumber(BeaconMatchSummaryCode idNumber) {
    
    this.idNumber = idNumber;
    return this;
  }

   /**
   * Get idNumber
   * @return idNumber
  **/
  @ApiModelProperty(required = true, value = "")

  public BeaconMatchSummaryCode getIdNumber() {
    return idNumber;
  }


  public void setIdNumber(BeaconMatchSummaryCode idNumber) {
    this.idNumber = idNumber;
  }


  public BeaconReportSyndicationAnalysis ipAddress(BeaconMatchSummaryCode ipAddress) {
    
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @ApiModelProperty(required = true, value = "")

  public BeaconMatchSummaryCode getIpAddress() {
    return ipAddress;
  }


  public void setIpAddress(BeaconMatchSummaryCode ipAddress) {
    this.ipAddress = ipAddress;
  }


  public BeaconReportSyndicationAnalysis phoneNumber(BeaconMatchSummaryCode phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(required = true, value = "")

  public BeaconMatchSummaryCode getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(BeaconMatchSummaryCode phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeaconReportSyndicationAnalysis beaconReportSyndicationAnalysis = (BeaconReportSyndicationAnalysis) o;
    return Objects.equals(this.address, beaconReportSyndicationAnalysis.address) &&
        Objects.equals(this.dateOfBirth, beaconReportSyndicationAnalysis.dateOfBirth) &&
        Objects.equals(this.emailAddress, beaconReportSyndicationAnalysis.emailAddress) &&
        Objects.equals(this.name, beaconReportSyndicationAnalysis.name) &&
        Objects.equals(this.idNumber, beaconReportSyndicationAnalysis.idNumber) &&
        Objects.equals(this.ipAddress, beaconReportSyndicationAnalysis.ipAddress) &&
        Objects.equals(this.phoneNumber, beaconReportSyndicationAnalysis.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, dateOfBirth, emailAddress, name, idNumber, ipAddress, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconReportSyndicationAnalysis {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

