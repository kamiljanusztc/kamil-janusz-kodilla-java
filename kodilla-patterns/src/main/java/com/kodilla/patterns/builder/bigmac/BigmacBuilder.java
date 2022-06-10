package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigmacBuilder {

    private String bun;
    private int burgers;
    private List<String> ingredients = new ArrayList<>();

    public BigmacBuilder bun(String bun) {
        this.bun = bun;
        return this;
    }

    public BigmacBuilder burgers(int burgers) {
        this.burgers = burgers;
        return this;
    }

    public BigmacBuilder ingredient(String ingredient) {
        ingredients.add(ingredient);
        return this;
    }

    public Bigmac build() {
        return new Bigmac(bun, burgers, ingredients);
    }

    @Override
    public String toString() {
        return "BigmacBuilder{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", ingredients=" + ingredients +
                '}';
    }
}
