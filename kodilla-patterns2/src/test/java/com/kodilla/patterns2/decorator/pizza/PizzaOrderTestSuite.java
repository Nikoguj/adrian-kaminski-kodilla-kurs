package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrder() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal cost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();
        //Then
        Assert.assertEquals(new BigDecimal(15), cost);
        Assert.assertEquals("Pizza: dough, sauce", description);
    }

    @Test
    public void testPizzaWithHamAndCheese() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();
        //Then
        Assert.assertEquals(new BigDecimal(24), cost);
        Assert.assertEquals("Pizza: dough, sauce, ham, cheese", description);
    }

    @Test
    public void testPizzaWithAll() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        pizzaOrder = new MaizeDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new PepperDecorator(pizzaOrder);
        pizzaOrder = new KetchupDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();
        //Then
        Assert.assertEquals(new BigDecimal(33), cost.stripTrailingZeros());
        Assert.assertEquals("Pizza: dough, sauce, ham, cheese, maize, mushrooms, pepper, ketchup", description);
    }
}
