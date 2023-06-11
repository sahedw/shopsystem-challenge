package org.example.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRepo {

    private Map<String, Order> orderList;

    public OrderRepo() {

        orderList = new HashMap<>();

        orderList.put("1", new Order("1", List.of(new Product("Keyboard", "1"))));

        orderList.put("2", new Order("2", List.of(new Product("Laptop", "2"))));
    }

    public List<Order> list() {
        return new ArrayList<>(orderList.values());
    }

    public Order get(String id) {
        return orderList.get(id);
    }

    public Order add(Order orderToAdd) {
        orderList.put(orderToAdd.getId(), orderToAdd);
        return orderToAdd;
    }
}
