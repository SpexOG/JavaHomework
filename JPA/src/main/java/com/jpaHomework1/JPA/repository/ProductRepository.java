package com.jpaHomework1.JPA.repository;

import com.jpaHomework1.JPA.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
