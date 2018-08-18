package com.silabt3am.ctf.pojo;

import java.io.Serializable;
import java.util.Date;

public class Passreset implements Serializable{
	private Long id;
	
	private Long userid;
	
	private String resettoken;
	
	private Boolean used;
	
	private Date createtime;
	
	private Date expireson;
	
	private Date usedtime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getResettoken() {
		return resettoken;
	}

	public void setResettoken(String resettoken) {
		this.resettoken = resettoken == null ? null : resettoken.trim();
	}

	public Boolean getUsed() {
		return used;
	}

	public void setUsed(Boolean used) {
		this.used = used;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getExpireson() {
		return expireson;
	}

	public void setExpireson(Date expireson) {
		this.expireson = expireson;
	}

	public Date getUsedtime() {
		return usedtime;
	}

	public void setUsedtime(Date usedtime) {
		this.usedtime = usedtime;
	}
	
}
