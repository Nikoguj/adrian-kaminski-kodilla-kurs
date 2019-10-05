package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class ExecuteOrder {
    public List<ShopInterface> listShop = new ArrayList<>();

    public ExecuteOrder() {
        listShop.add(new ExtraFoodShop());
        listShop.add(new HealthyShop());
        listShop.add(new GlutenFreeShop());
    }

    public void Run(Order order) {
        for (ShopInterface shop : listShop) {
            if (shop.process(order)) {
                System.out.println(shop.getShopName() + " = true");
            } else {
                System.out.println(shop.getShopName() + " = false");
            }
        }
        System.out.println();
    }

    public static interface Airport {
        String getAirportName();
        List<Airport> getFlightTo();
        void addListFlightTo(List<Airport> flightTo);
    }

    public static class Application {
        public static void main(String[] args) {

            Airport WAW = new WAW();
            Airport WRO = new WRO();
            Airport KRK = new KRK();
            Airport RZE = new RZE();
            Airport LUZ = new LUZ();
            Airport SZZ = new SZZ();

            List<Airport> wawList = new ArrayList<>();
            wawList.add(WRO);
            wawList.add(KRK);
            wawList.add(RZE);
            wawList.add(SZZ);
            WAW.addListFlightTo(wawList);

            List<Airport> wroList = new ArrayList<>();
            wroList.add(WAW);
            wroList.add(KRK);
            wroList.add(RZE);
            wroList.add(SZZ);
            WRO.addListFlightTo(wroList);

            List<Airport> krkList = new ArrayList<>();
            krkList.add(WAW);
            krkList.add(RZE);
            krkList.add(LUZ);
            krkList.add(WRO);
            KRK.addListFlightTo(krkList);

            List<Airport> rzeList = new ArrayList<>();
            rzeList.add(WAW);
            rzeList.add(KRK);
            rzeList.add(WRO);
            RZE.addListFlightTo(rzeList);

            List<Airport> luzList = new ArrayList<>();
            luzList.add(KRK);
            LUZ.addListFlightTo(luzList);

            List<Airport> szzList = new ArrayList<>();
            szzList.add(WAW);
            szzList.add(WRO);
            SZZ.addListFlightTo(szzList);

            FlightsFinder flightsFinder = new FlightsFinder();
            flightsFinder.PrintFlightsTo(WAW);
            flightsFinder.PrintFlightsFrom(KRK);
            flightsFinder.connectingFlights(WAW, LUZ);
        }
    }

    public static class FlightsFinder {

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

    public static class KRK implements Airport {

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

    public static class LUZ implements Airport {

        private String airportName = "Lublin (LUZ)";
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

            LUZ luz = (LUZ) o;

            if (airportName != null ? !airportName.equals(luz.airportName) : luz.airportName != null) return false;
            return flightTo != null ? flightTo.equals(luz.flightTo) : luz.flightTo == null;
        }

        @Override
        public int hashCode() {
            int result = airportName != null ? airportName.hashCode() : 0;
            result = 31 * result + (flightTo != null ? flightTo.hashCode() : 0);
            return result;
        }
    }

    public static class RZE implements Airport {

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

    public static class SZZ implements Airport {

        private String airportName = "Szczecin (SZZ)";
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

            SZZ szz = (SZZ) o;

            if (airportName != null ? !airportName.equals(szz.airportName) : szz.airportName != null) return false;
            return flightTo != null ? flightTo.equals(szz.flightTo) : szz.flightTo == null;
        }

        @Override
        public int hashCode() {
            int result = airportName != null ? airportName.hashCode() : 0;
            result = 31 * result + (flightTo != null ? flightTo.hashCode() : 0);
            return result;
        }
    }

    public static class WAW implements Airport {

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

    public static class WRO implements Airport {

        private String airportName = "Wroclaw (WRO)";
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

            WRO wro = (WRO) o;

            if (airportName != null ? !airportName.equals(wro.airportName) : wro.airportName != null) return false;
            return flightTo != null ? flightTo.equals(wro.flightTo) : wro.flightTo == null;
        }

        @Override
        public int hashCode() {
            int result = airportName != null ? airportName.hashCode() : 0;
            result = 31 * result + (flightTo != null ? flightTo.hashCode() : 0);
            return result;
        }
    }
}
