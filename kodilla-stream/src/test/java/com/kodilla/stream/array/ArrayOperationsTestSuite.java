package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

public class ArrayOperationsTestSuite implements ArrayOperations{
    @Test
    public void testGetAverage()
    {
        int[] array = {2, 5, 3, 7, 8, 13, 3, 33, 56, 16, 38, 112};
        Assert.assertEquals(24.6, ArrayOperations.getAverage(array), 0.1);
    }
}
