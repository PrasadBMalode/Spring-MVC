package com.xworkz.cafeshop.service;
import org.springframework.stereotype.Service;

@Service
public class CafeImpl implements CafeService{

    @Override
    public void save() {
        System.out.println("its a cafeImpl method...");

    }
}
