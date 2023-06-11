package org.example;

import org.example.model.ShopSystem;


public class Main {
    public static void main(String[] args) {
        ShopSystem shop = new ShopSystem();
        System.out.println(shop.listOrders());
        System.out.println(shop.getProduct("2"));
    }
}