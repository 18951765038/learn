package com.fh.common.bo;

import java.util.List;

import com.fh.common.dto.RGoodsDto;

public class RelaBookInfoJsonBo {
	//书籍信息
	private MdBookSpecialBo bookInfo;
	//书籍关联的商品信息
	private List<RGoodsDto> goodsInfo;
	//书籍关联的信息
	private List<RelaBookInfoBo> relBookInfo;
	public MdBookSpecialBo getBookInfo() {
		return bookInfo;
	}
	public void setBookInfo(MdBookSpecialBo bookInfo) {
		this.bookInfo = bookInfo;
	}
	public List<RGoodsDto> getGoodsInfo() {
		return goodsInfo;
	}
	public void setGoodsInfo(List<RGoodsDto> goodsInfo) {
		this.goodsInfo = goodsInfo;
	}
	public List<RelaBookInfoBo> getRelBookInfo() {
		return relBookInfo;
	}
	public void setRelBookInfo(List<RelaBookInfoBo> relBookInfo) {
		this.relBookInfo = relBookInfo;
	}
	

}
