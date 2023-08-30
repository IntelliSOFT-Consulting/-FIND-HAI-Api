package com.intellisoft.findhai.controller;

import com.intellisoft.findhai.controller.dto.PatientRegistrationRespDto;
import com.intellisoft.findhai.entity.Patient;
import com.intellisoft.findhai.service.PatientService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.ALL_VALUE;

@Slf4j
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/api/v1/patient", produces = "application/json")
@RestController
@RequiredArgsConstructor
public class PatientController {

    @Autowired
    PatientService patientService;

    @PostMapping(path = "/register", consumes = ALL_VALUE)
    public ResponseEntity<PatientRegistrationRespDto> registerPatient(@Valid @RequestBody Patient patient) {
        return ResponseEntity.status(HttpStatus.CREATED).body(patientService.register(patient));
    }

    @GetMapping(path = "/fetchAll")
    public ResponseEntity<List<Patient>> fetchPatients() {
        return ResponseEntity.status(HttpStatus.FOUND).body(patientService.fetchPatients());
    }

    @GetMapping(value = "/details/{patientID}")
    public ResponseEntity<Patient> fetchPatientDetails(@Valid String patientID) {
        return ResponseEntity.status(HttpStatus.FOUND).body(patientService.fetchPatientDetails(patientID));
    }






}
