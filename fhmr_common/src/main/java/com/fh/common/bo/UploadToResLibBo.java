package com.fh.common.bo;

public class UploadToResLibBo {
	/**
	 * 书籍id
	 */
	private Long bookId;
	/**
	 * 目录id
	 */
	private Long catalogId;
	/**
	 * 创建人id
	 */
	private Long staffId;
	
	/**
	 * 文件名称
	 */
	private String fileName;
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Long getStaffId() {
		return staffId;
	}

	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public Long getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(Long catalogId) {
		this.catalogId = catalogId;
	}
}
