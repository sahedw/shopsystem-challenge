package org.example;

import org.example.model.ShopSystem;

public class Main {
    public static void main(String[] args) {
        ShopSystem shop = new ShopSystem();

        System.out.println(shop.getProduct("Laptop"));
        System.out.println(shop.listProducts());

        shop.addOrder("Laptop");
        shop.addOrder("Keyboard");
        System.out.println(shop.getOrder("2"));
        shop.addOrder("Mouse");
        System.out.println(shop.listOrders());
    }
}