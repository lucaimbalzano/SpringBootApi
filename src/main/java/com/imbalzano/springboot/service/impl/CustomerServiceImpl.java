package com.imbalzano.springboot.service.impl;

import com.imbalzano.springboot.exception.ResourceNotFoundException;
import com.imbalzano.springboot.model.Customer;
import com.imbalzano.springboot.repository.CustomerRepository;
import com.imbalzano.springboot.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        super();
        this.customerRepository = customerRepository;
    }




    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> listCustomers() {
        return customerRepository.findAll();
    }


    @Override
    public Customer getCustomerById(Integer id) {
//        Optional<Customer> customer = customerRepository.findById(id);
//        if(customer.isPresent())
//            return customer.get();
//        else
//            throw new ResourceNotFoundException("Customer","id", id);
                                                        //Lampda Expression
        return customerRepository.findById(id).orElseThrow(()->
                new ResourceNotFoundException("Customer","id", id));
    }

    @Override
    public Customer updateCustomer(Customer customer, Integer customerId) {

        Customer existingCustomer = customerRepository.findById(customerId).orElseThrow(()->
                new ResourceNotFoundException("Customer", "id", customerId));

        existingCustomer.setStore_id(customer.getStore_id());
        existingCustomer.setFirst_name(customer.getFirst_name());
        existingCustomer.setLast_name(customer.getLast_name());
        existingCustomer.setEmail(customer.getEmail());
        existingCustomer.setAddress_id(customer.getAddress_id());
        existingCustomer.setActive(customer.getActive());
        existingCustomer.setCreate_date(customer.getCreate_date());
        existingCustomer.setLast_update(customer.getLast_update());
        return        customerRepository.save(existingCustomer);
    }

    @Override
    public String deleteCustomer(Integer customerId) {
        Customer existingCustomer = customerRepository.findById(customerId).orElseThrow(()->
                new ResourceNotFoundException("Customer", "id", customerId));

        customerRepository.deleteById(customerId);

            return "{" +
                    "'message': 'Deleted with success!' , "+
                    "'status': 200 "+
                    "}";
    }


}
