package com.silabt3am.ctf.pojo;

import java.io.Serializable;

public class Files implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String filename;
	
	private String addby;
	
	private Long size;
	
	private String md5;
	
	private Long challengeid;
	
	private String resindex;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename == null ? null : filename.trim();
	}

	public String getAddby() {
		return addby;
	}

	public void setAddby(String addby) {
		this.addby = addby == null ? null : addby.trim();
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5 == null ? null : md5.trim();
	}

	public Long getChallengeid() {
		return challengeid;
	}

	public void setChallengeid(Long challengeid) {
		this.challengeid = challengeid;
	}

	public String getResindex() {
		return resindex;
	}

	public void setResindex(String resindex) {
		this.resindex = resindex == null ? null : resindex.trim();
	}

	
	
	
}
