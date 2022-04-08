package net.guides.springboot2.backend.controller;


import net.guides.springboot2.backend.model.Category;
import net.guides.springboot2.backend.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/categories")
@RestController
@CrossOrigin(origins="http://localhost:4200")

public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("")
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @GetMapping("/get")
    public Category get(@RequestParam("id") int id){
        return categoryRepository.findById(id).get();
    }

    @PostMapping(value = "/add")
    public List<Category> persist(@RequestBody final Category category) {
        categoryRepository.save(category);
        return categoryRepository.findAll();
    }

    @DeleteMapping(value = "/delete")
    public List<Category> delete(@PathVariable int id) {
        categoryRepository.deleteById(id);
        return categoryRepository.findAll();
    }

    @PutMapping(value = "/put/{id}")
    public List<Category> put(@PathVariable int id, @RequestBody Category category) {
        if (categoryRepository.existsById(id)) {
            categoryRepository.deleteById(id);
            categoryRepository.save(category);
        }

        return categoryRepository.findAll();
    }

}
