package com.jpaHomework1.JPA.controller;

import com.jpaHomework1.JPA.model.Product;
import com.jpaHomework1.JPA.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Iterable<Product>> createProduct(@RequestBody List<Product> products){

        Iterable<Product> createdProducts = productService.saveAll(products);

        return ResponseEntity.status(HttpStatus.CREATED).body(createdProducts);

    }

    @GetMapping
    public ResponseEntity<Iterable<Product>> getAllProducts(){

        Iterable<Product> products = productService.findAllProducts();

        return ResponseEntity.status(HttpStatus.OK).body(products);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id){

        productService.deleteUser(id);

        return ResponseEntity.noContent().build();

    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct) {

        Product updated = productService.updateProduct(id, updatedProduct);

        return ResponseEntity.status(HttpStatus.OK).body(updated);

    }

    @GetMapping("/name/{name}")
    public ResponseEntity<List<Product>> getProductsByName(@PathVariable String name) {
        List<Product> products = productService.findProductsByName(name);
        return ResponseEntity.status(HttpStatus.OK).body(products);
    }

    @GetMapping("/price-greater-than/{price}")
    public ResponseEntity<List<Product>> getProductsWithPriceGreaterThan(@PathVariable Integer price) {
        List<Product> products = productService.findProductsWithPriceGreaterThan(price);
        return ResponseEntity.status(HttpStatus.OK).body(products);
    }

    @GetMapping("/in-stock")
    public ResponseEntity<List<Product>> getProductsInStock() {
        List<Product> products = productService.findProductsInStock();
        return ResponseEntity.status(HttpStatus.OK).body(products);
    }

    @GetMapping("/sorted-by-price-desc")
    public ResponseEntity<List<Product>> getAllProductsSortedByPriceDesc() {
        List<Product> products = productService.findAllProductsSortedByPriceDesc();
        return ResponseEntity.status(HttpStatus.OK).body(products);
    }

    @GetMapping("/name-starts-with/{prefix}")
    public ResponseEntity<List<Product>> getProductsByNameStartingWith(@PathVariable String prefix) {
        List<Product> products = productService.findProductsByNameStartingWith(prefix);
        return ResponseEntity.status(HttpStatus.OK).body(products);
    }

}
