package com.lxj.ip.domain;

public class CountryEntity {
    private Long id;
    private String continentCode;
    private String continentName;
    private String countryIsoCode;
    private String countryName;
    private String isInEuropeanUnion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContinentCode() {
        return continentCode;
    }

    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public String getCountryIsoCode() {
        return countryIsoCode;
    }

    public void setCountryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getIsInEuropeanUnion() {
        return isInEuropeanUnion;
    }

    public void setIsInEuropeanUnion(String isInEuropeanUnion) {
        this.isInEuropeanUnion = isInEuropeanUnion;
    }
}
