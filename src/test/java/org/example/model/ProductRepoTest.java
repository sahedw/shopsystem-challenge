package org.example.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    ProductRepo productRepo = new ProductRepo();

    @Test
    void yieldTrue_whenListProducts() {
        //GIVEN
        List<Product> listAllProducts = new ArrayList<>(List.of(
                new Product("Keyboard", "1"),
                new Product("Laptop", "2"
                )));

        List<Product> expected = listAllProducts;

        List<Product> actual = productRepo.list();

        assertEquals(expected, actual);

    }

    @Test
    void yieldTrue_whenGetProductId1() {
        //GIVEN
        Product product = new Product("Keyboard", "1");

        String expected = "Product{name='Keyboard', id='1'}";

        String actual = productRepo.get("1").toString();

        assertEquals(expected, actual);

    }

    @Test
    void yieldTrue_whenGetProductId2() {
        //GIVEN
        Product product = new Product("Laptop", "2");

        String expected = "Product{name='Laptop', id='2'}";

        String actual = productRepo.get("2").toString();

        assertEquals(expected, actual);

    }

    @Test
    void yieldNull_whenGetProductIdNotExistent() {
        //GIVEN
        Product product = new Product("Mouse", "3");

        Product actual = productRepo.get("3");

        assertNull(actual);

    }

}