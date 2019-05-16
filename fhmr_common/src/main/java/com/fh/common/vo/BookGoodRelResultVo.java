package com.fh.common.vo;

/**
 * 返回页面书籍管理的商品
 * 
 * @author lcy
 *
 */
public class BookGoodRelResultVo {
	/**
	 * 商品id
	 */
	private Integer goodId;
	/**
	 * 商品名称
	 */
	private String goodName;
	/**
	 * 商品图片
	 */
	private String goodImg;
	/**
	 * 商品地址
	 */
	private String goodAddr;
	/**
	 * 创建时间
	 */
	private String addTime;

	public Integer getGoodId() {
		return goodId;
	}

	public void setGoodId(Integer goodId) {
		this.goodId = goodId;
	}

	public String getGoodName() {
		return goodName;
	}

	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	public String getGoodImg() {
		return goodImg;
	}

	public void setGoodImg(String goodImg) {
		this.goodImg = goodImg;
	}

	public String getGoodAddr() {
		return goodAddr;
	}

	public void setGoodAddr(String goodAddr) {
		this.goodAddr = goodAddr;
	}

	public String getAddTime() {
		return addTime;
	}

	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}

}
