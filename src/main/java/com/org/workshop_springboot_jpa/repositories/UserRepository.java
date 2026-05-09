package com.org.workshop_springboot_jpa.repositories;

import com.org.workshop_springboot_jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
