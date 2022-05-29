package com.kodilla.good.patterns.flyService;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class FlightList {

    WarsawAirport warsawArrivals = new WarsawAirport();
    WroclawAirport wroclawArrivals = new WroclawAirport();
    PoznanAirport poznanArrivals = new PoznanAirport();
    WarsawAirport warsawDepartures = new WarsawAirport();
    WroclawAirport wroclawDepartures = new WroclawAirport();
    PoznanAirport poznanDepartures = new PoznanAirport();

    private Map<LocalDateTime, String> getWarsawArrivals() {
        Map<LocalDateTime, String> warsawArrivalsMap = warsawArrivals.getArrivals();
        return warsawArrivalsMap;
    }
    private Map<LocalDateTime, String> getWroclawArrivals() {
        Map<LocalDateTime, String> wroclawArrivalsMap = wroclawArrivals.getArrivals();
        return wroclawArrivalsMap;
    }
    private Map<LocalDateTime, String> getPoznanArrivals() {
        Map<LocalDateTime, String> poznanArrivalsMap = poznanArrivals.getArrivals();
        return poznanArrivalsMap;
    }
    private Map<LocalDateTime, String> getWarsawDepartures() {
        Map<LocalDateTime, String> warsawDeparturesMap = warsawDepartures.getDepartures();
        return warsawDeparturesMap;
    }
    private Map<LocalDateTime, String> getWroclawDepartures() {
        Map<LocalDateTime, String> wroclawDeparturesMap = wroclawDepartures.getDepartures();
        return wroclawDeparturesMap;
    }
    private Map<LocalDateTime, String> getPoznanDepartures() {
        Map<LocalDateTime, String> poznanDeparturesMap = poznanDepartures.getDepartures();
        return poznanDeparturesMap;
    }

    public Map<LocalDateTime,String> getFlights() {

        getFlights().putAll(getWarsawArrivals());
        getFlights().putAll(getWroclawArrivals());
        getFlights().putAll(getPoznanArrivals());
        return getFlights();
    }
}
