package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigMacNew() {
        //Given
        Bigmac bigmac = new BigmacBuilder()
                .bun("z sezamem")
                .burgers(2)
                .ingredient("sałata")
                .ingredient("cebula")
                .ingredient("papryczki chilli")
                .ingredient("ser")
                .build();
        System.out.println(bigmac);

        //When
        String whichBun = bigmac.getBun();
        int howManyBurgers = bigmac.getBurgers();
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals("z sezamem", whichBun);
        assertEquals(2, howManyBurgers);
        assertEquals(4, howManyIngredients);
    }
}
