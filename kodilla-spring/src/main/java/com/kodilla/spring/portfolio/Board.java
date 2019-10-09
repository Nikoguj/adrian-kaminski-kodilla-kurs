package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;

public class Board {

    private TaskList toDoList = new TaskList();
    private TaskList inProgressList = new TaskList();
    private TaskList doneList = new TaskList();

}
