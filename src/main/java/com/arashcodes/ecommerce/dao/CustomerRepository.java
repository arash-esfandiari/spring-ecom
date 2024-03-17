package com.arashcodes.ecommerce.dao;

import com.arashcodes.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;


public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
