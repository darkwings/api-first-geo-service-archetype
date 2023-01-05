package it.apifirst.lab.models;

import it.apifirst.lab.models.TaxCodeOwner;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-01-05T17:43:07.242068+01:00[Europe/Rome]")
public class InlineResponse2005 implements Serializable {

    private @Valid TaxCodeOwner data;

    /**
     **/
    public InlineResponse2005 data(TaxCodeOwner data) {
        this.data = data;
        return this;
    }

    @JsonProperty("data")

    public TaxCodeOwner getData() {
        return data;
    }

    public void setData(TaxCodeOwner data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InlineResponse2005 inlineResponse2005 = (InlineResponse2005) o;
        return Objects.equals(this.data, inlineResponse2005.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse2005 {\n");

        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
