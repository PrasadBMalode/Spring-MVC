package com.xworkz.autoWired.dto;

import org.springframework.stereotype.Component;

@Component
public class FacultyDTO {
    private int id;
    private String name;

    public void facultyDTO(){
        System.out.println("Faculty method from DTO");
    }
}
