package com.silabt3am.ctf.models.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.silabt3am.ctf.pojo.Config;
import com.silabt3am.ctf.pojo.ConfigExample;
public interface ConfigMapper {

    int countByExample(ConfigExample example);


    int deleteByExample(ConfigExample example);


    int deleteByPrimaryKey(Long id);


    int insert(Config record);


    int insertSelective(Config record);

    List<Config> selectByExample(ConfigExample example);


    Config selectByPrimaryKey(Long id);


    int updateByExampleSelective(@Param("record") Config record, @Param("example") ConfigExample example);


    int updateByExample(@Param("record") Config record, @Param("example") ConfigExample example);


    int updateByPrimaryKeySelective(Config record);


    int updateByPrimaryKey(Config record);
    
    List<Config> selectAllConfig();
}
