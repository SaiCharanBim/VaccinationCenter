package com.example.covidBackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String name;
    String docDegree;
    @ManyToOne
    @JsonIgnore
    VaccinationCenter vaccinationCenter;
    int patientCount;
    @ManyToMany
    List<Patient> patients;
}
