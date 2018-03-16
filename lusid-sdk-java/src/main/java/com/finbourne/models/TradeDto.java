/**
 * Copyright © 2018 FINBOURNE TECHNOLOGY LTD
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 */

package com.finbourne.models;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The TradeDto model.
 */
public class TradeDto {
    /**
     * Unique trade identifier.
     */
    @JsonProperty(value = "tradeId", required = true)
    private String tradeId;

    /**
     * LUSID transaction type code - Buy, Sell, StockIn, StockOut, etc.
     * Possible values include: 'Buy', 'Sell', 'StockIn', 'StockOut'.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Unique security identifier.
     */
    @JsonProperty(value = "securityUid", required = true)
    private String securityUid;

    /**
     * Trade date.
     */
    @JsonProperty(value = "tradeDate", required = true)
    private DateTime tradeDate;

    /**
     * Settlement date.
     */
    @JsonProperty(value = "settlementDate", required = true)
    private DateTime settlementDate;

    /**
     * Quantity of trade in units of the security.
     */
    @JsonProperty(value = "units", required = true)
    private double units;

    /**
     * Execution price for the trade.
     */
    @JsonProperty(value = "tradePrice", required = true)
    private double tradePrice;

    /**
     * Total value of the trade.
     */
    @JsonProperty(value = "totalConsideration", required = true)
    private double totalConsideration;

    /**
     * Settlement currency.
     */
    @JsonProperty(value = "settlementCurrency", required = true)
    private String settlementCurrency;

    /**
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private List<PropertyDto> properties;

    /**
     * Counterparty identifier.
     */
    @JsonProperty(value = "counterpartyId")
    private String counterpartyId;

    /**
     * Where this trade came from, either Client or System. Possible values
     * include: 'System', 'Client'.
     */
    @JsonProperty(value = "source", required = true)
    private String source;

    /**
     * Possible values include: 'Default', 'ExDividend', 'CumDividend'.
     */
    @JsonProperty(value = "dividendState")
    private String dividendState;

    /**
     * Possible values include: 'Price', 'Yield', 'Spread'.
     */
    @JsonProperty(value = "tradePriceType")
    private String tradePriceType;

    /**
     * Possible values include: 'Nominal', 'Shares', 'FaceValue', 'Contracts'.
     */
    @JsonProperty(value = "unitType")
    private String unitType;

    /**
     * The nettingSet property.
     */
    @JsonProperty(value = "nettingSet")
    private String nettingSet;

    /**
     * Get the tradeId value.
     *
     * @return the tradeId value
     */
    public String tradeId() {
        return this.tradeId;
    }

    /**
     * Set the tradeId value.
     *
     * @param tradeId the tradeId value to set
     * @return the TradeDto object itself.
     */
    public TradeDto withTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the TradeDto object itself.
     */
    public TradeDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the securityUid value.
     *
     * @return the securityUid value
     */
    public String securityUid() {
        return this.securityUid;
    }

    /**
     * Set the securityUid value.
     *
     * @param securityUid the securityUid value to set
     * @return the TradeDto object itself.
     */
    public TradeDto withSecurityUid(String securityUid) {
        this.securityUid = securityUid;
        return this;
    }

    /**
     * Get the tradeDate value.
     *
     * @return the tradeDate value
     */
    public DateTime tradeDate() {
        return this.tradeDate;
    }

    /**
     * Set the tradeDate value.
     *
     * @param tradeDate the tradeDate value to set
     * @return the TradeDto object itself.
     */
    public TradeDto withTradeDate(DateTime tradeDate) {
        this.tradeDate = tradeDate;
        return this;
    }

    /**
     * Get the settlementDate value.
     *
     * @return the settlementDate value
     */
    public DateTime settlementDate() {
        return this.settlementDate;
    }

    /**
     * Set the settlementDate value.
     *
     * @param settlementDate the settlementDate value to set
     * @return the TradeDto object itself.
     */
    public TradeDto withSettlementDate(DateTime settlementDate) {
        this.settlementDate = settlementDate;
        return this;
    }

    /**
     * Get the units value.
     *
     * @return the units value
     */
    public double units() {
        return this.units;
    }

    /**
     * Set the units value.
     *
     * @param units the units value to set
     * @return the TradeDto object itself.
     */
    public TradeDto withUnits(double units) {
        this.units = units;
        return this;
    }

    /**
     * Get the tradePrice value.
     *
     * @return the tradePrice value
     */
    public double tradePrice() {
        return this.tradePrice;
    }

    /**
     * Set the tradePrice value.
     *
     * @param tradePrice the tradePrice value to set
     * @return the TradeDto object itself.
     */
    public TradeDto withTradePrice(double tradePrice) {
        this.tradePrice = tradePrice;
        return this;
    }

    /**
     * Get the totalConsideration value.
     *
     * @return the totalConsideration value
     */
    public double totalConsideration() {
        return this.totalConsideration;
    }

    /**
     * Set the totalConsideration value.
     *
     * @param totalConsideration the totalConsideration value to set
     * @return the TradeDto object itself.
     */
    public TradeDto withTotalConsideration(double totalConsideration) {
        this.totalConsideration = totalConsideration;
        return this;
    }

    /**
     * Get the settlementCurrency value.
     *
     * @return the settlementCurrency value
     */
    public String settlementCurrency() {
        return this.settlementCurrency;
    }

    /**
     * Set the settlementCurrency value.
     *
     * @param settlementCurrency the settlementCurrency value to set
     * @return the TradeDto object itself.
     */
    public TradeDto withSettlementCurrency(String settlementCurrency) {
        this.settlementCurrency = settlementCurrency;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public List<PropertyDto> properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the TradeDto object itself.
     */
    public TradeDto withProperties(List<PropertyDto> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the counterpartyId value.
     *
     * @return the counterpartyId value
     */
    public String counterpartyId() {
        return this.counterpartyId;
    }

    /**
     * Set the counterpartyId value.
     *
     * @param counterpartyId the counterpartyId value to set
     * @return the TradeDto object itself.
     */
    public TradeDto withCounterpartyId(String counterpartyId) {
        this.counterpartyId = counterpartyId;
        return this;
    }

    /**
     * Get the source value.
     *
     * @return the source value
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source value.
     *
     * @param source the source value to set
     * @return the TradeDto object itself.
     */
    public TradeDto withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the dividendState value.
     *
     * @return the dividendState value
     */
    public String dividendState() {
        return this.dividendState;
    }

    /**
     * Set the dividendState value.
     *
     * @param dividendState the dividendState value to set
     * @return the TradeDto object itself.
     */
    public TradeDto withDividendState(String dividendState) {
        this.dividendState = dividendState;
        return this;
    }

    /**
     * Get the tradePriceType value.
     *
     * @return the tradePriceType value
     */
    public String tradePriceType() {
        return this.tradePriceType;
    }

    /**
     * Set the tradePriceType value.
     *
     * @param tradePriceType the tradePriceType value to set
     * @return the TradeDto object itself.
     */
    public TradeDto withTradePriceType(String tradePriceType) {
        this.tradePriceType = tradePriceType;
        return this;
    }

    /**
     * Get the unitType value.
     *
     * @return the unitType value
     */
    public String unitType() {
        return this.unitType;
    }

    /**
     * Set the unitType value.
     *
     * @param unitType the unitType value to set
     * @return the TradeDto object itself.
     */
    public TradeDto withUnitType(String unitType) {
        this.unitType = unitType;
        return this;
    }

    /**
     * Get the nettingSet value.
     *
     * @return the nettingSet value
     */
    public String nettingSet() {
        return this.nettingSet;
    }

    /**
     * Set the nettingSet value.
     *
     * @param nettingSet the nettingSet value to set
     * @return the TradeDto object itself.
     */
    public TradeDto withNettingSet(String nettingSet) {
        this.nettingSet = nettingSet;
        return this;
    }

}
