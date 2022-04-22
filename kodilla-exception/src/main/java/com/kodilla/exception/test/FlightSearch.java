package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Warsaw Airport", true);
        flights.put("Wroclaw Airport", true);
        flights.put("Poznan Airport", false);
        flights.put("Katowice Airport", true);
        flights.put("Krakow Airport", false);

        if (!flights.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Arrival airport does not exist");
        }
        if (!flights.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException("Departure airport does not exist");
        }
    }

    public static void main(String[] args) {

         FlightSearch flightSearch = new FlightSearch();

         try {
            flightSearch.findFlight(new Flight("Wroclaw Airport", "Katowice Airport"));
         } catch (RouteNotFoundException e) {
             System.out.println("Error! " + e);
         } finally {
             System.out.println("Flight list");
         }
    }
}
