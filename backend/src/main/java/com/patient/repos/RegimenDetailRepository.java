package com.patient.repos;

import com.patient.models.RegimenDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegimenDetailRepository extends JpaRepository< RegimenDetail, Long> {
}
