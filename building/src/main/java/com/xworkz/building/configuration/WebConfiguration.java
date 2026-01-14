package com.xworkz.building.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;

@Configuration
@ComponentScan("com.xworkz.building")
public  class WebConfiguration {

    public WebConfiguration(){
        System.out.println("WebConfiguration constructor...");
    }

}
