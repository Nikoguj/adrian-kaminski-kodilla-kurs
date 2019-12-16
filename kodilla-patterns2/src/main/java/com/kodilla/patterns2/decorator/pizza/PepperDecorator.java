package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PepperDecorator extends AbstractBasicPizzaOrderDecorator {
    protected PepperDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3.5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", pepper";
    }
}
