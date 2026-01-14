package com.xworkz.autoWired.controler;

import com.xworkz.autoWired.dto.ContectDTO;
import com.xworkz.autoWired.service.ContectImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class ContectControler {

    @Autowired
    ContectDTO contectDTO;
    @Autowired
    ContectImpl contectImpl;

    @GetMapping("/contect")
    public String saveContect(@RequestParam String number){
        System.out.println("method from Controler...");
        contectDTO.contectDTO();
        contectImpl.saveContectDetails();
        System.out.println("contect number=="+number);
        return "index.jsp";
    }
}
