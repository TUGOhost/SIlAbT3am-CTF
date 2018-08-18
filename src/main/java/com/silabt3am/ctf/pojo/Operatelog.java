package com.silabt3am.ctf.pojo;

import java.io.Serializable;
import java.util.Date;

public class Operatelog implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private Long operatorid;
	
	private String operatefunc;
	
	private Date operatetime;
	
	private String ipaddr;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOperatorid() {
		return operatorid;
	}

	public void setOperatorid(Long operatorid) {
		this.operatorid = operatorid;
	}

	public String getOperatefunc() {
		return operatefunc;
	}

	public void setOperatefunc(String operatefunc) {
		this.operatefunc = operatefunc == null ? null : operatefunc.trim();
	}

	public Date getOperatetime() {
		return operatetime;
	}

	public void setOperatetime(Date operatetime) {
		this.operatetime = operatetime;
	}

	public String getIpaddr() {
		return ipaddr;
	}

	public void setIpaddr(String ipaddr) {
		this.ipaddr = ipaddr == null ? null : ipaddr.trim();
	}

	
}
