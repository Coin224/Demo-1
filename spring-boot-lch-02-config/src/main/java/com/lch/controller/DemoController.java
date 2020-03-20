package com.lch.controller;

import com.lch.bean.Food;
import com.lch.config.FoodConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private FoodConfig foodConfig;

    @RequestMapping("/food")
    public Food getFood() {
        Food food = new Food();
        food.setMeat(foodConfig.getMeat());
        food.setRice(foodConfig.getRice());
        return food;
    }

}
