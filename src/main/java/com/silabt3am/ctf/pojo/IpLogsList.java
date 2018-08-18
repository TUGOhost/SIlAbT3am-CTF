package com.silabt3am.ctf.pojo;

public class IpLogsList extends IpLogs{
	public IpLogsList(IpLogs anip) {
		this.setAdded(anip.getAdded());
		this.setId(anip.getId());
		this.setIpaddr(anip.getIpaddr());
		this.setLastused(anip.getLastused());
		this.setTimesused(anip.getTimesused());
		this.setUserid(anip.getUserid());
	}
	
	private String usedby;
	
	public String getusedby() {
		return usedby;
	}
	
	public void setusedby(String usedby) {
		this.usedby = usedby;
	}

}
