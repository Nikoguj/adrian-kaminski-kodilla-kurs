package com.kodilla.good.patterns.Food2Door;

public class Application {
    public static void main(String[] args) {
        ExecuteOrder executeOrder = new ExecuteOrder(new ShopList().getListShop());

        executeOrder.Run(CreateOrder.create());
    }
}
