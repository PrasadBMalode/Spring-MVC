package com.xworkz.loginProject.service;

import com.xworkz.loginProject.Repository.UserRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignInService {

    @Autowired
    UserRegister userRegister;

    public boolean detailsRetrive(String userName, String password) {

        String dbPassword = userRegister.userDetailsRetrieve(userName);

        if (dbPassword == null) {
            return false;
        }
        return dbPassword.equals(password);
    }
}
