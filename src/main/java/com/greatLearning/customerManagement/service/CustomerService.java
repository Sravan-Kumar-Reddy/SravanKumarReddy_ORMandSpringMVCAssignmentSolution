package com.greatLearning.customerManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatLearning.customerManagement.entity.Customer;

@Service
public interface CustomerService {

	List<Customer> findAll();

	Customer findById(int id);

	void save(Customer theCustomer);

	void deleteById(int id);

	// print the loop
	void print(List<Customer> Customer);

}