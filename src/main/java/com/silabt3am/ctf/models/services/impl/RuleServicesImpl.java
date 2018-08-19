package com.silabt3am.ctf.models.services.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.silabt3am.ctf.models.dao.RulesMapper;
import com.silabt3am.ctf.models.services.RuleServices;
import com.silabt3am.ctf.pojo.Rules;

//规则页面实现方法
@Service("RuleServices")
public class RuleServicesImpl implements RuleServices{

	@Resource
	private RulesMapper rulesMapper;

	public Rules getRulesById(long id) {
		return rulesMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateRule(Rules newRule) {

		return rulesMapper.updateByPrimaryKey(newRule);
	}

}
