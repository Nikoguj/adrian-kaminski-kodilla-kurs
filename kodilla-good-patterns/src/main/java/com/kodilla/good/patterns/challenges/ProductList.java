package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

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
