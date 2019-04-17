package com.shopingcart.shopingcart.repo;

import com.shopingcart.shopingcart.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long> {

   // List<Customer> findAll();
}
