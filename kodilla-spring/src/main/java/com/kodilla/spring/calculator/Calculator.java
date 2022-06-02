package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator {

    @Autowired
    private Display display;

    void add(double a, double b) {
        double val = a + b;
        display.displayValue(val);
    }

    void sub(double a, double b) {
        double val = a - b;
        display.displayValue(val);
    }

    void mul(double a, double b) {
        double val = a * b;
        display.displayValue(val);
    }

    void div(double a, double b) {
        double val = a / b;
        display.displayValue(val);
    }
}
