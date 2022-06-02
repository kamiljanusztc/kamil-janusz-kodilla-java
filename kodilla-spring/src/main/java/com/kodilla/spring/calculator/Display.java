package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public final class Display {

    public void displayValue(double val) {
        System.out.println("Value: " + val);
    }
}
