package com.example.covidBackend.dto.response;

import com.example.covidBackend.models.Patient;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AppointmentDTO {

    int doseNumber;
    Patient patient;
    UUID docID;
    String docName;
    UUID vcID;
    String vaccinationCenterName;
}
