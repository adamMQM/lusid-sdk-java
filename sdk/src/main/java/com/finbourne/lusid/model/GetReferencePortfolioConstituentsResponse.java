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
import com.finbourne.lusid.model.Link;
import com.finbourne.lusid.model.ReferencePortfolioConstituent;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * GetReferencePortfolioConstituentsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetReferencePortfolioConstituentsResponse {
  public static final String SERIALIZED_NAME_EFFECTIVE_FROM = "effectiveFrom";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_FROM)
  private OffsetDateTime effectiveFrom;

  /**
   * The available values are: Static, Floating, Periodical
   */
  @JsonAdapter(WeightTypeEnum.Adapter.class)
  public enum WeightTypeEnum {
    STATIC("Static"),
    
    FLOATING("Floating"),
    
    PERIODICAL("Periodical");

    private String value;

    WeightTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WeightTypeEnum fromValue(String value) {
      for (WeightTypeEnum b : WeightTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WeightTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WeightTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WeightTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WeightTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WEIGHT_TYPE = "weightType";
  @SerializedName(SERIALIZED_NAME_WEIGHT_TYPE)
  private WeightTypeEnum weightType;

  /**
   * The available values are: Daily, Weekly, Monthly, Quarterly, Annually
   */
  @JsonAdapter(PeriodTypeEnum.Adapter.class)
  public enum PeriodTypeEnum {
    DAILY("Daily"),
    
    WEEKLY("Weekly"),
    
    MONTHLY("Monthly"),
    
    QUARTERLY("Quarterly"),
    
    ANNUALLY("Annually");

    private String value;

    PeriodTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PeriodTypeEnum fromValue(String value) {
      for (PeriodTypeEnum b : PeriodTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PeriodTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PeriodTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PeriodTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PeriodTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PERIOD_TYPE = "periodType";
  @SerializedName(SERIALIZED_NAME_PERIOD_TYPE)
  private PeriodTypeEnum periodType;

  public static final String SERIALIZED_NAME_PERIOD_COUNT = "periodCount";
  @SerializedName(SERIALIZED_NAME_PERIOD_COUNT)
  private Integer periodCount;

  public static final String SERIALIZED_NAME_CONSTITUENTS = "constituents";
  @SerializedName(SERIALIZED_NAME_CONSTITUENTS)
  private List<ReferencePortfolioConstituent> constituents = new ArrayList<>();

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public GetReferencePortfolioConstituentsResponse effectiveFrom(OffsetDateTime effectiveFrom) {
    this.effectiveFrom = effectiveFrom; 
    return this;
  }

   /**
   * Get effectiveFrom
   * @return effectiveFrom
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getEffectiveFrom() {
    return effectiveFrom;
  }

  public void setEffectiveFrom(OffsetDateTime effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
  }


  public GetReferencePortfolioConstituentsResponse weightType(WeightTypeEnum weightType) {
    this.weightType = weightType; 
    return this;
  }

   /**
   * The available values are: Static, Floating, Periodical
   * @return weightType
  **/
  @ApiModelProperty(required = true, value = "The available values are: Static, Floating, Periodical")
  public WeightTypeEnum getWeightType() {
    return weightType;
  }

  public void setWeightType(WeightTypeEnum weightType) {
    this.weightType = weightType;
  }


  public GetReferencePortfolioConstituentsResponse periodType(PeriodTypeEnum periodType) {
    this.periodType = periodType; 
    return this;
  }

   /**
   * The available values are: Daily, Weekly, Monthly, Quarterly, Annually
   * @return periodType
  **/
  @ApiModelProperty(value = "The available values are: Daily, Weekly, Monthly, Quarterly, Annually")
  public PeriodTypeEnum getPeriodType() {
    return periodType;
  }

  public void setPeriodType(PeriodTypeEnum periodType) {
    this.periodType = periodType;
  }


  public GetReferencePortfolioConstituentsResponse periodCount(Integer periodCount) {
    this.periodCount = periodCount; 
    return this;
  }

   /**
   * Get periodCount
   * @return periodCount
  **/
  @ApiModelProperty(value = "")
  public Integer getPeriodCount() {
    return periodCount;
  }

  public void setPeriodCount(Integer periodCount) {
    this.periodCount = periodCount;
  }


  public GetReferencePortfolioConstituentsResponse constituents(List<ReferencePortfolioConstituent> constituents) {
    this.constituents = constituents; 
    return this;
  }

  public GetReferencePortfolioConstituentsResponse addConstituentsItem(ReferencePortfolioConstituent constituentsItem) {
   
    this.constituents.add(constituentsItem);
    return this;
  }

   /**
   * Set of constituents (instrument/weight pairings)
   * @return constituents
  **/
  @ApiModelProperty(required = true, value = "Set of constituents (instrument/weight pairings)")
  public List<ReferencePortfolioConstituent> getConstituents() {
    return constituents;
  }

  public void setConstituents(List<ReferencePortfolioConstituent> constituents) {
    this.constituents = constituents;
  }


  public GetReferencePortfolioConstituentsResponse href(URI href) {
    this.href = href; 
    return this;
  }

   /**
   * The Uri that returns the same result as the original request,  but may include resolved as at time(s).
   * @return href
  **/
  @ApiModelProperty(value = "The Uri that returns the same result as the original request,  but may include resolved as at time(s).")
  public URI getHref() {
    return href;
  }

  public void setHref(URI href) {
    this.href = href;
  }


  public GetReferencePortfolioConstituentsResponse links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public GetReferencePortfolioConstituentsResponse addLinksItem(Link linksItem) {
   
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
    sb.append("class GetReferencePortfolioConstituentsResponse {\n");
    sb.append("    effectiveFrom: ").append(toIndentedString(effectiveFrom)).append("\n");
    sb.append("    weightType: ").append(toIndentedString(weightType)).append("\n");
    sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
    sb.append("    periodCount: ").append(toIndentedString(periodCount)).append("\n");
    sb.append("    constituents: ").append(toIndentedString(constituents)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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
