package com.intellisoft.findhai.service;

import com.intellisoft.findhai.controller.PatientController;
import com.intellisoft.findhai.controller.dto.PatientRegistrationRespDto;
import com.intellisoft.findhai.entity.Patient;

import java.util.List;

public interface PatientService {
    PatientRegistrationRespDto register(Patient patient);
    List<Patient> fetchPatients();
    Patient fetchPatientDetails(String patientID);
}
