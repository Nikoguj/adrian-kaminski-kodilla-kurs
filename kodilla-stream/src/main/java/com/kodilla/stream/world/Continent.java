package com.kodilla.stream.world;

import java.util.ArrayList;

public final class Continent {

    ArrayList<Country> europe = new ArrayList<>();
    ArrayList<Country> asia = new ArrayList<>();
    ArrayList<Country> africa = new ArrayList<>();
    ArrayList<Country> northAmerica = new ArrayList<>();
    ArrayList<Country> southAmerica = new ArrayList<>();

    ArrayList<Country> countryList = new ArrayList<>();

    public Continent(final String continent)
    {
        if(continent == "europe") {
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

            countryList.add(spain);
            countryList.add(france);
            countryList.add(unitedKingdom);
            countryList.add(switzerland);
            countryList.add(germany);
            countryList.add(poland);
            countryList.add(slovakia);
            countryList.add(croatia);
            countryList.add(serbia);
            countryList.add(greece);
            countryList.add(romania);
        }else if(continent == "asia") {
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

            countryList.add(russia);
            countryList.add(mongolia);
            countryList.add(pakistan);
            countryList.add(india);
            countryList.add(iran);
            countryList.add(afghanistan);
            countryList.add(burma);
            countryList.add(indonesia);
            countryList.add(philippines);
            countryList.add(vietnam);
        }else if(continent == "africa") {
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

            countryList.add(algeria);
            countryList.add(niger);
            countryList.add(chad);
            countryList.add(libya);
            countryList.add(egypt);
            countryList.add(sudan);
            countryList.add(ethiopia);
            countryList.add(angola);
            countryList.add(namibia);
            countryList.add(mozambique);
        }else if(continent == "northAmerica") {
            Country USA = new Country();
            Country canada = new Country();
            Country mexico = new Country();
            Country jamaica = new Country();
            Country cuba = new Country();
            Country bahamas = new Country();
            Country guatemala = new Country();

            countryList.add(USA);
            countryList.add(canada);
            countryList.add(mexico);
            countryList.add(jamaica);
            countryList.add(cuba);
            countryList.add(bahamas);
            countryList.add(guatemala);
        }else if(continent == "southAmerica") {
            Country venezuela = new Country();
            Country peru = new Country();
            Country brazil = new Country();
            Country bolivia = new Country();
            Country srgentina = new Country();
            Country uruguay = new Country();
            Country paraguay = new Country();
            Country colombia = new Country();

            countryList.add(venezuela);
            countryList.add(peru);
            countryList.add(brazil);
            countryList.add(bolivia);
            countryList.add(srgentina);
            countryList.add(uruguay);
            countryList.add(paraguay);
            countryList.add(colombia);
        }
    }

    public final ArrayList<Country> GetCountryList() {
        return countryList;
    }
}
