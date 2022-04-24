package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Warsaw Airport", true);
        flights.put("Wroclaw Airport", true);
        flights.put("Poznan Airport", false);
        flights.put("Katowice Airport", false);
        flights.put("Krakow Airport", false);

        if (flights.containsKey(flight.getDepartureAirport()) && flights.containsKey(flight.arrivalAirport)) {
            boolean isArrivalAirportAvailable = flights.get(flight.arrivalAirport);
            System.out.println(flight.arrivalAirport + " availability: " + isArrivalAirportAvailable);
            return isArrivalAirportAvailable;
        } else {
            throw new RouteNotFoundException(flight.arrivalAirport + "Airport unavailable");
        }
    }

    public static void main(String[] args) {

         FlightSearch flightSearch = new FlightSearch();

         try {
            flightSearch.findFlight(new Flight("Wroclaw Airport", "Katowice Airport"));
         } catch (RouteNotFoundException e) {
             System.out.println("Error! " + e);
         } finally {
             System.out.println("Flight checked");
         }
    }
}
