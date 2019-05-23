package com.patient.services;

import java.util.List;

import com.patient.models.Patient;
import com.patient.repos.RegimenDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.patient.repos.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private RegimenDetailRepository regimenDetailRepository;

	@Autowired
	private PatientRepository patientRepository;

	@Autowired
	private ObjectMapper objectMapper;


	public List<Patient> getAllPatients(){
		return patientRepository.findAll();
	}


}
