package com.xworkz.election.dto;
import lombok.*;
import org.springframework.stereotype.Component;

//@Component
@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class ElectionDTO {
    private String partyName;
    private String candidateName;
    private int age;
    private String email;
    private String phoneNumber;

}
