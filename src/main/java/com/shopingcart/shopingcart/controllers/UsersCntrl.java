package com.shopingcart.shopingcart.controllers;
import com.shopingcart.shopingcart.dto.UserDTO;
import com.shopingcart.shopingcart.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/")
public class UsersCntrl {

    @Autowired
    private UserServices userServices ;

    /*private UserServices userServices;
    public UsersCntrl(UserServices userServices) {
        this.userServices = userServices;
    }*/

    @PostMapping("add-user")
    UserDTO addUserData(@RequestBody UserDTO data){
        return userServices.addUserData(data);
    }


    @PutMapping("user/{id}")
    UserDTO updateProductdetails(@PathVariable Long id,@RequestBody UserDTO productDetails){
        return userServices.updateProductdetails(id,productDetails);
    }
}
