package net.guides.springboot2.backend.repository;

import net.guides.springboot2.backend.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    public List<Product> findByCategoryId(Integer id);

    public List<Product> findByNomContaining(String nom);

}
