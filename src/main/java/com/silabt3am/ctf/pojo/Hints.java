package com.silabt3am.ctf.pojo;

import java.io.Serializable;
import java.util.Date;

public class Hints implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private Long challengeid;
	
	private String content;
	
	private Date addtime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getChallengeid() {
		return challengeid;
	}

	public void setChallengeid(Long challengeid) {
		this.challengeid = challengeid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	
}
