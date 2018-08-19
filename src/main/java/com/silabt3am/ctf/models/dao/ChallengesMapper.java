package com.silabt3am.ctf.models.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.silabt3am.ctf.pojo.Challenges;
import com.silabt3am.ctf.pojo.ChallengeInManager;
public interface ChallengesMapper {

    int countByExample(ChallengesExample example);


    int deleteByExample(ChallengesExample example);


    int deleteByPrimaryKey(Long id);


    int insert(Challenges record);


    int insertSelective(Challenges record);


    List<Challenges> selectByExample(ChallengesExample example);


    Challenges selectByPrimaryKey(Long id);


    int updateByExampleSelective(@Param("record") Challenges record, @Param("example") ChallengesExample example);


    int updateByExample(@Param("record") Challenges record, @Param("example") ChallengesExample example);


    int updateByPrimaryKeySelective(Challenges record);


    int updateByPrimaryKey(Challenges record);
    
    List<Challenges> selectAll();
    
    List<Challenges> selectChallengesByCateId(Long cateid);
    
    List<Challenges> selectByCategoryId(Long cateid);
    
}
