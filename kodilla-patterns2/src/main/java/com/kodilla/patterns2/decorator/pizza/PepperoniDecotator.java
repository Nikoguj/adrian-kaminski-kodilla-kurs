package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PepperoniDecotator extends AbstractBasicPizzaOrderDecorator {
    protected PepperoniDecotator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4.5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", pepperoni";
    }
}
