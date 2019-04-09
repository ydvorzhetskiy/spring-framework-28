package ru.otus.spring.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import ru.otus.spring.dto.Country;

@Service
public class CountryServiceRest implements CountryService {

    private RestOperations rest = new RestTemplate();

    public Country getCountry(String id) {
        return rest.getForObject("https://restcountries.eu/rest/v2/alpha/" + id, Country.class);
    }
}
