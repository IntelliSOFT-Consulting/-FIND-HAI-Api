package com.intellisoft.findhai.service;


import com.intellisoft.findhai.entity.MedicalCase;
import com.intellisoft.findhai.entity.Patient;
import com.intellisoft.findhai.repository.CaseRepository;
import com.intellisoft.findhai.repository.PatientRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CaseServiceImpl implements CaseService{
    private final CaseRepository caseRepository;
    private final PatientRepository patientRepository;

    @Autowired
    public CaseServiceImpl(CaseRepository caseRepository, PatientRepository patientRepository) {
        this.caseRepository = caseRepository;
        this.patientRepository = patientRepository;
    }

    @Override
    public MedicalCase addCase(MedicalCase patientMedicalCase, String patientID) {

        Optional<Patient> optionalPatient = patientRepository.findByPatientID(patientID);

        if (optionalPatient.isPresent()) {
            Patient patient = optionalPatient.get();
            return caseRepository.save(patientMedicalCase);
        } else {
            throw new EntityNotFoundException("Patient with ID " + patientID + " not found");
        }
    }

    @Override
    public List<MedicalCase> fetchCases() {
        return caseRepository.findAll();
    }

    @Override
    public List<MedicalCase> fetchCaseDetails(String patientID) {

        Optional<MedicalCase> optionCase = caseRepository.findByPatientID(patientID);
        if (optionCase.isPresent()) {

            return (List<MedicalCase>) optionCase.get();

        } else {
            throw new EntityNotFoundException("Cases for Patient ID " + patientID + " not found");
        }
    }
}
