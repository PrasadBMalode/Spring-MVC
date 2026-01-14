package com.xworkz.cafeshop.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.cafeshop")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("WebConfiguration constructor");
    }


}
