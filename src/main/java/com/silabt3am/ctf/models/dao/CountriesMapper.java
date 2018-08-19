package com.silabt3am.ctf.models.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.silabt3am.ctf.pojo.Countries;
import com.silabt3am.ctf.pojo.CountriesExample;
public interface CountriesMapper {

    int countByExample(CountriesExample example);


    int deleteByExample(CountriesExample example);


    int deleteByPrimaryKey(Long id);


    int insert(Countries record);


    int insertSelective(Countries record);


    List<Countries> selectByExample(CountriesExample example);


    Countries selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Countries record, @Param("example") CountriesExample example);

    int updateByExample(@Param("record") Countries record, @Param("example") CountriesExample example);


    int updateByPrimaryKeySelective(Countries record);


    int updateByPrimaryKey(Countries record);
    
    List<Countries> SelectAll();
    
    Countries selectCountryByCode(String countrycode);
  
}
