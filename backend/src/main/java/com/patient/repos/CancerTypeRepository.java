package com.patient.repos;

import com.patient.models.CancerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CancerTypeRepository extends JpaRepository<CancerType, Long> {
}
