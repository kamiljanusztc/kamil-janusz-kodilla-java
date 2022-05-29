package com.kodilla.good.patterns.flyService;

import java.time.LocalDateTime;
import java.util.Map;

public interface FlightProvider {

    Map<LocalDateTime,String> getDepartures();
    Map<LocalDateTime,String> getArrivals();
    boolean isAirportAvailable();
}
