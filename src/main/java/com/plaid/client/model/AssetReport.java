/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.370.0
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
import com.plaid.client.model.AssetReportItem;
import com.plaid.client.model.AssetReportUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * An object representing an Asset Report
 */
@ApiModel(description = "An object representing an Asset Report")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-17T20:31:05.704177Z[Etc/UTC]")
public class AssetReport {
  public static final String SERIALIZED_NAME_ASSET_REPORT_ID = "asset_report_id";
  @SerializedName(SERIALIZED_NAME_ASSET_REPORT_ID)
  private String assetReportId;

  public static final String SERIALIZED_NAME_CLIENT_REPORT_ID = "client_report_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_REPORT_ID)
  private String clientReportId;

  public static final String SERIALIZED_NAME_DATE_GENERATED = "date_generated";
  @SerializedName(SERIALIZED_NAME_DATE_GENERATED)
  private OffsetDateTime dateGenerated;

  public static final String SERIALIZED_NAME_DAYS_REQUESTED = "days_requested";
  @SerializedName(SERIALIZED_NAME_DAYS_REQUESTED)
  private Double daysRequested;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private AssetReportUser user;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<AssetReportItem> items = new ArrayList<>();


  public AssetReport assetReportId(String assetReportId) {
    
    this.assetReportId = assetReportId;
    return this;
  }

   /**
   * A unique ID identifying an Asset Report. Like all Plaid identifiers, this ID is case sensitive.
   * @return assetReportId
  **/
  @ApiModelProperty(required = true, value = "A unique ID identifying an Asset Report. Like all Plaid identifiers, this ID is case sensitive.")

  public String getAssetReportId() {
    return assetReportId;
  }


  public void setAssetReportId(String assetReportId) {
    this.assetReportId = assetReportId;
  }


  public AssetReport clientReportId(String clientReportId) {
    
    this.clientReportId = clientReportId;
    return this;
  }

   /**
   * An identifier you determine and submit for the Asset Report.
   * @return clientReportId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "An identifier you determine and submit for the Asset Report.")

  public String getClientReportId() {
    return clientReportId;
  }


  public void setClientReportId(String clientReportId) {
    this.clientReportId = clientReportId;
  }


  public AssetReport dateGenerated(OffsetDateTime dateGenerated) {
    
    this.dateGenerated = dateGenerated;
    return this;
  }

   /**
   * The date and time when the Asset Report was created, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (e.g. \&quot;2018-04-12T03:32:11Z\&quot;).
   * @return dateGenerated
  **/
  @ApiModelProperty(required = true, value = "The date and time when the Asset Report was created, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (e.g. \"2018-04-12T03:32:11Z\").")

  public OffsetDateTime getDateGenerated() {
    return dateGenerated;
  }


  public void setDateGenerated(OffsetDateTime dateGenerated) {
    this.dateGenerated = dateGenerated;
  }


  public AssetReport daysRequested(Double daysRequested) {
    
    this.daysRequested = daysRequested;
    return this;
  }

   /**
   * The duration of transaction history you requested
   * @return daysRequested
  **/
  @ApiModelProperty(required = true, value = "The duration of transaction history you requested")

  public Double getDaysRequested() {
    return daysRequested;
  }


  public void setDaysRequested(Double daysRequested) {
    this.daysRequested = daysRequested;
  }


  public AssetReport user(AssetReportUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(required = true, value = "")

  public AssetReportUser getUser() {
    return user;
  }


  public void setUser(AssetReportUser user) {
    this.user = user;
  }


  public AssetReport items(List<AssetReportItem> items) {
    
    this.items = items;
    return this;
  }

  public AssetReport addItemsItem(AssetReportItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Data returned by Plaid about each of the Items included in the Asset Report.
   * @return items
  **/
  @ApiModelProperty(required = true, value = "Data returned by Plaid about each of the Items included in the Asset Report.")

  public List<AssetReportItem> getItems() {
    return items;
  }


  public void setItems(List<AssetReportItem> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReport assetReport = (AssetReport) o;
    return Objects.equals(this.assetReportId, assetReport.assetReportId) &&
        Objects.equals(this.clientReportId, assetReport.clientReportId) &&
        Objects.equals(this.dateGenerated, assetReport.dateGenerated) &&
        Objects.equals(this.daysRequested, assetReport.daysRequested) &&
        Objects.equals(this.user, assetReport.user) &&
        Objects.equals(this.items, assetReport.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetReportId, clientReportId, dateGenerated, daysRequested, user, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReport {\n");
    sb.append("    assetReportId: ").append(toIndentedString(assetReportId)).append("\n");
    sb.append("    clientReportId: ").append(toIndentedString(clientReportId)).append("\n");
    sb.append("    dateGenerated: ").append(toIndentedString(dateGenerated)).append("\n");
    sb.append("    daysRequested: ").append(toIndentedString(daysRequested)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

