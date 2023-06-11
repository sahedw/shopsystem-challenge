package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepoTest {

    @Test
    void yieldTrue_whenGetOrder1() {

        OrderRepo orderRepo = new OrderRepo();

        String expected = "Order{id='1', orderList=[Product{name='Keyboard', id='1'}]}";

        String actual = orderRepo.get("1").toString();

        assertEquals(expected, actual);
    }

    @Test
    void yieldTrue_whenGetOrder2() {

        OrderRepo orderRepo = new OrderRepo();

        String expected = "Order{id='2', orderList=[Product{name='Laptop', id='2'}]}";

        String actual = orderRepo.get("2").toString();

        assertEquals(expected, actual);
    }

    @Test
    void yieldTrue_whenListOrders() {

        OrderRepo orderRepo = new OrderRepo();

        String expected = "[Order{id='1', orderList=[Product{name='Keyboard', id='1'}]}, Order{id='2', orderList=[Product{name='Laptop', id='2'}]}]";

        String actual = orderRepo.list().toString();

        assertEquals(expected, actual);
    }

}