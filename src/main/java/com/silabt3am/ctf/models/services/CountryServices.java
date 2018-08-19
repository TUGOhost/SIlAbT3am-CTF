package com.silabt3am.ctf.models.services;
import java.util.List;
import com.silabt3am.ctf.pojo.Countries;

public interface CountryServices {
	public List<Countries> SelectAllCountry(); 
	
	public Countries getCountryById(Long id);
	
	public Countries getCountryByCode(String code);
}