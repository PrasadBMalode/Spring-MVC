package com.xworkz.bikesaling.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")

public class BikeSaleControler {

    @GetMapping("/addharNumber")
    public String addharNumber(@RequestParam String addharNumber){
        System.out.println("Addhar Number=="+addharNumber);
        return "addharNumber";
    }
    @GetMapping("/bikeEMI")
    public String bikeEMI(@RequestParam String bikeEMI){
        System.out.println("Bike Monthely EMI Details =="+bikeEMI);
        return "bikeEMI";
    }
    @GetMapping("/bikeIssuedDate")
    public String bikeIssuedDate(@RequestParam String bikeIssuedDate){
        System.out.println("Bike issue Date=="+bikeIssuedDate);
        return "bikeIssuedDate";
    }
    @GetMapping("/bikeName")
    public String bikeName(@RequestParam String bikeName){
        System.out.println("Bike Name=="+bikeName);
        return "bikeName";
    }
    @GetMapping("/bikePrice")
    public String bikePrice(@RequestParam String bikePrice){
        System.out.println("Bike Price=="+bikePrice);
        return "bikePrice";
    }
    @GetMapping("/bikeRegistrationNumber")
    public String bikeRegistrationNumber(@RequestParam String bikeRegistrationNumber){
        System.out.println("Bike Registration Number=="+bikeRegistrationNumber);
        return "bikeRegistrationNumber";
    }
    @GetMapping("/customerName")
    public String customerName(@RequestParam String customerName){
        System.out.println("Customer name=="+customerName);
        return "customerName";
    }
    @GetMapping("/customerNumber")
    public String customerNumber(@RequestParam String customerNumber){
        System.out.println("Customer Number=="+customerNumber);
        return "customerNumber";
    }
    @GetMapping("/showRoom")
    public String showRoom(@RequestParam String showRoom){
        System.out.println("Showroom name=="+showRoom);
        return "showRoom";
    }
    @GetMapping("/showRoomLocation")
    public String showRoomLocation(@RequestParam String showRoomLocation){
        System.out.println("Showroom location=="+showRoomLocation);
        return "showRoomLocation";
    }
}
