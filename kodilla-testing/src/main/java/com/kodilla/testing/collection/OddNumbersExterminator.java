package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public static List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumbersList = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbersList.add(number);
            }
        }
        return evenNumbersList;
    }

    public static void main(String[] args) {

    }
}

