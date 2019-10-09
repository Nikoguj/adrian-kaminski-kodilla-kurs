package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class ExecuteOrder {
    public List<ShopInterface> listShop = new ArrayList<>();

    public ExecuteOrder(List<ShopInterface> listShop) {
        this.listShop = listShop;
    }

    public void Run(List<Order> orderList) {
        for(Order order: orderList) {
            for (ShopInterface shop : listShop) {
                if (shop.process(order)) {
                    System.out.println(shop.getShopName() + " = true");
                } else {
                    System.out.println(shop.getShopName() + " = false");
                }
            }
            System.out.println();
        }
    }
}
