package com.silabt3am.ctf.models.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.silabt3am.ctf.models.dao.OperatelogMapper;
import com.silabt3am.ctf.models.services.OperateLogServices;
import com.silabt3am.ctf.pojo.Operatelog;

//后台操作日志服务的实现类
@Service("OperateLogServices")
public class OperateLogServicesImpl implements OperateLogServices{
	
	@Resource
	private OperatelogMapper operatelogMapper;


	@Override
	public int insertNewlog(Operatelog alog) {

		return operatelogMapper.insert(alog);
	}

	@Override
	public List<Operatelog> getAllLogs() {

		return operatelogMapper.selectAll();
	}
	
	
}

