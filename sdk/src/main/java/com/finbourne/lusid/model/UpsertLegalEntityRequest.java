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
import com.finbourne.lusid.model.CounterpartyRiskInformation;
import com.finbourne.lusid.model.Property;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Request to create or update an legal entity
 */
@ApiModel(description = "Request to create or update an legal entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpsertLegalEntityRequest {
  public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
  @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
  private Map<String, Property> identifiers = new HashMap<>();

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, Property> properties = null;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_COUNTERPARTY_RISK_INFORMATION = "counterpartyRiskInformation";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY_RISK_INFORMATION)
  private CounterpartyRiskInformation counterpartyRiskInformation;


  public UpsertLegalEntityRequest identifiers(Map<String, Property> identifiers) {
    this.identifiers = identifiers; 
    return this;
  }

  public UpsertLegalEntityRequest putIdentifiersItem(String key, Property identifiersItem) {
    this.identifiers.put(key, identifiersItem);
    return this;
  }

   /**
   * The identifiers the legal entity will be upserted with.The provided keys should be idTypeScope, idTypeCode, code
   * @return identifiers
  **/
  @ApiModelProperty(required = true, value = "The identifiers the legal entity will be upserted with.The provided keys should be idTypeScope, idTypeCode, code")
  public Map<String, Property> getIdentifiers() {
    return identifiers;
  }

  public void setIdentifiers(Map<String, Property> identifiers) {
    this.identifiers = identifiers;
  }


  public UpsertLegalEntityRequest properties(Map<String, Property> properties) {
    this.properties = properties; 
    return this;
  }

  public UpsertLegalEntityRequest putPropertiesItem(String key, Property propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * A set of properties associated to the Legal Entity.
   * @return properties
  **/
  @ApiModelProperty(value = "A set of properties associated to the Legal Entity.")
  public Map<String, Property> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, Property> properties) {
    this.properties = properties;
  }


  public UpsertLegalEntityRequest displayName(String displayName) {
    this.displayName = displayName; 
    return this;
  }

   /**
   * The display name of the Legal Entity
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "The display name of the Legal Entity")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public UpsertLegalEntityRequest description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * The description of the Legal Entity
   * @return description
  **/
  @ApiModelProperty(value = "The description of the Legal Entity")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public UpsertLegalEntityRequest counterpartyRiskInformation(CounterpartyRiskInformation counterpartyRiskInformation) {
    this.counterpartyRiskInformation = counterpartyRiskInformation; 
    return this;
  }

   /**
   * Get counterpartyRiskInformation
   * @return counterpartyRiskInformation
  **/
  @ApiModelProperty(value = "")
  public CounterpartyRiskInformation getCounterpartyRiskInformation() {
    return counterpartyRiskInformation;
  }

  public void setCounterpartyRiskInformation(CounterpartyRiskInformation counterpartyRiskInformation) {
    this.counterpartyRiskInformation = counterpartyRiskInformation;
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
    sb.append("class UpsertLegalEntityRequest {\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    counterpartyRiskInformation: ").append(toIndentedString(counterpartyRiskInformation)).append("\n");
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
