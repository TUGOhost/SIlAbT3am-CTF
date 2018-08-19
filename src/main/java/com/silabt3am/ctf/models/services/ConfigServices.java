package com.silabt3am.ctf.models.services;
import java.util.List;
import java.util.Map;
import com.silabt3am.ctf.pojo.Config;

public interface ConfigServices {
	
	public Map<String,String> getSysConfig();
	
	public List<Config> getAllConfigObjs();
	
	public int updateConfig(Config config);
	
}
