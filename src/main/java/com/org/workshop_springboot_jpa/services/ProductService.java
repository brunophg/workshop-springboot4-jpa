package com.org.workshop_springboot_jpa.services;

import com.org.workshop_springboot_jpa.entities.Product;
import com.org.workshop_springboot_jpa.entities.User;
import com.org.workshop_springboot_jpa.repositories.ProductRepository;
import com.org.workshop_springboot_jpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
