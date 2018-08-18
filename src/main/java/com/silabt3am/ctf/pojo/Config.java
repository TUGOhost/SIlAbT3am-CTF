package com.silabt3am.ctf.pojo;

public class Config {
	private Long id;
	
	private String varname;
	
	private String varvalue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVarname() {
		return varname;
	}

	public void setVarname(String varname) {
		this.varname = varname == null ? null : varname.trim();
	}

	public String getVarvalue() {
		return varvalue;
	}

	public void setVarvalue(String varvalue) {
		this.varvalue = varvalue == null ? null :varvalue.trim();
	}
	
	
}
