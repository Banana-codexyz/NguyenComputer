package com.nguyenz.nguyencomputer.controller;

import com.nguyenz.nguyencomputer.model.Product;
import com.nguyenz.nguyencomputer.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping("/get-by-category/{categoryId}")
    public List<Product> getProductByCategoryId(@PathVariable  int categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }

    @PostMapping("/create")
    public Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @PutMapping("/update")
    public Product update(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam int id) {
        productRepository.deleteById(id);
    }
}
