package com.kodilla.exception.test;

import javax.management.relation.RoleInfoNotFoundException;

public class FlightSearchRunner {
    public static void main(String args[]) throws RoleInfoNotFoundException {
        FlightSearchLogic flightSearchLogic = new FlightSearchLogic();
        Flight flight1 = new Flight("Międzynarodowy Port Lotniczy Atlanta", "Port lotniczy Londyn-Heathrow");

        if (flightSearchLogic.findFlight(flight1)) {
            System.out.println("flight found");
        } else {
            System.out.println("Cannot find flight");
        }

        Flight flight2 = new Flight("Międzynarodowy Port Lotniczy Atlanta", "Port Lotniczy Frankfurt");

        try {
            if (flightSearchLogic.findFlight(flight2)) {
                System.out.println("Flight found.");
            } else {
                System.out.println("Cannot find flight.");
            }
        } catch (Exception e) {
            System.out.println("Cannot find airport.");
        }
    }
}
