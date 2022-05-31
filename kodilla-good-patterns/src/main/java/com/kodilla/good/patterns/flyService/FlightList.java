package com.kodilla.good.patterns.flyService;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightList {

    WarsawAirport warsawArrivals = new WarsawAirport();
    WroclawAirport wroclawArrivals = new WroclawAirport();
    PoznanAirport poznanArrivals = new PoznanAirport();
    WarsawAirport warsawDepartures = new WarsawAirport();
    WroclawAirport wroclawDepartures = new WroclawAirport();
    PoznanAirport poznanDepartures = new PoznanAirport();

    public Map<LocalDateTime, List<String>> getAllDepartures() {
        Map<LocalDateTime, List<String>> departures = new HashMap<>();
        departures.putAll(poznanDepartures.getDepartures());
        departures.putAll(wroclawDepartures.getDepartures());
        departures.putAll(warsawDepartures.getDepartures());
        return departures;
    }

    public Map<LocalDateTime, List<String>> getAllArrivals() {
        Map<LocalDateTime, List<String>> arrivals = new HashMap<>();
        arrivals.putAll(poznanArrivals.getArrivals());
        arrivals.putAll(wroclawArrivals.getArrivals());
        arrivals.putAll(warsawArrivals.getArrivals());
        return arrivals;
    }
}
