package com.example.demo.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.OrderItem;
import com.example.demo.repository.OrderItemRepo;
import com.example.demo.service.OrderItemService;

@Service
public class OrderItemImpl implements OrderItemService {

	@Autowired(required = true)
	OrderItemRepo repo2;

	@Override
	public void addcus(OrderItem orderitem) {
		// TODO Auto-generated method stub
		repo2.saveAll(orderitem);
	}

	@Override
	public List<OrderItem> display() {
		// TODO Auto-generated method stub
		return repo2.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo2.deleteById(id);
	}

	@Override
	public void update(OrderItem orderitem) {
		// TODO Auto-generated method stub
		repo2.saveAll(orderitem);
	}
	}