package com.silabt3am.ctf.models.services;

import java.util.List;

import com.silabt3am.ctf.pojo.Submissions;

//用户提交答案记录的Services
public interface SubmissionServices {

	public List<Submissions> getAllCorrectSubmitByTaskId(Long taskid);
	
	public List<Submissions> getAllSubmitByUserId(Long userid);
	
	public int insertNewSubmission(Submissions aSubmission);
	
	public Submissions getLastCorrectSubmitByUserId(Long userid);
	
	public Long getSolvedByUseridAndTaskId(Long userid,Long taskid);
	
	public Submissions getLastSubmitByUserId(Long userid);
	
	public List<Submissions> getCorrectSubmitByUserid(Long userid);
	
	public Submissions getCorrectByUserIdAndTaskId(Long userid,Long taskid);
	
	public List<Submissions> getAllSubmissions();
	
	public List<Submissions> getAllCorrectAndOrderByUserId();
	
	public Submissions getSubmissionById(Long id);
	
	public int updateSubmission(Submissions newsub);
	
	public int deleteSubmission(Long id);
	
	public Long getsubmitTimesByUserIdAndTaskId(Long userid,Long taskid);
	
	public List<Submissions> getAllCorrectOrderByTime();
}
