package com.jpaHomework1.JPA.repository;

import com.jpaHomework1.JPA.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository2 extends JpaRepository<Product, Long> {

    List<Product> findByName(String name);

    List<Product> findByPriceGreaterThan(Integer price);

    List<Product> findByEstePeStocTrue();

    List<Product> findAllByOrderByPriceDesc();

    List<Product> findByNameStartingWith(String prefix);
}
