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
import com.finbourne.lusid.model.CreditRating;
import com.finbourne.lusid.model.IndustryClassifier;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * In the event that the legal entity is a counterparty to an OTC transaction  (as signatory to a counterparty agreement such as an ISDA 2002 Master Agreement),  this information would be needed for calculations  such as Credit-Valuation-Adjustments and Debit-Valuation-Adjustments (CVA, DVA, XVA etc).
 */
@ApiModel(description = "In the event that the legal entity is a counterparty to an OTC transaction  (as signatory to a counterparty agreement such as an ISDA 2002 Master Agreement),  this information would be needed for calculations  such as Credit-Valuation-Adjustments and Debit-Valuation-Adjustments (CVA, DVA, XVA etc).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CounterpartyRiskInformation {
  public static final String SERIALIZED_NAME_COUNTRY_OF_RISK = "countryOfRisk";
  @SerializedName(SERIALIZED_NAME_COUNTRY_OF_RISK)
  private String countryOfRisk;

  public static final String SERIALIZED_NAME_CREDIT_RATINGS = "creditRatings";
  @SerializedName(SERIALIZED_NAME_CREDIT_RATINGS)
  private List<CreditRating> creditRatings = new ArrayList<>();

  public static final String SERIALIZED_NAME_INDUSTRY_CLASSIFIERS = "industryClassifiers";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_CLASSIFIERS)
  private List<IndustryClassifier> industryClassifiers = new ArrayList<>();


  public CounterpartyRiskInformation countryOfRisk(String countryOfRisk) {
    this.countryOfRisk = countryOfRisk; 
    return this;
  }

   /**
   * The country to which one would naturally ascribe risk, typically the legal entity&#39;s country of registration. This can be used to infer funding currency and related market data in the absence of a specific preference.
   * @return countryOfRisk
  **/
  @ApiModelProperty(required = true, value = "The country to which one would naturally ascribe risk, typically the legal entity's country of registration. This can be used to infer funding currency and related market data in the absence of a specific preference.")
  public String getCountryOfRisk() {
    return countryOfRisk;
  }

  public void setCountryOfRisk(String countryOfRisk) {
    this.countryOfRisk = countryOfRisk;
  }


  public CounterpartyRiskInformation creditRatings(List<CreditRating> creditRatings) {
    this.creditRatings = creditRatings; 
    return this;
  }

  public CounterpartyRiskInformation addCreditRatingsItem(CreditRating creditRatingsItem) {
   
    this.creditRatings.add(creditRatingsItem);
    return this;
  }

   /**
   * Get creditRatings
   * @return creditRatings
  **/
  @ApiModelProperty(required = true, value = "")
  public List<CreditRating> getCreditRatings() {
    return creditRatings;
  }

  public void setCreditRatings(List<CreditRating> creditRatings) {
    this.creditRatings = creditRatings;
  }


  public CounterpartyRiskInformation industryClassifiers(List<IndustryClassifier> industryClassifiers) {
    this.industryClassifiers = industryClassifiers; 
    return this;
  }

  public CounterpartyRiskInformation addIndustryClassifiersItem(IndustryClassifier industryClassifiersItem) {
   
    this.industryClassifiers.add(industryClassifiersItem);
    return this;
  }

   /**
   * Get industryClassifiers
   * @return industryClassifiers
  **/
  @ApiModelProperty(required = true, value = "")
  public List<IndustryClassifier> getIndustryClassifiers() {
    return industryClassifiers;
  }

  public void setIndustryClassifiers(List<IndustryClassifier> industryClassifiers) {
    this.industryClassifiers = industryClassifiers;
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
    sb.append("class CounterpartyRiskInformation {\n");
    sb.append("    countryOfRisk: ").append(toIndentedString(countryOfRisk)).append("\n");
    sb.append("    creditRatings: ").append(toIndentedString(creditRatings)).append("\n");
    sb.append("    industryClassifiers: ").append(toIndentedString(industryClassifiers)).append("\n");
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
