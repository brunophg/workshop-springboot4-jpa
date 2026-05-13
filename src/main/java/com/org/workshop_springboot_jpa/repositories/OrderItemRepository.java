package com.org.workshop_springboot_jpa.repositories;

import com.org.workshop_springboot_jpa.entities.OrderItem;
import com.org.workshop_springboot_jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
