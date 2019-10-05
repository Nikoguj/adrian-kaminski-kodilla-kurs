package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class KRK implements Airport {

    private String airportName = "Krakow (KRK)";
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

        KRK krk = (KRK) o;

        if (airportName != null ? !airportName.equals(krk.airportName) : krk.airportName != null) return false;
        return flightTo != null ? flightTo.equals(krk.flightTo) : krk.flightTo == null;
    }

    @Override
    public int hashCode() {
        int result = airportName != null ? airportName.hashCode() : 0;
        result = 31 * result + (flightTo != null ? flightTo.hashCode() : 0);
        return result;
    }
}
