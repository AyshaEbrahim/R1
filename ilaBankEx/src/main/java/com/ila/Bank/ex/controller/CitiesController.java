package com.ila.Bank.ex.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ila.Bank.ex.model.Cities;
import com.ila.Bank.ex.services.CitiesServices;

@RestController
public class CitiesController {
	
	@Autowired
	private CitiesServices CitiesService;

	@GetMapping("/cities")
	public List<Cities> getAllCities() {

		return CitiesService.getAllCities();
	}

	@GetMapping("/getcitiesbyid")
	public Cities getEmpById(@RequestParam long id) {

		return CitiesService.getCitiesById(id);
	}

	/**
	 * call the above by exsample : localhost:8080/getempbyid?id=2
	 **/

	/**
	 * another way to get ID by passing it in the url :
	 * 
	 * @GetMapping("/employees/{id}") public Employee getEmpById( @PathVariable long
	 * id){
	 * 
	 * return empService.getEmpById(id); }
	 * 
	 * 
	 **/

	// for insert
	// make it as string to let me know if it is created or no
	// post we use @RequestBody == we send the object to the body
	// get responsible for retrieve data and the parameter in the url
	// get transfer the data from the url and it is faster than post but not secure
	// and limited data
	// post fast in performs and secure and unlimited but the speed of retrive data
	// less than get
	// use postman to make sure that the code correct

	@PostMapping("/cities")
	public String addCities(@RequestBody Cities newCities) {
		CitiesService.addCities(newCities);
		return "Saved Successfully";
	}
	
	// for update
	@PutMapping("/department")
	public String updateCities(@RequestBody Cities newCities) {
		CitiesService.updateCities(newCities);
		return "Update Successfully";
	}
	
	//for delete
	@DeleteMapping("/department")
	public String deleteCities(@RequestParam long id) {
		CitiesService.deleteCities(id);
		return "Deleted Successfully";
	}

}
