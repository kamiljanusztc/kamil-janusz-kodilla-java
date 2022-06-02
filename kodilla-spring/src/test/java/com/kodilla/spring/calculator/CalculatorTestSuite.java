package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations() {
        //Given
        //When
        calculator.add(2.2, 3.3);
        calculator.sub(4.4, 4.4);
        calculator.mul(2.0, 2.0);
        calculator.div(4.4, 2.2);
        //Then
    }
}
