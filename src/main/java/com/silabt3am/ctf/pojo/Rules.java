package com.silabt3am.ctf.pojo;
import java.io.Serializable;

public class Rules implements Serializable{
	private static final long serialVersionUID = 1L;  

    private Long id;

    private String content;

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}