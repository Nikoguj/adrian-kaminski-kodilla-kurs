package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args)
    {
        ProductList productList = new ProductList();

        OrderRequestExemplary orderRequestExemplary = new OrderRequestExemplary();
        OrderRequest orderRequest = orderRequestExemplary.Exemplary();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new ProductOrderRepository(), new ProductOderService());
        orderProcessor.process(orderRequest);
    }
}
