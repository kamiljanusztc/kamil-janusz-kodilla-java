package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        // Given
        int numbersList[] = {2, 33, 4, 7};

        // When
        double expectedAverage = ArrayOperations.getAverage(numbersList);

        // Then
        assertEquals(11.5, expectedAverage);
    }
}
