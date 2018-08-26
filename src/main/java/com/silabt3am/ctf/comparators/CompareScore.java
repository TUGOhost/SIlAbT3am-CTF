package com.silabt3am.ctf.comparators;

import java.util.Comparator;
import java.util.Date;

import com.silabt3am.ctf.pojo.RanklistObj;

//用户得分排序
public class CompareScore implements Comparator {
	public int compare(Object o1,Object o2) {
		long score1 = ((RanklistObj) o1).getuserobj().getScore();
		long score2 = ((RanklistObj) o2).getuserobj().getScore();
		Date submit1 = ((RanklistObj) o1).getLastSummit();
		Date submit2 = ((RanklistObj) 02).getLastSummit();
		if(score>score2) {
			return -1;
		}else {
			if(score1<score2) {
				return 1;
			}else {
				if(submit1.before(submit2)) {
					return 1;
				}else {
					return 0;
				}
			}
		}
	}

}
