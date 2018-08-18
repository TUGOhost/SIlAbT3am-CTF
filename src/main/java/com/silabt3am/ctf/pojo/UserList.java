package com.silabt3am.ctf.pojo;

public class UserList extends Users{
	
	private String countrycode;
	
	private String countryname;
	
	private long ips;
	
	public String getcountrycode(){
		return countrycode;
	}
	
	public void setcountrycode(String countrycode){
		this.countrycode = countrycode;
	}
	
	public String getcountryname() {
		return countryname;
	}
	
	public void setcountryname(String countryname) {
		this.countryname = countryname;
	}
	
	public long getips() {
		return ips;
	}
	
	public void setips(long ips) {
		this.ips = ips;
	}

}
