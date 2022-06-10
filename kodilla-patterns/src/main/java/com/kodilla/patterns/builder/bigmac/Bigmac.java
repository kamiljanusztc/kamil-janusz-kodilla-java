package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    
    private final String bun;
    private final int burgers;
    private List<String> ingredients = new ArrayList<>();

    public Bigmac(String bun, int burgers, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
