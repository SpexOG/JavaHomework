package com.jpaHomework1.JPA.service;

import com.jpaHomework1.JPA.model.Product;
import com.jpaHomework1.JPA.repository.ProductRepository;
import com.jpaHomework1.JPA.repository.ProductRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductRepository2 jpaRepository;

    public Iterable<Product> saveAll (List<Product> products){

        return productRepository.saveAll(products);

    }

    public Iterable<Product> findAllProducts(){

        return productRepository.findAll();

    }

    public void deleteUser (Long id){

        productRepository.deleteById(id);

    }

    public Product updateProduct(Long id, Product updatedProduct) {

        if (productRepository.existsById(id)) {

            updatedProduct.setId(id);
            return productRepository.save(updatedProduct);

        }

        throw new RuntimeException("Produsul cu ID-ul " + id + " nu a fost găsit");

    }

    public List<Product> findProductsByName(String name) {

        return jpaRepository.findByName(name);

    }

    public List<Product> findProductsWithPriceGreaterThan(Integer price) {

        return jpaRepository.findByPriceGreaterThan(price);

    }

    public List<Product> findProductsInStock() {

        return jpaRepository.findByEstePeStocTrue();

    }

    public List<Product> findAllProductsSortedByPriceDesc() {

        return jpaRepository.findAllByOrderByPriceDesc();

    }

    public List<Product> findProductsByNameStartingWith(String prefix) {

        return jpaRepository.findByNameStartingWith(prefix);

    }

}
