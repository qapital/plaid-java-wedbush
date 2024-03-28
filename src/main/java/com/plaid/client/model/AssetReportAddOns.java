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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * A list of add-ons that should be included in the Asset Report.  &#x60;fast_assets&#x60;: When Fast Assets is requested, Plaid will create two versions of the Asset Report: the Fast Asset Report, which will contain only Identity and Balance information, and the Full Asset Report, which will also contain Transactions information. A &#x60;PRODUCT_READY&#x60; webhook will be fired for each Asset Report when it is ready, and the &#x60;report_type&#x60; field will indicate whether the webhook is firing for the &#x60;full&#x60; or &#x60;fast&#x60; Asset Report. To retrieve the Fast Asset Report, call &#x60;/asset_report/get&#x60; with &#x60;fast_report&#x60; set to &#x60;true&#x60;. There is no additional charge for using Fast Assets. To create a Fast Asset Report, Plaid must successfully retrieve both Identity and Balance data; if Plaid encounters an error obtaining this data, the Fast Asset Report will not be created. However, as long as Plaid can obtain Transactions data, the Full Asset Report will still be available.  &#x60;investments&#x60;: Request an Asset Report with Investments. This add-on is in closed beta and not generally available.
 */
@JsonAdapter(AssetReportAddOns.Adapter.class)
public enum AssetReportAddOns {
  
  INVESTMENTS("investments"),
  
  FAST_ASSETS("fast_assets"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  AssetReportAddOns(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AssetReportAddOns fromValue(String value) {
    for (AssetReportAddOns b : AssetReportAddOns.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return AssetReportAddOns.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<AssetReportAddOns> {
    @Override
    public void write(final JsonWriter jsonWriter, final AssetReportAddOns enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AssetReportAddOns read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AssetReportAddOns.fromValue(value);
    }
  }
}

