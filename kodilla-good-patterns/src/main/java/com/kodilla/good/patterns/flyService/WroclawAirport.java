package com.kodilla.good.patterns.flyService;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class WroclawAirport implements FlightProvider {

    @Override
    public Map<LocalDateTime, String> getDepartures() {
        Map<LocalDateTime,String> departures = new HashMap<>();
        departures.put(LocalDateTime.parse("2022-06-12T11:30:00.00"), "Wroclaw");
        departures.put(LocalDateTime.parse("2022-06-12T13:30:00.00"), "Wroclaw");
        departures.put(LocalDateTime.parse("2022-06-12T15:30:00.00"), "Wroclaw");
        return departures;
    }

    @Override
    public Map<LocalDateTime, String> getArrivals() {
        Map<LocalDateTime,String> arrivals = new HashMap<>();
        arrivals.put(LocalDateTime.parse("2022-06-12T21:30:00.00"), "Wroclaw");
        arrivals.put(LocalDateTime.parse("2022-06-12T22:30:00.00"), "Wroclaw");
        arrivals.put(LocalDateTime.parse("2022-06-12T23:30:00.00"), "Wroclaw");;
        return arrivals;
    }

    @Override
    public boolean isAirportAvailable() {
        return true;
    }
}
