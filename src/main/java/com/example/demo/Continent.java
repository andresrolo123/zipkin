package com.example.demo;

import java.util.List;

public class Continent {
    private String code;
    private String name;
    private int areaSqKm;
    private long population;
    private List<String> lines;
    private int countries;
    private List<String> oceans;
    private List<String> developedCountries;

    // Getters and Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAreaSqKm() {
        return areaSqKm;
    }

    public void setAreaSqKm(int areaSqKm) {
        this.areaSqKm = areaSqKm;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public List<String> getLines() {
        return lines;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }

    public int getCountries() {
        return countries;
    }

    public void setCountries(int countries) {
        this.countries = countries;
    }

    public List<String> getOceans() {
        return oceans;
    }

    public void setOceans(List<String> oceans) {
        this.oceans = oceans;
    }

    public List<String> getDevelopedCountries() {
        return developedCountries;
    }

    public void setDevelopedCountries(List<String> developedCountries) {
        this.developedCountries = developedCountries;
    }
}