package com.example.covidBackend.dto.request;

import com.example.covidBackend.enums.VaccinationPrefrence;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PatientSignupDTO {
    String name;
    String email;
    String password;
    String aadharNumber;
    long phoneNumber;
    String gender;
    VaccinationPrefrence vaccinationPrefrence; // Sputnik, Covaxin, Covishield, xyz
    String address;
}
