package com.silabt3am.ctf.pojo;

import java.io.Serializable;
import java.util.Date;

public class News implements Serializable{
	private static final long serialVersionUID = 1L;  
   
    private Long id;

  
    private String title;

   
    private String content;

    
    private Date posttime;

   
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

   
    public String getContent() {
        return content;
    }

  
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    
    public Date getPosttime() {
        return posttime;
    }

    
    public void setPosttime(Date posttime) {
        this.posttime = posttime;
    }
}