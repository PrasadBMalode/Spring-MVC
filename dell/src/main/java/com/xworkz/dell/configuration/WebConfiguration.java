package com.xworkz.dell.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkx.dell")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("its WebConfiguration class");
    }
}
