package com.vcorp.vehicle.entity;

import java.io.Serializable;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="vehicle")
public class VehicleDetailsEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Indexed
	private String vin;
	private String fromWeek;
	private String toWeek;
	
	
	public String getFromWeek() {
		return fromWeek;
	}
	public void setFromWeek(String fromWeek) {
		this.fromWeek = fromWeek;
	}
	public String getToWeek() {
		return toWeek;
	}
	public void setToWeek(String toWeek) {
		this.toWeek = toWeek;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	

	

}
