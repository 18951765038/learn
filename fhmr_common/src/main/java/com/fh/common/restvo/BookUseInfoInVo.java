package com.fh.common.restvo;

/**
 * 书籍使用信息采集参数类
 * 
 * @author wwy add 20180613
 *
 */
public class BookUseInfoInVo {
	/**
	 * 系统key
	 */
	private String appKey;

	/**
	 * 小程序唯一标识
	 */
	private String openId;

	/**
	 * 书籍id
	 */
	private Long bookId;

	/**
	 * 调用时间
	 */
	private String time;

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
