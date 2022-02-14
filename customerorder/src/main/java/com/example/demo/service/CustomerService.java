package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Customer;

public interface CustomerService {

	public Customer addcus(Customer customer);

	public List<Customer> display();

	public void delete(int id);

	public void update(Customer customer);

}
