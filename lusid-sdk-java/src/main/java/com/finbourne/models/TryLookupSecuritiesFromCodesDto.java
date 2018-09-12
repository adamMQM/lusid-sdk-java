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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The TryLookupSecuritiesFromCodesDto model.
 */
public class TryLookupSecuritiesFromCodesDto {
    /**
     * The href property.
     */
    @JsonProperty(value = "href")
    private String href;

    /**
     * The values property.
     */
    @JsonProperty(value = "values")
    private List<ResourceListOfSecurityDto> values;

    /**
     * The failed property.
     */
    @JsonProperty(value = "failed")
    private List<ErrorDetail> failed;

    /**
     * Get the href value.
     *
     * @return the href value
     */
    public String href() {
        return this.href;
    }

    /**
     * Set the href value.
     *
     * @param href the href value to set
     * @return the TryLookupSecuritiesFromCodesDto object itself.
     */
    public TryLookupSecuritiesFromCodesDto withHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * Get the values value.
     *
     * @return the values value
     */
    public List<ResourceListOfSecurityDto> values() {
        return this.values;
    }

    /**
     * Set the values value.
     *
     * @param values the values value to set
     * @return the TryLookupSecuritiesFromCodesDto object itself.
     */
    public TryLookupSecuritiesFromCodesDto withValues(List<ResourceListOfSecurityDto> values) {
        this.values = values;
        return this;
    }

    /**
     * Get the failed value.
     *
     * @return the failed value
     */
    public List<ErrorDetail> failed() {
        return this.failed;
    }

    /**
     * Set the failed value.
     *
     * @param failed the failed value to set
     * @return the TryLookupSecuritiesFromCodesDto object itself.
     */
    public TryLookupSecuritiesFromCodesDto withFailed(List<ErrorDetail> failed) {
        this.failed = failed;
        return this;
    }

}
