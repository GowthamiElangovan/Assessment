package com.example.demo.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Order;
import com.example.demo.repository.OrderRepo;
import com.example.demo.service.OrderService;

@Service
public class OrderImpl implements OrderService {

	@Autowired(required = true)
	OrderRepo repo1;

	@Override
	public Order addcus(Order order) {
		// TODO Auto-generated method stub
		return repo1.save(order);
	}

	@Override
	public List<Order> display() {
		// TODO Auto-generated method stub
		return repo1.findAll();
	}

	@Override
	public void update(Order order) {
		// TODO Auto-generated method stub
		repo1.save(order);
	}
}
