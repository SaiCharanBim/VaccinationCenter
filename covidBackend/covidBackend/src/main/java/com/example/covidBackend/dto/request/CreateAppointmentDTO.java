package com.example.covidBackend.dto.request;

import com.example.covidBackend.enums.VaccinationCenterPrefrence;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CreateAppointmentDTO {
    UUID id;
    VaccinationCenterPrefrence vaccinationCenterPrefrence;
}
