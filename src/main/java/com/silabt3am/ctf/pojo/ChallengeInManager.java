package com.silabt3am.ctf.pojo;

import java.util.Date;

public class ChallengeInManager {
	private Long id;
	
	private String title;
	
	private Long score;
	
	private String catename;
	
	private String catemark;
	
	private Date available;
	
	private Date invalidate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public Long getScore() {
		return score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	public String getCatename() {
		return catename;
	}

	public void setCatename(String catename) {
		this.catename = catename;
	}

	public String getCatemark() {
		return catemark;
	}

	public void setCatemark(String catemark) {
		this.catemark = catemark;
	}

	public Date getAvailable() {
		return available;
	}

	public void setAvailable(Date available) {
		this.available = available;
	}

	public Date getInvalidate() {
		return invalidate;
	}

	public void setInvalidate(Date invalidate) {
		this.invalidate = invalidate;
	}
	
	
}
