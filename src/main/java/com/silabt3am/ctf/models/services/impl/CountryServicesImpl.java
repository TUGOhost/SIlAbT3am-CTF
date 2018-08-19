package com.silabt3am.ctf.models.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.silabt3am.ctf.models.dao.CountriesMapper;
import com.silabt3am.ctf.models.services.CountryServices;
import com.silabt3am.ctf.pojo.Countries;
@Service("CountryServices")
public class CountryServicesImpl implements CountryServices {

	@Resource
	private CountriesMapper countriesMapper;

	public List<Countries> SelectAllCountry() {
		return countriesMapper.SelectAll();
	}

	public Countries getCountryById(Long id) {

		return countriesMapper.selectByPrimaryKey(id);
	}

	@Override
	public Countries getCountryByCode(String code) {
		
		return countriesMapper.selectCountryByCode(code);
	}
	
}
