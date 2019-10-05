package flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsFinder {

    public void PrintFlightsFrom(Airport airport)
    {
        System.out.println("Flights from: " + airport.getAirportName());
        airport.getFlightTo().stream().
                map(Airport::getAirportName).
                forEach(System.out::println);
        System.out.println();
    }

    public void PrintFlightsTo(Airport airport)
    {
        System.out.println("Flights to: " + airport.getAirportName());
        airport.getFlightTo().stream()
                .map(Airport::getAirportName)
                .forEach(System.out::println);
        System.out.println();
    }

    public void connectingFlights(Airport airportFrom, Airport airportTo)
    {
        airportFrom.getFlightTo()
                .forEach(airport -> airport.getFlightTo().stream()
                        .filter(airport1 -> airport1.equals(airportTo))
                        .map(airport1 -> airportFrom.getAirportName() + " -> " + airport.getAirportName() + " -> " + airport1.getAirportName())
                        .forEach(System.out::println));
    }
}
