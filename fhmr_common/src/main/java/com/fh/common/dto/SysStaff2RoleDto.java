package com.fh.common.dto;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_staff_2_role")
public class SysStaff2RoleDto {
    /**
     * 主键
     */
    @Id
    @Column(name = "FRS_ID")
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private Long frsId;

    /**
     * 用户id
     */
    @Column(name = "STAFF_ID")
    private Long staffId;

    /**
     * 角色id
     */
    @Column(name = "ROLE_ID")
    private Long roleId;

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

    /**
     * 获取主键
     *
     * @return FRS_ID - 主键
     */
    public Long getFrsId() {
        return frsId;
    }

    /**
     * 设置主键
     *
     * @param frsId 主键
     */
    public void setFrsId(Long frsId) {
        this.frsId = frsId;
    }

    /**
     * 获取用户id
     *
     * @return STAFF_ID - 用户id
     */
    public Long getStaffId() {
        return staffId;
    }

    /**
     * 设置用户id
     *
     * @param staffId 用户id
     */
    public void setStaffId(Long staffId) {
        this.staffId = staffId;
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