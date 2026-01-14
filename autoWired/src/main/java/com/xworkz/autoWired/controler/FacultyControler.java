package com.xworkz.autoWired.controler;

import com.xworkz.autoWired.dto.FacultyDTO;
import com.xworkz.autoWired.service.FacultyImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class FacultyControler {

    @Autowired
    FacultyDTO facultyDTO;

    @Autowired
    FacultyImpl facultyIml;

    @GetMapping("/faculty")
    public String facultySaveDetails(@RequestParam String name){
        System.out.println("Faculty method from Controler");

        facultyDTO.facultyDTO();
        facultyIml.facultySaveDetails();

        System.out.println(name);
        return "index.jsp";
    }
}
