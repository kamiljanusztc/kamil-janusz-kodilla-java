package com.kodilla.good.patterns.flyService;

public class Application {

    public static void main(String[] args) {

        FlightList flightList = new FlightList();

        System.out.println("All deparutres: " + flightList.getAllDepartures());
        System.out.println("All arrivals: " + flightList.getAllArrivals());

    }
}
