package com.kelompok2.selfOrderApp.selfOrderAppBackend.controllers;

import com.kelompok2.selfOrderApp.selfOrderAppBackend.models.Product;
import com.kelompok2.selfOrderApp.selfOrderAppBackend.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {

    @Autowired
    private ProductRepository productRepo;

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productRepo.save(product);
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Integer id) {
        return productRepo.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Integer id, @RequestBody Product updated) {
        Product product = productRepo.findById(id).orElse(null);
        if (product != null) {
            product.setName(updated.getName());
            product.setCategory(updated.getCategory());
            product.setPrice(updated.getPrice());
            product.setStock(updated.getStock());
            return productRepo.save(product);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Integer id) {
        productRepo.deleteById(id);
    }
}
