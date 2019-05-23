package com.patient.controllers;

import java.util.List;

import com.patient.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.patient.services.PatientService;

@RestController
public class PatientController {

	@Autowired
	private PatientService patientService;

	@RequestMapping(value = "/patientController", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public List<Patient> getAllMedicines() {
		return patientService.getAllPatients();
	}


}
