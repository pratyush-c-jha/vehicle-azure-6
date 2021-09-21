package com.vcorp.vehicle.entity;

import java.io.Serializable;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vdn")
public class VdnDetailsEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Indexed
	private String vdn;
	private String fromWeek;
	private String toWeek;
	private String vdnFamily;

	
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
	public String getVdnFamily() {
		return vdnFamily;
	}
	public void setVdnFamily(String vdnFamily) {
		this.vdnFamily = vdnFamily;
	}
	public String getVdn() {
		return vdn;
	}
	public void setVdn(String vdn) {
		this.vdn = vdn;
	}
	
	

}
