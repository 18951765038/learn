package com.fh.common.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "r_book_res")
public class RBookResDto {
	/**
	 * 资源ID
	 */
	@Id
	@Column(name = "RES_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer resId;
	/**
	 * 书id
	 */
	@Column(name = "BOOK_ID")
	private Integer bookId;
	/**
	 * 资源名
	 */
	@Column(name = "NAME")
	private String resName;
	/**
	 * 目录id
	 */
	@Column(name = "CATALOG_ID")
	private Integer catalogId;
	/**
	 * 资源格式
	 */
	@Column(name = "FORMAT_ID")
	private Integer formatId;
	/**
	 * 资源的业务类型
	 */
	@Column(name = "BUSI_FORMAT_ID")
	private Integer busiFormatId;
	/**
	 * 上架状态，0 ：上架、1：下架' 2：未上架
	 */
	@Column(name = "PUB_STATE")
	private String pubState;
	/**
	 * 上架人
	 */
	@Column(name = "PUB_STAFF")
	private Integer pubStaff;
	/**
	 * 显示名称
	 */
	@Column(name = "DISPLAY_NAME")
	private String displayName;
	/**
	 * 资源库ID
	 */
	@Column(name = "MD_RES_ID")
	private Integer mdResId;
	/**
	 * 审核状态，'-1未审核，1审核通过，0审核不通过'
	 */
	@Column(name = "IS_AUDIT")
	private Integer isAudit;
	/**
	 * 审核人
	 */
	@Column(name = "AUDIT_STAFF_ID")
	private Integer auditStaffId;
	/**
	 * 调用资源库时间
	 */
	@Column(name = "HAND_TIME")
	private Date hadeTime;
	/**
	 * 资源库处理完回调时间
	 */
	@Column(name = "BACK_CALL_TIME")
	private Date backCallTime;
	/**
	 * 创建时间
	 */
	@Column(name = "CREATE_TIME")
	private Date createTime;
	/**
	 * 更新时间
	 */
	@Column(name = "UPDATE_TIME")
	private Date updateTime;
	/**
	 * 创建人
	 */
	@Column(name = "STAFF_ID")
	private Integer staffId;

	@Column(name = "NOTES")
	private String notes;
	/**
	 * 资源大小
	 */
	@Column(name = "RS_SIZE")
	private String rsSize;
	/**
	 * 上传状态
	 */
	@Column(name = "IS_UPLOAD")
	private Integer isUpload;
	/**
	 * 删除状态
	 */
	@Column(name = "DELETE_STATE")
	private Integer deleteState;

	public Integer getDeleteState() {
		return deleteState;
	}

	public void setDeleteState(Integer deleteState) {
		this.deleteState = deleteState;
	}

	public String getRsSize() {
		return rsSize;
	}

	public void setRsSize(String rsSize) {
		this.rsSize = rsSize;
	}

	public Integer getIsUpload() {
		return isUpload;
	}

	public void setIsUpload(Integer isUpload) {
		this.isUpload = isUpload;
	}

	public Integer getResId() {
		return resId;
	}

	public void setResId(Integer resId) {
		this.resId = resId;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	public Integer getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(Integer catalogId) {
		this.catalogId = catalogId;
	}

	public Integer getFormatId() {
		return formatId;
	}

	public void setFormatId(Integer formatId) {
		this.formatId = formatId;
	}

	public Integer getBusiFormatId() {
		return busiFormatId;
	}

	public void setBusiFormatId(Integer busiFormatId) {
		this.busiFormatId = busiFormatId;
	}

	public String getPubState() {
		return pubState;
	}

	public void setPubState(String pubState) {
		this.pubState = pubState;
	}

	public Integer getPubStaff() {
		return pubStaff;
	}

	public void setPubStaff(Integer pubStaff) {
		this.pubStaff = pubStaff;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Integer getMdResId() {
		return mdResId;
	}

	public void setMdResId(Integer mdResId) {
		this.mdResId = mdResId;
	}

	public Integer getIsAudit() {
		return isAudit;
	}

	public void setIsAudit(Integer isAudit) {
		this.isAudit = isAudit;
	}

	public Integer getAuditStaffId() {
		return auditStaffId;
	}

	public void setAuditStaffId(Integer auditStaffId) {
		this.auditStaffId = auditStaffId;
	}

	public Date getHadeTime() {
		return hadeTime;
	}

	public void setHadeTime(Date hadeTime) {
		this.hadeTime = hadeTime;
	}

	public Date getBackCallTime() {
		return backCallTime;
	}

	public void setBackCallTime(Date backCallTime) {
		this.backCallTime = backCallTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}