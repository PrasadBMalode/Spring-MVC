package com.xworkz.StudentDetails.service;

import com.xworkz.StudentDetails.dto.StudentDTO;

public class StudentService {
    public boolean studentValidationSave(StudentDTO studentDTO){
        if (studentDTO.getStudentId().length()==5
        && studentDTO.getStudentName()!=null && studentDTO.getStudentName().length()>3
        && studentDTO.getCllgName()!=null && studentDTO.getCllgName().length()>5
        && studentDTO.getStudentPhoneNumber().length()==10
        && studentDTO.getStudentEmail().contains("@gmail.com")){
            return true;
        }else {
            return false;
        }
    }
}
