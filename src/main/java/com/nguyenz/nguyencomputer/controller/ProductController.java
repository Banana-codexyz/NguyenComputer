package com.nguyenz.nguyencomputer.controller;

import com.nguyenz.nguyencomputer.model.Product;
import com.nguyenz.nguyencomputer.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/get-by-category/{categoryId}")
    public List<Product> getProductByCategoryId(@PathVariable  int categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }
}
