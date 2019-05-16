package com.fh.common.dto;

import java.util.Date;

import javax.persistence.*;

@Table(name = "s_book_open_info")
public class SBookOpenInfoDto {
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "BOOK_ID")
	private Long bookId;

	@Column(name = "CREATE_TIME")
	private Date createTime;

	/**
	 * 微信用户唯一识id
	 */
	@Column(name = "OPEN_ID")
	private String openId;

	/**
	 * @return ID
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return BOOK_ID
	 */
	public Long getBookId() {
		return bookId;
	}

	/**
	 * @param bookId
	 */
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	/**
	 * @return CREATE_TIME
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

}