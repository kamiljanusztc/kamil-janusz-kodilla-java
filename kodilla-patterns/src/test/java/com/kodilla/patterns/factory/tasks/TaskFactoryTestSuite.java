package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);

        //Then
        assertEquals("Go shopping", shoppingTask.getTaskName());
        assertEquals(false, shoppingTask.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);

        //Then
        assertEquals("Paint the walls", paintingTask.getTaskName());
        assertEquals(true, paintingTask.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);

        //Then
        assertEquals("Go to the car service", drivingTask.getTaskName());
        assertEquals(true, drivingTask.isTaskExecuted());
    }
}
