package com.kodilla.testing.collection;


import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("when List number is empty or contains even or odd numbers" +
            "then should return List")

    @Test
    void testOddNumbersExterminatorEmptyList() {
//        Given
        ArrayList<Integer> emptyList = new ArrayList<>();

//        When
        List<Integer> result = OddNumbersExterminator.exterminate(emptyList);

//        Then
        Assertions.assertEquals(emptyList, result);
    }

    @Test
    void testOddNumbersExterminatorNormalList() {
//      Given
        ArrayList<Integer> allNumbers = new ArrayList<>(Arrays.asList (2, 6, 8, 16, 1, 3, 11, 21));
        ArrayList<Integer> expectedNumbers = new ArrayList<>(Arrays.asList (2, 6, 8, 16));

//      When
        List<Integer> result = OddNumbersExterminator.exterminate(allNumbers);
        System.out.println("Test all numbers in list");

//      Then
        Assertions.assertEquals(expectedNumbers, result);
    }
}
