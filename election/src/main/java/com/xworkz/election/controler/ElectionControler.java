package com.xworkz.election.controler;

import com.xworkz.election.dto.ElectionDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ElectionControler {

    @PostMapping("/electionDetails")
    public String electionDetails(ElectionDTO electionDTO){

        System.out.println("Party name=="+electionDTO.getPartyName()
                +" "+"Candidate name=="+electionDTO.getCandidateName()
                +" "+"Age=="+electionDTO.getAge()
                +" "+" Email=="+electionDTO.getEmail()
                +" "+"Phone number"+electionDTO.getPhoneNumber());
        return "responce";

    }
}
