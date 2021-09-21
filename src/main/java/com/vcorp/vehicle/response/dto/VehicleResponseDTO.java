package com.vcorp.vehicle.response.dto;

import java.io.Serializable;
import java.util.List;

public class VehicleResponseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 308699872477313620L;
	
	private String buildFrom;
	private String buildTo;
	private List<String> vdn;
	private String vin;
	
	public String getBuildFrom() {
		return buildFrom;
	}
	public void setBuildFrom(String buildFrom) {
		this.buildFrom = buildFrom;
	}
	public String getBuildTo() {
		return buildTo;
	}
	public void setBuildTo(String buildTo) {
		this.buildTo = buildTo;
	}
	public List<String> getVdn() {
		return vdn;
	}
	public void setVdn(List<String> vdn) {
		this.vdn = vdn;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	
	
	

}
