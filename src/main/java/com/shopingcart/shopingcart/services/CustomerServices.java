package com.shopingcart.shopingcart.services;

import com.shopingcart.shopingcart.dto.CustomerDTO;
import com.shopingcart.shopingcart.helper.AddressHelper;
import com.shopingcart.shopingcart.helper.CustomerHelper;
import com.shopingcart.shopingcart.models.Address;
import com.shopingcart.shopingcart.models.Customer;
import com.shopingcart.shopingcart.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServices {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private CustomerHelper cutomerHelper;

    @Autowired
    private AddressHelper addressHelper;

    public List<Customer> getCustomerData(){

        return customerRepo.findAll();
    }

    public CustomerDTO addCustomerData(CustomerDTO data){

        Customer save = cutomerHelper.dtoToModel(data);
        save = customerRepo.save(save);
        Address address = addressHelper.dtoToModel(data.getAddress());
        address.setCustomer(save);
//        save.getAddress().setCustomer(save);

//        System.out.println("address = " + save.getAddress().getCustomer());
//        customerRepo.save(save);
        return cutomerHelper.modelToDTO(save);
    }

    public Customer getCustomerDetails(Long customerId){
        //return customerRepo.findById(customerId);
        return null;
    }
}
