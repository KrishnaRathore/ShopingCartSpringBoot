package com.shopingcart.shopingcart.controllers;

import com.shopingcart.shopingcart.models.Product;
import com.shopingcart.shopingcart.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class ProductsCntrl {

    @Autowired
    private ProductServices productServices;

    @GetMapping("products")
    List<Product> getProductData(){
        return productServices.getProductData();
    }

    @PostMapping("product/add-product")
    Product addProductData(@RequestBody @Valid Product data){
        return productServices.addProductData(data);
    }


    /*@PostMapping(value = "/add-product",headers ="Content-Type=multipart/form-data" )
    Product addProductData(@RequestParam(value = "sdd") MultipartFile multipartFile, @RequestBody @Valid Product data){
        return productServices.addProductData(data);
    }*/

    @GetMapping("product/{id}")
    Product getProductdetails(@PathVariable Long id){
        return productServices.getProductDetails(id);
    }

    @DeleteMapping("product/delete/{id}")
    void deleteProduct(@PathVariable Long id){
        productServices.deleteProduct(id);
    }

    @PutMapping("product/update/{id}")
    Product updateProductdetails(@PathVariable Long id,@Valid @RequestBody Product productDetails){
        return productServices.updateProductdetails(id,productDetails);
    }

}
