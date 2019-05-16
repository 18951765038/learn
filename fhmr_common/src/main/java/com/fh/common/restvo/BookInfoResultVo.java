package com.fh.common.restvo;

import java.io.Serializable;

/**
 * 1.5用户信息采集
 * 返回前台数据对象
 * 
 * @author renchuan
 *
 */
public class BookInfoResultVo implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 返回前台成功信息
	 */
	private boolean success = false;
	/**
	 * 自定义信息类型，传输数据
	 */
	private String code;
	/**
	 * 返回前提示信息
	 */
	private String msg = "";
	/**
	 * 返回时间
	 */
	private String time;
	/**
	 * 返回对象
	 */
	private Object data;
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
    
}
