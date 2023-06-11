package org.example.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Order {

    private String id;

    private List<Product> orderList;

    public Order(String id, List<Product> orderList) {
        this.id = id;
        this.orderList = orderList;
    }

    public String getId() {
        return id;
    }

    public List<Product> getOrderList() {
        return orderList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(orderList, order.orderList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderList);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", orderList=" + orderList +
                '}';
    }
}
