package com.xworkz.shoppingComplex.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ShoesControler {
    public ShoesControler(){
        System.out.println("it is Shoe controler of constructor...");
    }
    @GetMapping("/shoe")
    public String shoe(){
        System.out.println("it is shoe method from controler..");
        return "shoes.jsp";
    }
}
