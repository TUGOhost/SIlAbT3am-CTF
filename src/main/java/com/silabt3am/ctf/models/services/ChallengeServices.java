package com.silabt3am.ctf.models.services;
import java.util.List;
import com.silabt3am.ctf.pojo.Challenges;

public interface ChallengeServices {

	public List<Challenges> getAllAvailChallenges();
	
	public int updateChallenge(Challenges challenge);
	
	public Challenges getChallengeById(Long id);
	
	public Long getCateScoreByCateId(Long cateid);
	
	public List<Challenges> getAllChallenges();
	
	public int createNewChallenge(Challenges challenge);
	
	public List<Challenges> getAllChallengesInCateById(Long id);
	
	public int deleteChallengeById(Long id);
}
