package org.example.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepo {

    private Product laptop = new Product("Laptop", "1");
    private Product computer = new Product("Computer", "2");
    private Product mouse = new Product("Mouse", "3");
    private Product keyboard = new Product("Keyboard", "4");

    private Map<String, Product> listOfProducts = new HashMap<>(Map.of("Laptop", laptop,"Computer", computer,"Mouse", mouse,"Keyboard", keyboard));

    public Map<String, Product> list() {
        return this.listOfProducts;
    }

    public Product get(String name) {
        return listOfProducts.get(name);
    }

}
