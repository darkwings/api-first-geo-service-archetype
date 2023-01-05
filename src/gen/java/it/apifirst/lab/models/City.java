package it.apifirst.lab.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A city. A deleted city is a city that no longer exists, possibly for a merge with other cities. Each city should have
 * a unique ID. Given that some big cities are associated to more zip codes, the field &#x60;zip_codes&#x60; is an
 * array.
 **/

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-01-05T17:43:07.242068+01:00[Europe/Rome]")
public class City implements Serializable {

    private @Valid String cityId;

    private @Valid String name;

    private @Valid List<String> zipCodes = new ArrayList<>();

    private @Valid String stateCode;

    private @Valid String managementCode;

    private @Valid Boolean deleted = false;

    private @Valid BigDecimal extension;

    private @Valid Integer inhabitants;

    private @Valid String countryId;

    private @Valid String countryName;

    private @Valid String regionId;

    private @Valid String regionName;

    private @Valid String provinceId;

    private @Valid String provinceName;

    /**
     * The city ID. It MUST identify a city in unique way
     **/
    public City cityId(String cityId) {
        this.cityId = cityId;
        return this;
    }

    @JsonProperty("city_id")
    @NotNull
    @Pattern(regexp = "[A-Za-z0-9-_]+")
    @Size(max = 10)
    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    /**
     * The name reflects the value of &#39;lang&#39; param
     **/
    public City name(String name) {
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
     * Some cities spreads through different zip codes, so we treat it as a list
     **/
    public City zipCodes(List<String> zipCodes) {
        this.zipCodes = zipCodes;
        return this;
    }

    @JsonProperty("zip_codes")
    @Size(max = 100)
    public List<String> getZipCodes() {
        return zipCodes;
    }

    public void setZipCodes(List<String> zipCodes) {
        this.zipCodes = zipCodes;
    }

    /**
     * The code used by owning state to identify the city.
     **/
    public City stateCode(String stateCode) {
        this.stateCode = stateCode;
        return this;
    }

    @JsonProperty("state_code")
    @Pattern(regexp = "[A-Za-z0-9]+")
    @Size(max = 10)
    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    /**
     * The code used by authorities to identify the city. In Italy could be ISTAT code (known as &#39;Codice
     * catastale&#39;)
     **/
    public City managementCode(String managementCode) {
        this.managementCode = managementCode;
        return this;
    }

    @JsonProperty("management_code")
    @Pattern(regexp = "[A-Za-z0-9]+")
    @Size(max = 10)
    public String getManagementCode() {
        return managementCode;
    }

    public void setManagementCode(String managementCode) {
        this.managementCode = managementCode;
    }

    /**
     * Identifies deleted cities, that means cities that are no more valid because of merging with other cities or any
     * other reason
     **/
    public City deleted(Boolean deleted) {
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
     * The extension of the city, in square metres minimum: 0
     **/
    public City extension(BigDecimal extension) {
        this.extension = extension;
        return this;
    }

    @JsonProperty("extension")
    @DecimalMin("0")
    public BigDecimal getExtension() {
        return extension;
    }

    public void setExtension(BigDecimal extension) {
        this.extension = extension;
    }

    /**
     * The inhabitants of the city
     **/
    public City inhabitants(Integer inhabitants) {
        this.inhabitants = inhabitants;
        return this;
    }

    @JsonProperty("inhabitants")

    public Integer getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(Integer inhabitants) {
        this.inhabitants = inhabitants;
    }

    /**
     * ISO code of country
     **/
    public City countryId(String countryId) {
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
    public City countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    @JsonProperty("country_name")
    @Pattern(regexp = "[A-Za-z0-9 -']+")
    @Size(max = 100)
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * The ID of the region
     **/
    public City regionId(String regionId) {
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

    /**
       **/
    public City regionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    @JsonProperty("region_name")
    @Pattern(regexp = "[A-Za-z0-9 -']+")
    @Size(max = 100)
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * Province ID, can be null when data is not available
     **/
    public City provinceId(String provinceId) {
        this.provinceId = provinceId;
        return this;
    }

    @JsonProperty("province_id")
    @Pattern(regexp = "[A-Za-z0-9-_]+")
    @Size(max = 10)
    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    /**
       **/
    public City provinceName(String provinceName) {
        this.provinceName = provinceName;
        return this;
    }

    @JsonProperty("province_name")
    @Pattern(regexp = "[A-Za-z0-9 -']+")
    @Size(max = 100)
    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        City city = (City) o;
        return Objects.equals(this.cityId, city.cityId) && Objects.equals(this.name, city.name)
                && Objects.equals(this.zipCodes, city.zipCodes) && Objects.equals(this.stateCode, city.stateCode)
                && Objects.equals(this.managementCode, city.managementCode)
                && Objects.equals(this.deleted, city.deleted) && Objects.equals(this.extension, city.extension)
                && Objects.equals(this.inhabitants, city.inhabitants) && Objects.equals(this.countryId, city.countryId)
                && Objects.equals(this.countryName, city.countryName) && Objects.equals(this.regionId, city.regionId)
                && Objects.equals(this.regionName, city.regionName) && Objects.equals(this.provinceId, city.provinceId)
                && Objects.equals(this.provinceName, city.provinceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityId, name, zipCodes, stateCode, managementCode, deleted, extension, inhabitants,
                countryId, countryName, regionId, regionName, provinceId, provinceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class City {\n");

        sb.append("    cityId: ").append(toIndentedString(cityId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    zipCodes: ").append(toIndentedString(zipCodes)).append("\n");
        sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
        sb.append("    managementCode: ").append(toIndentedString(managementCode)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
        sb.append("    inhabitants: ").append(toIndentedString(inhabitants)).append("\n");
        sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
        sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    provinceId: ").append(toIndentedString(provinceId)).append("\n");
        sb.append("    provinceName: ").append(toIndentedString(provinceName)).append("\n");
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
