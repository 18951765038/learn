package com.fh.common.vo;

import java.io.Serializable;

/**
 * 返回前台数据对象
 * 
 * @author xujun
 *
 */
public class ResultVo implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 返回前台成功信息
	 */
	private boolean success = false;
	/**
	 * 自定义信息类型，传输数据
	 */
	private Integer resCode;
	/**
	 * 返回前提示信息
	 */
	private String msg = "";
	/**
	 * 自定义对象，记录数据
	 */
	private String info;

	private String filePath;
	/**
	 * 返回时间
	 */
	private String time;

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Integer getResCode() {
		return resCode;
	}

	public void setResCode(Integer resCode) {
		this.resCode = resCode;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
