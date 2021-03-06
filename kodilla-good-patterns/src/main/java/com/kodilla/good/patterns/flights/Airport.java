package com.kodilla.good.patterns.flights;

import java.util.List;

public interface Airport {
    String getAirportName();
    List<Airport> getFlightTo();
    void addListFlightTo (List<Airport> flightTo);
}
