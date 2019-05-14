package com.paragon.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.paragon.domain.MedicineWrapper;
import com.paragon.models.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.paragon.repos.MedicineRepository;

@Service
public class MedicineService {

	@Autowired
	private MedicineRepository medicineRepository;

	@Autowired
	private ObjectMapper objectMapper;

	/**
	 * This method is used to get all available persons.
	 * @return
	 */
	public List<Medicine> getAllMedicines() {
		List<Medicine> medicinesList = new ArrayList<>();
		medicineRepository.findAll().forEach(x -> medicinesList.add(x));
		return medicinesList;
	}

	public Medicine getMedicine(int id){
		return medicineRepository.findOne((long) id);
	}

	public Medicine addOrUpdateMedicine(String payLoad) throws JsonParseException, JsonMappingException, IOException{

    MedicineWrapper medicineWrapper = objectMapper.readValue(payLoad, MedicineWrapper.class);
		long personId = medicineWrapper.getId();
		Medicine medicine = new Medicine();
		medicine.setId(personId);
		medicine.setFirstName(medicineWrapper.getFirstName());
		medicine.setLastName(medicineWrapper.getLastName());
		medicine.setOccupation(medicineWrapper.getOccupation());
		medicine.setAge(medicineWrapper.getAge());
		medicine.setDob(medicineWrapper.getDob());
		medicine.setMiddleName(medicineWrapper.getMiddleName());

    if(medicineWrapper.getId() == 0){
      medicine.setCreatedOn(new Date());
      medicine.setUpdatedOn(new Date());
			Long size = medicineRepository.count();
			medicine.setId(size+1);
		} else {
      Medicine newMedicine = this.getMedicine((int) personId);
      if (newMedicine != null) {
        medicine.setCreatedOn(newMedicine.getCreatedOn());
        medicine.setUpdatedOn(newMedicine.getUpdatedOn());
      }
      medicine.setId(medicineWrapper.getId());

    }
		medicine = medicineRepository.save(medicine);
		return medicine;
	}

	public long deleteMedicine(long id) {
		Medicine medicine = medicineRepository.findOne(id);
		medicineRepository.delete(medicine);
		return id;
	}
}
