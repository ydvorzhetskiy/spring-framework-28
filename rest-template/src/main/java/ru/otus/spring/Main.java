package ru.otus.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        Country country = restTemplate.getForObject("https://restcountries.eu/rest/v2/alpha/col", Country.class);
        log.info(country.getName());
    }
}
