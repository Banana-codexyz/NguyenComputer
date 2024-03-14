package com.nguyenz.nguyencomputer.service;

import com.nguyenz.nguyencomputer.model.Category;
import com.nguyenz.nguyencomputer.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll() {
        return categoryRepository.findAll();
    }
}
