package com.silabt3am.ctf.models.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.silabt3am.ctf.pojo.BannedIps;
import com.silabt3am.ctf.pojo.BanedIpsExample;
public interface BannedIpsMapper {

    int countByExample(BannedIpsExample example);


    int deleteByExample(BannedIpsExample example);


    int deleteByPrimaryKey(Long id);


    int insert(BannedIps record);


    int insertSelective(BannedIps record);


    List<BannedIps> selectByExample(BannedIpsExample example);


    BannedIps selectByPrimaryKey(Long id);


    int updateByExampleSelective(@Param("record") BannedIps record, @Param("example") BannedIpsExample example);


    int updateByExample(@Param("record") BannedIps record, @Param("example") BannedIpsExample example);


    int updateByPrimaryKeySelective(BannedIps record);


    int updateByPrimaryKey(BannedIps record);
    
    BannedIps selectByIpAddr(String ip);
    
    List<BannedIps> selectAll();
    
}