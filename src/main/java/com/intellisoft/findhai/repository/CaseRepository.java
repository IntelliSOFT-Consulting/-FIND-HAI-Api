package com.intellisoft.findhai.repository;

import com.intellisoft.findhai.entity.MedicalCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseRepository extends JpaRepository<MedicalCase, Long> {

}
