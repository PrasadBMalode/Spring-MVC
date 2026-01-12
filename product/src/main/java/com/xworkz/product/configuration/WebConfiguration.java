package com.xworkz.product.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.product")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("its web configuration class");
    }
}
