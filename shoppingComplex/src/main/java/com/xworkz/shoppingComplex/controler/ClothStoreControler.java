package com.xworkz.shoppingComplex.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ClothStoreControler {
    public ClothStoreControler() {
        System.out.println("it is cloth store controler");
    }

    @GetMapping("/clothStoreName")
    public String clothStoreName(){
        System.out.println("it is cloth store controler method");
        return "cloth.jsp";
    }
}
