package com.vcorp.vehicle.request.dto;

import java.io.Serializable;

public class VehicleRequestDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 79510311178528673L;
	//@NotNull
	private String vin;

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}
	
	

}
