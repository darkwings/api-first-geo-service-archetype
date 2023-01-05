package it.apifirst.lab.models;

import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-01-05T12:22:30.422909+01:00[Europe/Rome]")
public class InlineObject1 implements Serializable {

    private @Valid String countryId;

    private @Valid String regionName;

    private @Valid String provinceName;

    private @Valid String cityName;

    /**
     **/
    public InlineObject1 countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    @JsonProperty("country_id")
    @NotNull
    @Pattern(regexp = "[A-Za-z]{2}")
    @Size(max = 2)
    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    /**
       **/
    public InlineObject1 regionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    @JsonProperty("region_name")
    @Pattern(regexp = "[A-Za-z0-9 ,'-]+")
    @Size(max = 100)
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
       **/
    public InlineObject1 provinceName(String provinceName) {
        this.provinceName = provinceName;
        return this;
    }

    @JsonProperty("province_name")
    @Pattern(regexp = "[A-Za-z0-9 ,'-]+")
    @Size(max = 100)
    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    /**
       **/
    public InlineObject1 cityName(String cityName) {
        this.cityName = cityName;
        return this;
    }

    @JsonProperty("city_name")
    @Pattern(regexp = "[A-Za-z0-9 ,'-]+")
    @Size(max = 100)
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InlineObject1 inlineObject1 = (InlineObject1) o;
        return Objects.equals(this.countryId, inlineObject1.countryId)
                && Objects.equals(this.regionName, inlineObject1.regionName)
                && Objects.equals(this.provinceName, inlineObject1.provinceName)
                && Objects.equals(this.cityName, inlineObject1.cityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryId, regionName, provinceName, cityName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineObject1 {\n");

        sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    provinceName: ").append(toIndentedString(provinceName)).append("\n");
        sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
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
