package com.xworkz.mapingControlerSecond.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MapingControlerSecond {
    public MapingControlerSecond(){
        System.out.println("its controler class");
    }

    @PostMapping("/firstControlerMethod")
    public String firstControlerMethod(){
        return "resp1";
    }

    @PostMapping("/secondControlerMethod")
    public String secondControlerMethod(){
        return "resp2";
    }

    @PostMapping("/thirdControlerMethod")
    public String thirdControlerMethod(){
        return "resp3";
    }

    @PostMapping("/fourthControlerMethod")
    public String fourthControlerMethod(){
        return "resp4";
    }

    @PostMapping("/fifthControlerMethod")
    public String fifthControlerMethod(){
        return "resp5";
    }
}
