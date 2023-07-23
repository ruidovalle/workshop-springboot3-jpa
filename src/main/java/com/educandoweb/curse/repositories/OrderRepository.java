package com.educandoweb.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.curse.entities.Order;
import com.educandoweb.curse.entities.User;


public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
