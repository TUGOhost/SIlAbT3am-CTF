package com.silabt3am.ctf.models.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.silabt3am.ctf.pojo.Users;
import com.silabt3am.ctf.pojo.UsersExample;

public interface UsersMapper {

    int countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
    
    Users selectByEmail(String email);
    
    Users selectByName(String username);
    
    List<Users> selectUsersForRank();
    
    List<Users> SelectAll();
    
    List<Users> selectAllUsersInTeamByTeamId(Long teamid);
    
}