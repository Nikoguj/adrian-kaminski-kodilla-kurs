package Food2Door;

public class HealthyShop implements ShopInterface {

    public String shopName = "HealthyShop";

    @Override
    public boolean process(Order order) {
        if (order.getProductName().charAt(0) == 's') {
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
