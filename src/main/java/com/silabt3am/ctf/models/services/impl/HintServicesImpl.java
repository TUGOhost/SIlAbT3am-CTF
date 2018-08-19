package com.silabt3am.ctf.models.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.silabt3am.ctf.models.dao.HintsMapper;
import com.silabt3am.ctf.models.services.HintServices;
import com.silabt3am.ctf.pojo.Hints;

//Hints表段服务实现类
@Service("HintServices")
public class HintServicesImpl implements HintServices {

	@Resource
	private HintsMapper hintsMapper;

	public List<Hints> getHintsByTaskId(Long id) {
		
		return hintsMapper.selectHintsByTaskId(id);
	}

	@Override
	public int createNewHint(Hints hint) {

		return hintsMapper.insert(hint);
	}

	@Override
	public List<Hints> getAllHints() {

		return hintsMapper.selectAll();
	}

	@Override
	public Hints getHintById(Long id) {

		return hintsMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateHint(Hints hint) {
		
		return hintsMapper.updateByPrimaryKey(hint);
	}

	@Override
	public int deleteById(Long id) {
		
		return hintsMapper.deleteByPrimaryKey(id);
	}

}
