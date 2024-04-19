package com.SpringBootExample.SpringBootCrud.Repository;

import com.SpringBootExample.SpringBootCrud.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
