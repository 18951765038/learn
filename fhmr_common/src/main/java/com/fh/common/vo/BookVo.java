package com.fh.common.vo;

import java.util.Date;

import com.fh.common.dto.MdBookSpecialDto;
/**
 * 返回页面书籍信息
 * @author xujun 
 *
 */
public class BookVo extends MdBookSpecialDto{
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
	 * 上架人
	 */
	private String staffName;
	/**
	 * 图书创建时间
	 */
	private Date createTime;
	
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
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
