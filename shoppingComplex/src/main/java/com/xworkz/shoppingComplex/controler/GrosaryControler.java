package com.xworkz.shoppingComplex.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class GrosaryControler {
    public GrosaryControler() {
        System.out.println("its GrosaryControler controler constructor..");
    }

    @GetMapping("/grosary")
    public String grosary() {
        System.out.println("its controler grosary method..");
return "Grosary.jsp";
    }

}
