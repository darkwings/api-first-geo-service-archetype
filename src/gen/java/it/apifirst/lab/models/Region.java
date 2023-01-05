package it.apifirst.lab.models;

import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Region / State (for US or other federated countries). This API does not force region_id to have a particular format,
 * but implementors have to make sure it will be unique for that region state. It could be a random alphanumeric code
 * (&#39;abc012&#39;) or could be something that recalls countries (es &#39;us-ak&#39; for Alaska, &#39;it-lo&#39; for
 * Lombardy etc). It is purely an implementor&#39;s choice, the important is that the code is unique.
 **/

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-01-05T17:43:07.242068+01:00[Europe/Rome]")
public class Region implements Serializable {

    private @Valid String regionId;

    private @Valid String name;

    private @Valid Boolean deleted = false;

    private @Valid String countryId;

    /**
     * The region ID. It MUST identify a region/state in unique way.
     **/
    public Region regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    @JsonProperty("region_id")
    @NotNull
    @Pattern(regexp = "[A-Za-z0-9-_]+")
    @Size(max = 10)
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * The name reflects the value of &#39;lang&#39; param
     **/
    public Region name(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("name")
    @NotNull
    @Pattern(regexp = "[A-Za-z '-]+")
    @Size(max = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set to true is we&#39;re managing a deleted region
     **/
    public Region deleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    @JsonProperty("deleted")

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * The country ID (ISO)
     **/
    public Region countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    @JsonProperty("country_id")
    @Pattern(regexp = "[A-Za-z0-9-_]+")
    @Size(max = 10)
    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Region region = (Region) o;
        return Objects.equals(this.regionId, region.regionId) && Objects.equals(this.name, region.name)
                && Objects.equals(this.deleted, region.deleted) && Objects.equals(this.countryId, region.countryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionId, name, deleted, countryId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Region {\n");

        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
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
