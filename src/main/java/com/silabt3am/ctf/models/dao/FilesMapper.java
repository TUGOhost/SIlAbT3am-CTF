package com.silabt3am.ctf.models.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.silabt3am.ctf.pojo.Files;
import com.silabt3am.ctf.pojo.FilesExample;
public interface FilesMapper {

    int countByExample(FilesExample example);


    int deleteByExample(FilesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Files record);

    int insertSelective(Files record);

    List<Files> selectByExample(FilesExample example);

    Files selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Files record, @Param("example") FilesExample example);

    int updateByExample(@Param("record") Files record, @Param("example") FilesExample example);

    int updateByPrimaryKeySelective(Files record);

    int updateByPrimaryKey(Files record);
    
    List<Files> SelectFilesByTaskId(Long taskid);
    
    Files selectAFilesNotattachedByName(String filename);
    
    List<Files> SelectAll();
    
}
