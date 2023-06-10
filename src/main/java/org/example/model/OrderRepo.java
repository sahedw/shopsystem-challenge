package org.example.model;

import java.util.HashMap;
import java.util.Map;

public class OrderRepo {

    Order order = new Order();

    Map<String, Product> orderOfProducts = new HashMap<>();

    public Map<String, Product> list() {
        return this.orderOfProducts;
    }

    public Product get(String number) {
        return orderOfProducts.get(number);
    }

    int counter = 1;
    public void add(String name) {
        orderOfProducts.put(Integer.toString(counter), order.getListOfProducts().get(name));
        counter++;
    }
}
