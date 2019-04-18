package com.shopingcart.shopingcart.dto;

import com.shopingcart.shopingcart.base.BaseDTO;
import lombok.Data;

@Data
public class UserDTO extends BaseDTO {

    private Long id;
    private String name;
    private String email;
}
