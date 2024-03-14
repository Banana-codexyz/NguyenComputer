package com.nguyenz.nguyencomputer.repository;

import com.nguyenz.nguyencomputer.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByCategoryId(int categoryId);
}
