package it.apifirst.lab.models;

import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Represents an error
 **/

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-01-05T17:43:07.242068+01:00[Europe/Rome]")
public class Error implements Serializable {

    private @Valid String code;

    private @Valid String message;

    /**
     * The error code. Can be used to localize the error, if shown to clients
     **/
    public Error code(String code) {
        this.code = code;
        return this;
    }

    @JsonProperty("code")
    @Pattern(regexp = "[A-Z0-9]+")
    @Size(max = 6)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * The error message
     **/
    public Error message(String message) {
        this.message = message;
        return this;
    }

    @JsonProperty("message")
    @Pattern(regexp = "[A-Za-z0-9 ,]+")
    @Size(max = 100)
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Error error = (Error) o;
        return Objects.equals(this.code, error.code) && Objects.equals(this.message, error.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Error {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
