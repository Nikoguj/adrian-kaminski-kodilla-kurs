package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public double add(double a, double b)
    {
        double returnVal = a + b;
        display.displayValue(returnVal);
        return returnVal;
    }

    public double sub(double a, double b)
    {
        double returnVal = a - b;
        display.displayValue(returnVal);
        return returnVal;
    }

    public double mul(double a, double b)
    {
        double returnVal = a * b;
        display.displayValue(returnVal);
        return returnVal;
    }

    public double div(double a, double b)
    {
        double returnVal = a / b;
        display.displayValue(returnVal);
        return returnVal;
    }

}
