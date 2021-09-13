/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) | 
 *
 * The version of the OpenAPI document: 0.11.3479
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
import com.finbourne.lusid.model.Property;
import com.finbourne.lusid.model.ResourceId;
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
 * A list of portfolios.
 */
@ApiModel(description = "A list of portfolios.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PortfolioSearchResult {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private ResourceId id;

  /**
   * The type of the portfolio. The available values are: Transaction, Reference, DerivedTransaction
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TRANSACTION("Transaction"),
    
    REFERENCE("Reference"),
    
    DERIVEDTRANSACTION("DerivedTransaction");

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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_IS_DERIVED = "isDerived";
  @SerializedName(SERIALIZED_NAME_IS_DERIVED)
  private Boolean isDerived;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_PARENT_PORTFOLIO_ID = "parentPortfolioId";
  @SerializedName(SERIALIZED_NAME_PARENT_PORTFOLIO_ID)
  private ResourceId parentPortfolioId;

  public static final String SERIALIZED_NAME_BASE_CURRENCY = "baseCurrency";
  @SerializedName(SERIALIZED_NAME_BASE_CURRENCY)
  private String baseCurrency;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private List<Property> properties = null;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public PortfolioSearchResult id(ResourceId id) {
    this.id = id; 
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public ResourceId getId() {
    return id;
  }

  public void setId(ResourceId id) {
    this.id = id;
  }


  public PortfolioSearchResult type(TypeEnum type) {
    this.type = type; 
    return this;
  }

   /**
   * The type of the portfolio. The available values are: Transaction, Reference, DerivedTransaction
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the portfolio. The available values are: Transaction, Reference, DerivedTransaction")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public PortfolioSearchResult href(URI href) {
    this.href = href; 
    return this;
  }

   /**
   * The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime.
   * @return href
  **/
  @ApiModelProperty(value = "The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime.")
  public URI getHref() {
    return href;
  }

  public void setHref(URI href) {
    this.href = href;
  }


  public PortfolioSearchResult description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * The long form description of the portfolio.
   * @return description
  **/
  @ApiModelProperty(value = "The long form description of the portfolio.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public PortfolioSearchResult displayName(String displayName) {
    this.displayName = displayName; 
    return this;
  }

   /**
   * The name of the portfolio.
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "The name of the portfolio.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


   /**
   * Whether or not this is a derived portfolio.
   * @return isDerived
  **/
  @ApiModelProperty(value = "Whether or not this is a derived portfolio.")
  public Boolean getIsDerived() {
    return isDerived;
  }



  public PortfolioSearchResult created(OffsetDateTime created) {
    this.created = created; 
    return this;
  }

   /**
   * The effective datetime at which the portfolio was created. No transactions or constituents can be added to the portfolio before this date.
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The effective datetime at which the portfolio was created. No transactions or constituents can be added to the portfolio before this date.")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public PortfolioSearchResult parentPortfolioId(ResourceId parentPortfolioId) {
    this.parentPortfolioId = parentPortfolioId; 
    return this;
  }

   /**
   * Get parentPortfolioId
   * @return parentPortfolioId
  **/
  @ApiModelProperty(value = "")
  public ResourceId getParentPortfolioId() {
    return parentPortfolioId;
  }

  public void setParentPortfolioId(ResourceId parentPortfolioId) {
    this.parentPortfolioId = parentPortfolioId;
  }


  public PortfolioSearchResult baseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency; 
    return this;
  }

   /**
   * The base currency of the portfolio. This will be an empty string for reference portfolios.
   * @return baseCurrency
  **/
  @ApiModelProperty(value = "The base currency of the portfolio. This will be an empty string for reference portfolios.")
  public String getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
  }


  public PortfolioSearchResult properties(List<Property> properties) {
    this.properties = properties; 
    return this;
  }

  public PortfolioSearchResult addPropertiesItem(Property propertiesItem) {
   
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * The requested portfolio properties. These will be from the &#39;Portfolio&#39; domain.
   * @return properties
  **/
  @ApiModelProperty(value = "The requested portfolio properties. These will be from the 'Portfolio' domain.")
  public List<Property> getProperties() {
    return properties;
  }

  public void setProperties(List<Property> properties) {
    this.properties = properties;
  }


  public PortfolioSearchResult links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public PortfolioSearchResult addLinksItem(Link linksItem) {
   
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
    sb.append("class PortfolioSearchResult {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    isDerived: ").append(toIndentedString(isDerived)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    parentPortfolioId: ").append(toIndentedString(parentPortfolioId)).append("\n");
    sb.append("    baseCurrency: ").append(toIndentedString(baseCurrency)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
