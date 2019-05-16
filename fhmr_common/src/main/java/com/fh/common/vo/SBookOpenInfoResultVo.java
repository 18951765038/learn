package com.fh.common.vo;

import com.fh.common.dto.SBookOpenInfoDto;

/**
 * 返回页面书籍查看统计信息
 * 
 * @author wangweiyang add 20180612
 *
 */
public class SBookOpenInfoResultVo extends SBookOpenInfoDto {
	/**
	 * 书籍名称
	 */
	private String bookName;
	/**
	 * 学科名称
	 */
	private String subjectName;
	/**
	 * 年级名称
	 */
	private String gradeName;
	/**
	 * 册别名称
	 */
	private String kindName;

	/**
	 * 使用次数
	 */
	private Integer useNum;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public String getKindName() {
		return kindName;
	}

	public void setKindName(String kindName) {
		this.kindName = kindName;
	}

	public Integer getUseNum() {
		return useNum;
	}

	public void setUseNum(Integer useNum) {
		this.useNum = useNum;
	}

}
