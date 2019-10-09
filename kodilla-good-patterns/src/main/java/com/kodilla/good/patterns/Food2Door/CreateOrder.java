package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class CreateOrder {
    public static List<Order> create() {
        List<Order> ordersList = new ArrayList<>();

        Order order1 = new Order(35, "spinach");
        Order order2 = new Order(200, "peas");
        Order order3 = new Order(40, "pineapple");

        ordersList.add(order1);
        ordersList.add(order2);
        ordersList.add(order3);

        return ordersList;
    }
}
