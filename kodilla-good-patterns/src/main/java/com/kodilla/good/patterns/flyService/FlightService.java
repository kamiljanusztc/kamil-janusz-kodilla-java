package com.kodilla.good.patterns.flyService;

public class FlightService {

    public static void main(String[] args) {

        WroclawAirport wroclawAirport = new WroclawAirport();

        wroclawAirport.getDepartures().entrySet().stream().forEach(
                entry -> System.out.println("WROCLAW - DEPARTURE: " + "\n" + entry.getKey() + "=" + entry.getValue())
        );

        wroclawAirport.getArrivals().entrySet().stream().forEach(
                entry -> System.out.println("WROCLAW - ARRIVAL: " + "\n" + entry.getKey() + "=" + entry.getValue())
        );

        System.out.println("To Warsaw through Poznan: " + "\n" + wroclawAirport.getFlyDepartureThrough() );

        System.out.println("To Wroclaw through Poznan: " + "\n" + wroclawAirport.getFlyArrivalThrough() );
   }
}
