package org.example.model;

import java.util.List;
import java.util.Map;

public class ShopSystem {

    ProductRepo productRepo = new ProductRepo();
    OrderRepo orderRepo = new OrderRepo();

    public Product getProduct(String name) {
        return productRepo.get(name);
    }

    public Map<String, Product> listProducts() {
        return productRepo.list();
    }

    public void addOrder(String name) {
        orderRepo.add(name);
    }

    public Product getOrder(String number) {
        return orderRepo.get(number);
    }

    public Map <String, Product> listOrders() {
        return orderRepo.list();
    }
}
