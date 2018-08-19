package com.silabt3am.ctf.models.services;
import java.util.List;
import com.silabt3am.ctf.pojo.Operatelog;

public interface OperateLogServices {
	public int insertNewlog(Operatelog alog);
	
	public List<Operatelog> getAllLogs();
	
	
}
