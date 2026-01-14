package com.xworkz.autoWired.dto;

import org.springframework.stereotype.Component;

@Component
public class ContectDTO {
    private String name;
    private long number;

    public ContectDTO() {
        System.out.println("constructor from DTO");
    }

    public void contectDTO(){
        System.out.println("method from DTO");
    }
}
