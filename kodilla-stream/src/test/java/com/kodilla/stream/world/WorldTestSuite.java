package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        // Given
        Country aruba = new Country("Aruba", new BigDecimal("64554544"));
        Country costaRica = new Country("Costa Rica", new BigDecimal("543524342"));
        Country brazil = new Country("Brazil", new BigDecimal("634342342"));
        Country colombia = new Country("Colombia", new BigDecimal("754754455454"));
        Country kenya = new Country("Kenya", new BigDecimal("324325352"));
        Country algeria = new Country("Algeria", new BigDecimal("6322343423"));
        Country poland = new Country("Poland", new BigDecimal("213321324"));
        Country portugal = new Country("Portugal", new BigDecimal("1143432523"));

        // When
        Continent northAmerica = new Continent("North America");
        northAmerica.addCountry(aruba);
        northAmerica.addCountry(costaRica);

        Continent southAmerica = new Continent("South America");
        southAmerica.addCountry(brazil);
        southAmerica.addCountry(colombia);

        Continent africa = new Continent("Africa");
        africa.addCountry(kenya);
        africa.addCountry(algeria);

        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(portugal);

        World world = new World();
        world.addContinent(northAmerica);
        world.addContinent(southAmerica);
        world.addContinent(africa);
        world.addContinent(europe);

        // Then
        BigDecimal expectedResult = world.getPeopleQuantity();
        BigDecimal currentResult = new BigDecimal("764000299304");
        assertEquals(expectedResult, currentResult);
    }
}
