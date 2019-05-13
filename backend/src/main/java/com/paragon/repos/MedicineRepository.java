package com.paragon.repos;

import com.paragon.models.Medicine;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MedicineRepository extends PagingAndSortingRepository<Medicine, Long> {
	
}