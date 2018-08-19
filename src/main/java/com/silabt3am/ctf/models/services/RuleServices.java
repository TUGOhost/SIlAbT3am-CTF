package com.silabt3am.ctf.models.services;

import com.silabt3am.ctf.pojo.Rules;

public interface RuleServices {
	public Rules getRulesById(long id);
	
	public int updateRule(Rules newRule);
	
}
