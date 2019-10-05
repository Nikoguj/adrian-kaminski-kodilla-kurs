package com.kodilla.good.patterns.challenges;

import java.util.Map;

public class ShowMovies {
    public static void main(String[] args) {
        MovieStore.getMovies().entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .flatMap(x -> x.stream())
                .map(x -> x.concat("! "))
                .forEach(System.out::print);
    }
}
