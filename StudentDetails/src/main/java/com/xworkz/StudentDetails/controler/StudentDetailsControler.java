package com.xworkz.StudentDetails.controler;

import com.xworkz.StudentDetails.dto.StudentDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StudentDetailsControler {

    @PostMapping("/studentDetails")
    public String studentDetails(StudentDTO studentDTO){
        System.out.println("Student ID=="+studentDTO.getStudentId());
        System.out.println("Student name=="+studentDTO.getStudentName());
        System.out.println("College name=="+studentDTO.getCllgName());
        System.out.println("Mobile number=="+studentDTO.getStudentPhoneNumber());
        System.out.println("Email=="+studentDTO.getStudentEmail());

        return "responce";
    }

}
