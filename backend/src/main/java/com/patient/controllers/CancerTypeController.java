package com.patient.controllers;

import com.patient.models.CancerType;
import com.patient.services.CancerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CancerTypeController {

    @Autowired
    private CancerTypeService cancerTypeService;

    @RequestMapping(value = "/cancerTypeController", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public List<CancerType> getAllCancerTypes() {
        return cancerTypeService.getAllCancerTypes();
    }
}
