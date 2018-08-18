package com.silabt3am.ctf.pojo;

//按分类统计的进度
public class CateProcess {
	private String name;
	
	private long proc;
	
	private long total;
	
	private double percent;
	
	private String style;
	
	private double percentall;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getProc() {
		return proc;
	}

	public void setProc(long proc) {
		this.proc = proc;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public double getPercentall() {
		return percentall;
	}

	public void setPercentall(double percentall) {
		this.percentall = percentall;
	}
	
}
