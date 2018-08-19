package com.silabt3am.ctf.models.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.silabt3am.ctf.models.dao.UsersMapper;
import com.silabt3am.ctf.models.services.UserServices;
import com.silabt3am.ctf.pojo.Users;

@Service("UserServices")
public class UserServiceImpl implements UserServices {

	@Resource
	private UsersMapper usersMapper;
	
	public Users getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return usersMapper.selectByEmail(email);
	}

	
	public int insertNewUser(Users auser) {
		
		return usersMapper.insert(auser);
	}

	
	public Users getUserByName(String username) {

		return usersMapper.selectByName(username);
	}


	public int updateUser(Users User) {
		
		return usersMapper.updateByPrimaryKey(User);
	}

	
	public Users getUserById(Long id) {

		return usersMapper.selectByPrimaryKey(id);
	}

	public List<Users> getUsersForRank() {

		return usersMapper.selectUsersForRank();
	}

	@Override
	public List<Users> getAllUsers() {

		return usersMapper.SelectAll();
	}

	@Override
	public int deleteUserById(Long id) {

		return usersMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Users> getAllUsersByTeamId(Long teamid) {

		return usersMapper.selectAllUsersInTeamByTeamId(teamid);
	}
}
