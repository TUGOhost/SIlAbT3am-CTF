package com.silabt3am.ctf.pojo;

public class SolveList {

	private long taskid;
	
	private String solvestr;
	
	private String tasktitle;
	
	public long gettaskid() {
		return taskid;
	}
	
	public void settaskid(long taskid) {
		this.taskid = taskid;
	}
	
	public String getsolvestr(){
		return solvestr;
	}
	
	public void setsolvestr(String solvestr) {
		this.solvestr = solvestr;
	}
	
	public String gettasktitle(){
		return tasktitle;
	}
	
	public void settakstitle(String tasktitle){
		this.tasktitle = tasktitle;
	}
}
