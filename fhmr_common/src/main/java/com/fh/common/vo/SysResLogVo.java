package com.fh.common.vo;

public class SysResLogVo {
	/**
	 * 资源名称
	 */
	private String resName;
	/**
	 * 操作说明
	 */
	private String logNote;
	/**
	 * 操作人
	 */
	private String staffName;
	/**
	 * 操作时间
	 */
	private String time;
	public String getResName() {
		return resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}
	
	public String getLogNote() {
		return logNote;
	}
	public void setLogNote(String logNote) {
		this.logNote = logNote;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
}
