package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.OrderItem;

public interface OrderItemService {

	public void addcus(OrderItem orderitem);

	public List<OrderItem> display();

	public void delete(int id);

	public void update(OrderItem orderitem);
}
