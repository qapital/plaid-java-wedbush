/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.503.5
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
import java.time.LocalDate;

/**
 * An object representing the status of the student loan
 */
@ApiModel(description = "An object representing the status of the student loan")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T21:00:55.745394Z[Etc/UTC]")
public class StudentLoanStatus {
  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  /**
   * The status type of the student loan
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CANCELLED("cancelled"),
    
    CHARGED_OFF("charged off"),
    
    CLAIM("claim"),
    
    CONSOLIDATED("consolidated"),
    
    DEFERMENT("deferment"),
    
    DELINQUENT("delinquent"),
    
    DISCHARGED("discharged"),
    
    EXTENSION("extension"),
    
    FORBEARANCE("forbearance"),
    
    IN_GRACE("in grace"),
    
    IN_MILITARY("in military"),
    
    IN_SCHOOL("in school"),
    
    NOT_FULLY_DISBURSED("not fully disbursed"),
    
    OTHER("other"),
    
    PAID_IN_FULL("paid in full"),
    
    REFUNDED("refunded"),
    
    REPAYMENT("repayment"),
    
    TRANSFERRED("transferred"),
    
    PENDING_IDR("pending idr");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;


  public StudentLoanStatus endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The date until which the loan will be in its current status. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD). 
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The date until which the loan will be in its current status. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD). ")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public StudentLoanStatus type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The status type of the student loan
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The status type of the student loan")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
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
    StudentLoanStatus studentLoanStatus = (StudentLoanStatus) o;
    return Objects.equals(this.endDate, studentLoanStatus.endDate) &&
        Objects.equals(this.type, studentLoanStatus.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentLoanStatus {\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

