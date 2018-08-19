package com.silabt3am.ctf.models.services;
import java.util.List;
import com.silabt3am.ctf.pojo.Hints;

public interface HintServices {
	public List<Hints> getHintsByTaskId(Long id);
	
	public int createNewHint(Hints hint);
	
	public List<Hints> getAllHints();
	
	public Hints getHintById(Long id);
	
	public int updateHint(Hints hint);
	
	public int deleteById(Long id);
}