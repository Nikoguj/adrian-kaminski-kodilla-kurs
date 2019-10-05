package flights;

import java.util.ArrayList;
import java.util.List;

public class WAW implements Airport {

    private String airportName = "Warszwa (WAW)";
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

        WAW waw = (WAW) o;

        if (airportName != null ? !airportName.equals(waw.airportName) : waw.airportName != null) return false;
        return flightTo != null ? flightTo.equals(waw.flightTo) : waw.flightTo == null;
    }

    @Override
    public int hashCode() {
        int result = airportName != null ? airportName.hashCode() : 0;
        result = 31 * result + (flightTo != null ? flightTo.hashCode() : 0);
        return result;
    }
}
