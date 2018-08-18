package com.silabt3am.ctf.pojo;

import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable {
	private static final long serialVersionUID = 1L;  
    
    private Long id;

   
    private String username;

    private String password;

    
    private String email;

   
    private String phone;

   
    private String organization;

    
    private Long countryid;

    
    private String description;

    
    private Boolean isenabled;

    
    private Long score;

    
    private String token;

    
    private String salt;

    
    private Date regtime;

    
    private Date lastactive;

    
    private String role;

   
    private Long teamid;

    public Long getId() {
        return id;
    }

    
    public void setId(Long id) {
        this.id = id;
    }

    
    public String getUsername() {
        return username;
    }

    
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    
    public String getPhone() {
        return phone;
    }

    
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    
    public String getOrganization() {
        return organization;
    }

    
    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

   
    public Long getCountryid() {
        return countryid;
    }

    
    public void setCountryid(Long countryid) {
        this.countryid = countryid;
    }

    
    public String getDescription() {
        return description;
    }

   
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    
    public Boolean getIsenabled() {
        return isenabled;
    }

   
    public void setIsenabled(Boolean isenabled) {
        this.isenabled = isenabled;
    }

  
    public Long getScore() {
        return score;
    }

    
    public void setScore(Long score) {
        this.score = score;
    }

    
    public String getToken() {
        return token;
    }

    
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    
    public String getSalt() {
        return salt;
    }

    
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    
    public Date getRegtime() {
        return regtime;
    }

    
    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    
    public Date getLastactive() {
        return lastactive;
    }

    
    public void setLastactive(Date lastactive) {
        this.lastactive = lastactive;
    }

   
    public String getRole() {
        return role;
    }

  
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    
    public Long getTeamid() {
        return teamid;
    }

    
    public void setTeamid(Long teamid) {
        this.teamid = teamid;
    }
}
