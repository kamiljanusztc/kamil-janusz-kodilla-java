package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigMacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .Bun(Bun.SEASAM)
                .Sauce(Sauce.STANDARD)
                .Burgers(2)
                .Ingredients(Ingredient.BACON)
                .Ingredients(Ingredient.CHEESE)
                .Ingredients(Ingredient.CHILLI)
                .Ingredients(Ingredient.SALAT)
                .build();
        System.out.println(bigmac);

        //When
        String whichBun = bigmac.getBun().getBunType();
        String whichSauce = bigmac.getSauce().getSauceType();
        int howManyBurgers = bigmac.getBurgers();
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals("SEASAM", whichBun);
        assertEquals("STANDARD", whichSauce);
        assertEquals(2, howManyBurgers);
        assertEquals(4, howManyIngredients);
    }
}
