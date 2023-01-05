package it.apifirst.lab.models;

import it.apifirst.lab.models.Country;
import it.apifirst.lab.models.Link;
import it.apifirst.lab.models.Metadata;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-01-05T12:22:30.422909+01:00[Europe/Rome]")
public class InlineResponse200 implements Serializable {

    private @Valid List<Country> data = new ArrayList<>();

    private @Valid List<Link> links = new ArrayList<>();

    private @Valid Metadata metadata;

    /**
     **/
    public InlineResponse200 data(List<Country> data) {
        this.data = data;
        return this;
    }

    @JsonProperty("data")
    @NotNull
    @Size(max = 300)
    public List<Country> getData() {
        return data;
    }

    public void setData(List<Country> data) {
        this.data = data;
    }

    /**
       **/
    public InlineResponse200 links(List<Link> links) {
        this.links = links;
        return this;
    }

    @JsonProperty("links")
    @Size(max = 20)
    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    /**
       **/
    public InlineResponse200 metadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    @JsonProperty("metadata")

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InlineResponse200 inlineResponse200 = (InlineResponse200) o;
        return Objects.equals(this.data, inlineResponse200.data) && Objects.equals(this.links, inlineResponse200.links)
                && Objects.equals(this.metadata, inlineResponse200.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, links, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse200 {\n");

        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
