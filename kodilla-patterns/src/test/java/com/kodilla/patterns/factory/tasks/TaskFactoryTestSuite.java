package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        ShoppingTask shoppingTask = (ShoppingTask) factory.makeTask(TaskFactory.SHOPPING);
        shoppingTask.setExecuted(false);

        //Then
        assertEquals("Go shopping", shoppingTask.getTaskName());
        assertEquals(false, shoppingTask.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        PaintingTask paintingTask = (PaintingTask) factory.makeTask(TaskFactory.PAINTING);
        paintingTask.setExecuted(true);

        //Then
        assertEquals("Paint the walls", paintingTask.getTaskName());
        assertEquals(true, paintingTask.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        DrivingTask drivingTask = (DrivingTask) factory.makeTask(TaskFactory.DRIVING);
        drivingTask.setExecuted(true);

        //Then
        assertEquals("Go to the car service", drivingTask.getTaskName());
        assertEquals(true, drivingTask.isTaskExecuted());
    }
}
