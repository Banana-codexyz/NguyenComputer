package com.nguyenz.nguyencomputer.controller;

import com.nguyenz.nguyencomputer.model.Category;
import com.nguyenz.nguyencomputer.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/get-all")
    public List<Category> getCategory() {
        return categoryService.getAll();
    }
}
