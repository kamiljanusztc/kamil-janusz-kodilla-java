package com.kodilla.good.patterns.flyService;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PoznanAirport implements FlightProvider {

    private static final List<String> departureRoute = Arrays.asList("Poznan", "Wroclaw");
    private static final List<String> arrivalRoute = Arrays.asList("Wroclaw", "Poznan");

    @Override
    public List<String> departureRoute() {
        return departureRoute;
    }

    @Override
    public List<String> arrivalRoute() {
        return arrivalRoute;
    }
    @Override
    public Map<LocalDateTime, List<String>> getDepartures() {
        Map<LocalDateTime, List<String>> departures = new HashMap<>();
        departures.put(LocalDateTime.parse("2022-06-12T11:20:00.00"), departureRoute());
        departures.put(LocalDateTime.parse("2022-06-12T13:20:00.00"), departureRoute());
        departures.put(LocalDateTime.parse("2022-06-12T15:20:00.00"), departureRoute());
        return departures;
    }

    @Override
    public Map<LocalDateTime, List<String>> getArrivals() {
        Map<LocalDateTime, List<String>> arrivals = new HashMap<>();
        arrivals.put(LocalDateTime.parse("2022-06-12T20:20:00.00"), arrivalRoute());
        arrivals.put(LocalDateTime.parse("2022-06-12T21:20:00.00"), arrivalRoute());
        arrivals.put(LocalDateTime.parse("2022-06-12T22:20:00.00"), arrivalRoute());
        return arrivals;
    }

    @Override
    public boolean isAirportAvailable() {
        return true;
    }
}
