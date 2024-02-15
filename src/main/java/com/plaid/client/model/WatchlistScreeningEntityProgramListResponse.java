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
import com.plaid.client.model.EntityWatchlistProgram;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Paginated list of entity watchlist screening programs
 */
@ApiModel(description = "Paginated list of entity watchlist screening programs")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-15T20:08:18.129993Z[Etc/UTC]")
public class WatchlistScreeningEntityProgramListResponse {
  public static final String SERIALIZED_NAME_ENTITY_WATCHLIST_PROGRAMS = "entity_watchlist_programs";
  @SerializedName(SERIALIZED_NAME_ENTITY_WATCHLIST_PROGRAMS)
  private List<EntityWatchlistProgram> entityWatchlistPrograms = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_CURSOR = "next_cursor";
  @SerializedName(SERIALIZED_NAME_NEXT_CURSOR)
  private String nextCursor;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public WatchlistScreeningEntityProgramListResponse entityWatchlistPrograms(List<EntityWatchlistProgram> entityWatchlistPrograms) {
    
    this.entityWatchlistPrograms = entityWatchlistPrograms;
    return this;
  }

  public WatchlistScreeningEntityProgramListResponse addEntityWatchlistProgramsItem(EntityWatchlistProgram entityWatchlistProgramsItem) {
    this.entityWatchlistPrograms.add(entityWatchlistProgramsItem);
    return this;
  }

   /**
   * List of entity watchlist screening programs
   * @return entityWatchlistPrograms
  **/
  @ApiModelProperty(required = true, value = "List of entity watchlist screening programs")

  public List<EntityWatchlistProgram> getEntityWatchlistPrograms() {
    return entityWatchlistPrograms;
  }


  public void setEntityWatchlistPrograms(List<EntityWatchlistProgram> entityWatchlistPrograms) {
    this.entityWatchlistPrograms = entityWatchlistPrograms;
  }


  public WatchlistScreeningEntityProgramListResponse nextCursor(String nextCursor) {
    
    this.nextCursor = nextCursor;
    return this;
  }

   /**
   * An identifier that determines which page of results you receive.
   * @return nextCursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "eyJkaXJlY3Rpb24iOiJuZXh0Iiwib2Zmc2V0IjoiMTU5NDM", required = true, value = "An identifier that determines which page of results you receive.")

  public String getNextCursor() {
    return nextCursor;
  }


  public void setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
  }


  public WatchlistScreeningEntityProgramListResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchlistScreeningEntityProgramListResponse watchlistScreeningEntityProgramListResponse = (WatchlistScreeningEntityProgramListResponse) o;
    return Objects.equals(this.entityWatchlistPrograms, watchlistScreeningEntityProgramListResponse.entityWatchlistPrograms) &&
        Objects.equals(this.nextCursor, watchlistScreeningEntityProgramListResponse.nextCursor) &&
        Objects.equals(this.requestId, watchlistScreeningEntityProgramListResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityWatchlistPrograms, nextCursor, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchlistScreeningEntityProgramListResponse {\n");
    sb.append("    entityWatchlistPrograms: ").append(toIndentedString(entityWatchlistPrograms)).append("\n");
    sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

