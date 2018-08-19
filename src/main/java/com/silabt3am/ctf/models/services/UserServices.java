package com.silabt3am.ctf.models.services;

import java.util.List;

import com.silabt3am.ctf.pojo.Users;

//用户数据库访问接口
public interface UserServices {
	
	public Users getUserByEmail(String email);
	
	public Users getUserByName(String username);
	
	public int insertNewUser(Users auser);
	
	public int updateUser(Users User);
	
	public Users getUserById(Long id);
	
	public List<Users> getUsersForRank();
	
	public List<Users> getAllUsers();
	
	public int deleteUserById(Long id);
	
	public List<Users> getAllUsersByTeamId(Long teamid);
}

