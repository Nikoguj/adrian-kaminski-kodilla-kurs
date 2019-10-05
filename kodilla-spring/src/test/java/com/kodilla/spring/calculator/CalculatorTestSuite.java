package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testAddCalculations()
    {
        //Given
        double a = 9;
        double b = 3;
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addVal = calculator.add(a, b);
        //Then
        Assert.assertEquals(12.0, addVal, 0.5);
    }

    @Test
    public void testSubCalculations()
    {
        //Given
        double a = 9;
        double b = 3;
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double subVal = calculator.sub(a, b);
        //Then
        Assert.assertEquals(6.0, subVal, 0.5);
    }

    @Test
    public void testMulCalculations()
    {
        //Given
        double a = 9;
        double b = 3;
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double mulVal = calculator.mul(a, b);
        //Then
        Assert.assertEquals(27.0, mulVal, 0.5);
    }

    @Test
    public void testDivCalculations()
    {
        //Given
        double a = 9;
        double b = 3;
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double divVal = calculator.div(a, b);
        //Then
        Assert.assertEquals(3.0, divVal, 0.5);
    }

}
