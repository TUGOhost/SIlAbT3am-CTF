package com.silabt3am.ctf.models.dao;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.silabt3am.ctf.pojo.Rules;
import com.silabt3am.ctf.pojo.RulesExample;
public interface RulesMapper {

    int countByExample(RulesExample example);

    int deleteByExample(RulesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Rules record);

    int insertSelective(Rules record);

    List<Rules> selectByExample(RulesExample example);

    Rules selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Rules record, @Param("example") RulesExample example);

    int updateByExample(@Param("record") Rules record, @Param("example") RulesExample example);

    int updateByPrimaryKeySelective(Rules record);

    int updateByPrimaryKey(Rules record);
}
