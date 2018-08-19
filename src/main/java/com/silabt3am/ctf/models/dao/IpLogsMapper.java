package com.silabt3am.ctf.models.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.silabt3am.ctf.pojo.IpLogs;
import com.silabt3am.ctf.pojo.IpLogsExample;
public interface IpLogsMapper {

    int countByExample(IpLogsExample example);

    int deleteByExample(IpLogsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(IpLogs record);

    int insertSelective(IpLogs record);

    List<IpLogs> selectByExample(IpLogsExample example);

    IpLogs selectByPrimaryKey(Long id);
    
    IpLogs selectByAddrAndId(@Param("addr")String addr,@Param("userid")Long userid);

    int updateByExampleSelective(@Param("record") IpLogs record, @Param("example") IpLogsExample example);

    int updateByExample(@Param("record") IpLogs record, @Param("example") IpLogsExample example);

    int updateByPrimaryKeySelective(IpLogs record);

    int updateByPrimaryKey(IpLogs record);
    
    Long CountByUserId(Long userid);
    
    List<IpLogs> selectByUserid(Long userid);
    
    List<IpLogs> selectAllOrderByUserId();
}
