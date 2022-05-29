package com.kodilla.good.patterns.flyService;

import java.time.LocalDateTime;

public class Airport {

    String name;
    LocalDateTime departure;
    LocalDateTime arrival;
    boolean isAvailable;

    public Airport(String name, LocalDateTime departure, LocalDateTime arrival, boolean isAvailable) {
        this.name = name;
        this.departure = departure;
        this.arrival = arrival;
        this.isAvailable = isAvailable;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDeparture() {
        return departure;
    }

    public LocalDateTime getArrival() {
        return arrival;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
