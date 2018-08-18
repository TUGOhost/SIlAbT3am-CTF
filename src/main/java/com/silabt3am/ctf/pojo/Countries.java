package com.silabt3am.ctf.pojo;

import java.io.Serializable;

public class Countries implements Serializable{
	private Long id;
	
	private String countryname;
	
	private String countrycode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname == null ? null : countryname.trim();
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode == null ? null : countrycode.trim();
	}
	
	
}
