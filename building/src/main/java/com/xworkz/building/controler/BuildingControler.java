package com.xworkz.building.controler;

import com.xworkz.building.dto.BuildingDTO;
import com.xworkz.building.service.BuildingImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class BuildingControler {

    @Autowired
    BuildingDTO buildingDTO;

    @Autowired
    BuildingImpl buildingImpl;

    public BuildingControler() {
        System.out.println("it is BuildingControler constructor");
    }

    @GetMapping("/building")
    public String building(@RequestParam String number){
        System.out.println("number=="+ number);
        buildingImpl.save();

        return "index.jsp";

    }
}
