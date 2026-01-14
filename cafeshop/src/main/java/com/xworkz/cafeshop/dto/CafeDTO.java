package com.xworkz.cafeshop.dto;


import org.springframework.stereotype.Component;

@Component
public class CafeDTO {
    private int cafeId;
    private String shopName;
    private String location;

    public CafeDTO() {
        System.out.println("DTO constructor");
    }


}
