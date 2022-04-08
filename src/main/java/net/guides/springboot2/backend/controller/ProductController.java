package net.guides.springboot2.backend.controller;


import net.guides.springboot2.backend.model.Category;
import net.guides.springboot2.backend.model.Product;
import net.guides.springboot2.backend.repository.ProductRepository;
import net.guides.springboot2.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
@CrossOrigin(origins="http://localhost:4200")

public class ProductController {

    @Autowired
    private ProductRepository productRepository;
    private ProductService productService;
    public ProductController(ProductService productService){this.productService = productService;}


    @GetMapping("/products")
    public List<Product> getAllProducts(){

        return productService.getAllProduct();
    }

    @GetMapping("/get")
    public Product get(@RequestParam("id") int id){

        return productRepository.findById(id).get();
    }

    @PostMapping("/add")
    public List<Product> persist(@RequestBody final Product product){
        productRepository.save(product);
        return productRepository.findAll();
    }

    @DeleteMapping("/delete")
    public List<Product> delete(@PathVariable int id){
        productRepository.deleteById(id);
        return productRepository.findAll();
    }

    @PutMapping(value = "/put/{id}")
    public List<Product> put(@PathVariable int id, @RequestBody Product product) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            productRepository.save(product);
        }

        return productRepository.findAll();
    }

    @GetMapping(value ="/category")
    public  List<Product> getAllProductByCategoryId(@RequestParam  Integer id){
        return productService.getProductByCategoryId(id);
    }
    //http://localhost:8080/api/productkey?word=key
    @GetMapping(value="/productkey")
    public List<Product> getProductByKey(@RequestParam String word){
        return productService.getProductByKey(word);
    }


}
