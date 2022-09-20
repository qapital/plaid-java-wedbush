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
 * URLs for downloading original and cropped images for this document submission. The URLs are designed to only allow downloading, not hot linking, so the URL will only serve the document image for 60 seconds before expiring. The expiration time is 60 seconds after the &#x60;GET&#x60; request for the associated Identity Verification attempt. A new expiring URL is generated with each request, so you can always rerequest the Identity Verification attempt if one of your URLs expires.
 */
@ApiModel(description = "URLs for downloading original and cropped images for this document submission. The URLs are designed to only allow downloading, not hot linking, so the URL will only serve the document image for 60 seconds before expiring. The expiration time is 60 seconds after the `GET` request for the associated Identity Verification attempt. A new expiring URL is generated with each request, so you can always rerequest the Identity Verification attempt if one of your URLs expires.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-20T04:12:52.507993Z[Etc/UTC]")
public class PhysicalDocumentImages {
  public static final String SERIALIZED_NAME_ORIGINAL_FRONT = "original_front";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_FRONT)
  private String originalFront;

  public static final String SERIALIZED_NAME_ORIGINAL_BACK = "original_back";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_BACK)
  private String originalBack;

  public static final String SERIALIZED_NAME_CROPPED_FRONT = "cropped_front";
  @SerializedName(SERIALIZED_NAME_CROPPED_FRONT)
  private String croppedFront;

  public static final String SERIALIZED_NAME_CROPPED_BACK = "cropped_back";
  @SerializedName(SERIALIZED_NAME_CROPPED_BACK)
  private String croppedBack;

  public static final String SERIALIZED_NAME_FACE = "face";
  @SerializedName(SERIALIZED_NAME_FACE)
  private String face;


  public PhysicalDocumentImages originalFront(String originalFront) {
    
    this.originalFront = originalFront;
    return this;
  }

   /**
   * Temporary URL that expires after 60 seconds for downloading the uncropped original image of the front of the document.
   * @return originalFront
  **/
  @ApiModelProperty(example = "https://example.plaid.com/verifications/idv_52xR9LKo77r1Np/documents/1/original_front.jpeg", required = true, value = "Temporary URL that expires after 60 seconds for downloading the uncropped original image of the front of the document.")

  public String getOriginalFront() {
    return originalFront;
  }


  public void setOriginalFront(String originalFront) {
    this.originalFront = originalFront;
  }


  public PhysicalDocumentImages originalBack(String originalBack) {
    
    this.originalBack = originalBack;
    return this;
  }

   /**
   * Temporary URL that expires after 60 seconds for downloading the original image of the back of the document. Might be null if the back of the document was not collected.
   * @return originalBack
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.plaid.com/verifications/idv_52xR9LKo77r1Np/documents/1/original_back.jpeg", required = true, value = "Temporary URL that expires after 60 seconds for downloading the original image of the back of the document. Might be null if the back of the document was not collected.")

  public String getOriginalBack() {
    return originalBack;
  }


  public void setOriginalBack(String originalBack) {
    this.originalBack = originalBack;
  }


  public PhysicalDocumentImages croppedFront(String croppedFront) {
    
    this.croppedFront = croppedFront;
    return this;
  }

   /**
   * Temporary URL that expires after 60 seconds for downloading a cropped image containing just the front of the document.
   * @return croppedFront
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.plaid.com/verifications/idv_52xR9LKo77r1Np/documents/1/cropped_front.jpeg", required = true, value = "Temporary URL that expires after 60 seconds for downloading a cropped image containing just the front of the document.")

  public String getCroppedFront() {
    return croppedFront;
  }


  public void setCroppedFront(String croppedFront) {
    this.croppedFront = croppedFront;
  }


  public PhysicalDocumentImages croppedBack(String croppedBack) {
    
    this.croppedBack = croppedBack;
    return this;
  }

   /**
   * Temporary URL that expires after 60 seconds for downloading a cropped image containing just the back of the document. Might be null if the back of the document was not collected.
   * @return croppedBack
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.plaid.com/verifications/idv_52xR9LKo77r1Np/documents/1/cropped_back.jpeg", required = true, value = "Temporary URL that expires after 60 seconds for downloading a cropped image containing just the back of the document. Might be null if the back of the document was not collected.")

  public String getCroppedBack() {
    return croppedBack;
  }


  public void setCroppedBack(String croppedBack) {
    this.croppedBack = croppedBack;
  }


  public PhysicalDocumentImages face(String face) {
    
    this.face = face;
    return this;
  }

   /**
   * Temporary URL that expires after 60 seconds for downloading a crop of just the user&#39;s face from the document image. Might be null if the document does not contain a face photo.
   * @return face
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.plaid.com/verifications/idv_52xR9LKo77r1Np/documents/1/face.jpeg", required = true, value = "Temporary URL that expires after 60 seconds for downloading a crop of just the user's face from the document image. Might be null if the document does not contain a face photo.")

  public String getFace() {
    return face;
  }


  public void setFace(String face) {
    this.face = face;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhysicalDocumentImages physicalDocumentImages = (PhysicalDocumentImages) o;
    return Objects.equals(this.originalFront, physicalDocumentImages.originalFront) &&
        Objects.equals(this.originalBack, physicalDocumentImages.originalBack) &&
        Objects.equals(this.croppedFront, physicalDocumentImages.croppedFront) &&
        Objects.equals(this.croppedBack, physicalDocumentImages.croppedBack) &&
        Objects.equals(this.face, physicalDocumentImages.face);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalFront, originalBack, croppedFront, croppedBack, face);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhysicalDocumentImages {\n");
    sb.append("    originalFront: ").append(toIndentedString(originalFront)).append("\n");
    sb.append("    originalBack: ").append(toIndentedString(originalBack)).append("\n");
    sb.append("    croppedFront: ").append(toIndentedString(croppedFront)).append("\n");
    sb.append("    croppedBack: ").append(toIndentedString(croppedBack)).append("\n");
    sb.append("    face: ").append(toIndentedString(face)).append("\n");
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

