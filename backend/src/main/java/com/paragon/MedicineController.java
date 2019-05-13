package com.paragon;

import java.io.IOException;
import java.util.List;

import com.paragon.models.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.paragon.services.MedicineService;

@RestController
public class MedicineController {

	@Autowired
	private MedicineService medicineService;

	/**
	 * This method is used to fetch all persons.
	 *
	 * @return
	 */
	@RequestMapping(value = "/medicineController", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public @ResponseBody List<Medicine> getAllMedicines() {
		return medicineService.getAllMedicines();
	}

	/**
	 * This method is used to get a single person based on ID.
	 *
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/medicineController/{id}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public @ResponseBody
	Medicine getMedicine(@PathVariable("id") Integer id) {
		return medicineService.getMedicine(id);
	}

	/**
	 * This method is used for both update and add.
	 *
	 * @param payLoad
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@RequestMapping(value = "/medicineController", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public @ResponseBody
	Medicine addMedicine(@RequestBody String payLoad)
			throws JsonParseException, JsonMappingException, IOException {
		return medicineService.addOrUpdateMedicine(payLoad);
	}

	@RequestMapping(value = "/medicineController/{id}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.PUT)
	public @ResponseBody
	Medicine UpdateMedicine(@RequestBody String payLoad)
			throws JsonParseException, JsonMappingException, IOException {
		return medicineService.addOrUpdateMedicine(payLoad);
	}
	/**
	 * This method is used to delete the user.
	 *
	 * @parampayLoad
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@RequestMapping(value = "/medicineController/{id}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.DELETE)
	public long deleteMedicine(@PathVariable("id") Long id) {
		medicineService.deleteMedicine(id);
		return id;
	 }

}
