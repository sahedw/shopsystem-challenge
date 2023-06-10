package org.example.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {

    private String id;

    private List<Product> products;

    private Product laptop = new Product("Laptop", "1");
    private Product computer = new Product("Computer", "2");
    private Product mouse = new Product("Mouse", "3");
    private Product keyboard = new Product("Keyboard", "4");

    private Map<String, Product> listOfProducts = new HashMap<>(Map.of("Laptop", laptop,"Computer", computer,"Mouse", mouse,"Keyboard", keyboard));

    public Map<String, Product> getListOfProducts() {
        return listOfProducts;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", products=" + products +
                ", laptop=" + laptop +
                ", computer=" + computer +
                ", mouse=" + mouse +
                ", keyboard=" + keyboard +
                ", listOfProducts=" + listOfProducts +
                '}';
    }
}
