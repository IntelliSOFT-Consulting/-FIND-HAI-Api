package com.intellisoft.findhai.repository;

import com.intellisoft.findhai.entity.MedicalCase;
import com.intellisoft.findhai.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CaseRepository extends JpaRepository<MedicalCase, Long> {

    Optional<MedicalCase> findByPatientID(String patientID);
}
