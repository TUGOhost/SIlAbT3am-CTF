package com.silabt3am.ctf.models.services.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.silabt3am.ctf.models.dao.TeamsMapper;
import com.silabt3am.ctf.models.services.TeamServices;
import com.silabt3am.ctf.pojo.Teams;

//队伍查询服务的实现类
@Service("TeamServices")
public class TeamServicesImpl implements TeamServices {
	@Resource 
	private TeamsMapper teamsMapper;

	@Override
	public Teams getTeamById(Long id) {
		return teamsMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int createANewTeam(Teams ateam) {

		return teamsMapper.insert(ateam);
	}
	
	@Override
	public Teams getTeamByName(String teamname) {

		return teamsMapper.selectByTeamName(teamname);
	}
	
	@Override
	public Teams getTeamByToken(String teamtoken) {

		return teamsMapper.selectByTeamToken(teamtoken);
	}

	@Override
	public int updateTeamInfo(Teams team) {

		return teamsMapper.updateByPrimaryKey(team);
	}
	
	@Override
	public int deleteTeamById(Long id) {

		return teamsMapper.deleteByPrimaryKey(id);
	}
	
	@Override
	public List<Teams> getAllTeams() {

		return teamsMapper.selectAll();
	}
}
