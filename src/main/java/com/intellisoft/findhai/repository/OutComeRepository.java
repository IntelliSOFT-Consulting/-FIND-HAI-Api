package com.intellisoft.findhai.repository;

import com.intellisoft.findhai.entity.Outcome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutComeRepository extends JpaRepository<Outcome, Long> {
}
