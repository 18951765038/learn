package com.fh.common.bo;
//关联书籍信息
public class RelaBookInfoBo {
	/**
	 * 关联书籍id
	 */
	private Integer bookId;
    /**
     * 关联书籍名
     */
    private String bookName;
    /**
     * 关联书年级
     */
    private Long gradeId;
    /**
     * 关联书籍上下册
     */
    private Integer kindId;
    /**
     * 关联书籍价格
     */
    private String bookPrice;
    /**
     * 书籍封面地址
     */
    private String bookImg;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookImg() {
		return bookImg;
	}

	public void setBookImg(String bookImg) {
		this.bookImg = bookImg;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	public Integer getKindId() {
		return kindId;
	}

	public void setKindId(Integer kindId) {
		this.kindId = kindId;
	}

	public String getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}
	
}