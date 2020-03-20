package com.lch.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:config/food.properties",encoding = "utf-8")
@ConfigurationProperties(prefix = "food")
@Data
public class FoodConfig {


    private String rice;
    private String meat;


//    public String getRice() {
//        return rice;
//    }
//
//    public void setRice(String rice) {
//        this.rice = rice;
//    }
//
//    public String getMeat() {
//        return meat;
//    }
//
//    public void setMeat(String meat) {
//        this.meat = meat;
//    }
}
