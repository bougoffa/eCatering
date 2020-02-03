package AF.Formation.eCatering.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import AF.Formation.eCatering.model.TA_FACILITY;
import AF.Formation.eCatering.repository.FacilityRepository;

@RestController
@RequestMapping("api/1/")
public class FacilityController {
	@Autowired
	FacilityRepository facilityRepository;
	
	@RequestMapping(value = "facility/", method = RequestMethod.GET)
	public List<TA_FACILITY> getListFacility(){
		return facilityRepository.findAll();
	}
	
	@RequestMapping(value = "facility/{id}", method = RequestMethod.GET)
	public TA_FACILITY getFacilityInfo(@PathVariable long id){
		return facilityRepository.getOne(id);
	}
	 

}
