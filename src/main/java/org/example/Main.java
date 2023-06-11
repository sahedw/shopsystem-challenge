package org.example;

import org.example.model.ShopSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShopSystem shop = new ShopSystem();

        System.out.println(shop.listOrders());
    }
}