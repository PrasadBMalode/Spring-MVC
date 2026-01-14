package com.xworkz.autoWired.service;

import org.springframework.stereotype.Service;

@Service
public class ContectImpl implements Contect{
    @Override
    public void saveContectDetails() {
        System.out.println("method from Service");
    }
}
