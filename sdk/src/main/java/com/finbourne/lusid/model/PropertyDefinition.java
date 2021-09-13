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
import java.util.ArrayList;
import java.util.List;

/**
 * A list of property definitions.
 */
@ApiModel(description = "A list of property definitions.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PropertyDefinition {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  /**
   * The type of values that can be associated with this property. This is defined by the property&#39;s data type. The available values are: String, Int, Decimal, DateTime, Boolean, Map, List, PropertyArray, Percentage, Code, Id, Uri, CurrencyAndAmount, TradePrice, Currency, MetricValue, ResourceId, ResultValue, CutLocalTime, DateOrCutLabel
   */
  @JsonAdapter(ValueTypeEnum.Adapter.class)
  public enum ValueTypeEnum {
    STRING("String"),
    
    INT("Int"),
    
    DECIMAL("Decimal"),
    
    DATETIME("DateTime"),
    
    BOOLEAN("Boolean"),
    
    MAP("Map"),
    
    LIST("List"),
    
    PROPERTYARRAY("PropertyArray"),
    
    PERCENTAGE("Percentage"),
    
    CODE("Code"),
    
    ID("Id"),
    
    URI("Uri"),
    
    CURRENCYANDAMOUNT("CurrencyAndAmount"),
    
    TRADEPRICE("TradePrice"),
    
    CURRENCY("Currency"),
    
    METRICVALUE("MetricValue"),
    
    RESOURCEID("ResourceId"),
    
    RESULTVALUE("ResultValue"),
    
    CUTLOCALTIME("CutLocalTime"),
    
    DATEORCUTLABEL("DateOrCutLabel");

    private String value;

    ValueTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ValueTypeEnum fromValue(String value) {
      for (ValueTypeEnum b : ValueTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ValueTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ValueTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ValueTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ValueTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VALUE_TYPE = "valueType";
  @SerializedName(SERIALIZED_NAME_VALUE_TYPE)
  private ValueTypeEnum valueType;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DATA_TYPE_ID = "dataTypeId";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE_ID)
  private ResourceId dataTypeId;

  /**
   * The type of the property. The available values are: Label, Metric, Information
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    LABEL("Label"),
    
    METRIC("Metric"),
    
    INFORMATION("Information");

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

  /**
   * The units that can be associated with the property&#39;s values. This is defined by the property&#39;s data type. The available values are: NoUnits, Basic, Iso4217Currency
   */
  @JsonAdapter(UnitSchemaEnum.Adapter.class)
  public enum UnitSchemaEnum {
    NOUNITS("NoUnits"),
    
    BASIC("Basic"),
    
    ISO4217CURRENCY("Iso4217Currency");

    private String value;

    UnitSchemaEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UnitSchemaEnum fromValue(String value) {
      for (UnitSchemaEnum b : UnitSchemaEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UnitSchemaEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UnitSchemaEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UnitSchemaEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UnitSchemaEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_UNIT_SCHEMA = "unitSchema";
  @SerializedName(SERIALIZED_NAME_UNIT_SCHEMA)
  private UnitSchemaEnum unitSchema;

  /**
   * The domain that the property exists in. The available values are: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, Placement, Execution, Block, Participation, Package, OrderInstruction, CustomEntity
   */
  @JsonAdapter(DomainEnum.Adapter.class)
  public enum DomainEnum {
    NOTDEFINED("NotDefined"),
    
    TRANSACTION("Transaction"),
    
    PORTFOLIO("Portfolio"),
    
    HOLDING("Holding"),
    
    REFERENCEHOLDING("ReferenceHolding"),
    
    TRANSACTIONCONFIGURATION("TransactionConfiguration"),
    
    INSTRUMENT("Instrument"),
    
    CUTLABELDEFINITION("CutLabelDefinition"),
    
    ANALYTIC("Analytic"),
    
    PORTFOLIOGROUP("PortfolioGroup"),
    
    PERSON("Person"),
    
    ACCESSMETADATA("AccessMetadata"),
    
    ORDER("Order"),
    
    UNITRESULT("UnitResult"),
    
    MARKETDATA("MarketData"),
    
    CONFIGURATIONRECIPE("ConfigurationRecipe"),
    
    ALLOCATION("Allocation"),
    
    CALENDAR("Calendar"),
    
    LEGALENTITY("LegalEntity"),
    
    PLACEMENT("Placement"),
    
    EXECUTION("Execution"),
    
    BLOCK("Block"),
    
    PARTICIPATION("Participation"),
    
    PACKAGE("Package"),
    
    ORDERINSTRUCTION("OrderInstruction"),
    
    CUSTOMENTITY("CustomEntity");

    private String value;

    DomainEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DomainEnum fromValue(String value) {
      for (DomainEnum b : DomainEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DomainEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DomainEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DomainEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DomainEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private DomainEnum domain;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_VALUE_REQUIRED = "valueRequired";
  @SerializedName(SERIALIZED_NAME_VALUE_REQUIRED)
  private Boolean valueRequired;

  /**
   * Describes how the property&#39;s values can change over time. The available values are: Perpetual, TimeVariant
   */
  @JsonAdapter(LifeTimeEnum.Adapter.class)
  public enum LifeTimeEnum {
    PERPETUAL("Perpetual"),
    
    TIMEVARIANT("TimeVariant");

    private String value;

    LifeTimeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LifeTimeEnum fromValue(String value) {
      for (LifeTimeEnum b : LifeTimeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LifeTimeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LifeTimeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LifeTimeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LifeTimeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LIFE_TIME = "lifeTime";
  @SerializedName(SERIALIZED_NAME_LIFE_TIME)
  private LifeTimeEnum lifeTime;

  public static final String SERIALIZED_NAME_CONSTRAINT_STYLE = "constraintStyle";
  @SerializedName(SERIALIZED_NAME_CONSTRAINT_STYLE)
  private String constraintStyle;

  /**
   * The definition type (DerivedDefinition or Definition). The available values are: ValueProperty, DerivedDefinition
   */
  @JsonAdapter(PropertyDefinitionTypeEnum.Adapter.class)
  public enum PropertyDefinitionTypeEnum {
    VALUEPROPERTY("ValueProperty"),
    
    DERIVEDDEFINITION("DerivedDefinition");

    private String value;

    PropertyDefinitionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PropertyDefinitionTypeEnum fromValue(String value) {
      for (PropertyDefinitionTypeEnum b : PropertyDefinitionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PropertyDefinitionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PropertyDefinitionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PropertyDefinitionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PropertyDefinitionTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROPERTY_DEFINITION_TYPE = "propertyDefinitionType";
  @SerializedName(SERIALIZED_NAME_PROPERTY_DEFINITION_TYPE)
  private PropertyDefinitionTypeEnum propertyDefinitionType;

  public static final String SERIALIZED_NAME_PROPERTY_DESCRIPTION = "propertyDescription";
  @SerializedName(SERIALIZED_NAME_PROPERTY_DESCRIPTION)
  private String propertyDescription;

  public static final String SERIALIZED_NAME_DERIVATION_FORMULA = "derivationFormula";
  @SerializedName(SERIALIZED_NAME_DERIVATION_FORMULA)
  private String derivationFormula;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public PropertyDefinition href(URI href) {
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


  public PropertyDefinition key(String key) {
    this.key = key; 
    return this;
  }

   /**
   * The property key which uniquely identifies the property. The format for the property key is {domain}/{scope}/{code}, e.g. &#39;Portfolio/Manager/Id&#39;.
   * @return key
  **/
  @ApiModelProperty(value = "The property key which uniquely identifies the property. The format for the property key is {domain}/{scope}/{code}, e.g. 'Portfolio/Manager/Id'.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  public PropertyDefinition valueType(ValueTypeEnum valueType) {
    this.valueType = valueType; 
    return this;
  }

   /**
   * The type of values that can be associated with this property. This is defined by the property&#39;s data type. The available values are: String, Int, Decimal, DateTime, Boolean, Map, List, PropertyArray, Percentage, Code, Id, Uri, CurrencyAndAmount, TradePrice, Currency, MetricValue, ResourceId, ResultValue, CutLocalTime, DateOrCutLabel
   * @return valueType
  **/
  @ApiModelProperty(value = "The type of values that can be associated with this property. This is defined by the property's data type. The available values are: String, Int, Decimal, DateTime, Boolean, Map, List, PropertyArray, Percentage, Code, Id, Uri, CurrencyAndAmount, TradePrice, Currency, MetricValue, ResourceId, ResultValue, CutLocalTime, DateOrCutLabel")
  public ValueTypeEnum getValueType() {
    return valueType;
  }

  public void setValueType(ValueTypeEnum valueType) {
    this.valueType = valueType;
  }


  public PropertyDefinition displayName(String displayName) {
    this.displayName = displayName; 
    return this;
  }

   /**
   * The display name of the property.
   * @return displayName
  **/
  @ApiModelProperty(value = "The display name of the property.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public PropertyDefinition dataTypeId(ResourceId dataTypeId) {
    this.dataTypeId = dataTypeId; 
    return this;
  }

   /**
   * Get dataTypeId
   * @return dataTypeId
  **/
  @ApiModelProperty(value = "")
  public ResourceId getDataTypeId() {
    return dataTypeId;
  }

  public void setDataTypeId(ResourceId dataTypeId) {
    this.dataTypeId = dataTypeId;
  }


  public PropertyDefinition type(TypeEnum type) {
    this.type = type; 
    return this;
  }

   /**
   * The type of the property. The available values are: Label, Metric, Information
   * @return type
  **/
  @ApiModelProperty(value = "The type of the property. The available values are: Label, Metric, Information")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public PropertyDefinition unitSchema(UnitSchemaEnum unitSchema) {
    this.unitSchema = unitSchema; 
    return this;
  }

   /**
   * The units that can be associated with the property&#39;s values. This is defined by the property&#39;s data type. The available values are: NoUnits, Basic, Iso4217Currency
   * @return unitSchema
  **/
  @ApiModelProperty(value = "The units that can be associated with the property's values. This is defined by the property's data type. The available values are: NoUnits, Basic, Iso4217Currency")
  public UnitSchemaEnum getUnitSchema() {
    return unitSchema;
  }

  public void setUnitSchema(UnitSchemaEnum unitSchema) {
    this.unitSchema = unitSchema;
  }


  public PropertyDefinition domain(DomainEnum domain) {
    this.domain = domain; 
    return this;
  }

   /**
   * The domain that the property exists in. The available values are: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, Placement, Execution, Block, Participation, Package, OrderInstruction, CustomEntity
   * @return domain
  **/
  @ApiModelProperty(value = "The domain that the property exists in. The available values are: NotDefined, Transaction, Portfolio, Holding, ReferenceHolding, TransactionConfiguration, Instrument, CutLabelDefinition, Analytic, PortfolioGroup, Person, AccessMetadata, Order, UnitResult, MarketData, ConfigurationRecipe, Allocation, Calendar, LegalEntity, Placement, Execution, Block, Participation, Package, OrderInstruction, CustomEntity")
  public DomainEnum getDomain() {
    return domain;
  }

  public void setDomain(DomainEnum domain) {
    this.domain = domain;
  }


   /**
   * The scope that the property exists in.
   * @return scope
  **/
  @ApiModelProperty(value = "The scope that the property exists in.")
  public String getScope() {
    return scope;
  }



   /**
   * The code of the property. Together with the domain and scope this uniquely identifies the property.
   * @return code
  **/
  @ApiModelProperty(value = "The code of the property. Together with the domain and scope this uniquely identifies the property.")
  public String getCode() {
    return code;
  }



  public PropertyDefinition valueRequired(Boolean valueRequired) {
    this.valueRequired = valueRequired; 
    return this;
  }

   /**
   * Whether or not a value is always required for this property.
   * @return valueRequired
  **/
  @ApiModelProperty(value = "Whether or not a value is always required for this property.")
  public Boolean getValueRequired() {
    return valueRequired;
  }

  public void setValueRequired(Boolean valueRequired) {
    this.valueRequired = valueRequired;
  }


  public PropertyDefinition lifeTime(LifeTimeEnum lifeTime) {
    this.lifeTime = lifeTime; 
    return this;
  }

   /**
   * Describes how the property&#39;s values can change over time. The available values are: Perpetual, TimeVariant
   * @return lifeTime
  **/
  @ApiModelProperty(value = "Describes how the property's values can change over time. The available values are: Perpetual, TimeVariant")
  public LifeTimeEnum getLifeTime() {
    return lifeTime;
  }

  public void setLifeTime(LifeTimeEnum lifeTime) {
    this.lifeTime = lifeTime;
  }


  public PropertyDefinition constraintStyle(String constraintStyle) {
    this.constraintStyle = constraintStyle; 
    return this;
  }

   /**
   * Describes the uniqueness and cardinality of the property for entity objects under the property domain specified in Key.
   * @return constraintStyle
  **/
  @ApiModelProperty(value = "Describes the uniqueness and cardinality of the property for entity objects under the property domain specified in Key.")
  public String getConstraintStyle() {
    return constraintStyle;
  }

  public void setConstraintStyle(String constraintStyle) {
    this.constraintStyle = constraintStyle;
  }


  public PropertyDefinition propertyDefinitionType(PropertyDefinitionTypeEnum propertyDefinitionType) {
    this.propertyDefinitionType = propertyDefinitionType; 
    return this;
  }

   /**
   * The definition type (DerivedDefinition or Definition). The available values are: ValueProperty, DerivedDefinition
   * @return propertyDefinitionType
  **/
  @ApiModelProperty(value = "The definition type (DerivedDefinition or Definition). The available values are: ValueProperty, DerivedDefinition")
  public PropertyDefinitionTypeEnum getPropertyDefinitionType() {
    return propertyDefinitionType;
  }

  public void setPropertyDefinitionType(PropertyDefinitionTypeEnum propertyDefinitionType) {
    this.propertyDefinitionType = propertyDefinitionType;
  }


  public PropertyDefinition propertyDescription(String propertyDescription) {
    this.propertyDescription = propertyDescription; 
    return this;
  }

   /**
   * A brief description of what a property of this property definition contains.
   * @return propertyDescription
  **/
  @ApiModelProperty(value = "A brief description of what a property of this property definition contains.")
  public String getPropertyDescription() {
    return propertyDescription;
  }

  public void setPropertyDescription(String propertyDescription) {
    this.propertyDescription = propertyDescription;
  }


  public PropertyDefinition derivationFormula(String derivationFormula) {
    this.derivationFormula = derivationFormula; 
    return this;
  }

   /**
   * The rule that defines how data is composed for a derived property.
   * @return derivationFormula
  **/
  @ApiModelProperty(value = "The rule that defines how data is composed for a derived property.")
  public String getDerivationFormula() {
    return derivationFormula;
  }

  public void setDerivationFormula(String derivationFormula) {
    this.derivationFormula = derivationFormula;
  }


  public PropertyDefinition links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public PropertyDefinition addLinksItem(Link linksItem) {
   
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
    sb.append("class PropertyDefinition {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    dataTypeId: ").append(toIndentedString(dataTypeId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unitSchema: ").append(toIndentedString(unitSchema)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    valueRequired: ").append(toIndentedString(valueRequired)).append("\n");
    sb.append("    lifeTime: ").append(toIndentedString(lifeTime)).append("\n");
    sb.append("    constraintStyle: ").append(toIndentedString(constraintStyle)).append("\n");
    sb.append("    propertyDefinitionType: ").append(toIndentedString(propertyDefinitionType)).append("\n");
    sb.append("    propertyDescription: ").append(toIndentedString(propertyDescription)).append("\n");
    sb.append("    derivationFormula: ").append(toIndentedString(derivationFormula)).append("\n");
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
