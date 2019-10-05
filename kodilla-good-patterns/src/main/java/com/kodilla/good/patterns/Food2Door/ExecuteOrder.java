package Food2Door;

import java.util.ArrayList;
import java.util.List;

public class ExecuteOrder {
    public List<ShopInterface> listShop = new ArrayList<>();

    public ExecuteOrder() {
        listShop.add(new ExtraFoodShop());
        listShop.add(new HealthyShop());
        listShop.add(new GlutenFreeShop());
    }

    public void Run(Order order) {
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
