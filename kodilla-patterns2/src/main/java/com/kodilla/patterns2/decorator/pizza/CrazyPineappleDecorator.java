package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class CrazyPineappleDecorator extends AbstractPizzaOrderDecorator {

    public CrazyPineappleDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(99));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + crazy pineapple";
    }
}
