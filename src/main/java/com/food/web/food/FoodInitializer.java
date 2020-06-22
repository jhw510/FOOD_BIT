package com.food.web.food;

import com.food.web.mappers.FoodMapper;

import com.food.web.proxy.Crawler;
import com.food.web.proxy.ISupplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;



public class FoodInitializer implements ApplicationRunner {
@Autowired
    FoodMapper foodMapper;
@Autowired
Crawler crawler;

@Override
    public void run(ApplicationArguments args) throws Exception{
    ISupplier<Integer> s=foodMapper::count;
    if(s.get() == 0){ crawler.price(); }
}
}
