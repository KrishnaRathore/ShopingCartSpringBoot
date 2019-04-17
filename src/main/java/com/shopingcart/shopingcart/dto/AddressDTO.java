package com.shopingcart.shopingcart.dto;

import com.shopingcart.shopingcart.models.Address;
import lombok.Data;

@Data
public class AddressDTO {

    private Long id;

    private String buildingNo;

    private String city;

    private String state;

    private String country;

    public AddressDTO(Address address) {
        this.id = address.getId();
        this.buildingNo = address.getBuildingNo();
        this.city = address.getCity();
        this.state = address.getState();
        this.country = address.getCountry();
    }

    public AddressDTO() {
    }
}
