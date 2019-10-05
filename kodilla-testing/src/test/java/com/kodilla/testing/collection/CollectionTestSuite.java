package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        OddNumbersExterminator number = new OddNumbersExterminator();
        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<Integer> result = number.exterminate(num);
        System.out.println("Testing testOddNumbersExterminatorEmptyList");
        Assert.assertEquals(result.size(), 0);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator number = new OddNumbersExterminator();
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(2);
        num.add(4);
        num.add(5);
        num.add(9);
        num.add(8);
        ArrayList<Integer> expectedNum = new ArrayList<Integer>();
        expectedNum.add(2);
        expectedNum.add(4);
        expectedNum.add(8);
        ArrayList<Integer> result = number.exterminate(num);
        System.out.println("Testing testOddNumbersExterminatorNormalList");
        Assert.assertEquals(result, expectedNum);
    }
}
