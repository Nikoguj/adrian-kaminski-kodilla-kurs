package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Board {

    @Autowired
    @Qualifier("toDoList")
    private TaskList toDoList;

    @Autowired
    @Qualifier("inProgressList")
    private TaskList inProgressLis;

    @Autowired
    @Qualifier("doneList")
    private TaskList doneList;


    public void addTask(TaskList taskList, String task) {
        taskList.tasks.add(task);
    }
}
