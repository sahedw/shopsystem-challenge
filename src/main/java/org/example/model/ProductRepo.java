package org.example.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepo {
    private Map<String, Product> listOfProducts;

    public ProductRepo() {
        listOfProducts = new HashMap<>();

        listOfProducts.put("1", new Product("Keyboard", "1"));

        listOfProducts.put("2", new Product("Laptop", "2"));
    }

    public List<Product> list() {
        return new ArrayList<>(listOfProducts.values());
    }

    public Product get(String id) {
        return listOfProducts.get(id);
    }

}
