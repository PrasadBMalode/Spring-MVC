package com.xworkz.traveldetails.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import java.lang.annotation.Annotation;

public class WebInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("its a getRootConfigClasses method");

        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("its a getServletConfigClasses method..");
        return new Class[]{
                WedConfiguration.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("its a getServletMappings method..");
        return new String[]{
                "/"
        };
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer defaultServletHandlerConfigurer){
        defaultServletHandlerConfigurer.enable();

    }
}
