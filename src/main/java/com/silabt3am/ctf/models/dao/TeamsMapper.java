package com.silabt3am.ctf.models.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.silabt3am.ctf.pojo.Teams;
import com.silabt3am.ctf.pojo.TeamsExample;
public interface TeamsMapper {

    int countByExample(TeamsExample example);

    int deleteByExample(TeamsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Teams record);

    int insertSelective(Teams record);

    List<Teams> selectByExample(TeamsExample example);

    Teams selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Teams record, @Param("example") TeamsExample example);

    int updateByExample(@Param("record") Teams record, @Param("example") TeamsExample example);

    int updateByPrimaryKeySelective(Teams record);

    int updateByPrimaryKey(Teams record);
    
    Teams selectByTeamName(String teamname);
    
    Teams selectByTeamToken(String teamtoken);
    
    List<Teams> selectAll();
    
    
}
