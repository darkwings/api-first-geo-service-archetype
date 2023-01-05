package it.apifirst.lab.models;

import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-01-05T12:22:30.422909+01:00[Europe/Rome]")
public class InlineObject implements Serializable {

    private @Valid String countryId;

    private @Valid String taxCode;

    /**
     **/
    public InlineObject countryId(String countryId) {
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
    public InlineObject taxCode(String taxCode) {
        this.taxCode = taxCode;
        return this;
    }

    @JsonProperty("tax_code")
    @NotNull
    @Pattern(regexp = "[A-Za-z0-9]+")
    @Size(max = 20)
    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InlineObject inlineObject = (InlineObject) o;
        return Objects.equals(this.countryId, inlineObject.countryId)
                && Objects.equals(this.taxCode, inlineObject.taxCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryId, taxCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineObject {\n");

        sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
        sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
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
