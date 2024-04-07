package com.nguyenz.nguyencomputer.service;

import com.nguyenz.nguyencomputer.model.Category;
import com.nguyenz.nguyencomputer.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    public void delete(int categoryId) {
        categoryRepository.deleteById(categoryId);
    }
}
