package com.kodilla.good.patterns.Food2Door;

public class GlutenFreeShop implements ShopInterface {

    public String shopName = "GlutenFreeShop";

    @Override
    public boolean process(Order order) {
        if (order.getProductCount() < 50 && order.getProductName().length() > 7) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getShopName() {
        return shopName;
    }
}
