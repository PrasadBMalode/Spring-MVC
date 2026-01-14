package com.xworkz.cafeshop.controler;

import com.xworkz.cafeshop.dto.CafeDTO;
import com.xworkz.cafeshop.service.CafeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class CafeControler {
    @Autowired
    CafeDTO cafeDTO;

    @Autowired
    CafeImpl cafeImpl;

    public CafeControler() {
        System.out.println("CafeControler constructor");
    }

    @GetMapping("/cafe")
    public String cafe(@RequestParam String name){
        System.out.println("Customer name="+name);
        cafeImpl.save();
        System.out.println("CafeControler method");
        return "index.jsp";


    }
}
