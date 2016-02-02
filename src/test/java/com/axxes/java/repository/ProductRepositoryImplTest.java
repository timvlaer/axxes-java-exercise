package com.axxes.java.repository;

import com.axxes.java.domain.Product;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;


public class ProductRepositoryImplTest {

    private ProductRepository productRepository;

    @Before
    public void setUp() throws Exception {
        productRepository = new ProductRepositoryImpl();
    }

    @Test
    public void testGetProducts() throws Exception {
        Set<Product> products = productRepository.getProducts();
        assertThat(products).hasSize(1500);
        Product firstProduct = products.iterator().next();
        assertThat(firstProduct.getId()).isNotNull();
        assertThat(firstProduct.getName()).isNotNull();
        assertThat(firstProduct.getPrice()).isNotNull();
    }

    @Test
    public void testSave() throws Exception {
        assertThat(productRepository.getProducts()).hasSize(1500);
        productRepository.save(new Product(3000L, "test", BigDecimal.valueOf(12.34)));
        assertThat(productRepository.getProducts()).hasSize(1501);
    }
}