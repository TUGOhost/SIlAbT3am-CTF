package com.silabt3am.ctf.pojo;

import java.util.Date;

public class Teams {
	private Long id;
	
	private String name;
	
	private String teamtoken;
	
	private Long score;
	
	private String organization;
	
	private String description;
	
	private Boolean isenabled;
	
	private Date createtime;
	
	private Long countryid;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getTeamtoken() {
		return teamtoken;
	}

	public void setTeamtoken(String teamtoken) {
		this.teamtoken = teamtoken == null ? null : teamtoken.trim();
	}

	public Long getScore() {
		return score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization == null ? null : organization.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public Boolean getIsenabled() {
		return isenabled;
	}

	public void setIsenabled(Boolean isenabled) {
		this.isenabled = isenabled;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Long getCountryid() {
		return countryid;
	}

	public void setCountryid(Long countryid) {
		this.countryid = countryid;
	}
}
