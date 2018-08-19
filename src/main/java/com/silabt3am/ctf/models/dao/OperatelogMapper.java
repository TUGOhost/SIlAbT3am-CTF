package com.silabt3am.ctf.models.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.silabt3am.ctf.pojo.Operatelog;
import com.silabt3am.ctf.pojo.OperatelogExample;
public interface OperatelogMapper {

    int countByExample(OperatelogExample example);

    int deleteByExample(OperatelogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Operatelog record);

    int insertSelective(Operatelog record);

    List<Operatelog> selectByExample(OperatelogExample example);

    Operatelog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Operatelog record, @Param("example") OperatelogExample example);

    int updateByExample(@Param("record") Operatelog record, @Param("example") OperatelogExample example);


    int updateByPrimaryKeySelective(Operatelog record);


    int updateByPrimaryKey(Operatelog record);
    
    
    List<Operatelog> selectAll();
    
}
