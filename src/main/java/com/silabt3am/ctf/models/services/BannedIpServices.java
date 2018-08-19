package com.silabt3am.ctf.models.services;
import java.util.List;
import com.silabt3am.ctf.pojo.BannedIps;

public interface BannedIpServices {
	
	public BannedIps getRecordByIp(String ip);
	
	public List<BannedIps> getAllIps();
	
	public int deleteRecordById(Long id);
	
	public int updateRecord(BannedIps ip);
	
	public int insertIpRecord(BannedIps newip);
	
	public BannedIps getRecordById(Long id);
	
}
