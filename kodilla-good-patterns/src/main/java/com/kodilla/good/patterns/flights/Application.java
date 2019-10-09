package com.kodilla.good.patterns.flights;

import com.kodilla.good.patterns.Food2Door.CreateOrder;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        CreateAirports createAirports = new CreateAirports();
        FlightsFinder flightsFinder = new FlightsFinder();

        flightsFinder.PrintFlightsTo(CreateAirports.airportList.get(0));
        flightsFinder.PrintFlightsFrom(CreateAirports.airportList.get(2));
        flightsFinder.connectingFlights(CreateAirports.airportList.get(0), CreateAirports.airportList.get(5));
    }
}
