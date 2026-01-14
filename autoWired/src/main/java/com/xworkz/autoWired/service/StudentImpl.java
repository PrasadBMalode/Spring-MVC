package com.xworkz.autoWired.service;

import org.springframework.stereotype.Service;

@Service
public class StudentImpl implements Student{
    @Override
    public void saveStudentDetails() {
        System.out.println("method from service...");
    }
}
