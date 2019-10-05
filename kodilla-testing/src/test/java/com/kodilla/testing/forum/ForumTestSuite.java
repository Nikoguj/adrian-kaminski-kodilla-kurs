package com.kodilla.testing.forum;


import com.kodilla.testing.SimpleUser;
import org.junit.*;
import sun.java2d.pipe.SpanShapeRenderer;

public class ForumTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testCaseUsername() {
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        String result = simpleUser.getUsername();
        System.out.println("Testing " + result);
        Assert.assertEquals("theForumUser", result);
    }

    @Test
    public void testCaseRealName() {
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        String result = simpleUser.getRealName();
        System.out.println("Testing" + result);
        Assert.assertEquals("John Smith", result);
    }
}
