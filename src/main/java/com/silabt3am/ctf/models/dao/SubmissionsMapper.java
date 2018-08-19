package com.silabt3am.ctf.models.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.silabt3am.ctf.pojo.Submissions;
import com.silabt3am.ctf.pojo.SubmissionsExample;
public interface SubmissionsMapper {

    int countByExample(SubmissionsExample example);

    int deleteByExample(SubmissionsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Submissions record);

    int insertSelective(Submissions record);

    List<Submissions> selectByExample(SubmissionsExample example);

    Submissions selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Submissions record, @Param("example") SubmissionsExample example);

    int updateByExample(@Param("record") Submissions record, @Param("example") SubmissionsExample example);

    int updateByPrimaryKeySelective(Submissions record);

    int updateByPrimaryKey(Submissions record);
    
    List<Submissions> getCorrectSubmitBytaskId(Long taskid);
    
    List<Submissions> getCorrectSubmitByUserid(Long userid);
    
    List<Submissions> getAllSubmitByUserId(Long userid);
    
    Submissions selectLastCorrectSubmitByUserId(Long id);
    
    Submissions selectLastSubmitByUserId(Long id);
    
    Long countSolvedByUseridAndTaskId(@Param("userid") Long userid,@Param("taskid") Long taskid);
    
    Submissions selectCorrectByUseridAndTaskId(@Param("userid") Long userid,@Param("taskid") Long taskid);
    
    List<Submissions> selectAll();
    
    Submissions selectExtraSubmitByUserId(Long id);
    
    Long countSubmitByUserIdAndTaskId(@Param("userid") Long userid,@Param("taskid") Long taskid);
    
    List<Submissions> SelectCorrectOrderByUserId();
    
    List<Submissions> SelectCorrectOrderByTime();
}
