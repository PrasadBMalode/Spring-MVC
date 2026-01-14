package com.xworkz.autoWired.service;

import org.springframework.stereotype.Service;

@Service
public class FacultyImpl implements Faculty{
    @Override
    public void facultySaveDetails() {
        System.out.println("method from Faculty IMPL");

    }
}
