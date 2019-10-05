package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class Application {
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
