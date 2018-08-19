package com.silabt3am.ctf.models.services.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.silabt3am.ctf.models.dao.IpLogsMapper;
import com.silabt3am.ctf.models.services.IPlogServices;
import com.silabt3am.ctf.pojo.IpLogs;
@Service("IPlogServices")
public class IPlogServicesImpl implements IPlogServices{

	@Resource
	private IpLogsMapper ipLogsMapper;

	public IpLogs getLogsByAddrAndId(String addr, long uid) {
		return ipLogsMapper.selectByAddrAndId(addr, uid);
	}

	public int insertNewLog(IpLogs aLog) {
		return ipLogsMapper.insert(aLog);
		
	}

	public int updateLogInfo(IpLogs newLog) {
		return ipLogsMapper.updateByPrimaryKey(newLog);
		
	}

	@Override
	public long countByUserId(Long userid) {

		return ipLogsMapper.CountByUserId(userid);
	}

	@Override
	public List<IpLogs> getAllIpLogsByUserId(Long userid) {

		return ipLogsMapper.selectByUserid(userid);
	}

	@Override
	public List<IpLogs> getAllOrderByUserId() {

		return ipLogsMapper.selectAllOrderByUserId();
	}

}
