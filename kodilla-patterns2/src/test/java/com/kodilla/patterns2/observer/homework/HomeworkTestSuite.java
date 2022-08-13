package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HomeworkTestSuite {

    @Test
    void testUpdate() {
        //Given
        StudentTask nicole = new Nicole();
        StudentTask kate = new Kate();
        StudentTask john = new John();
        Mentor joe = new Mentor("Joe");
        Mentor anna = new Mentor("Anna");
        nicole.registerObserver(joe);
        kate.registerObserver(anna);
        john.registerObserver(joe);
        //When
        nicole.sendFinishedTask("Rest task");
        kate.sendFinishedTask("Database task");
        john.sendFinishedTask("Java FX task");
        //Then
        assertEquals(2, joe.getUpdateCount());
        assertEquals(1, anna.getUpdateCount());
    }
}
