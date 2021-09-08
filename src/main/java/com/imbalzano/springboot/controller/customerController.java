package com.imbalzano.springboot.controller;

import com.imbalzano.springboot.model.Customer;
import com.imbalzano.springboot.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
    @RestController
    combine @Controller and @ResponseBody, eliminates every request to annotate
 */
@RestController
@RequestMapping("api/customers")
public class customerController {

    private CustomerService customerService;

    public customerController(CustomerService customerService) {
        super();
        this.customerService = customerService;
    }

    //Insert Customer REST API
    @PostMapping                                //@RequestBody allows to retrieve and convert in JavaObject our RequestHttpBody
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
            return new ResponseEntity<Customer>(customerService.saveCustomer(customer), HttpStatus.CREATED);

    }

    //List Customers REST API
    @GetMapping("/getListCustomers")
    public List<Customer> listCustomers(){
        return customerService.listCustomers();
    }

    //Get Customer By Id REST API
    //http://localhost:8080/api/customers/getCustomer/{id}
    @GetMapping("{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") Integer id){
        return new ResponseEntity<Customer>(customerService.getCustomerById(id),HttpStatus.OK);
    }

    //Update Customer By Id and Body Customer REST API
    @PutMapping("{id}")
    public ResponseEntity<Customer>  updateCustomer(@RequestBody Customer customer,@PathVariable("id") Integer id){
      // [Service return boolean can be:]  return customerService.updateCustomer(customer,id) ? "Updated with successs!" : "Error into the update!";
        return new ResponseEntity<Customer>(customerService.updateCustomer(customer,id) ,HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public String deleteById(@PathVariable("id") Integer id){
        return customerService.deleteCustomer(id);
    }

}
