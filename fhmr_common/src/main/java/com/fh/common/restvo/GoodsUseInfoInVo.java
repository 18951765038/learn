package com.fh.common.restvo;

/**
 * 推荐商品使用信息采集参数类
 * 
 * @author wwy add 20180613
 *
 */
public class GoodsUseInfoInVo {
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
	private Long goodsId;

	/**
	 * 调用时间
	 */
	private String time;

	/**
	 * 用户未授权时传true，授权时为空
	 */
	private String unAuthorize;

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

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getUnAuthorize() {
		return unAuthorize;
	}

	public void setUnAuthorize(String unAuthorize) {
		this.unAuthorize = unAuthorize;
	}

}
