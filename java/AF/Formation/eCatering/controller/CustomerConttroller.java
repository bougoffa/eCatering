package AF.Formation.eCatering.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import AF.Formation.eCatering.model.TA_CUSTOMER;
import AF.Formation.eCatering.repository.CustomerRepository;

@RestController
@RequestMapping("api/1/")
public class CustomerConttroller {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@RequestMapping(value = "customer/", method = RequestMethod.GET)
	public List<TA_CUSTOMER> getListCustomer(){
		return customerRepository.findAll();
	}
	
	@RequestMapping(value = "customer/{id}", method = RequestMethod.GET)
	public TA_CUSTOMER getCustomerInfo(@PathVariable long id){
		return customerRepository.getOne(id);
	}

}
