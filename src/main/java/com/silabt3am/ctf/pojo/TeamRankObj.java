package com.silabt3am.ctf.pojo;

import java.util.Date;

public class TeamRankObj extends Teams{
	public TeamRankObj(Teams initteam) {
		this.setCountryid(initteam.getCountryid());
		this.setCreatetime(initteam.getCreatetime());
		this.setDescription(initteam.getDescription());
		this.setId(initteam.getId());
		this.setIsenabled(initteam.getIsenabled());
		this.setName(initteam.getName());
		this.setOrganization(initteam.getOrganization());
		this.setScore(initteam.getScore());
		this.setTeamtoken(initteam.getTeamtoken());
	}
	
	private Date LastSummit;
	
	public Date getLastSummit() {
		return LastSummit;
	}
	
	public void setLastSummit(Date LastSummit) {
		this.LastSummit = LastSummit;
	}
}
