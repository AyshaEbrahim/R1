package com.ila.Bank.ex.repositories;

import java.util.List;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ila.Bank.ex.model.World;

@Repository
public interface WorldRepositories extends JpaRepository<World , Long>  {
	
	/*
	 * JpaRepository will take two parameters : 
	 * the class name or model name that you work in it 
	 * the class of the dataType of your primaryKey
	 * */
	
	/* to find by countryName */
	public List<World> findByCountryNameIgnoreCase (String countryName); 
	
	/* another way to find by countryName */
	//search query :
		@Query(" select wd from World wd where wd.countryName = :countryNameBind ")
		public List<World> wdSearch(@Param("countryNameBind") String countryName); 

		public List<World> findByCitiesId (long citiesId);

}
