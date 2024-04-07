package com.nguyenz.nguyencomputer.controller;

import com.nguyenz.nguyencomputer.model.Category;
import com.nguyenz.nguyencomputer.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("/get-all")
    public List<Category> getCategory() {
        return categoryService.getAll();
    }

    @PostMapping("/create")
    public Category createCategory(@RequestBody Category category) {
        return categoryService.save(category);
    }

    @PutMapping("/update")
    public Category updateCategory(@RequestBody Category category) {
        return categoryService.save(category);
    }

    @DeleteMapping("/delete/{categoryId}")
    public void delete(@PathVariable int categoryId) {
        categoryService.delete(categoryId);
    }
}
