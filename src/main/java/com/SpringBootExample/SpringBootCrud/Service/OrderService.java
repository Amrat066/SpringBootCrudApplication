package com.SpringBootExample.SpringBootCrud.Service;

import com.SpringBootExample.SpringBootCrud.Entity.Order;


import java.util.List;

public interface OrderService {


	public Order saveOrder(Order order);
	public List<Order> saveOrders(List<Order>order);
	public List<Order>getOrder();
	public Order getOrderById(int id);
	public String deleteOrder(int id);
	
}
