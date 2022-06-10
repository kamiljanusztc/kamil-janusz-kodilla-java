package com.kodilla.patterns.builder.bigmac;

public class Ingredient {

    public static final String SALAT = "SALAT";
    public static final String ONION = "ONION";
    public static final String BACON = "BACON";
    public static final String CUCUMBER = "CUCUMBER";
    public static final String CHILLI = "CHILLI PEPPERS";
    public static final String MUSHROOMS = "MUSHROOMS";
    public static final String SHRIMPS = "SHRIMPS";
    public static final String CHEESE = "CHEESE";
    private final String ingredientType;

    public String getIngredientType() {
        return ingredientType;
    }

    public Ingredient(String ingredientType) {
        if (
                ingredientType.equals(SALAT) ||
                ingredientType.equals(ONION) ||
                ingredientType.equals(BACON) ||
                ingredientType.equals(CUCUMBER) ||
                ingredientType.equals(CHILLI) ||
                ingredientType.equals(MUSHROOMS) ||
                ingredientType.equals(SHRIMPS) ||
                ingredientType.equals(CHEESE)
        ) {
           this.ingredientType = ingredientType;
        } else {
            throw new IllegalStateException("Ingredient type should be checked");
        }


    }
}
