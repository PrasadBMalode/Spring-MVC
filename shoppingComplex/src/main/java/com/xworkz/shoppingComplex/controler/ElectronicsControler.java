package com.xworkz.shoppingComplex.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ElectronicsControler {
    public ElectronicsControler(){
        System.out.println("its Electronic store constructor from controler");
    }
    @GetMapping("/electronics")
    public String electronic(){
        System.out.println("its controler method of Electrics");
        return "/electronics.jsp";
    }
}
