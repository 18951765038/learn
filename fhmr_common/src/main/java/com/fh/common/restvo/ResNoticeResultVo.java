package com.fh.common.restvo;

/**
 * 资源库处理完成后通知服务端返回结果类
 * 
 * @author wwy add 20180614
 *
 */
public class ResNoticeResultVo {
	/**
	 * 状态，值为：S/F(成功/失败)
	 */
	private String state = "F";

	/**
	 * 错误信息
	 */
	private String errorMsg;

	/**
	 * 调用时间
	 */
	private String time;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
