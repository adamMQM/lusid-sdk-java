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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The MovementDataDto model.
 */
public class MovementDataDto {
    /**
     * The movement types. Possible values include: 'Settlement', 'Traded',
     * 'ForwardFx', 'Commitment', 'Receivable', 'CashSettlement', 'Accrual'.
     */
    @JsonProperty(value = "movementTypes", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String movementTypes;

    /**
     * The Side. Possible values include: 'Side1', 'Side2', 'BondInt'.
     */
    @JsonProperty(value = "side", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String side;

    /**
     * The direction property.
     */
    @JsonProperty(value = "direction", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private int direction;

    /**
     * The Flags.
     */
    @JsonProperty(value = "flags", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String flags;

    /**
     * Get the movementTypes value.
     *
     * @return the movementTypes value
     */
    public String movementTypes() {
        return this.movementTypes;
    }

    /**
     * Get the side value.
     *
     * @return the side value
     */
    public String side() {
        return this.side;
    }

    /**
     * Get the direction value.
     *
     * @return the direction value
     */
    public int direction() {
        return this.direction;
    }

    /**
     * Get the flags value.
     *
     * @return the flags value
     */
    public String flags() {
        return this.flags;
    }

}
