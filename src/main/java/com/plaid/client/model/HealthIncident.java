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
import com.plaid.client.model.IncidentUpdate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * A status health incident
 */
@ApiModel(description = "A status health incident")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-17T20:31:05.704177Z[Etc/UTC]")
public class HealthIncident {
  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_INCIDENT_UPDATES = "incident_updates";
  @SerializedName(SERIALIZED_NAME_INCIDENT_UPDATES)
  private List<IncidentUpdate> incidentUpdates = new ArrayList<>();


  public HealthIncident startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of the incident, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format, e.g. &#x60;\&quot;2020-10-30T15:26:48Z\&quot;&#x60;.
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "The start date of the incident, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format, e.g. `\"2020-10-30T15:26:48Z\"`.")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public HealthIncident endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date of the incident, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format, e.g. &#x60;\&quot;2020-10-30T15:26:48Z\&quot;&#x60;.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end date of the incident, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format, e.g. `\"2020-10-30T15:26:48Z\"`.")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public HealthIncident title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of the incident
   * @return title
  **/
  @ApiModelProperty(required = true, value = "The title of the incident")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public HealthIncident incidentUpdates(List<IncidentUpdate> incidentUpdates) {
    
    this.incidentUpdates = incidentUpdates;
    return this;
  }

  public HealthIncident addIncidentUpdatesItem(IncidentUpdate incidentUpdatesItem) {
    this.incidentUpdates.add(incidentUpdatesItem);
    return this;
  }

   /**
   * Updates on the health incident.
   * @return incidentUpdates
  **/
  @ApiModelProperty(required = true, value = "Updates on the health incident.")

  public List<IncidentUpdate> getIncidentUpdates() {
    return incidentUpdates;
  }


  public void setIncidentUpdates(List<IncidentUpdate> incidentUpdates) {
    this.incidentUpdates = incidentUpdates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthIncident healthIncident = (HealthIncident) o;
    return Objects.equals(this.startDate, healthIncident.startDate) &&
        Objects.equals(this.endDate, healthIncident.endDate) &&
        Objects.equals(this.title, healthIncident.title) &&
        Objects.equals(this.incidentUpdates, healthIncident.incidentUpdates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, title, incidentUpdates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthIncident {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    incidentUpdates: ").append(toIndentedString(incidentUpdates)).append("\n");
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

