package com.fh.common.dto;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_staff")
public class SysStaffDto {
    @Id
    @Column(name = "STAFF_ID")
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private Long staffId;

    /**
     * 用户名称
     */
    @Column(name = "USER_NAME")
    private String userName;

    /**
     * 用户账号
     */
    @Column(name = "USER_CODE")
    private String userCode;

	/**
	 * 用户类型1：系统超级管理员 2：普通用户
	 */
	@Column(name = "STAFF_TYPE_ID")
	private Integer staffTypeId;
    
    /**
     * 密码
     */
    @Column(name = "PASSWORD")
    private String password;

    /**
     * 手机
     */
    @Column(name = "PHONE")
    private Long phone;

    /**
     * 有效期
     */
    @Column(name = "VALID_DATE")
    private Date validDate;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * 1表示删除，0标识正常
     */
    @Column(name = "DELETE_STATE")
    private Integer deleteState;

    /**
     * 创建人
     */
    @Column(name = "CR_STAFF_ID")
    private Long crStaffId;

    @Column(name = "NOTES")
    private String notes;

    /**
     * @return STAFF_ID
     */
    public Long getStaffId() {
        return staffId;
    }

    /**
     * @param staffId
     */
    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    /**
     * 获取用户名称
     *
     * @return USER_NAME - 用户名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名称
     *
     * @param userName 用户名称
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取用户账号
     *
     * @return USER_CODE - 用户账号
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * 设置用户账号
     *
     * @param userCode 用户账号
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public Integer getStaffTypeId() {
		return staffTypeId;
	}

	public void setStaffTypeId(Integer staffTypeId) {
		this.staffTypeId = staffTypeId;
	}

	/**
     * 获取密码
     *
     * @return PASSWORD - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取手机
     *
     * @return PHONE - 手机
     */
    public Long getPhone() {
        return phone;
    }

    /**
     * 设置手机
     *
     * @param phone 手机
     */
    public void setPhone(Long phone) {
        this.phone = phone;
    }

    /**
     * 获取有效期
     *
     * @return VALID_DATE - 有效期
     */
    public Date getValidDate() {
        return validDate;
    }

    /**
     * 设置有效期
     *
     * @param validDate 有效期
     */
    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return UPDATE_TIME - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * 获取创建人
     *
     * @return CR_STAFF_ID - 创建人
     */
    public Long getCrStaffId() {
        return crStaffId;
    }

    /**
     * 设置创建人
     *
     * @param crStaffId 创建人
     */
    public void setCrStaffId(Long crStaffId) {
        this.crStaffId = crStaffId;
    }

    /**
     * @return NOTES
     */
    public String getNotes() {
        return notes;
    }
    
    /**
     * @param notes
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

	public Integer getDeleteState() {
		return deleteState;
	}

	public void setDeleteState(Integer deleteState) {
		this.deleteState = deleteState;
	}
}