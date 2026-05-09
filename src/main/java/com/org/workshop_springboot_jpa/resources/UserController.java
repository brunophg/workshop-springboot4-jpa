package com.org.workshop_springboot_jpa.resources;

import com.org.workshop_springboot_jpa.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Maria","maria@email.com", "999998888", "12345");
        return ResponseEntity.ok().body(user);
    }
}
