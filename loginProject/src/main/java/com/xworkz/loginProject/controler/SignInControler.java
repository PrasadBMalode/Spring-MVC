package com.xworkz.loginProject.controler;

import com.xworkz.loginProject.service.SignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class SignInControler {

    @Autowired
    SignInService signInService;

    public SignInControler() {
        System.out.println("its a sign in controler...!");

    }

    @GetMapping("getSignIn")
    public String signInDataSave(@RequestParam String userName, @RequestParam String password) {
        System.out.println("its a signInDataSave");

        boolean isValid = signInService.detailsRetrive(userName, password);

        if (isValid) {
            return "SignInSuccessfully";

        } else {
            return "SignInFailed";

        }
    }
}
