package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.OrderItem;
import com.example.demo.implementation.OrderItemImpl;

@RestController
public class OrderItemController {
	@Autowired
	OrderItemImpl implement2;

	@PostMapping("/save")
	public void store(@RequestBody OrderItem orderitem) {
		implement2.addcus(orderitem);
	}

	@GetMapping("/display")

	public List<OrderItem> print() {
		return implement2.display();
	}

	@GetMapping("/delete")

	public void delete(@PathVariable int id) {
		implement2.delete(id);
	}

	@PutMapping("/update")

	public Void update(@RequestBody OrderItem orderitem) {

		implement2.addcus(orderitem);
		return null;
		// TODO Auto-generated method stub
	}
}