package com.intellisoft.findhai.repository;

import com.intellisoft.findhai.entity.SurgicalSitePathogenInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurgicalSitePathogenInfoRepository extends JpaRepository<SurgicalSitePathogenInfo, Long> {

}
