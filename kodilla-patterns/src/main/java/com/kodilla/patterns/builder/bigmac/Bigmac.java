package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    
    private final Bun bun;
    private final Sauce sauce;
    private final int burgers;
    private List<String> ingredients = new ArrayList<>();

    public Bigmac(Bun bun, Sauce sauce, int burgers, List<String> ingredients) {
        this.bun = bun;
        this.sauce = sauce;
        this.burgers = burgers;
        this.ingredients = ingredients;
    }

    public static class BigmacBuilder {

        private Bun bun;
        private Sauce sauce;
        private int burgers;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder Bun(String bunType) {
            this.bun = new Bun(bunType);
            return this;
        }

        public BigmacBuilder Sauce(String sauceType) {
            this.sauce = new Sauce(sauceType);
            return this;
        }

        public BigmacBuilder Burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder Ingredients(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            if (bun == null) {
                throw new IllegalStateException("Please choose bun to configure yuur burger");
            }
            return new Bigmac(bun, sauce, burgers, ingredients);
        }
    }

    public Bun getBun() {
        return bun;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bunType=" + bun.getBunType() +
                ", sauceType=" + sauce.getSauceType() +
                ", burgers=" + burgers +
                ", ingredients=" + ingredients +
                '}';
    }
}
