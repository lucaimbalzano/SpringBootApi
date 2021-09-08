package com.imbalzano.springboot.repository;

import com.imbalzano.springboot.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;



//Spring Data Jpa internally provides @Repository annotation, then i add @Repository annotation in CustomerRepository Interface
//Spring Data JPA made JpaRepository methods Transactional, then i add @Transactional annotation in Service Class
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
