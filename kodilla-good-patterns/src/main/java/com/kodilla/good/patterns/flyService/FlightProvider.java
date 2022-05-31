package com.kodilla.good.patterns.flyService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public interface FlightProvider {

    Map<LocalDateTime, List<String>> getDepartures();
    Map<LocalDateTime, List<String>> getArrivals();

    List<String> departureRoute();
    List<String> arrivalRoute();

    boolean isAirportAvailable();
}
