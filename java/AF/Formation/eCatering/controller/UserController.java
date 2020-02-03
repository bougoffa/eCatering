package AF.Formation.eCatering.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import AF.Formation.eCatering.model.TA_USER;
import AF.Formation.eCatering.repository.UserRepository;

@RestController
@RequestMapping("api/1/")
public class UserController {

	@Autowired
	UserRepository userRepository;

		
	
	@RequestMapping(value = "user/", method = RequestMethod.GET)
	public List<TA_USER> getListUser(){
		return userRepository.findAll();
	}
	
	@RequestMapping(value = "user/{id}", method = RequestMethod.GET)
	public TA_USER getUserInfo(@PathVariable long id){
		return userRepository.getOne(id);
	}
	
	@RequestMapping(value = "/validate", method = RequestMethod.GET)
    public TA_USER validateUsr(@RequestParam("T_LOGIN")String T_LOGIN, @RequestParam("T_PASSWORD")String T_PASSWORD, HttpServletRequest request) {
		return this.userRepository.LoginUtilisateur(T_LOGIN, T_PASSWORD);
	}
	
	
}
