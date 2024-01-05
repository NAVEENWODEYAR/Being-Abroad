package com.beingabroad.test.repo;

import com.beingabroad.test.entity.Institution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstituteRepo extends JpaRepository<Institution, Integer> {
}
