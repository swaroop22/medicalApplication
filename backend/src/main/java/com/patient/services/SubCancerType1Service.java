package com.patient.services;

import com.patient.models.SubCancerType1;
import com.patient.repos.SubCancerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubCancerType1Service {

    @Autowired
    private SubCancerTypeRepository subCancerTypeRepository;

    public List<SubCancerType1> getAllSubCancerTypes(){
        return subCancerTypeRepository.findAll();
    }
}
