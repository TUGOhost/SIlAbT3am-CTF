package com.silabt3am.ctf.comparators;

import java.util.Comparator;
import java.util.Date;

import com.silabt3am.ctf.pojo.News;

//对日期排序
public class CompareDate {
	public int compare(Object o1,Object o2) {
		Date begin = ((News)o1).getPosttime();
		Date end = ((News)o2).getPosttime();
		if(begin.after(end)) {
			return -1;
		} else {
			if(begin.before(end)) {
				return 1;
			}else {
				return 0;
			}
		}
	}
}
