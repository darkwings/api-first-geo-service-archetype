package it.apifirst.lab.models;

import java.time.LocalDate;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The owner of tax code
 **/

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-01-05T12:22:30.422909+01:00[Europe/Rome]")
public class TaxCodeOwner implements Serializable {

    private @Valid String taxCode;

    private @Valid String lastName;

    private @Valid String firstName;

    private @Valid String sex;

    private @Valid LocalDate birthDate;

    private @Valid String birthRegion;

    private @Valid String birthProvince;

    private @Valid String birthCity;

    private @Valid String birthCityManagementCode;

    private @Valid String birthCityStateCode;

    private @Valid String controlChars;

    /**
     **/
    public TaxCodeOwner taxCode(String taxCode) {
        this.taxCode = taxCode;
        return this;
    }

    @JsonProperty("tax_code")
    @Pattern(regexp = "[A-Za-z0-9]+")
    @Size(max = 20)
    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    /**
     * The last name of the owner of tax code, if available
     **/
    public TaxCodeOwner lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @JsonProperty("last_name")
    @Pattern(regexp = "[A-Za-z ]+")
    @Size(max = 100)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * The first name of the owner of tax code, if available
     **/
    public TaxCodeOwner firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @JsonProperty("first_name")
    @Pattern(regexp = "[A-Za-z ]+")
    @Size(max = 100)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * The sex of the owner of tax code, if available
     **/
    public TaxCodeOwner sex(String sex) {
        this.sex = sex;
        return this;
    }

    @JsonProperty("sex")
    @Pattern(regexp = "[A-Z]+")
    @Size(max = 2)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * The birth date, in YYYY-mm-dd format
     **/
    public TaxCodeOwner birthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    @JsonProperty("birth_date")
    @Size(max = 10)
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * The name reflects the value of &#39;lang&#39; param
     **/
    public TaxCodeOwner birthRegion(String birthRegion) {
        this.birthRegion = birthRegion;
        return this;
    }

    @JsonProperty("birth_region")
    @Pattern(regexp = "[A-Za-z ']+")
    @Size(max = 100)
    public String getBirthRegion() {
        return birthRegion;
    }

    public void setBirthRegion(String birthRegion) {
        this.birthRegion = birthRegion;
    }

    /**
     * The name reflects the value of &#39;lang&#39; param
     **/
    public TaxCodeOwner birthProvince(String birthProvince) {
        this.birthProvince = birthProvince;
        return this;
    }

    @JsonProperty("birth_province")
    @Pattern(regexp = "[A-Za-z ']+")
    @Size(max = 100)
    public String getBirthProvince() {
        return birthProvince;
    }

    public void setBirthProvince(String birthProvince) {
        this.birthProvince = birthProvince;
    }

    /**
     * The name reflects the value of &#39;lang&#39; param
     **/
    public TaxCodeOwner birthCity(String birthCity) {
        this.birthCity = birthCity;
        return this;
    }

    @JsonProperty("birth_city")
    @Pattern(regexp = "[A-Za-z ']+")
    @Size(max = 100)
    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    /**
     * if available
     **/
    public TaxCodeOwner birthCityManagementCode(String birthCityManagementCode) {
        this.birthCityManagementCode = birthCityManagementCode;
        return this;
    }

    @JsonProperty("birth_city_management_code")
    @Pattern(regexp = "[A-Za-z0-9]+")
    @Size(max = 10)
    public String getBirthCityManagementCode() {
        return birthCityManagementCode;
    }

    public void setBirthCityManagementCode(String birthCityManagementCode) {
        this.birthCityManagementCode = birthCityManagementCode;
    }

    /**
     * if available
     **/
    public TaxCodeOwner birthCityStateCode(String birthCityStateCode) {
        this.birthCityStateCode = birthCityStateCode;
        return this;
    }

    @JsonProperty("birth_city_state_code")
    @Pattern(regexp = "[A-Za-z0-9]+")
    @Size(max = 10)
    public String getBirthCityStateCode() {
        return birthCityStateCode;
    }

    public void setBirthCityStateCode(String birthCityStateCode) {
        this.birthCityStateCode = birthCityStateCode;
    }

    /**
     * Additional chars of the tax code, if present
     **/
    public TaxCodeOwner controlChars(String controlChars) {
        this.controlChars = controlChars;
        return this;
    }

    @JsonProperty("control_chars")
    @Pattern(regexp = "[A-Za-z0-9]+")
    @Size(max = 10)
    public String getControlChars() {
        return controlChars;
    }

    public void setControlChars(String controlChars) {
        this.controlChars = controlChars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaxCodeOwner taxCodeOwner = (TaxCodeOwner) o;
        return Objects.equals(this.taxCode, taxCodeOwner.taxCode)
                && Objects.equals(this.lastName, taxCodeOwner.lastName)
                && Objects.equals(this.firstName, taxCodeOwner.firstName) && Objects.equals(this.sex, taxCodeOwner.sex)
                && Objects.equals(this.birthDate, taxCodeOwner.birthDate)
                && Objects.equals(this.birthRegion, taxCodeOwner.birthRegion)
                && Objects.equals(this.birthProvince, taxCodeOwner.birthProvince)
                && Objects.equals(this.birthCity, taxCodeOwner.birthCity)
                && Objects.equals(this.birthCityManagementCode, taxCodeOwner.birthCityManagementCode)
                && Objects.equals(this.birthCityStateCode, taxCodeOwner.birthCityStateCode)
                && Objects.equals(this.controlChars, taxCodeOwner.controlChars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taxCode, lastName, firstName, sex, birthDate, birthRegion, birthProvince, birthCity,
                birthCityManagementCode, birthCityStateCode, controlChars);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaxCodeOwner {\n");

        sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
        sb.append("    birthRegion: ").append(toIndentedString(birthRegion)).append("\n");
        sb.append("    birthProvince: ").append(toIndentedString(birthProvince)).append("\n");
        sb.append("    birthCity: ").append(toIndentedString(birthCity)).append("\n");
        sb.append("    birthCityManagementCode: ").append(toIndentedString(birthCityManagementCode)).append("\n");
        sb.append("    birthCityStateCode: ").append(toIndentedString(birthCityStateCode)).append("\n");
        sb.append("    controlChars: ").append(toIndentedString(controlChars)).append("\n");
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
