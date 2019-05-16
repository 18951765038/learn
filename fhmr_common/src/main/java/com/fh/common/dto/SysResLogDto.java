package com.fh.common.dto;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_res_log")
public class SysResLogDto {
    /**
     * 主键
     */
    @Column(name = "LOG_ID")
    private Long logId;

    @Column(name = "RES_ID")
    private Long resId;

    /**
     * 见pub_ddv表
     */
    @Column(name = "LOG_TYPE_ID")
    private Integer logTypeId;

    @Column(name = "STAFF_ID")
    private Long staffId;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 获取主键
     *
     * @return LOG_ID - 主键
     */
    public Long getLogId() {
        return logId;
    }

    /**
     * 设置主键
     *
     * @param logId 主键
     */
    public void setLogId(Long logId) {
        this.logId = logId;
    }

    /**
     * @return RES_ID
     */
    public Long getResId() {
        return resId;
    }

    /**
     * @param resId
     */
    public void setResId(Long resId) {
        this.resId = resId;
    }

    public Integer getLogTypeId() {
		return logTypeId;
	}

	public void setLogTypeId(Integer logTypeId) {
		this.logTypeId = logTypeId;
	}

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
}