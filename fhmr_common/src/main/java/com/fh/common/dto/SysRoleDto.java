package com.fh.common.dto;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_role")
public class SysRoleDto {
    /**
     * 角色id
     */
    @Id
    @Column(name = "ROLE_ID")
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private Long roleId;

    /**
     * 角色名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 1表示后端制作类角色，2表示客户端使用类权限
     */
    @Column(name = "ROLE_TYPE")
    private String roleType;
    
    /**
     * 创建人
     */
    @Column(name = "CR_STAFF_ID")
    private Long crStaffId;
    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 备注
     */
    @Column(name = "NOTES")
    private String notes;
    
    
    public Long getCrStaffId() {
		return crStaffId;
	}

	public void setCrStaffId(Long crStaffId) {
		this.crStaffId = crStaffId;
	}

	/**
     * 获取角色id
     *
     * @return ROLE_ID - 角色id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     *
     * @param roleId 角色id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取角色名称
     *
     * @return NAME - 角色名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置角色名称
     *
     * @param name 角色名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取1表示后端制作类角色，2表示客户端使用类权限
     *
     * @return ROLE_TYPE - 1表示后端制作类角色，2表示客户端使用类权限
     */
    public String getRoleType() {
        return roleType;
    }

    /**
     * 设置1表示后端制作类角色，2表示客户端使用类权限
     *
     * @param roleType 1表示后端制作类角色，2表示客户端使用类权限
     */
    public void setRoleType(String roleType) {
        this.roleType = roleType == null ? null : roleType.trim();
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
     * 获取备注
     *
     * @return NOTES - 备注
     */
    public String getNotes() {
        return notes;
    }

    /**
     * 设置备注
     *
     * @param notes 备注
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }
}