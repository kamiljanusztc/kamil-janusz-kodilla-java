package com.kodilla.good.patterns.flyService;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class WarsawAirport implements FlightProvider {

    @Override
    public Map<LocalDateTime, String> getDepartures() {
        Map<LocalDateTime,String> departures = new HashMap<>();
        departures.put(LocalDateTime.parse("2022-06-12T15:30:00.00"), "Warsaw");
        departures.put(LocalDateTime.parse("2022-06-12T16:30:00.00"), "Warsaw");
        departures.put(LocalDateTime.parse("2022-06-12T17:30:00.00"), "Warsaw");
        return departures;
    }

    @Override
    public Map<LocalDateTime, String> getArrivals() {
        Map<LocalDateTime,String> arrivals = new HashMap<>();
        arrivals.put(LocalDateTime.parse("2022-06-12T22:30:00.00"), "Warsaw");
        arrivals.put(LocalDateTime.parse("2022-06-12T23:30:00.00"), "Warsaw");
        arrivals.put(LocalDateTime.parse("2022-06-12T24:30:00.00"), "Warsaw");;
        return arrivals;
    }

    @Override
    public boolean isAirportAvailable() {
        return true;
    }
}
