package challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductList {
    List<String> productList = new ArrayList<>();

    public ProductList() {
        productList.add(0, "shoes");
        productList.add(1, "toothbrush");
        productList.add(2, "computer game");
    }

    public String returnProduct(int productIndex)
    {
        return productList.get(productIndex);
    }
}
