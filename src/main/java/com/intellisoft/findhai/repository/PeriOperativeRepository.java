package com.intellisoft.findhai.repository;

import com.intellisoft.findhai.entity.PeriOperative;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriOperativeRepository extends JpaRepository<PeriOperative, Long> {
}
