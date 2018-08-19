package com.silabt3am.ctf.models.services;
import com.silabt3am.ctf.pojo.Passreset;

public interface PassResetServices {
	public int insertNewtoken(Passreset passreset);
	
	public Passreset getResetRecordBytoken(String token);
	
	public int updateResetRecord(Passreset passreset);
}
