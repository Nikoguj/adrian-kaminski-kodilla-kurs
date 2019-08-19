package com.kodilla.stream.world;

import java.util.ArrayList;

public final class Continent {

    ArrayList<Country> europe = new ArrayList<>();
    ArrayList<Country> asia = new ArrayList<>();
    ArrayList<Country> africa = new ArrayList<>();
    ArrayList<Country> northAmerica = new ArrayList<>();
    ArrayList<Country> southAmerica = new ArrayList<>();


    public final ArrayList<Country> GetEurope() {
        Country spain = new Country();
        Country france = new Country();
        Country unitedKingdom = new Country();
        Country switzerland = new Country();
        Country germany = new Country();
        Country poland = new Country();
        Country slovakia = new Country();
        Country croatia = new Country();
        Country serbia = new Country();
        Country greece = new Country();
        Country romania = new Country();

        europe.add(spain);
        europe.add(france);
        europe.add(unitedKingdom);
        europe.add(switzerland);
        europe.add(germany);
        europe.add(poland);
        europe.add(slovakia);
        europe.add(croatia);
        europe.add(serbia);
        europe.add(greece);
        europe.add(romania);

        return europe;
    }

    public final ArrayList<Country> GetAsia() {
        Country russia = new Country();
        Country mongolia = new Country();
        Country pakistan = new Country();
        Country india = new Country();
        Country iran = new Country();
        Country afghanistan = new Country();
        Country burma = new Country();
        Country indonesia = new Country();
        Country philippines = new Country();
        Country vietnam = new Country();

        asia.add(russia);
        asia.add(mongolia);
        asia.add(pakistan);
        asia.add(india);
        asia.add(iran);
        asia.add(afghanistan);
        asia.add(burma);
        asia.add(indonesia);
        asia.add(philippines);
        asia.add(vietnam);

        return asia;
    }

    public final ArrayList<Country> GetAfrica() {
        Country algeria = new Country();
        Country niger = new Country();
        Country chad = new Country();
        Country libya = new Country();
        Country egypt = new Country();
        Country sudan = new Country();
        Country ethiopia = new Country();
        Country angola = new Country();
        Country namibia = new Country();
        Country mozambique = new Country();

        africa.add(algeria);
        africa.add(niger);
        africa.add(chad);
        africa.add(libya);
        africa.add(egypt);
        africa.add(sudan);
        africa.add(ethiopia);
        africa.add(angola);
        africa.add(namibia);
        africa.add(mozambique);

        return africa;
    }

    public final ArrayList<Country> GetNorthAmerica() {
        Country USA = new Country();
        Country canada = new Country();
        Country mexico = new Country();
        Country jamaica = new Country();
        Country cuba = new Country();
        Country bahamas = new Country();
        Country guatemala = new Country();

        northAmerica.add(USA);
        northAmerica.add(canada);
        northAmerica.add(mexico);
        northAmerica.add(jamaica);
        northAmerica.add(cuba);
        northAmerica.add(bahamas);
        northAmerica.add(guatemala);

        return northAmerica;
    }

    public final ArrayList<Country> GetSouthAmerica()
    {
        Country venezuela = new Country();
        Country peru = new Country();
        Country brazil = new Country();
        Country bolivia = new Country();
        Country srgentina = new Country();
        Country uruguay = new Country();
        Country paraguay = new Country();
        Country colombia = new Country();

        southAmerica.add(venezuela);
        southAmerica.add(peru);
        southAmerica.add(brazil);
        southAmerica.add(bolivia);
        southAmerica.add(srgentina);
        southAmerica.add(uruguay);
        southAmerica.add(paraguay);
        southAmerica.add(colombia);

        return southAmerica;
    }
}
