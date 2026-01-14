package com.xworkz.building.service;

import org.springframework.stereotype.Service;

@Service
public class BuildingImpl implements Building{

    public void save() {
        System.out.println("its is method from BuildingImpl");

    }
}
