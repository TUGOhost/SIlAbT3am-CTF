package com.silabt3am.ctf.pojo;

import java.util.Date;

public class SolveStat {
	
	private long order;
	
	private long solverid;
	
	private String solvername;
	
	private long submits;
	
	private Date time;
	
	private String countrycode;
	
	private String countryname;
	
	public long getorder() {
		return order;
	}
	
	public void setorder(long order) {
		this.order = order;
	}
	
	public String getcountrycode() {
		return countrycode;
	}
	
	public void setcountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	
	public String getcountryname() {
		return countryname;
	}
	
	public void setcountryname(String countryname) {
		this.countryname = countryname;
	}
	
	public long getsolverid(){
		return solverid;
	}
	
	public void setsolverid(long solverid) {
		this.solverid = solverid;
	}
	
	
	public String getsolvername(){
		return solvername;
	}
	
	public void setsolvername(String solvername) {
		this.solvername = solvername;
	}
	
	public long getsubmits(){
		return submits;
	}
	
	public void setsubmits(long submits) {
		this.submits = submits;
	}
	
	public Date gettime() {
		return time;
	}
	
	public void settime(Date time) {
		this.time = time;
	}
}
