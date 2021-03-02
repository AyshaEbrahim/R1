package com.ila.Bank.ex.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ila.Bank.ex.model.Cities;
import com.ila.Bank.ex.repositories.CitiesRepositories;



@Service
public class CitiesServices {
	
	@Autowired
	private CitiesRepositories citiesRepository;
	

	public List<Cities> getAllCities() {

		return citiesRepository.findAll();
	}


	public Cities getCitiesById(long id) {
		/*
		 * if i did not find the id it will return null and this is not error handle
		 */
		return citiesRepository.findById(id).orElseThrow(null);
	}


	// insert cities
	public void addCities(Cities newCities) {
		// i have to call the repository and save function and it will take an entity
		// save if it put == it will update the record
		// save if post it will add new record if it is not in the database
		citiesRepository.save(newCities);

	}

	// update cities
	public void updateCities(Cities newCities) {
		citiesRepository.save(newCities);

	}
	
	//delete
	public void deleteCities (long id) {
		citiesRepository.deleteById(id);
	}

}
