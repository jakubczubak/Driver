package com.czubakjakub.driverapp.category;

import java.util.List;

public class ServiceCategoryImpl implements ServiceCategory {

    private CategoryRepository categoryRepository;

    public ServiceCategoryImpl(CategoryRepository categoryRepository){
        this.categoryRepository=categoryRepository;
    }
    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
