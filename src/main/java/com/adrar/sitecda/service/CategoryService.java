package com.adrar.sitecda.service;

import com.adrar.sitecda.model.Category;
import com.adrar.sitecda.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryService categoryService;

    public List<Category> findAll() {
        return categoryService.findAll();
    }

    public Category findById(Long id) {
        return categoryService.findById(id);
    }
}
