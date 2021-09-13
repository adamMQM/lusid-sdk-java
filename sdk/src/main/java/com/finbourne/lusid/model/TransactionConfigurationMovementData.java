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
import com.finbourne.lusid.model.PerpetualProperty;
import com.finbourne.lusid.model.TransactionPropertyMapping;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TransactionConfigurationMovementData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionConfigurationMovementData {
  /**
   * . The available values are: Settlement, Traded, StockMovement, FutureCash, Commitment, Receivable, CashSettlement, CashForward, CashCommitment, CashReceivable, Accrual, CashAccrual, ForwardFx, CashFxForward, UnsettledCashTypes, Carry, CarryAsPnl
   */
  @JsonAdapter(MovementTypesEnum.Adapter.class)
  public enum MovementTypesEnum {
    SETTLEMENT("Settlement"),
    
    TRADED("Traded"),
    
    STOCKMOVEMENT("StockMovement"),
    
    FUTURECASH("FutureCash"),
    
    COMMITMENT("Commitment"),
    
    RECEIVABLE("Receivable"),
    
    CASHSETTLEMENT("CashSettlement"),
    
    CASHFORWARD("CashForward"),
    
    CASHCOMMITMENT("CashCommitment"),
    
    CASHRECEIVABLE("CashReceivable"),
    
    ACCRUAL("Accrual"),
    
    CASHACCRUAL("CashAccrual"),
    
    FORWARDFX("ForwardFx"),
    
    CASHFXFORWARD("CashFxForward"),
    
    UNSETTLEDCASHTYPES("UnsettledCashTypes"),
    
    CARRY("Carry"),
    
    CARRYASPNL("CarryAsPnl");

    private String value;

    MovementTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MovementTypesEnum fromValue(String value) {
      for (MovementTypesEnum b : MovementTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MovementTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MovementTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MovementTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MovementTypesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MOVEMENT_TYPES = "movementTypes";
  @SerializedName(SERIALIZED_NAME_MOVEMENT_TYPES)
  private MovementTypesEnum movementTypes;

  public static final String SERIALIZED_NAME_SIDE = "side";
  @SerializedName(SERIALIZED_NAME_SIDE)
  private String side;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private Integer direction;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, PerpetualProperty> properties = null;

  public static final String SERIALIZED_NAME_MAPPINGS = "mappings";
  @SerializedName(SERIALIZED_NAME_MAPPINGS)
  private List<TransactionPropertyMapping> mappings = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public TransactionConfigurationMovementData movementTypes(MovementTypesEnum movementTypes) {
    this.movementTypes = movementTypes; 
    return this;
  }

   /**
   * . The available values are: Settlement, Traded, StockMovement, FutureCash, Commitment, Receivable, CashSettlement, CashForward, CashCommitment, CashReceivable, Accrual, CashAccrual, ForwardFx, CashFxForward, UnsettledCashTypes, Carry, CarryAsPnl
   * @return movementTypes
  **/
  @ApiModelProperty(required = true, value = ". The available values are: Settlement, Traded, StockMovement, FutureCash, Commitment, Receivable, CashSettlement, CashForward, CashCommitment, CashReceivable, Accrual, CashAccrual, ForwardFx, CashFxForward, UnsettledCashTypes, Carry, CarryAsPnl")
  public MovementTypesEnum getMovementTypes() {
    return movementTypes;
  }

  public void setMovementTypes(MovementTypesEnum movementTypes) {
    this.movementTypes = movementTypes;
  }


  public TransactionConfigurationMovementData side(String side) {
    this.side = side; 
    return this;
  }

   /**
   * The movement side
   * @return side
  **/
  @ApiModelProperty(required = true, value = "The movement side")
  public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }


  public TransactionConfigurationMovementData direction(Integer direction) {
    this.direction = direction; 
    return this;
  }

   /**
   * The movement direction
   * @return direction
  **/
  @ApiModelProperty(required = true, value = "The movement direction")
  public Integer getDirection() {
    return direction;
  }

  public void setDirection(Integer direction) {
    this.direction = direction;
  }


  public TransactionConfigurationMovementData properties(Map<String, PerpetualProperty> properties) {
    this.properties = properties; 
    return this;
  }

  public TransactionConfigurationMovementData putPropertiesItem(String key, PerpetualProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * The properties associated with the underlying Movement.
   * @return properties
  **/
  @ApiModelProperty(value = "The properties associated with the underlying Movement.")
  public Map<String, PerpetualProperty> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, PerpetualProperty> properties) {
    this.properties = properties;
  }


  public TransactionConfigurationMovementData mappings(List<TransactionPropertyMapping> mappings) {
    this.mappings = mappings; 
    return this;
  }

  public TransactionConfigurationMovementData addMappingsItem(TransactionPropertyMapping mappingsItem) {
   
    if (this.mappings == null) {
      this.mappings = new ArrayList<>();
    }
    this.mappings.add(mappingsItem);
    return this;
  }

   /**
   * This allows you to map a transaction property to a property on the underlying holding.
   * @return mappings
  **/
  @ApiModelProperty(value = "This allows you to map a transaction property to a property on the underlying holding.")
  public List<TransactionPropertyMapping> getMappings() {
    return mappings;
  }

  public void setMappings(List<TransactionPropertyMapping> mappings) {
    this.mappings = mappings;
  }


  public TransactionConfigurationMovementData name(String name) {
    this.name = name; 
    return this;
  }

   /**
   * The movement name (optional)
   * @return name
  **/
  @ApiModelProperty(value = "The movement name (optional)")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
    sb.append("class TransactionConfigurationMovementData {\n");
    sb.append("    movementTypes: ").append(toIndentedString(movementTypes)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
