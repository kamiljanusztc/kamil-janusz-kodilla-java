package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(2, 1.5);
            System.out.println("result: " + result);
        } catch (Exception e) {
            System.out.println("Something went wrong with: " + e);
        } finally {
            System.out.println("Calculation finished!");
        }
    }
}
