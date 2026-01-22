package com.xworkz.election.service;

import com.xworkz.election.dto.ElectionDTO;

public class ElectionService {
    public boolean electionValidationSave(ElectionDTO electionDTO){
        if (electionDTO.getPartyName()!=null && electionDTO.getPartyName().length()<5
        && electionDTO.getCandidateName()!=null && electionDTO.getCandidateName().length()<10
        && electionDTO.getAge()>19 && electionDTO.getAge()<60
        && electionDTO.getEmail().contains("@gmail.com")
        && electionDTO.getPhoneNumber().length()==10){
            return true;
        }
        return false;

    }
}
