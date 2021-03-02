package com.ila.Bank.ex.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ila.Bank.ex.model.World;
import com.ila.Bank.ex.services.WorldServices;

@RestController
public class WorldController {

	/*
	 * inject for the service
	 */
	@Autowired
	private WorldServices wService;

	
	//NOTE : CHECK IT 
	// bring all country under this world
	@GetMapping("/department/{deptId}/employee")
	public List<World> getWorldCities( @PathVariable long citiesId ) {

		return wService.getCitesWorld(citiesId);
	}
	
	@GetMapping("/world")
	public List<World> getAllWorld() {
		return wService.getAllWorld();
	}

	@GetMapping("/world/{id}")
	public World getWorldById(@PathVariable long id) {

		return wService.getWorldById(id);
	}

	/**
	 * another way to get ID : : @GetMapping("/world") public Employee
	 * getWorldById( @RequestParam long id){ return wService.getWorldById(id); }
	 **/

	// to get the employees that have the same first name
	@GetMapping("/getworldbyname")
	public List<World> getWorldByCountryName(@RequestParam String countryName) {

		return wService.getWorldByCountryName(countryName);
	}

	// search function
	@GetMapping("/wdsearch")
	public List<World> wdSearch(@RequestParam String countryName) {
		return wService.getWdSearch(countryName);
	}
	/*
	 * localhost:8080/wdsearch?countryName=Bahrain
	 */

	// for insert
	// make it as string to let me know if it is created or no
	// post we use @RequestBody == we send the object to the body
	// get responsible for retrieve data
	// get transfer the data from the url and it is faster than post but not secure
	// and limited data
	// post fast in performs and secure and unlimited but the speed of retrive data
	// less than get
	// use postman to make sure that the code correct
	//Insert
	@PostMapping("/world")
	public ResponseEntity<World> addEmp(@Valid @RequestBody World newWd) {
		wService.addWd(newWd);
		return new ResponseEntity<World> ( newWd , HttpStatus.OK);
	}

	// for update
	@PutMapping("/world")
	public ResponseEntity<World> updateWd(@Valid @RequestBody World newWd) {
		wService.updateWd(newWd);
		return new ResponseEntity<World> ( newWd , HttpStatus.OK);
	}

	// delete by id
	@DeleteMapping("/world")
	public String deleteWd(@RequestParam long id) {
		wService.deleteWd(id);
		return "Deleted Successfully";
	}

}
