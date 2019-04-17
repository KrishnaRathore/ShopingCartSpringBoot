package com.shopingcart.shopingcart.controllers;

import com.shopingcart.shopingcart.models.Category;
import com.shopingcart.shopingcart.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/")
public class CategoryCntrl {

    @Autowired
    private CategoryServices categoryServices ;

    @GetMapping("categories")
    List<Category> getCategoryData(){
        return categoryServices.getCategoryData();
    }

    @PostMapping("category/add-Category")
    Category addCategoryData(@RequestBody Category data){
        return categoryServices.addCategoryData(data);
    }

    @GetMapping("category/get/{id}")
    Category getCategorydetails(@PathVariable Long id){
        return categoryServices .getCategoryDetails(id);
    }
}