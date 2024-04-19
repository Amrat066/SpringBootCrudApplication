package com.SpringBootExample.SpringBootCrud.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootExample.SpringBootCrud.Entity.Order;
import com.SpringBootExample.SpringBootCrud.Repository.OrderRepository;
import com.SpringBootExample.SpringBootCrud.Service.OrderService;


@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository repositry;
	
	@Override
	public Order saveOrder(Order order) {
		return repositry.save(order);
	}
	@Override
	public List<Order> saveOrders(List<Order> order) {
		return repositry.saveAll(order);

	}
	@Override
	public List<Order> getOrder() {
		return repositry.findAll();

	}
	@Override
	public Order getOrderById(int id) {
		return repositry.findById(id).orElse(null);

	}

	@Override
	public String deleteOrder(int id) {
		repositry.deleteById(id);
		return "the data is removed !! "+id;
	}

	

}
