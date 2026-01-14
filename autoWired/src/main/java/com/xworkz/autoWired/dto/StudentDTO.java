package com.xworkz.autoWired.dto;

import org.springframework.stereotype.Component;

@Component
public class StudentDTO {
    private int studentID;
    private String studentName;
    private String cllgName;

    public StudentDTO() {
        System.out.println("constructor from DTO");
    }
    public void student(){
        System.out.println("method from DTO");
    }

}
