package com.shopingcart.shopingcart.services;

import com.shopingcart.shopingcart.models.Category;
import com.shopingcart.shopingcart.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServices {

    @Autowired
    private CategoryRepo categoryRepo;

    public List<Category> getCategoryData(){

        return categoryRepo.findAll();
    }

    public Category addCategoryData(Category data){

        return categoryRepo.save(data);
    }

    public Category getCategoryDetails(Long CategoryId){
        return null;
    }
}
