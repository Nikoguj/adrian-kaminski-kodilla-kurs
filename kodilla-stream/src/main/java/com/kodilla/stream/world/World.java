package com.kodilla.stream.world;

import com.kodilla.stream.sand.Europe;

import java.math.BigDecimal;
import java.util.ArrayList;

public final class World {
    ArrayList<Continent> continentList = new ArrayList<>();

    public World()
    {
        Continent europe = new Continent("europe");
        Continent asia = new Continent("asia");
        Continent africa = new Continent("africa");
        Continent northAmerica = new Continent("northAmerica");
        Continent southAmerica = new Continent("southAmerica");

        continentList.add(europe);
        continentList.add(africa);
        continentList.add(asia);
        continentList.add(northAmerica);
        continentList.add(southAmerica);
    }

    public BigDecimal getPeopleQuantity()
    {
        BigDecimal zero = BigDecimal.ZERO;
        return continentList.stream()
                .flatMap(continent -> continent.GetCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(zero, (a,b) -> a.add(b));


    }
}
