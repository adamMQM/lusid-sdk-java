/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) | 
 *
 * The version of the OpenAPI document: 0.11.3442
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.lusid.model.HoldingAdjustment;
import com.finbourne.lusid.model.Link;
import com.finbourne.lusid.model.Version;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Full content of a holdings adjustment for a single portfolio and effective date.
 */
@ApiModel(description = "Full content of a holdings adjustment for a single portfolio and effective date.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HoldingsAdjustment {
  public static final String SERIALIZED_NAME_EFFECTIVE_AT = "effectiveAt";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_AT)
  private OffsetDateTime effectiveAt;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Version version;

  /**
   * Describes how the holdings were adjusted. If &#39;PositionToZero&#39; the entire transaction portfolio&#39;s holdings were set via a call to &#39;Set holdings&#39;. If &#39;KeepTheSame&#39; only the specified holdings were adjusted via a call to &#39;Adjust holdings&#39;. The available values are: PositionToZero, KeepTheSame
   */
  @JsonAdapter(UnmatchedHoldingMethodEnum.Adapter.class)
  public enum UnmatchedHoldingMethodEnum {
    POSITIONTOZERO("PositionToZero"),
    
    KEEPTHESAME("KeepTheSame");

    private String value;

    UnmatchedHoldingMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UnmatchedHoldingMethodEnum fromValue(String value) {
      for (UnmatchedHoldingMethodEnum b : UnmatchedHoldingMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UnmatchedHoldingMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UnmatchedHoldingMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UnmatchedHoldingMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UnmatchedHoldingMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_UNMATCHED_HOLDING_METHOD = "unmatchedHoldingMethod";
  @SerializedName(SERIALIZED_NAME_UNMATCHED_HOLDING_METHOD)
  private UnmatchedHoldingMethodEnum unmatchedHoldingMethod;

  public static final String SERIALIZED_NAME_ADJUSTMENTS = "adjustments";
  @SerializedName(SERIALIZED_NAME_ADJUSTMENTS)
  private List<HoldingAdjustment> adjustments = new ArrayList<>();

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public HoldingsAdjustment effectiveAt(OffsetDateTime effectiveAt) {
    this.effectiveAt = effectiveAt; 
    return this;
  }

   /**
   * The effective datetime from which the adjustment is valid. There can only be one holdings adjustment for a transaction portfolio at a specific effective datetime, so this uniquely identifies the adjustment.
   * @return effectiveAt
  **/
  @ApiModelProperty(required = true, value = "The effective datetime from which the adjustment is valid. There can only be one holdings adjustment for a transaction portfolio at a specific effective datetime, so this uniquely identifies the adjustment.")
  public OffsetDateTime getEffectiveAt() {
    return effectiveAt;
  }

  public void setEffectiveAt(OffsetDateTime effectiveAt) {
    this.effectiveAt = effectiveAt;
  }


  public HoldingsAdjustment version(Version version) {
    this.version = version; 
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(required = true, value = "")
  public Version getVersion() {
    return version;
  }

  public void setVersion(Version version) {
    this.version = version;
  }


  public HoldingsAdjustment unmatchedHoldingMethod(UnmatchedHoldingMethodEnum unmatchedHoldingMethod) {
    this.unmatchedHoldingMethod = unmatchedHoldingMethod; 
    return this;
  }

   /**
   * Describes how the holdings were adjusted. If &#39;PositionToZero&#39; the entire transaction portfolio&#39;s holdings were set via a call to &#39;Set holdings&#39;. If &#39;KeepTheSame&#39; only the specified holdings were adjusted via a call to &#39;Adjust holdings&#39;. The available values are: PositionToZero, KeepTheSame
   * @return unmatchedHoldingMethod
  **/
  @ApiModelProperty(required = true, value = "Describes how the holdings were adjusted. If 'PositionToZero' the entire transaction portfolio's holdings were set via a call to 'Set holdings'. If 'KeepTheSame' only the specified holdings were adjusted via a call to 'Adjust holdings'. The available values are: PositionToZero, KeepTheSame")
  public UnmatchedHoldingMethodEnum getUnmatchedHoldingMethod() {
    return unmatchedHoldingMethod;
  }

  public void setUnmatchedHoldingMethod(UnmatchedHoldingMethodEnum unmatchedHoldingMethod) {
    this.unmatchedHoldingMethod = unmatchedHoldingMethod;
  }


  public HoldingsAdjustment adjustments(List<HoldingAdjustment> adjustments) {
    this.adjustments = adjustments; 
    return this;
  }

  public HoldingsAdjustment addAdjustmentsItem(HoldingAdjustment adjustmentsItem) {
   
    this.adjustments.add(adjustmentsItem);
    return this;
  }

   /**
   * The holding adjustments.
   * @return adjustments
  **/
  @ApiModelProperty(required = true, value = "The holding adjustments.")
  public List<HoldingAdjustment> getAdjustments() {
    return adjustments;
  }

  public void setAdjustments(List<HoldingAdjustment> adjustments) {
    this.adjustments = adjustments;
  }


  public HoldingsAdjustment links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public HoldingsAdjustment addLinksItem(Link linksItem) {
   
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Collection of links.
   * @return links
  **/
  @ApiModelProperty(value = "Collection of links.")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return super.hashCode();  
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoldingsAdjustment {\n");
    sb.append("    effectiveAt: ").append(toIndentedString(effectiveAt)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    unmatchedHoldingMethod: ").append(toIndentedString(unmatchedHoldingMethod)).append("\n");
    sb.append("    adjustments: ").append(toIndentedString(adjustments)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
