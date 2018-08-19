package com.silabt3am.ctf.models.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.silabt3am.ctf.pojo.Categories;
import com.silabt3am.ctf.pojo.CategoriesExample;
public interface CategoriesMapper {

    int countByExample(CategoriesExample example);


    int deleteByExample(CategoriesExample example);


    int deleteByPrimaryKey(Long id);


    int insert(Categories record);


    int insertSelective(Categories record);


    List<Categories> selectByExample(CategoriesExample example);


    Categories selectByPrimaryKey(Long id);


    int updateByExampleSelective(@Param("record") Categories record, @Param("example") CategoriesExample example);


    int updateByExample(@Param("record") Categories record, @Param("example") CategoriesExample example);


    int updateByPrimaryKeySelective(Categories record);


    int updateByPrimaryKey(Categories record);
    
    List<Categories> selectAll();
}
