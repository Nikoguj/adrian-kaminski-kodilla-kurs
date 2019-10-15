package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("home shopping", "carpet", 2);
            case PAINTING:
                return new PaintingTask("painting room", "white", "guest room");
            case DRIVING:
                return new DrivingTask("pick up Tom", "school", "car");
            default:
                return null;

        }
    }
}
