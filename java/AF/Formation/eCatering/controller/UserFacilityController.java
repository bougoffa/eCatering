package AF.Formation.eCatering.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import AF.Formation.eCatering.model.RE_USER_FACILITY;
import AF.Formation.eCatering.repository.UserFacilityRepository;

@RestController
@RequestMapping("api/1/")
public class UserFacilityController {

	@Autowired
	UserFacilityRepository  userFacilityRepository;
	
	@RequestMapping(value = "userfacility/", method = RequestMethod.GET)
	public List<RE_USER_FACILITY> getListUserFcility(){
		return userFacilityRepository.findAll();
	}
	
	

	@RequestMapping(value = "userfacility/{id}", method = RequestMethod.GET)
	public RE_USER_FACILITY getUserFcilityInfo(@PathVariable long id){
		return userFacilityRepository.getOne(id);
	}
}
