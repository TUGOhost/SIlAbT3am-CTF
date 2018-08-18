package com.silabt3am.ctf.pojo;

import java.io.Serializable;

public class BannedIps implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String ipAddr;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIpAddr() {
		return ipAddr;
	}

	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr == null ? null : ipAddr.trim();
	}

	
	
	
}
