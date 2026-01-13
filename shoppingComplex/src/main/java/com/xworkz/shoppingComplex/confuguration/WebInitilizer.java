package com.xworkz.shoppingComplex.confuguration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
    public WebInitilizer(){
        System.out.println("it is WebInitilizer constructor..");
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("it is a getRootConfigClasses method");
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("it is a getServletConfigClasses method");
        return new Class[]{
                WebConfiguration.class
        };
    }
    @Override
    protected String[] getServletMappings() {
        System.out.println("it is a getServletMappings method");
        return new String[]{
                "/"
        };
    }
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        System.out.println("it is a configureDefaultServletHandling method");
        configurer.enable();
    }
}
