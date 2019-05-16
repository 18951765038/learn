package com.fh.common.restvo;

/**
 * 书籍使用信息采集返回结果类
 * 
 * @author wwy add 20180613
 *
 */
public class BookUseInfoResultVo {

	/**
	 * 返回前台成功信息
	 */
	private boolean success = false;

	/**
	 * 信息code
	 */
	private String code;

	/**
	 * 提示信息
	 */
	private String msg = "";

	/**
	 * 返回时间
	 */
	private String time;

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

}
