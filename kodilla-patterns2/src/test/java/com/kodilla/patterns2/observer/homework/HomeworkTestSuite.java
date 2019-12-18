package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkTestSuite {
    @Test
    public void testHomework() {
        //Given
        HomeworkTopic task1 = new Task1();
        HomeworkTopic task2 = new Task2();
        Mentor mentor1 = new Mentor("Michal");
        Mentor mentor2 = new Mentor("Maciej");
        task1.addObserver(mentor1);
        task2.addObserver(mentor1);
        task2.addObserver(mentor2);
        //When
        task1.addTask("New task!");
        task1.addTask("Update my last Task");
        task2.addTask("Something is wrong on line 23");
        task1.addTask("Now it will work!");
        task2.addTask("Task completed");
        //Then
        Assert.assertEquals(5, mentor1.getCount());
        Assert.assertEquals(2, mentor2.getCount());

    }
}
