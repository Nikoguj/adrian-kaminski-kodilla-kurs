package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "list name";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("list name", "");
        taskListDao.save(taskList);
        String name = taskList.getListName();

        //When
        List<TaskList> readListTasks = taskListDao.findByListName("list name");

        //Then
        Assert.assertEquals(1, readListTasks.size());

        //CleanUp
        int id = readListTasks.get(0).getId();
        taskListDao.deleteById(id);
    }
}
