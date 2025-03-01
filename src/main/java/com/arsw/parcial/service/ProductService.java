package com.arsw.parcial.service;

import java.util.ArrayList;
import java.util.List;
import com.arsw.parcial.model.Product;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(int id) {
        return products.stream().filter(p -> p.getId() == id).findFirst().orElse(null);

    }

    public Product addProduct(String nombre, double precio) {
        Product product = new Product(nombre, precio);
        products.add(product);
        return product;
    }

    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }
}