package com.ila.Bank.ex.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table( name = "Cities")
public class Cities {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO) 
	private long id;
	private String cityName;
	private String altitude;
	private String langtude;
	
	
	
	public Cities() {
		
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getCityName() {
		return cityName;
	}



	public void setCityName(String cityName) {
		this.cityName = cityName;
	}



	public String getAltitude() {
		return altitude;
	}



	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}



	public String getLangtude() {
		return langtude;
	}



	public void setLangtude(String langtude) {
		this.langtude = langtude;
	}



	public Cities(long id, String cityName, String altitude, String langtude) {
		super();
		this.id = id;
		this.cityName = cityName;
		this.altitude = altitude;
		this.langtude = langtude;
	}
	
	

}
