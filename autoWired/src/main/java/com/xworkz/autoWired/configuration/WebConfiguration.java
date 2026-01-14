package com.xworkz.autoWired.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.autoWired")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("its configuration class");
    }
}
