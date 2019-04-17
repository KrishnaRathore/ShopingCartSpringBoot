package com.shopingcart.shopingcart.controllers;


import com.shopingcart.shopingcart.dto.CustomerDTO;
import com.shopingcart.shopingcart.models.Customer;
import com.shopingcart.shopingcart.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class CustomerCntrl {

    @Autowired
    private CustomerServices customerServices ;

    @GetMapping("customers")
    List<Customer> getCustomerData(){
        return customerServices.getCustomerData();
    }

    @PostMapping("customer/add-customer")
    CustomerDTO addCustomerData(@RequestBody CustomerDTO data){

        return customerServices.addCustomerData(data);
    }

    @GetMapping("customer/{id}")
    Customer getCustomerdetails(@PathVariable Long id){
        //System.out.println("id = " + id);
        return customerServices.getCustomerDetails(id);
    }


}