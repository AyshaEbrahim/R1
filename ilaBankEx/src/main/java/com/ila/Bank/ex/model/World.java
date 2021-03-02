package com.ila.Bank.ex.model;

import javax.persistence.CascadeType;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
//import javax.validation.constraints.NotEmpty;


@Entity
@Table(name = "World")
public class World {
	
	/*  Object that i need 
	 * id string
	 * isoCode 3 string - not null
	 * isoCode 2 string - not null 
	 * countryName string - not null 
	 * countryDialingCode string - not null
	 * cities to capital - not null 
	 * the relation One to Many
	 * so if any update in the cities will update auto 
	 * **/
	
		@Id
	@GeneratedValue ( strategy = GenerationType.AUTO )
	private long id;
	@NotNull( message = "isoCode3 can't be empty")
	private String isoCode3;
	@NotNull( message = "isoCode2 can't be empty")
	private String isoCode2;
	@NotNull( message = "Country Name can't be empty")
	private String countryName;
	@NotNull( message = "Country Dialing Code can't be empty")
	private String countryDialingCode;
	@ManyToOne( cascade = CascadeType.ALL )
	@JoinColumn( name = "capital") //foreign key name
	@NotNull( message = "You have to enter capital (city id)")
	private Cities cities; 
	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getIsoCode3() {
		return isoCode3;
	}


	public void setIsoCode3(String isoCode3) {
		this.isoCode3 = isoCode3;
	}


	public String getIsoCode2() {
		return isoCode2;
	}


	public void setIsoCode2(String isoCode2) {
		this.isoCode2 = isoCode2;
	}


	public String getCountryName() {
		return countryName;
	}


	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


	public String getCountryDialingCode() {
		return countryDialingCode;
	}


	public void setCountryDialingCode(String countryDialingCode) {
		this.countryDialingCode = countryDialingCode;
	}


	public Cities getCities() {
		return cities;
	}


	public void setCities(Cities cities) {
		this.cities = cities;
	}


	public World() {
	}



	
	public World(long id, String isoCode3, String isoCode2, String countryName, String countryDialingCode , Cities cities) {
		super();
		this.id = id;
		this.isoCode3 = isoCode3;
		this.isoCode2 = isoCode2;
		this.countryName = countryName;
		this.countryDialingCode = countryDialingCode;
		this.cities = cities ;
	} 

}
