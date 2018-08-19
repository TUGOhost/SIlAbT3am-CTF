package com.silabt3am.ctf.models.services;
import java.util.List;
import com.silabt3am.ctf.pojo.IpLogs;


public interface IPlogServices {
	public IpLogs getLogsByAddrAndId(String addr,long uid);
	
	public int insertNewLog(IpLogs aLog);
	
	public int updateLogInfo(IpLogs newLog);
	
	public long countByUserId(Long userid);
	
	public List<IpLogs> getAllIpLogsByUserId(Long userid);
	
	public List<IpLogs> getAllOrderByUserId();
}
