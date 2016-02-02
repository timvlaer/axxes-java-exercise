package com.axxes.java.repository;

import com.axxes.java.domain.Product;

import java.util.Set;

public interface ProductRepository {

    Set<Product> getProducts();

    void save(Product product);

}
