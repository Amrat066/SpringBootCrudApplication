package com.SpringBootExample.SpringBootCrud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootExample.SpringBootCrud.Entity.Order;
import com.SpringBootExample.SpringBootCrud.Service.OrderService;

@RestController

public class OrderController {
	@Autowired
	OrderService service;
	@PostMapping("/addorder")
	public Order addOrder(@RequestBody Order order) {
		return service.saveOrder(order);
	}
	@PostMapping("/addorders")
	public List<Order> addorders(@RequestBody List<Order> orders){
		return service.saveOrders(orders);
	}
	@GetMapping("/GetOrders")
	public List<Order>findAllOrders(){
		return service.getOrder();
	}
	
	@GetMapping("/GetOrder/{id}")
	public Order FindOrderById(@PathVariable int id) {
		return service.getOrderById(id);
	}
	
	@DeleteMapping("/deleteOrder/{id}")
	public String deleteOrders(@PathVariable int id) {
		return service.deleteOrder(id);
	}
	
	

	
}
