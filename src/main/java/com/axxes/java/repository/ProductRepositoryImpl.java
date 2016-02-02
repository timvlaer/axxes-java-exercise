package com.axxes.java.repository;

import com.axxes.java.domain.Product;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;

public class ProductRepositoryImpl implements ProductRepository {
    private static final SecureRandom random = new SecureRandom();

    private HashSet<Product> products = new HashSet<>();

    public ProductRepositoryImpl() {
        for (long counter = 0; counter < 1500; counter++) {
            final String randomName = new BigInteger(130, random).toString(32);
            final double randomPrice = (double) Math.round(10000 * random.nextDouble()) / 100;
            products.add(new Product(counter, randomName, BigDecimal.valueOf(randomPrice)));
        }
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void save(Product product) {
        products.add(product);
    }

}
