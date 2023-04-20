package com.example.ex_hib_2.repositories;

import com.example.ex_hib_2.dtos.ProductDTO;
import com.example.ex_hib_2.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

  @Query("""
    SELECT new com.example.ex_hib_2.dtos.ProductDTO(p.id, p.nume, p.cantitate) 
    FROM Product p 
    WHERE p.cantitate > :cantitate
  """)
  List<ProductDTO> findProductsHighQuantity(int cantitate);
}
