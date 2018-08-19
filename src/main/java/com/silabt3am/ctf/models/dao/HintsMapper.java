package com.silabt3am.ctf.models.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.silabt3am.ctf.pojo.Hints;
import com.silabt3am.ctf.pojo.HintsExample;
public interface HintsMapper {

    int countByExample(HintsExample example);


    int deleteByExample(HintsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Hints record);

    int insertSelective(Hints record);

    List<Hints> selectByExample(HintsExample example);

    Hints selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Hints record, @Param("example") HintsExample example);

    int updateByExample(@Param("record") Hints record, @Param("example") HintsExample example);

    int updateByPrimaryKeySelective(Hints record);

    int updateByPrimaryKey(Hints record);
    
    List<Hints> selectHintsByTaskId(Long id);
    
    List<Hints> selectAll();
    
}
