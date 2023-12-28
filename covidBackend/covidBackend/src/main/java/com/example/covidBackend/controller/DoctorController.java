package com.example.covidBackend.controller;


import com.example.covidBackend.models.Doctor;
import com.example.covidBackend.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @PostMapping("/register")
    public String registerDoctor(@RequestBody Doctor obj){
        Doctor doctor = doctorService.registerDoctor(obj);
        return "Doctor got created";
    }
}
