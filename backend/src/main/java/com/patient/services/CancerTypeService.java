package com.patient.services;

import com.patient.models.CancerType;
import com.patient.repos.CancerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CancerTypeService {

    @Autowired
    private CancerTypeRepository cancerTypeRepository;

    public List<CancerType> getAllCancerTypes(){
        return cancerTypeRepository.findAll();
    }
}
