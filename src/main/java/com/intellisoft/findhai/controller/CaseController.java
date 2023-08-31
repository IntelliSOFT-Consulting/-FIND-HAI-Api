package com.intellisoft.findhai.controller;


import com.intellisoft.findhai.entity.MedicalCase;
import com.intellisoft.findhai.service.CaseService;
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
@RequestMapping(value = "/api/v1/case", produces = "application/json")
@RestController
@RequiredArgsConstructor
public class CaseController {

    @Autowired
    CaseService caseService;

    @PutMapping(path = "/{patientID}/add", consumes = ALL_VALUE)
    public ResponseEntity<MedicalCase> addCase(@Valid @RequestBody MedicalCase patientMedicalCase, String patientID) {
        return ResponseEntity.status(HttpStatus.OK).body(caseService.addCase(patientMedicalCase, patientID));
    }

    @GetMapping(path = "/fetchCases")
    public ResponseEntity<List<MedicalCase>> fetchCases() {
        return ResponseEntity.status(HttpStatus.FOUND).body(caseService.fetchCases());
    }

    @GetMapping(path = "/details/{patientID}")
    public ResponseEntity<List<MedicalCase>> fetchCaseDetails(String patientID) {
        return ResponseEntity.status(HttpStatus.FOUND).body(caseService.fetchCaseDetails(patientID));
    }


}
