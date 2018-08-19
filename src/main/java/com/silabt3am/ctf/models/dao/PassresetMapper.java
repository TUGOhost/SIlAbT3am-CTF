package com.silabt3am.ctf.models.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.silabt3am.ctf.pojo.Passreset;
import com.silabt3am.ctf.pojo.PassresetExample;
public interface PassresetMapper {

    int countByExample(PassresetExample example);

    int deleteByExample(PassresetExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Passreset record);

    int insertSelective(Passreset record);

    List<Passreset> selectByExample(PassresetExample example);

    Passreset selectByPrimaryKey(Long id);
    
    Passreset selectBytoken(String token);

    int updateByExampleSelective(@Param("record") Passreset record, @Param("example") PassresetExample example);


    int updateByExample(@Param("record") Passreset record, @Param("example") PassresetExample example);

    int updateByPrimaryKeySelective(Passreset record);

    int updateByPrimaryKey(Passreset record);
}
