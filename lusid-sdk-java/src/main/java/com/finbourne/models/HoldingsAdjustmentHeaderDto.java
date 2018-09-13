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
 * Summary information of a holdings adjustment for a single portfolio and
 * effective date.
 */
public class HoldingsAdjustmentHeaderDto {
    /**
     * There can be at most one holdings adjustment for a portfolio at a
     * specific effective time so this uniquely identifies the adjustment.
     */
    @JsonProperty(value = "effectiveAt")
    private DateTime effectiveAt;

    /**
     * The version property.
     */
    @JsonProperty(value = "version")
    private VersionDto version;

    /**
     * Possible values include: 'PositionToZero', 'KeepTheSame'.
     */
    @JsonProperty(value = "unmatchedHoldingMethod")
    private String unmatchedHoldingMethod;

    /**
     * The _links property.
     */
    @JsonProperty(value = "_links")
    private List<Link> _links;

    /**
     * Get there can be at most one holdings adjustment for a portfolio at a
     specific effective time so this uniquely identifies the adjustment.
     *
     * @return the effectiveAt value
     */
    public DateTime effectiveAt() {
        return this.effectiveAt;
    }

    /**
     * Set there can be at most one holdings adjustment for a portfolio at a
     specific effective time so this uniquely identifies the adjustment.
     *
     * @param effectiveAt the effectiveAt value to set
     * @return the HoldingsAdjustmentHeaderDto object itself.
     */
    public HoldingsAdjustmentHeaderDto withEffectiveAt(DateTime effectiveAt) {
        this.effectiveAt = effectiveAt;
        return this;
    }

    /**
     * Get the version value.
     *
     * @return the version value
     */
    public VersionDto version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set
     * @return the HoldingsAdjustmentHeaderDto object itself.
     */
    public HoldingsAdjustmentHeaderDto withVersion(VersionDto version) {
        this.version = version;
        return this;
    }

    /**
     * Get possible values include: 'PositionToZero', 'KeepTheSame'.
     *
     * @return the unmatchedHoldingMethod value
     */
    public String unmatchedHoldingMethod() {
        return this.unmatchedHoldingMethod;
    }

    /**
     * Set possible values include: 'PositionToZero', 'KeepTheSame'.
     *
     * @param unmatchedHoldingMethod the unmatchedHoldingMethod value to set
     * @return the HoldingsAdjustmentHeaderDto object itself.
     */
    public HoldingsAdjustmentHeaderDto withUnmatchedHoldingMethod(String unmatchedHoldingMethod) {
        this.unmatchedHoldingMethod = unmatchedHoldingMethod;
        return this;
    }

    /**
     * Get the _links value.
     *
     * @return the _links value
     */
    public List<Link> _links() {
        return this._links;
    }

    /**
     * Set the _links value.
     *
     * @param _links the _links value to set
     * @return the HoldingsAdjustmentHeaderDto object itself.
     */
    public HoldingsAdjustmentHeaderDto with_links(List<Link> _links) {
        this._links = _links;
        return this;
    }

}
