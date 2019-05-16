package com.fh.common.restvo;

/**
 * 资源库处理完成后通知服务端参数类
 * 
 * @author wwy add 20180614
 *
 */
public class ResNoticeInVo {
	/**
	 * 资源库资源id
	 */
	private String resId;

	/**
	 * 调用时间
	 */
	private String time;

	public String getResId() {
		return resId;
	}

	public void setResId(String resId) {
		this.resId = resId;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
