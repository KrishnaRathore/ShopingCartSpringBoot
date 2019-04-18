package com.shopingcart.shopingcart.repo;


import com.shopingcart.shopingcart.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

}