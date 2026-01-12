package com.xworkz.product.internal;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ProductRunner {
    public ProductRunner(){
        System.out.println("its a Product runner class...");
    }

    @Bean
    public String productItem(){
        System.out.println("its a @Bean anotation  method ");
        return null;
    }
}
