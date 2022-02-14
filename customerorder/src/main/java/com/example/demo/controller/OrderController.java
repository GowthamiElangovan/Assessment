package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Order;
import com.example.demo.implementation.OrderImpl;

@RestController
public class OrderController {
	@Autowired
	OrderImpl implement1;

	@PostMapping("/save")
	public void store(@RequestBody Order order) {
		implement1.addcus(order);
	}

	@GetMapping("/display")

	public List<Order> print() {
		return implement1.display();
	}

	@PutMapping("/update")

	public void update(@RequestBody Order order) {

		implement1.addcus(order);

		// TODO Auto-generated method stub

	}

}
