package com.fh.common.restvo;
/**
 * 用户信息采集
 * @author renchuan
 *
 */
public class CollectUserInfoInVo {
	/**
	 * 系统key
	 */
	private String appKey;
	/**
	 * 用户未授权时传true，授权时为空
	 */
	private String unAuthorize;
	/**
	 * 用户信息
	 */
	private String userInfo;
	/**
	 * 登录时获取的 code
	 */
	private String code ;
	/**
	 * 调用时间
	 */
	private String time ;
	public String getAppKey() {
		return appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}
	public String getUnAuthorize() {
		return unAuthorize;
	}
	public void setUnAuthorize(String unAuthorize) {
		this.unAuthorize = unAuthorize;
	}
	public String getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}
