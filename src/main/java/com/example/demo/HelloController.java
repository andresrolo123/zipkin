package com.example.demo;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

@RestController
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    private final RestTemplate restTemplate;

    public HelloController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @GetMapping("/hello/{user}")
    public String hello(@PathVariable String user) throws IOException {
        logger.info("Received request for user: {}", user);
        List response = restTemplate.getForObject("https://dummy-json.mock.beeceptor.com/continents", List.class);
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(response.get(1));
        Continent continent = objectMapper.readValue(json, Continent.class);
        logger.info("Response from API: {}", continent.getName());

        return "Hello " + user + " from " + continent.getName();
    }

}