package com.silabt3am.ctf.pojo;

import java.io.Serializable;
import java.util.Date;

public class IpLogs implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private Object ipaddr;
	
	private Long userid;
	
	private Date added;
	
	private Date lastused;
	
	private Long timeused;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Object getIpaddr() {
		return ipaddr;
	}

	public void setIpaddr(Object ipaddr) {
		this.ipaddr = ipaddr;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public Date getAdded() {
		return added;
	}

	public void setAdded(Date added) {
		this.added = added;
	}

	public Date getLastused() {
		return lastused;
	}

	public void setLastused(Date lastused) {
		this.lastused = lastused;
	}

	public Long getTimeused() {
		return timeused;
	}

	public void setTimeused(Long timeused) {
		this.timeused = timeused;
	}

	
	
}
