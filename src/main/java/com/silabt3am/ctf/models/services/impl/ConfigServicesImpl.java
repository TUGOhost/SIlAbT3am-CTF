package com.silabt3am.ctf.models.services.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.silabt3am.ctf.models.dao.ConfigMapper;
import com.silabt3am.ctf.models.services.ConfigServices;
import com.silabt3am.ctf.pojo.Config;
@Service("ConfigServices")
public class ConfigServicesImpl implements ConfigServices{

	
	@Resource
	private ConfigMapper configMapper;

	@Override
	public Map<String, String> getSysConfig() {

		Map<String, String> configs = new HashMap<String, String>();
		List<Config> allconf = configMapper.selectAllConfig();
		
		for (Config conf:allconf) {
			configs.put(conf.getVarname(), conf.getVarvalue());
		}
		return configs;
	}

	@Override
	public List<Config> getAllConfigObjs() {

		return configMapper.selectAllConfig();
	}

	@Override
	public int updateConfig(Config config) {

		return configMapper.updateByPrimaryKey(config);
	}
	
}
