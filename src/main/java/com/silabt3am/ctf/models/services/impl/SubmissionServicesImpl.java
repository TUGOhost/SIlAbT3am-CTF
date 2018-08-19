package com.silabt3am.ctf.models.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.silabt3am.ctf.models.dao.SubmissionsMapper;
import com.silabt3am.ctf.models.services.SubmissionServices;
import com.silabt3am.ctf.pojo.Submissions;

//对应表submissions服务实现类
@Service("SubmissionServices")
public class SubmissionServicesImpl implements SubmissionServices {

	
	@Resource
	private SubmissionsMapper submissionsMapper;

	public List<Submissions> getAllCorrectSubmitByTaskId(Long taskid) {

		return submissionsMapper.getCorrectSubmitBytaskId(taskid);
	}

	public List<Submissions> getAllSubmitByUserId(Long userid) {

		return submissionsMapper.getAllSubmitByUserId(userid);
	}

	public int insertNewSubmission(Submissions aSubmission) {

		return submissionsMapper.insert(aSubmission);
	}

	public Submissions getLastCorrectSubmitByUserId(Long userid) {

		return submissionsMapper.selectLastCorrectSubmitByUserId(userid);
	}

	public Long getSolvedByUseridAndTaskId(Long userid, Long taskid) {

		return submissionsMapper.countSolvedByUseridAndTaskId(userid, taskid);
	}

	public Submissions getLastSubmitByUserId(Long userid) {

		return submissionsMapper.selectLastSubmitByUserId(userid);
	}

	@Override
	public List<Submissions> getCorrectSubmitByUserid(Long userid) {

		return submissionsMapper.getCorrectSubmitByUserid(userid);
	}

	@Override
	public Submissions getCorrectByUserIdAndTaskId(Long userid, Long taskid) {

		return submissionsMapper.selectCorrectByUseridAndTaskId(userid, taskid);
	}

	@Override
	public List<Submissions> getAllSubmissions() {

		return submissionsMapper.selectAll();
	}

	@Override
	public Submissions getSubmissionById(Long id) {

		return submissionsMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateSubmission(Submissions newsub) {

		return submissionsMapper.updateByPrimaryKey(newsub);
	}

	@Override
	public int deleteSubmission(Long id) {

		return submissionsMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Long getsubmitTimesByUserIdAndTaskId(Long userid, Long taskid) {

		return submissionsMapper.countSubmitByUserIdAndTaskId(userid, taskid);
	}

	@Override
	public List<Submissions> getAllCorrectAndOrderByUserId() {

		return submissionsMapper.SelectCorrectOrderByUserId();
	}

	@Override
	public List<Submissions> getAllCorrectOrderByTime() {

		return submissionsMapper.SelectCorrectOrderByTime();
	}
	
	
}
