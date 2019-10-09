package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class ShopList {
    public List<ShopInterface> listShop = new ArrayList<>();

    public ShopList() {
        listShop.add(new ExtraFoodShop());
        listShop.add(new HealthyShop());
        listShop.add(new GlutenFreeShop());
    }

    public List<ShopInterface> getListShop() {
        return listShop;
    }
}
