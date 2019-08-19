package com.kodilla.stream.world;

import com.kodilla.stream.sand.Europe;

import java.math.BigDecimal;
import java.util.ArrayList;

public final class World {
    ArrayList<Continent> continentList = new ArrayList<>();

    public final void World()
    {
        Continent europe = new Continent();
        europe.GetEurope();
        Continent asia = new Continent();
        asia.GetAsia();
        Continent africa = new Continent();
        africa.GetAfrica();
        Continent northAmerica = new Continent();
        northAmerica.GetNorthAmerica();
        Continent southAmerica = new Continent();
        southAmerica.GetSouthAmerica();

        continentList.add(europe);
        continentList.add(africa);
        continentList.add(asia);
        continentList.add(northAmerica);
        continentList.add(southAmerica);
    }

    /*public BigDecimal getPeopleQuantity()
    {
        return continentList.stream()
                .flatMap(country -> country)

    }*/
}
