package com.kodilla.good.patterns.flyService;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class PoznanAirport implements FlightProvider {

    @Override
    public Map<LocalDateTime, String> getDepartures() {
        Map<LocalDateTime,String> departures = new HashMap<>();
        departures.put(LocalDateTime.parse("2022-06-12T11:20:00.00"), "Poznan");
        departures.put(LocalDateTime.parse("2022-06-12T13:20:00.00"), "Poznan");
        departures.put(LocalDateTime.parse("2022-06-12T15:20:00.00"), "Poznan");
        return departures;
    }

    @Override
    public Map<LocalDateTime, String> getArrivals() {
        Map<LocalDateTime,String> arrivals = new HashMap<>();
        arrivals.put(LocalDateTime.parse("2022-06-12T21:20:00.00"), "Poznan");
        arrivals.put(LocalDateTime.parse("2022-06-12T22:20:00.00"), "Poznan");
        arrivals.put(LocalDateTime.parse("2022-06-12T23:20:00.00"), "Poznan");
        return arrivals;
    }

    @Override
    public boolean isAirportAvailable() {
        return true;
    }
}
