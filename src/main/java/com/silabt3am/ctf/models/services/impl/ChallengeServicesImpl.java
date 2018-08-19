package com.silabt3am.ctf.models.services.impl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.silabt3am.ctf.models.dao.ChallengesMapper;
import com.silabt3am.ctf.models.services.ChallengeServices;
import com.silabt3am.ctf.pojo.Challenges;
import com.silabt3am.ctf.utils.CommonUtils;
@Service("ChallengeServices")
public class ChallengeServicesImpl implements ChallengeServices{

	@Resource
	private ChallengesMapper challengesMapper;
	@Resource
	private ConfigServices configServices;

	public List<Challenges> getAllAvailChallenges() {
		
		List<Challenges> allchallenges = challengesMapper.selectAll();
		ArrayList<Challenges> availchalls = new ArrayList<Challenges>();
		Date currenttime = new Date();
		for (Challenges ch:allchallenges) {
			if (ch.getExposed() && currenttime.after(ch.getAvailable())){
				Date globalstart = CommonUtils.getStartDate(configServices);
				if (globalstart!=null && currenttime.before(globalstart)) {
					continue;
				}
				availchalls.add(ch);
			}
		}
		return availchalls;
	}

	public int updateChallenge(Challenges challenge) {

		return challengesMapper.updateByPrimaryKey(challenge);
	}

	public Challenges getChallengeById(Long id) {

		return challengesMapper.selectByPrimaryKey(id);
	}

	@Override
	public Long getCateScoreByCateId(Long cateid) {
		
		List<Challenges> catechalls = challengesMapper.selectChallengesByCateId(cateid);
		long score = 0;
		Date currenttime = new Date();
		for (Challenges ch:catechalls) {
			if (ch.getExposed() && currenttime.after(ch.getAvailable())){
				score += ch.getScore();
			}
		}
		return score;
	}

	@Override
	public List<Challenges> getAllChallenges() {
		
		return challengesMapper.selectAll();
	}

	@Override
	public int createNewChallenge(Challenges challenge) {

		return challengesMapper.insert(challenge);
	}

	@Override
	public List<Challenges> getAllChallengesInCateById(Long id) {

		return challengesMapper.selectByCategoryId(id);
	}

	@Override
	public int deleteChallengeById(Long id) {

		return challengesMapper.deleteByPrimaryKey(id);
	}

}

