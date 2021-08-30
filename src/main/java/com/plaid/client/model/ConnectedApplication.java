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
import com.plaid.client.model.RequestedScopes;
import com.plaid.client.model.ScopesNullable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Describes the connected application for a particular end user.
 */
@ApiModel(description = "Describes the connected application for a particular end user.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-30T20:56:28.111Z[GMT]")
public class ConnectedApplication {
  public static final String SERIALIZED_NAME_APPLICATION_ID = "application_id";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private String applicationId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private String logo;

  public static final String SERIALIZED_NAME_LOGO_URL = "logo_url";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_APPLICATION_URL = "application_url";
  @SerializedName(SERIALIZED_NAME_APPLICATION_URL)
  private String applicationUrl;

  public static final String SERIALIZED_NAME_REASON_FOR_ACCESS = "reason_for_access";
  @SerializedName(SERIALIZED_NAME_REASON_FOR_ACCESS)
  private String reasonForAccess;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private LocalDate createdAt;

  /**
   * Gets or Sets productDataTypes
   */
  @JsonAdapter(ProductDataTypesEnum.Adapter.class)
  public enum ProductDataTypesEnum {
    BALANCE("ACCOUNT_BALANCE"),
    
    USER_INFO("ACCOUNT_USER_INFO"),
    
    TRANSACTIONS("ACCOUNT_TRANSACTIONS");

    private String value;

    ProductDataTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProductDataTypesEnum fromValue(String value) {
      for (ProductDataTypesEnum b : ProductDataTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProductDataTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProductDataTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProductDataTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProductDataTypesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PRODUCT_DATA_TYPES = "product_data_types";
  @SerializedName(SERIALIZED_NAME_PRODUCT_DATA_TYPES)
  private List<ProductDataTypesEnum> productDataTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
  private ScopesNullable scopes = null;

  public static final String SERIALIZED_NAME_REQUESTED_SCOPES = "requested_scopes";
  @SerializedName(SERIALIZED_NAME_REQUESTED_SCOPES)
  private RequestedScopes requestedScopes;


  public ConnectedApplication applicationId(String applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * This field will map to the application ID that is returned from /item/applications/list, or provided to the institution in an oauth redirect.
   * @return applicationId
  **/
  @ApiModelProperty(required = true, value = "This field will map to the application ID that is returned from /item/applications/list, or provided to the institution in an oauth redirect.")

  public String getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  public ConnectedApplication name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the application
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the application")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ConnectedApplication logo(String logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * A URL that links to the application logo image (will be deprecated in the future, please use logo_url).
   * @return logo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A URL that links to the application logo image (will be deprecated in the future, please use logo_url).")

  public String getLogo() {
    return logo;
  }


  public void setLogo(String logo) {
    this.logo = logo;
  }


  public ConnectedApplication logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * A URL that links to the application logo image.
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A URL that links to the application logo image.")

  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public ConnectedApplication applicationUrl(String applicationUrl) {
    
    this.applicationUrl = applicationUrl;
    return this;
  }

   /**
   * The URL for the application&#39;s website
   * @return applicationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The URL for the application's website")

  public String getApplicationUrl() {
    return applicationUrl;
  }


  public void setApplicationUrl(String applicationUrl) {
    this.applicationUrl = applicationUrl;
  }


  public ConnectedApplication reasonForAccess(String reasonForAccess) {
    
    this.reasonForAccess = reasonForAccess;
    return this;
  }

   /**
   * A string provided by the connected app stating why they use their respective enabled products.
   * @return reasonForAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A string provided by the connected app stating why they use their respective enabled products.")

  public String getReasonForAccess() {
    return reasonForAccess;
  }


  public void setReasonForAccess(String reasonForAccess) {
    this.reasonForAccess = reasonForAccess;
  }


  public ConnectedApplication createdAt(LocalDate createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date this application was linked in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format in UTC.
   * @return createdAt
  **/
  @ApiModelProperty(example = "Wed Jan 01 00:00:00 GMT 2020", required = true, value = "The date this application was linked in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format in UTC.")

  public LocalDate getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }


  public ConnectedApplication productDataTypes(List<ProductDataTypesEnum> productDataTypes) {
    
    this.productDataTypes = productDataTypes;
    return this;
  }

  public ConnectedApplication addProductDataTypesItem(ProductDataTypesEnum productDataTypesItem) {
    this.productDataTypes.add(productDataTypesItem);
    return this;
  }

   /**
   * (Deprecated) A list of enums representing the data collected and products enabled for this connected application.
   * @return productDataTypes
  **/
  @ApiModelProperty(required = true, value = "(Deprecated) A list of enums representing the data collected and products enabled for this connected application.")

  public List<ProductDataTypesEnum> getProductDataTypes() {
    return productDataTypes;
  }


  public void setProductDataTypes(List<ProductDataTypesEnum> productDataTypes) {
    this.productDataTypes = productDataTypes;
  }


  public ConnectedApplication scopes(ScopesNullable scopes) {
    
    this.scopes = scopes;
    return this;
  }

   /**
   * Get scopes
   * @return scopes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScopesNullable getScopes() {
    return scopes;
  }


  public void setScopes(ScopesNullable scopes) {
    this.scopes = scopes;
  }


  public ConnectedApplication requestedScopes(RequestedScopes requestedScopes) {
    
    this.requestedScopes = requestedScopes;
    return this;
  }

   /**
   * Get requestedScopes
   * @return requestedScopes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RequestedScopes getRequestedScopes() {
    return requestedScopes;
  }


  public void setRequestedScopes(RequestedScopes requestedScopes) {
    this.requestedScopes = requestedScopes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectedApplication connectedApplication = (ConnectedApplication) o;
    return Objects.equals(this.applicationId, connectedApplication.applicationId) &&
        Objects.equals(this.name, connectedApplication.name) &&
        Objects.equals(this.logo, connectedApplication.logo) &&
        Objects.equals(this.logoUrl, connectedApplication.logoUrl) &&
        Objects.equals(this.applicationUrl, connectedApplication.applicationUrl) &&
        Objects.equals(this.reasonForAccess, connectedApplication.reasonForAccess) &&
        Objects.equals(this.createdAt, connectedApplication.createdAt) &&
        Objects.equals(this.productDataTypes, connectedApplication.productDataTypes) &&
        Objects.equals(this.scopes, connectedApplication.scopes) &&
        Objects.equals(this.requestedScopes, connectedApplication.requestedScopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, name, logo, logoUrl, applicationUrl, reasonForAccess, createdAt, productDataTypes, scopes, requestedScopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectedApplication {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    applicationUrl: ").append(toIndentedString(applicationUrl)).append("\n");
    sb.append("    reasonForAccess: ").append(toIndentedString(reasonForAccess)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    productDataTypes: ").append(toIndentedString(productDataTypes)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    requestedScopes: ").append(toIndentedString(requestedScopes)).append("\n");
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

