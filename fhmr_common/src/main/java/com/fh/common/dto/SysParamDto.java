package com.fh.common.dto;

import java.util.Date;

import javax.persistence.*;
/**
 * 用户采集信息表
 * @author Administrator
 *
 */
@Table(name = "sys_param")
public class SysParamDto {
    @Id
    @Column(name = "ID")
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private Long id;
    /**
     * 系统key
     */
    @Column(name = "SYS_KEY")
    private String sysKey;
    /**
     * 系统值
     */
    @Column(name = "SYS_VALUE")
    private String sysValue;
    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;
    
    

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSysKey() {
		return sysKey;
	}

	public void setSysKey(String sysKey) {
		this.sysKey = sysKey;
	}

	public String getSysValue() {
		return sysValue;
	}

	public void setSysValue(String sysValue) {
		this.sysValue = sysValue;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}