package com.kodilla.exception.test;

import javax.management.relation.RoleInfoNotFoundException;
import java.util.HashMap;

public class FlightSearchLogic {
    public boolean findFlight(Flight flight) throws RoleInfoNotFoundException {
        HashMap<String, Boolean> airports = new HashMap<>();
        airports.put("Międzynarodowy Port Lotniczy Atlanta", true);
        airports.put("Międzynarodowy Stołeczny Port Lotniczy Pekin", false);
        airports.put("Międzynarodowy Port Lotniczy Dubaj", true);
        airports.put("Port Lotniczy Haneda", true);
        airports.put("Międzynarodowy Port Lotniczy Los Angeles", false);
        airports.put("Międzynarodowy Port Lotniczy Chicago-O’Hare", false);
        airports.put("Port lotniczy Londyn-Heathrow", true);
        airports.put("Międzynarodowy Port Lotniczy Hongkong", false);
        airports.put("Międzynarodowy Port Lotniczy Szanghaj-Pudong", false);

        if (airports.get(flight.departureAirport) != null && airports.get(flight.arrivalAirport) != null) {
            if (airports.get(flight.arrivalAirport) == true) {
                return true;
            } else {
                return false;
            }
        } else {
            throw new RoleInfoNotFoundException();
        }
    }
}
