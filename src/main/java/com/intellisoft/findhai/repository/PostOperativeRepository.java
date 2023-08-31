package com.intellisoft.findhai.repository;

import com.intellisoft.findhai.entity.PostOperative;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostOperativeRepository extends JpaRepository<PostOperative, Long> {
}
