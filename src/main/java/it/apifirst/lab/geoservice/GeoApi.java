package it.apifirst.lab.geoservice;

import it.apifirst.lab.api.DefaultApi;
import it.apifirst.lab.models.Country;
import it.apifirst.lab.models.InlineResponse200;
import it.apifirst.lab.models.Metadata;

import javax.enterprise.context.ApplicationScoped;
import java.math.BigDecimal;
import java.util.*;

import static java.util.Optional.ofNullable;

@ApplicationScoped
public class GeoApi implements DefaultApi {

    @Override
    public InlineResponse200 getCountries(String lang, BigDecimal offset, BigDecimal limit) {
        // IPER BASIC IMPLEMENTATION, just to show something
        var map = Map.of("it",
                Arrays.asList(new Country().countryId("it").name("italia").phoneCode("39").deleted(false),
                        new Country().countryId("es").name("spagna").phoneCode("34").deleted(false),
                        new Country().countryId("de").name("germania").phoneCode("49").deleted(false)),
                "en",
                Arrays.asList(new Country().countryId("it").name("italy").phoneCode("39").deleted(false),
                        new Country().countryId("es").name("spain").phoneCode("34").deleted(false),
                        new Country().countryId("de").name("germany").phoneCode("49").deleted(false)));
        var resp = new InlineResponse200();
        return resp.data(ofNullable(map.get(lang)).orElse(Collections.emptyList())).links(Collections.emptyList())
                .metadata(new Metadata().totalCount(3).currentOffset(0));
    }
}
