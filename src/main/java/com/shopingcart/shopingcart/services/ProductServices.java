package com.shopingcart.shopingcart.services;

import com.shopingcart.shopingcart.Exceptions.ResourceNotFoundException;
import com.shopingcart.shopingcart.models.Product;
import com.shopingcart.shopingcart.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ProductServices {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getProductData(){
        return productRepo.findAll();
    }

    public Product addProductData(Product data){

        return productRepo.save(data);
    }

    public Product getProductDetails(Long prroductId){
        //return productRepo.findById(prroductId).orElse(new Product());
        return productRepo.findById(prroductId).orElseThrow(() -> new ResourceNotFoundException("Product", "id", prroductId));
    }

    public void deleteProduct(Long prroductId){
        Product prod=  productRepo.findById(prroductId).orElseThrow(() -> new ResourceNotFoundException("Product", "id", prroductId));
        productRepo.delete(prod);
    }

    public Product updateProductdetails(Long prroductId,Product productDetails){
        Product pro=productRepo.findById(prroductId).orElseThrow(() -> new ResourceNotFoundException("Product", "id", prroductId));
        pro.setDescription(productDetails.getDescription());
        pro.setName(productDetails.getName());
        pro.setProductPrice(productDetails.getProductPrice());
        pro.setRating(productDetails.getRating());
        return  productRepo.save(pro);
    }
}
