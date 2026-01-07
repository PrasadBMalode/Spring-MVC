package com.xworkz.traveldetails.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.travelDetails")
public class WedConfiguration {
    public WedConfiguration(){
        System.out.println("its webconfiguration class..");
    }
}
