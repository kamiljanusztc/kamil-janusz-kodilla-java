package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        int sumAdd = calculator.addNumbers(33, 21);
        int sumSubtract = calculator.subtractNumbers(33, 21);
        System.out.println("Suma liczb: " + sumAdd + "\n" + "Różnica liczb: " + sumSubtract);

        Integer addResult = sumAdd;
        Integer subtractResult = sumSubtract;

        if (addResult != null) {
            System.out.println("Addition test OK!");
        } else {
            System.out.println("Error!");
        }

        if (subtractResult != null) {
            System.out.println("Subtraction test OK!");
        } else {
            System.out.println("Error!");
        }
    }
}