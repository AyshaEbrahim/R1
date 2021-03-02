package com.ila.Bank.ex.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ila.Bank.ex.model.Cities;
import com.ila.Bank.ex.model.World;

@Repository
public interface CitiesRepositories extends JpaRepository<Cities, Long > {
	
}
