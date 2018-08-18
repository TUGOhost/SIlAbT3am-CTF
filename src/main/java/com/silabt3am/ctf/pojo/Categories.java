package com.silabt3am.ctf.pojo;

import java.io.Serializable;

public class Categories {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String name;
	
	private String mark;

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

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark == null ? null : mark.trim();
	}

	@Override
	public int hashCode() {
		return id.intValue();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Categories other = (Categories) obj;
		if(id!=other.id)
			return false;
		return true;
	}
}
