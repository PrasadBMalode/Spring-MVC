package com.xworkz.fooddetails.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.foodDetails")

public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("its configuration class...");
    }
}
