package com.org.workshop_springboot_jpa.repositories;

import com.org.workshop_springboot_jpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
