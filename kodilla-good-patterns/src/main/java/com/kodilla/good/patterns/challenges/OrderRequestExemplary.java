package com.kodilla.good.patterns.challenges;

public class OrderRequestExemplary {

    public OrderRequest Exemplary()
    {
        User user = new User("John", "Wekl");
        String product = new ProductList().returnProduct(1);

        return new OrderRequest(user, product);
        }
}
