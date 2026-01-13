package com.xworkz.shoppingComplex.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class FancyStoreControler {
    public FancyStoreControler(){
        System.out.println("its Fancy store controler constructor..");
    }
    @GetMapping("/fancy")
    public String fancy(){
        System.out.println("it is a method of Controler from Fancy store..");
        return "fancystore.jsp";
    }
}
