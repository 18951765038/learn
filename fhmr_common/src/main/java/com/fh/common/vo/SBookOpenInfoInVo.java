package com.fh.common.vo;

import com.fh.common.dto.SBookOpenInfoDto;

/**
 * 统计书籍查看信息查询参数类
 * 
 * @author wwy 20180612
 *
 */
public class SBookOpenInfoInVo extends SBookOpenInfoDto {

	/**
	 * 出版社id
	 */
	private Integer pressId;

	/**
	 * 年级id
	 */
	private Long classId;

	/**
	 * 册别id
	 */
	private Integer kindId;

	/**
	 * 学科id
	 */
	private Long subjectId;

	/**
	 * 开始时间
	 */
	private String startDate;

	/**
	 * 结束时间
	 */
	private String endDate;

	/**
	 * 上架状态 0：上架 1：下架 2：未上架
	 */
	private Integer upStatus;

	/**
	 * 书籍id数组
	 */
	private String[] bookIdArr;

	public Integer getPressId() {
		return pressId;
	}

	public void setPressId(Integer pressId) {
		this.pressId = pressId;
	}

	public Long getClassId() {
		return classId;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public Integer getKindId() {
		return kindId;
	}

	public void setKindId(Integer kindId) {
		this.kindId = kindId;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Integer getUpStatus() {
		return upStatus;
	}

	public void setUpStatus(Integer upStatus) {
		this.upStatus = upStatus;
	}

	public String[] getBookIdArr() {
		return bookIdArr;
	}

	public void setBookIdArr(String[] bookIdArr) {
		this.bookIdArr = bookIdArr;
	}

}
