package com.xworkz.autoWired.controler;

import com.xworkz.autoWired.dto.StudentDTO;
import com.xworkz.autoWired.service.StudentImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class StudentControler {

    @Autowired
    StudentDTO studentDTO;

    @Autowired
    StudentImpl studentImpl;

    @GetMapping("/std")
    public String student(@RequestParam String name) {

        studentDTO.student();
        studentImpl.saveStudentDetails();

        System.out.println("Name of Student == " + name);

        return "index.jsp";
    }
}
