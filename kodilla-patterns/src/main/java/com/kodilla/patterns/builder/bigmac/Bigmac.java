package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String bun;
    private final String sauce;
    private final List<String> ingredients;

    public static class Bigmacbuilder {
        private String bun;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public Bigmacbuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public Bigmacbuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Bigmacbuilder ingredients(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, sauce, ingredients);
        }
    }

    public Bigmac(String bun, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
