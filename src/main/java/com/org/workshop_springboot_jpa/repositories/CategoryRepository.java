package com.org.workshop_springboot_jpa.repositories;

import com.org.workshop_springboot_jpa.entities.Category;
import com.org.workshop_springboot_jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
