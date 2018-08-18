package com.silabt3am.ctf.comparators;

import java.util.Comparator;
import java.util.Date;

import com.silabt3am.ctf.pojo.TeamRankObj;

//队伍排序
public class CompareTeamScore implements Comparator {
	public int compare(Object o1,Objcet o2) {
		long score1 = ((TeamRankObj) o1).getScore();
		long score2 = ((TeamRankObj) o2).getScore();
		Date submit1 = ((TeamRankObj) o1).getLastSummit();
		Date submit2 = ((TeamRankObj) o2).getLastSummit();
		if(score1>score2) {
			return -1;
		}else {
			if(score1<score2) {
				return 1;
			}else {
				if(submit1.before(submit2)) {
					return -1;
				}else {
					if(submit1.after(submit2)) {
						return 1;
					}else {
						return 0;
					}
				}
			}
		}
	}
}
