package com.silabt3am.ctf.utils;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.silabt3am.ctf.models.services.OperateLogServices;
import com.silabt3am.ctf.pojo.Operatelog;
import com.silabt3am.ctf.pojo.Users;

public class LogUtils {

	
	public static void recordOperateLog(HttpServletRequest request,Users userobj,OperateLogServices operatelogServices,String logcontent) {
		String userip = request.getRemoteAddr(); 
		Date current = new Date();
		Operatelog alog = new Operatelog();
		alog.setIpaddr(userip);
		alog.setOperatefunc(logcontent);
		alog.setOperatetime(current);
		alog.setOperatorid(userobj.getId());
		
		operatelogServices.insertNewlog(alog);
	}
}
