package com.silabt3am.ctf.pojo;

import java.io.Serializable;
import java.util.Date;

public class Challenges implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String title;
	
	private String description;
	
	private String attachids;
	
	private Long score;
	
	private Long categoryid;
	
	private String flag;
	
	private Boolean exposed;
	
	private Date available;
	
	private Date invalidate;
	
	private String watchby;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public String getAttachids() {
		return attachids;
	}

	public void setAttachids(String attachids) {
		this.attachids = attachids == null ? null :attachids.trim();
	}

	public Long getScore() {
		return score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	public Long getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag == null ? null : flag.trim();
	}

	public Boolean getExposed() {
		return exposed;
	}

	public void setExposed(Boolean exposed) {
		this.exposed = exposed;
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

	public String getWatchby() {
		return watchby;
	}

	public void setWatchby(String watchby) {
		this.watchby = watchby == null ? null : watchby.trim();
	}

	
	
}
