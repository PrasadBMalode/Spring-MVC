package com.xworkz.hp.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.hp")
public class WebCongiguration {
    public WebCongiguration(){
        System.out.println("its WebCongiguration class..");
    }
}
