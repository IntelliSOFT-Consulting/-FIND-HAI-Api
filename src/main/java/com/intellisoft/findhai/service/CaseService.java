package com.intellisoft.findhai.service;

import com.intellisoft.findhai.entity.MedicalCase;

import java.util.List;

public interface CaseService {
    MedicalCase addCase(MedicalCase patientMedicalCase, String patientID);

    List<MedicalCase> fetchCases();

    List<MedicalCase> fetchCaseDetails(String patientID);
}
