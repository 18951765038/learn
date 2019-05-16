package com.fh.common.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 推荐商品Dto
 * 
 * @author add by lcy
 *
 */
@Table(name = "r_goods")
public class RecommendGoodsDto {
	/**
	 * 商品id
	 */
	@Id
	@Column(name = "GOODS_ID")
	@SequenceGenerator(name = "", sequenceName = "SELECT LAST_INSERT_ID()")
	private Integer goodsId;

	/**
	 * 商品名称
	 */
	@Column(name = "GOODS_NAME")
	private String goodsName;

	/**
	 * 推荐商品图片地址
	 */
	@Column(name = "GOODS_IMG")
	private String goodsImg;

	/**
	 * 推荐商品网址
	 */
	@Column(name = "GOODS_ADDR")
	private String goodsAddr;

	/**
	 * 创建人
	 */
	@Column(name = "STAFF_ID")
	private Long staffId;
	/**
	 * 创建时间
	 */
	@Column(name = "CREATE_TIME")
	private String createTime;

	/**
	 * 备注
	 */
	@Column(name = "NOTES")
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

	public String getGoodsAddr() {
		return goodsAddr;
	}

	public void setGoodsAddr(String goodsAddr) {
		this.goodsAddr = goodsAddr;
	}

	public Long getStaffId() {
		return staffId;
	}

	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}