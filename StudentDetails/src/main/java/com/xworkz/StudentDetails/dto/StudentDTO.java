package com.xworkz.StudentDetails.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class StudentDTO {
    private String studentId;
    private String studentName;
    private String cllgName;
    private String studentPhoneNumber;
    private String studentEmail;

}
