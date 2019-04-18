package com.shopingcart.shopingcart.services;


import com.shopingcart.shopingcart.Exceptions.ResourceNotFoundException;
import com.shopingcart.shopingcart.dto.UserDTO;
import com.shopingcart.shopingcart.models.User;
import com.shopingcart.shopingcart.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    private UserRepo userRepo;

    public UserDTO addUserData(UserDTO data){
        User user=this.userDtoToUserModel(data);
        User savedRecord = userRepo.save(user);
        return userModelToUserDTO(savedRecord);
    }


    public UserDTO updateProductdetails(Long id, UserDTO productDetails) {
        User pro=userRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
        pro.setName(productDetails.getName());
        pro.setEmail(productDetails.getEmail());
        userRepo.save(pro);
        return this.userModelToUserDTO(pro) ;
    }

    private User userDtoToUserModel(UserDTO dtoData){
        User user=new User();
        user.setEmail(dtoData.getEmail());
        user.setName(dtoData.getName());
        return user;
    }

    private UserDTO userModelToUserDTO(User userData){
        UserDTO userDto=new UserDTO();
        userDto.setEmail(userData.getEmail());
        userDto.setName(userData.getName());
        userDto.setId(userData.getId());
        userDto.setCreateDate(userData.getCreateDate());
        userDto.setUpdatedDate(userData.getUpdatedDate());
        return userDto;
    }
}