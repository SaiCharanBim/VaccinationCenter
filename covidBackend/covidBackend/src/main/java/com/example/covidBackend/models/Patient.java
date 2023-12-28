package com.example.covidBackend.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String name;
    String gender;
    @Column(unique = true)
    String aadharNumber;
    int doseCount;
    String vaccinationPrefrence;
    String address;
    @Column(unique = true)
    long phoneNumber;
    @Column(unique = true)
    String email;
    String password;
}
