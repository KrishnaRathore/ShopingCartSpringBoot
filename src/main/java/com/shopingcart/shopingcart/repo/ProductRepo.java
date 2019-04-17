package com.shopingcart.shopingcart.repo;

import com.shopingcart.shopingcart.models.Product;
import org.apache.tomcat.jni.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {

    List<Product> findAll();

    //Product findOneById(Long prroductId);


    //Product findById();
    //List<Product> getAll();

    //Product findOneByAddress_Street(Address name);


}
