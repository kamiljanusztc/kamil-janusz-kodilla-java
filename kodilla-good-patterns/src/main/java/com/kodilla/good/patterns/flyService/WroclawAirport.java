package com.kodilla.good.patterns.flyService;

import java.time.LocalDateTime;
import java.util.*;

public class WroclawAirport implements FlightProvider {

    private static final List<String> departureRoute = Arrays.asList("Wroclaw", "Poznan", "Warsaw");
    private static final List<String> arrivalRoute = Arrays.asList("Warsaw", "Poznan", "Wroclaw");

    @Override
    public List<String> departureRoute() {
        return departureRoute;
    }

    @Override
    public List<String> arrivalRoute() {
        return arrivalRoute;
    }

    String getFlyArrivalThrough() {
        Object[] cities = arrivalRoute.toArray();
        StringBuilder resultString = new StringBuilder();
        for (int i = 1; i < cities.length - 1; i++) {
            resultString.append(cities[i]).append(" - time - ").append(getArrivals().keySet().toArray()[i]);
        }
        return resultString.toString();
    }

    String getFlyDepartureThrough() {
        Object[] cities = departureRoute.toArray();
        StringBuilder resultString = new StringBuilder();
        for (int i = 1; i < cities.length - 1; i++) {
            resultString.append(cities[i]).append(" - time - ").append(getDepartures().keySet().toArray()[i]);
        }
        return resultString.toString();
    }

    @Override
    public Map<LocalDateTime, List<String>> getDepartures() {
        Map<LocalDateTime, List<String>> departures = new HashMap<>();
        departures.put(LocalDateTime.parse("2022-06-12T11:30:00.00"), departureRoute());
        departures.put(LocalDateTime.parse("2022-06-12T12:30:00.00"), departureRoute());
        departures.put(LocalDateTime.parse("2022-06-12T13:30:00.00"), departureRoute());
        return departures;
    }

    @Override
    public Map<LocalDateTime, List<String>> getArrivals() {
        Map<LocalDateTime, List<String>> arrivals = new HashMap<>();
        arrivals.put(LocalDateTime.parse("2022-06-12T19:50:00.00"), arrivalRoute());
        arrivals.put(LocalDateTime.parse("2022-06-12T20:50:00.00"), arrivalRoute());
        arrivals.put(LocalDateTime.parse("2022-06-12T21:50:00.00"), arrivalRoute());
        return arrivals;
    }

    @Override
    public boolean isAirportAvailable() {
        return true;
    }
}
