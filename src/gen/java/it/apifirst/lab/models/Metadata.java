package it.apifirst.lab.models;

import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Associated with collection responses, but only if needed. As an example, for Province API which will return a small
 * number of results, metadata is quite unuseful.
 **/

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-01-05T12:22:30.422909+01:00[Europe/Rome]")
public class Metadata implements Serializable {

    private @Valid Integer currentOffset;

    private @Valid Integer totalCount;

    /**
     * The current offset of the results shown minimum: 0 maximum: 100000
     **/
    public Metadata currentOffset(Integer currentOffset) {
        this.currentOffset = currentOffset;
        return this;
    }

    @JsonProperty("current_offset")
    @Min(0)
    @Max(100000)
    public Integer getCurrentOffset() {
        return currentOffset;
    }

    public void setCurrentOffset(Integer currentOffset) {
        this.currentOffset = currentOffset;
    }

    /**
     * minimum: 0 maximum: 10000
     **/
    public Metadata totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    @JsonProperty("total_count")
    @Min(0)
    @Max(10000)
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Metadata metadata = (Metadata) o;
        return Objects.equals(this.currentOffset, metadata.currentOffset)
                && Objects.equals(this.totalCount, metadata.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentOffset, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Metadata {\n");

        sb.append("    currentOffset: ").append(toIndentedString(currentOffset)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
