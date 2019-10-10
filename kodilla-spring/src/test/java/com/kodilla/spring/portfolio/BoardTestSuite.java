package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        TaskList toDoList = (TaskList)context.getBean("toDoList");
        TaskList inProgressList = (TaskList)context.getBean("inProgressList");
        TaskList doneList = (TaskList)context.getBean("doneList");

        board.addTask(toDoList, "go shop");
        board.addTask(inProgressList, "do the kodilla course");
        board.addTask(doneList, "complete the project");

        Assert.assertEquals("go shop", toDoList.tasks.get(0));
        Assert.assertEquals("do the kodilla course", inProgressList.tasks.get(0));
        Assert.assertEquals("complete the project", doneList.tasks.get(0));
    }
}
