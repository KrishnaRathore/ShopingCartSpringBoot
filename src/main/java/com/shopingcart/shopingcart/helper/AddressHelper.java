package com.shopingcart.shopingcart.helper;

import com.shopingcart.shopingcart.dto.AddressDTO;
import com.shopingcart.shopingcart.models.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressHelper {

    public AddressDTO modelToDTO(Address address) {
        AddressDTO dto = new AddressDTO(address);
        return dto;
    }

    public Address dtoToModel(AddressDTO address) {
        return new Address(address);
    }



}
