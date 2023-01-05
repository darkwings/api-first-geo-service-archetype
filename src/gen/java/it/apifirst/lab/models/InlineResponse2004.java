package it.apifirst.lab.models;

import it.apifirst.lab.models.Link;
import it.apifirst.lab.models.Metadata;
import it.apifirst.lab.models.Province;
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
public class InlineResponse2004 implements Serializable {

    private @Valid List<Province> data = new ArrayList<>();

    private @Valid List<Link> links = new ArrayList<>();

    private @Valid Metadata metadata;

    /**
     **/
    public InlineResponse2004 data(List<Province> data) {
        this.data = data;
        return this;
    }

    @JsonProperty("data")
    @NotNull
    @Size(max = 300)
    public List<Province> getData() {
        return data;
    }

    public void setData(List<Province> data) {
        this.data = data;
    }

    /**
       **/
    public InlineResponse2004 links(List<Link> links) {
        this.links = links;
        return this;
    }

    @JsonProperty("links")
    @Size(max = 200)
    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    /**
       **/
    public InlineResponse2004 metadata(Metadata metadata) {
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
        InlineResponse2004 inlineResponse2004 = (InlineResponse2004) o;
        return Objects.equals(this.data, inlineResponse2004.data)
                && Objects.equals(this.links, inlineResponse2004.links)
                && Objects.equals(this.metadata, inlineResponse2004.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, links, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse2004 {\n");

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
