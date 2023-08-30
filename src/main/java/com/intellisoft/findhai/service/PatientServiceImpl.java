package com.intellisoft.findhai.service;

import com.intellisoft.findhai.controller.dto.PatientRegistrationRespDto;
import com.intellisoft.findhai.entity.Patient;
import com.intellisoft.findhai.repository.PatientRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService{

    private final PatientRepository patientRepository;

    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public PatientRegistrationRespDto register(Patient patient) {

        Patient registeredPatient = patientRepository.save(patient);
        return new PatientRegistrationRespDto("Patient registered successfully", registeredPatient);
    }

    @Override
    public List<Patient> fetchPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient fetchPatientDetails(String patientID) {

        Optional<Patient> optionalPatient = patientRepository.findByPatientID(patientID);

        if (optionalPatient.isPresent()) {

            return optionalPatient.get();

        } else {
            throw new EntityNotFoundException("Patient with ID " + patientID + " not found");
        }
    }

}
