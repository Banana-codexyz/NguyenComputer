package com.nguyenz.nguyencomputer.service;

import com.nguyenz.nguyencomputer.model.Product;
import com.nguyenz.nguyencomputer.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getByCategoryId(int categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }
}
