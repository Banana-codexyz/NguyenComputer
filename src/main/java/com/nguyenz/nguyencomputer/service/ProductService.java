package com.nguyenz.nguyencomputer.service;

import com.nguyenz.nguyencomputer.model.Product;
import com.nguyenz.nguyencomputer.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getByCategoryId(int categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public void delete(int productId) {
        productRepository.deleteById(productId);
    }
}
