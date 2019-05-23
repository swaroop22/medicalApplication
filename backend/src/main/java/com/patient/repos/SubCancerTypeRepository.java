package com.patient.repos;

import com.patient.models.SubCancerType1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubCancerTypeRepository  extends JpaRepository<SubCancerType1, Long> {
}
