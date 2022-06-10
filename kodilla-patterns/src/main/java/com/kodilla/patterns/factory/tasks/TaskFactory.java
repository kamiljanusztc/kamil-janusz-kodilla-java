package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "Shopping task";
    public static final String PAINTING = "Painting task";
    public static final String DRIVING = "Driving task";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Go shopping", "bread", 2.0);
            case PAINTING:
                return new PaintingTask("Paint the walls", "white", "wall");
            case DRIVING:
                return new DrivingTask("Go to the car service", "Wroclaw", "tow truck");
            default:
                return null;
        }
    }
}
