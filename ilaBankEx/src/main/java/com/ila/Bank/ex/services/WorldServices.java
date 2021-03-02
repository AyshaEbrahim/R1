package com.ila.Bank.ex.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ila.Bank.ex.error.RecordNotFoundException;
import com.ila.Bank.ex.model.World;
import com.ila.Bank.ex.repositories.WorldRepositories;

import java.util.List;

@Service
public class WorldServices {

	@Autowired
	private WorldRepositories worldRepoitory;
	
	// for the foreign key
		// note check it 
		public List<World> getCitesWorld (long citiesId) {
			return worldRepoitory.findByCitiesId(citiesId);	
		}

	public List<World> getAllWorld() {

		return worldRepoitory.findAll();
	}

	public World getWorldById(long id) {

		return worldRepoitory.findById(id).orElseThrow(()->  new RecordNotFoundException("this world country not found :- " + id ));
	}

	public List<World> getWorldByCountryName(String countryName) {

		return worldRepoitory.findByCountryNameIgnoreCase(countryName);
	}

	// search function
	public List<World> getWdSearch(String countryName) {

		return worldRepoitory.wdSearch(countryName);
	}

	// insert world country
	public void addWd(World newWd) {
		// i have to call the repository and save function and it will take an entity
		// save if it put == it will update the record
		// save if post it will add new record if it is not in the database
		worldRepoitory.save(newWd);

	}

	// update 
	public void updateWd(World newWd) {
		worldRepoitory.save(newWd);

	}
	
	//delete 
	public void deleteWd(long id) {
		worldRepoitory.deleteById(id);
	}

}
