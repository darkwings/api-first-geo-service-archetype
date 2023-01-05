package it.apifirst.lab.models;

import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Represents a country
 **/

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-01-05T12:22:30.422909+01:00[Europe/Rome]")
public class Country implements Serializable {

    private @Valid String countryId;

    private @Valid String name;

    private @Valid String phoneCode;

    private @Valid Boolean deleted = false;

    /**
     * ISO code of the country (it, en, de etc.)
     **/
    public Country countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    @JsonProperty("country_id")
    @NotNull
    @Pattern(regexp = "[A-Za-z0-9-_]+")
    @Size(max = 10)
    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    /**
     * The name reflects the value of &#39;lang&#39; param
     **/
    public Country name(String name) {
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
     * The phone code of the country (link 39 for Italy)
     **/
    public Country phoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
        return this;
    }

    @JsonProperty("phone_code")
    @Pattern(regexp = "[0-9]*")
    @Size(max = 3)
    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    /**
     * Set to true is we&#39;re managing a deleted country like Yugoslavia
     **/
    public Country deleted(Boolean deleted) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Country country = (Country) o;
        return Objects.equals(this.countryId, country.countryId) && Objects.equals(this.name, country.name)
                && Objects.equals(this.phoneCode, country.phoneCode) && Objects.equals(this.deleted, country.deleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryId, name, phoneCode, deleted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Country {\n");

        sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    phoneCode: ").append(toIndentedString(phoneCode)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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
