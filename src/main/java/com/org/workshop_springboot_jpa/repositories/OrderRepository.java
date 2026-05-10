package com.org.workshop_springboot_jpa.repositories;

import com.org.workshop_springboot_jpa.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
