package com.xworkz.shoppingComplex.confuguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.shoppingComplex")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("it is WebConfiguration class");
    }
}
