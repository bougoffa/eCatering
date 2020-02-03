package AF.Formation.eCatering.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import AF.Formation.eCatering.model.TA_PROFILE;
import AF.Formation.eCatering.repository.ProfileRepository;


@RestController
@RequestMapping("api/1/")
public class ProfileContoller {
	@Autowired 
	ProfileRepository profileRepository ;
	
	@RequestMapping(value = "profile/", method = RequestMethod.GET)
	public List<TA_PROFILE> getListProfile(){
		return profileRepository.findAll();
	}
	
	@RequestMapping(value = "profile/{id}", method = RequestMethod.GET)
	public TA_PROFILE getProfileInfo(@PathVariable long id){
		return profileRepository.getOne(id);
	}
	

}
