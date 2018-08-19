package com.silabt3am.ctf.models.services.impl;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.silabt3am.ctf.models.dao.PassresetMapper;
import com.silabt3am.ctf.models.services.PassResetServices;
import com.silabt3am.ctf.pojo.Passreset;
//密码重置服务的实现类
@Service("PassResetServices")
public class PassResetServicesImpl implements PassResetServices {

	@Resource
	private PassresetMapper passresetMapper;

	public int insertNewtoken(Passreset passreset) {
		
		return passresetMapper.insert(passreset);
	}

	public Passreset getResetRecordBytoken(String token) {

		return passresetMapper.selectBytoken(token);
	}

	public int updateResetRecord(Passreset passreset) {

		return passresetMapper.updateByPrimaryKey(passreset);
	}
	
}

