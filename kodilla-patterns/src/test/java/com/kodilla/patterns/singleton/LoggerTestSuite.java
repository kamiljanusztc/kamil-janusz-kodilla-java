package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    Logger logger = Logger.INSTANCE;

    @Test
    void testLastLog() {
        //Given
       logger.log("last log");

        //When
        String result = logger.getLastLog();

        //Then
        assertEquals("last log", result);
    }
}
