package com.example.covidBackend.controller;

import com.example.covidBackend.dto.request.PatientLoginDTO;
import com.example.covidBackend.dto.request.PatientSignupDTO;
import com.example.covidBackend.dto.response.AppointmentDTO;
import com.example.covidBackend.dto.response.GeneralMessageDTO;
import com.example.covidBackend.enums.VaccinationCenterPrefrence;
import com.example.covidBackend.exceptions.PatientDoesNotExistException;
import com.example.covidBackend.exceptions.WrongCredentials;
import com.example.covidBackend.models.Patient;
import com.example.covidBackend.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    PatientService patientService;

    @PostMapping("/signup")
    public ResponseEntity signUp(@RequestBody PatientSignupDTO patientSignupDTO){
        Patient patient = patientService.signUp(patientSignupDTO);
        return new ResponseEntity(patient, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody PatientLoginDTO patientLoginDTO){
        try{
            Patient patient = patientService.login(patientLoginDTO);
            return new ResponseEntity(patient, HttpStatus.OK);
        }catch (WrongCredentials wrongCredentials){
            return new ResponseEntity(new GeneralMessageDTO(wrongCredentials.getMessage()), HttpStatus.UNAUTHORIZED);
        }catch(PatientDoesNotExistException patientDoesNotExistException){
            return new ResponseEntity(new GeneralMessageDTO(patientDoesNotExistException.getMessage()), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/createappointment")
    public ResponseEntity createAppointment(@RequestParam String email, @RequestParam VaccinationCenterPrefrence vaccinationCenterPrefrence){
        AppointmentDTO appointmentDTO = patientService.createAppointment(email, vaccinationCenterPrefrence.toString());
        return new ResponseEntity(appointmentDTO, HttpStatus.OK);
    }

}
