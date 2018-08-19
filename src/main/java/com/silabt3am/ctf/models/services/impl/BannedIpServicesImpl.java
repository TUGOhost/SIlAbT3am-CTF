package com.silabt3am.ctf.models.services.impl;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.silabt3am.ctf.models.dao.BannedIpsMapper;
import com.silabt3am.ctf.models.services.BannedIpServices;
import com.silabt3am.ctf.pojo.BannedIps;

@Service("BannedIpServices")
public class BannedIpServicesImpl implements BannedIpServices{

	@Resource
	private BannedIpsMapper bannedIpsMapper;

	public BannedIps getRecordByIp(String ip) {

		return bannedIpsMapper.selectByIpAddr(ip);
	}

	@Override
	public int deleteRecordById(Long id) {

		return bannedIpsMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateRecord(BannedIps ip) {

		return bannedIpsMapper.updateByPrimaryKey(ip);
	}

	@Override
	public int insertIpRecord(BannedIps newip) {

		return bannedIpsMapper.insert(newip);
	}

	@Override
	public List<BannedIps> getAllIps() {

		return bannedIpsMapper.selectAll();
	}

	@Override
	public BannedIps getRecordById(Long id) {

		return bannedIpsMapper.selectByPrimaryKey(id);
	}
	
}