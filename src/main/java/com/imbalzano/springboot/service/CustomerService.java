package com.imbalzano.springboot.service;

import com.imbalzano.springboot.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer saveCustomer(Customer customer);

    List<Customer> listCustomers();

    Customer getCustomerById(Integer id);

    Customer updateCustomer(Customer customer, Integer customerId);

    String deleteCustomer(Integer customerId);

}
