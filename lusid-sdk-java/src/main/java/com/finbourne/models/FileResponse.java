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
 * Allows a file (represented as a stream) to be returned from an Api call.
 */
public class FileResponse {
    /**
     * The fileStream property.
     */
    @JsonProperty(value = "fileStream", access = JsonProperty.Access.WRITE_ONLY)
    private StreamModel fileStream;

    /**
     * The contentType property.
     */
    @JsonProperty(value = "contentType", access = JsonProperty.Access.WRITE_ONLY)
    private String contentType;

    /**
     * The downloadedFilename property.
     */
    @JsonProperty(value = "downloadedFilename", access = JsonProperty.Access.WRITE_ONLY)
    private String downloadedFilename;

    /**
     * Get the fileStream value.
     *
     * @return the fileStream value
     */
    public StreamModel fileStream() {
        return this.fileStream;
    }

    /**
     * Get the contentType value.
     *
     * @return the contentType value
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Get the downloadedFilename value.
     *
     * @return the downloadedFilename value
     */
    public String downloadedFilename() {
        return this.downloadedFilename;
    }

}
