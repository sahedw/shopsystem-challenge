package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ShopSystem {

    ProductRepo productRepo = new ProductRepo();
    OrderRepo orderRepo = new OrderRepo();

    public Product getProduct(String id) {
        return productRepo.get(id);
    }

    public List<Product> listProducts() {
        return productRepo.list();
    }

    public Order getOrder(String id) {
        return orderRepo.get(id);
    }

    public List<Order> listOrders() {
        return orderRepo.list();
    }

    public Order addOrder(List<String> productIds) {
        List <Product> addedProducts = new ArrayList<>();

        for (String productid : productIds) {
            Product product = productRepo.get(productid);
            if (product == null) {
                return null;
            }
            addedProducts.add(product);
        }
        Order newOrder = new Order(UUID.randomUUID().toString(), addedProducts);
        return orderRepo.add(newOrder);
    }
}
