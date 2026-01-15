package com.xworkz.flightbooking.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class FlightBookingControler {

    @GetMapping("/flightName")
    public String flightName(@RequestParam String flightName){
        System.out.println("Flight name=="+flightName);
        return "flightName";
    }
    @GetMapping("/passengerName")
    public String passengerName(@RequestParam String passengerName){
        System.out.println("Passenger name=="+passengerName);
        return "passengerName";
    }


    @GetMapping("/addharNumber")
    public String addharNumber(@RequestParam String addharNumber){
        System.out.println("Addhar number=="+addharNumber);
        return "addharNumber";
    }

    @GetMapping("/flightDestination")
    public String flightDestination(@RequestParam String flightDestination){
        System.out.println("Flight Destination =="+flightDestination);
        return "flightDestination";
    }

    @GetMapping("/flightFrom")
    public String flightFrom(@RequestParam String flightFrom){
        System.out.println("Flight Departched=="+flightFrom);
        return "flightFrom";
    }

    @GetMapping("/flightNumber")
    public String flightNumber(@RequestParam String flightNumber){
        System.out.println("Flight Number=="+flightNumber);
        return "flightNumber";
    }

    @GetMapping("/flightTicketPrice")
    public String flightTicketPrice(@RequestParam String flightTicketPrice){
        System.out.println("Flight Ticket Price=="+flightTicketPrice);
        return "flightTicketPrice";
    }

    @GetMapping("/mobileNumber")
    public String mobileNumber(@RequestParam String mobileNumber){
        System.out.println("Flight Number=="+mobileNumber);
        return "mobileNumber";
    }

    @GetMapping("/motherName")
    public String motherName(@RequestParam String motherName){
        System.out.println("Mother name=="+motherName);
        return "motherName";
    }

    @GetMapping("/fatherName")
    public String fatherName(@RequestParam String fatherName){
        System.out.println("Father name=="+fatherName);
        return "fatherName";
    }
}
