package com.fh.common.dto;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_role_2_purview")
public class SysRole2PurviewDto {
    /**
     * 主键
     */
    @Id
    @Column(name = "FRC_ID")
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private Long frcId;

    /**
     * 角色id
     */
    @Column(name = "ROLE_ID")
    private Long roleId;

    /**
     * 权限点id
     */
    @Column(name = "PUR_ID")
    private Long purId;

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
     * @return FRC_ID - 主键
     */
    public Long getFrcId() {
        return frcId;
    }

    /**
     * 设置主键
     *
     * @param frcId 主键
     */
    public void setFrcId(Long frcId) {
        this.frcId = frcId;
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
     * 获取权限点id
     *
     * @return PUR_ID - 权限点id
     */
    public Long getPurId() {
        return purId;
    }

    /**
     * 设置权限点id
     *
     * @param purId 权限点id
     */
    public void setPurId(Long purId) {
        this.purId = purId;
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