package it.apifirst.lab.models;

import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Province, for countries we need this concept
 **/

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-01-05T12:22:30.422909+01:00[Europe/Rome]")
public class Province implements Serializable {

    private @Valid String provinceId;

    private @Valid String name;

    private @Valid String code;

    private @Valid Boolean deleted = false;

    private @Valid String countryId;

    private @Valid String regionId;

    /**
     * The province ID. It MUST identify a province in unique way
     **/
    public Province provinceId(String provinceId) {
        this.provinceId = provinceId;
        return this;
    }

    @JsonProperty("province_id")
    @NotNull
    @Pattern(regexp = "[A-Za-z0-9-_]+")
    @Size(max = 10)
    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * The name reflects the value of &#39;lang&#39; param
     **/
    public Province name(String name) {
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
     * The mnemonical code of the province. For italian provine we have MI, NA, VE and so on
     **/
    public Province code(String code) {
        this.code = code;
        return this;
    }

    @JsonProperty("code")
    @NotNull
    @Pattern(regexp = "[A-Za-z]+")
    @Size(max = 5)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Set to true is we&#39;re managing a deleted province
     **/
    public Province deleted(Boolean deleted) {
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
       **/
    public Province countryId(String countryId) {
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

    /**
       **/
    public Province regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    @JsonProperty("region_id")
    @Pattern(regexp = "[A-Za-z0-9-_]+")
    @Size(max = 10)
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Province province = (Province) o;
        return Objects.equals(this.provinceId, province.provinceId) && Objects.equals(this.name, province.name)
                && Objects.equals(this.code, province.code) && Objects.equals(this.deleted, province.deleted)
                && Objects.equals(this.countryId, province.countryId)
                && Objects.equals(this.regionId, province.regionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provinceId, name, code, deleted, countryId, regionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Province {\n");

        sb.append("    provinceId: ").append(toIndentedString(provinceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
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
