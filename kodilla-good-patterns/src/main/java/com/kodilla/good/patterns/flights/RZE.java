package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class RZE implements Airport {

    private String airportName = "Rzeszow (RZE)";
    private List<Airport> flightTo = new ArrayList<>();

    public void addListFlightTo (List<Airport> flightTo)
    {
        this.flightTo = flightTo;
    }

    public List<Airport> getFlightTo() {
        return flightTo;
    }

    @Override
    public String getAirportName() {
        return airportName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RZE rze = (RZE) o;

        if (airportName != null ? !airportName.equals(rze.airportName) : rze.airportName != null) return false;
        return flightTo != null ? flightTo.equals(rze.flightTo) : rze.flightTo == null;
    }

    @Override
    public int hashCode() {
        int result = airportName != null ? airportName.hashCode() : 0;
        result = 31 * result + (flightTo != null ? flightTo.hashCode() : 0);
        return result;
    }
}
