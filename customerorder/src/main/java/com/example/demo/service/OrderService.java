package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Order;

public interface OrderService {
	public Order addcus(Order order);

	public List<Order> display();

	public void update(Order order);
}
