package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testLogger() {
        //Given
        Logger.getInstance().log("Error: 404");
        //When
        String returnValue = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Error: 404", returnValue);
    }
}
