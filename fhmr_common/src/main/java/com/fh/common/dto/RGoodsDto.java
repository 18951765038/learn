package com.fh.common.dto;

import java.util.Date;

public class RGoodsDto {
	//推荐商品id
    private Integer goodsId;
    //推荐商品名称
    private String goodsName;
    //推荐商品图片路径
    private String goodsImg;
    //推荐商品链接地址
    private String goodsLinkUrl;

    private Integer staffId;
    
    private Date createTime;
    
    private String createTimeStr;
    private String notes;

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsImg() {
		return goodsImg;
	}

	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
	}

	public String getGoodsLinkUrl() {
		return goodsLinkUrl;
	}

	public void setGoodsLinkUrl(String goodsLinkUrl) {
		this.goodsLinkUrl = goodsLinkUrl;
	}

	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateTimeStr() {
		return createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
    
}