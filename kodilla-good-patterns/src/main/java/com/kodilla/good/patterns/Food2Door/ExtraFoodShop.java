package Food2Door;

public class ExtraFoodShop implements ShopInterface {

    public String shopName = "ExtraFoodShop";

    @Override
    public boolean process(Order order) {
        if (order.getProductCount() > 100) {
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
