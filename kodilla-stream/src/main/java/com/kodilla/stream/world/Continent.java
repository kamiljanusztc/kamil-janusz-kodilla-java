package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final String continentName;
    private final List<Country> countriesList = new ArrayList<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country) {
        countriesList.add(country);
    }

    public boolean removeCountry(Country country) {
        return countriesList.remove(country);
    }

    public List<Country> getListOfCountries() {
        return countriesList;
    }
}
