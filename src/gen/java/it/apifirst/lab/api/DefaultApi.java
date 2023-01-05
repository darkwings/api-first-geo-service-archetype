package it.apifirst.lab.api;

import java.math.BigDecimal;
import it.apifirst.lab.models.Errors;
import it.apifirst.lab.models.InlineObject;
import it.apifirst.lab.models.InlineObject1;
import it.apifirst.lab.models.InlineResponse200;
import it.apifirst.lab.models.InlineResponse2001;
import it.apifirst.lab.models.InlineResponse2002;
import it.apifirst.lab.models.InlineResponse2003;
import it.apifirst.lab.models.InlineResponse2004;
import it.apifirst.lab.models.InlineResponse2005;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.jboss.resteasy.spi.NotImplementedYetException;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-01-05T17:43:07.242068+01:00[Europe/Rome]")
public interface DefaultApi {

    @GET
    @Path("/countries/{country_id}/regions/{region_id}/cities")
    @Produces({ "application/json" })
    default InlineResponse2002 citiesByRegion(
            @PathParam("country_id") @Pattern(regexp = "[A-Za-z]{2}") @Size(max = 2) String countryId,
            @PathParam("region_id") @Pattern(regexp = "[A-Za-z0-9]+") @Size(max = 10) String regionId,
            @QueryParam("lang") @Pattern(regexp = "[A-Za-z]{2}") @Size(max = 2) @DefaultValue("it") String lang,
            @QueryParam("limit") @DecimalMin("0") @DecimalMax("50") @DefaultValue("20") BigDecimal limit,
            @QueryParam("offset") @DecimalMin("0") @DefaultValue("0") BigDecimal offset) {
        throw new NotImplementedYetException();
    }

    @GET
    @Path("/countries/{country_id}/regions/{region_id}/cities/{city_id}")
    @Produces({ "application/json" })
    default InlineResponse2003 citiesByRegionAndCityId(
            @PathParam("country_id") @Pattern(regexp = "[A-Za-z]{2}") @Size(max = 2) String countryId,
            @PathParam("region_id") @Pattern(regexp = "[A-Za-z0-9]+") @Size(max = 10) String regionId,
            @PathParam("city_id") @Pattern(regexp = "[A-Za-z0-9]+") @Size(max = 10) String cityId,
            @QueryParam("lang") @Pattern(regexp = "[A-Za-z]{2}") @Size(max = 2) @DefaultValue("it") String lang) {
        throw new NotImplementedYetException();
    }

    @GET
    @Path("/countries/{country_id}/regions/{region_id}/provinces/{province_id}/cities/{city_id}")
    @Produces({ "application/json" })
    default InlineResponse2003 cityByCityIdAndProvince(
            @PathParam("country_id") @Pattern(regexp = "[A-Za-z]{2}") @Size(max = 2) String countryId,
            @PathParam("region_id") @Pattern(regexp = "[A-Za-z0-9]+") @Size(max = 10) String regionId,
            @PathParam("province_id") @Pattern(regexp = "[A-Za-z0-9]+") @Size(max = 10) String provinceId,
            @PathParam("city_id") @Pattern(regexp = "[A-Za-z0-9]+") @Size(max = 10) String cityId,
            @QueryParam("lang") @Pattern(regexp = "[A-Za-z]{2}") @Size(max = 2) @DefaultValue("it") String lang) {
        throw new NotImplementedYetException();
    }

    @GET
    @Path("/countries/{country_id}/regions")
    @Produces({ "application/json" })
    default InlineResponse2001 getApiGeoCountriesCountryCode(
            @PathParam("country_id") @Pattern(regexp = "[A-Za-z]{2}") @Size(max = 2) String countryId,
            @QueryParam("lang") @Pattern(regexp = "[A-Za-z]{2}") @Size(max = 2) @DefaultValue("it") String lang,
            @QueryParam("offset") @DecimalMin("0") @DefaultValue("0") BigDecimal offset,
            @QueryParam("limit") @DecimalMin("0") @DecimalMax("50") @DefaultValue("20") BigDecimal limit) {
        throw new NotImplementedYetException();
    }

    @GET
    @Path("/countries/{country_id}/regions/{region_id}/provinces/{province_id}/cities")
    @Produces({ "application/json" })
    default InlineResponse2002 getApiGeoCountriesCountryCodeRegionsRegionCodeProvincesProvinceCodeCities(
            @PathParam("country_id") @Pattern(regexp = "[A-Za-z]{2}") @Size(max = 2) String countryId,
            @PathParam("region_id") @Pattern(regexp = "[A-Za-z0-9]+") @Size(max = 10) String regionId,
            @PathParam("province_id") @Pattern(regexp = "[A-Za-z0-9]+") @Size(max = 10) String provinceId,
            @QueryParam("lang") @Pattern(regexp = "[A-Za-z]{2}") @Size(max = 2) @DefaultValue("it") String lang,
            @QueryParam("offset") @DecimalMin("0") @DefaultValue("0") BigDecimal offset,
            @QueryParam("limit") @DecimalMin("0") @DecimalMax("50") @DefaultValue("20") BigDecimal limit) {
        throw new NotImplementedYetException();
    }

    @GET
    @Path("/countries")
    @Produces({ "application/json" })
    default InlineResponse200 getCountries(
            @QueryParam("lang") @Pattern(regexp = "[A-Za-z]{2}") @Size(max = 2) @DefaultValue("it") String lang,
            @QueryParam("offset") @DecimalMin("0") @DefaultValue("0") BigDecimal offset,
            @QueryParam("limit") @DecimalMin("0") @DecimalMax("50") @DefaultValue("20") BigDecimal limit) {
        throw new NotImplementedYetException();
    }

    @GET
    @Path("/cities/{city_id}")
    @Produces({ "application/json" })
    default InlineResponse2003 getGeoCitiesCityId(
            @PathParam("city_id") @Pattern(regexp = "[A-Za-z0-9-_]+") @Size(max = 10) String cityId,
            @QueryParam("lang") @Pattern(regexp = "[A-Za-z]{2}") @Size(max = 2) @DefaultValue("it") String lang) {
        throw new NotImplementedYetException();
    }

    @POST
    @Path("/cities/search")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    default InlineResponse2002 postCitiesSearch(
            @QueryParam("lang") @Pattern(regexp = "[A-Za-z]{2}") @Size(max = 2) @DefaultValue("it") String lang,
            @QueryParam("offset") @DecimalMin("0") @DefaultValue("0") BigDecimal offset,
            @QueryParam("limit") @DecimalMin("0") @DecimalMax("50") @DefaultValue("20") BigDecimal limit,
            @Valid InlineObject1 inlineObject1) {
        throw new NotImplementedYetException();
    }

    @GET
    @Path("/countries/{country_id}/regions/{region_id}/provinces")
    @Produces({ "application/json" })
    default InlineResponse2004 provincesByRegion(
            @PathParam("country_id") @Pattern(regexp = "[A-Za-z]{2}") @Size(max = 2) String countryId,
            @PathParam("region_id") @Pattern(regexp = "[A-Za-z0-9]+") @Size(max = 10) String regionId,
            @QueryParam("lang") @Pattern(regexp = "[A-Za-z]{2}") @Size(max = 2) @DefaultValue("it") String lang,
            @QueryParam("offset") @DecimalMin("0") @DefaultValue("0") BigDecimal offset,
            @QueryParam("limit") @DecimalMin("0") @DecimalMax("50") @DefaultValue("20") BigDecimal limit) {
        throw new NotImplementedYetException();
    }

    @PUT
    @Path("/tax-code-validation")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    default InlineResponse2005 validateTaxCode(
            @QueryParam("lang") @Pattern(regexp = "[A-Za-z]{2}") @Size(max = 2) @DefaultValue("it") String lang,
            @Valid InlineObject inlineObject) {
        throw new NotImplementedYetException();
    }
}
