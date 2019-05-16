package com.fh.common.bo;

import com.fh.common.dto.MdBookSpecialDto;

public class MdBookSpecialBo extends MdBookSpecialDto{
    /**
     * 书籍名
     */
    private String bookName;

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
}