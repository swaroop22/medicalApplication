package com.patient.controllers;

import com.patient.models.SubCancerType1;
import com.patient.services.SubCancerType1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubCancerType1Controller {

    @Autowired
    private SubCancerType1Service subCancerType1Service;

    @RequestMapping(value = "/subCancerType1Controller", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public List<SubCancerType1> getSubCancerTypes(){
        return subCancerType1Service.getAllSubCancerTypes();
    }
}
