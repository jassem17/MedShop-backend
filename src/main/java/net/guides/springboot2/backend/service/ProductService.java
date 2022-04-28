package net.guides.springboot2.backend.service;

import net.guides.springboot2.backend.model.Product;
import net.guides.springboot2.backend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository){this.productRepository=productRepository;}

    public List<Product> getAllProduct(){return productRepository.findAll();}

    public List<Product> getProductByCategoryId(Integer id) {
        return productRepository.findByCategoryId(id);
    }

    public List<Product> getProductByKey(String key){ return productRepository.findByNomContaining(key);}
}
