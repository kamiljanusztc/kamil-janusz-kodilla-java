package com.kodilla.exception.test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ThrowExceptionTestSuite {

    @Test
    void testThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0, 1.5)),
                () -> assertDoesNotThrow( () -> secondChallenge.probablyIWillThrowException(1.1, 2.1)),
                () -> assertDoesNotThrow( () -> secondChallenge.probablyIWillThrowException(1.1, 1.1))
        );
    }
}
