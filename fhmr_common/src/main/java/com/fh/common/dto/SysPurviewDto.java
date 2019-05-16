package com.fh.common.dto;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_purview")
public class SysPurviewDto {
    /**
     * 权限点id
     */
    @Id
    @Column(name = "PUR_ID")
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private Long purId;

    /**
     * 权限点名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 权限点编码
     */
    @Column(name = "CODE")
    private String code;

    /**
     * 对应地址
     */
    @Column(name = "PUR_URL")
    private String purUrl;

    /**
     * 0页面 1功能按钮
     */
    @Column(name = "PUR_TYPE")
    private Boolean purType;

    /**
     * 父级权限点
     */
    @Column(name = "PARENT_PUR_ID")
    private Long parentPurId;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;


    /**
     * 1表示删除，0标识正常
     */
    @Column(name = "DELETE_STATE")
    private Boolean deleteState;

    /**
     * 备注
     */
    @Column(name = "NOTES")
    private String notes;

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
     * 获取权限点名称
     *
     * @return NAME - 权限点名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置权限点名称
     *
     * @param name 权限点名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取权限点编码
     *
     * @return CODE - 权限点编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置权限点编码
     *
     * @param code 权限点编码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取对应地址
     *
     * @return PUR_URL - 对应地址
     */
    public String getPurUrl() {
        return purUrl;
    }

    /**
     * 设置对应地址
     *
     * @param purUrl 对应地址
     */
    public void setPurUrl(String purUrl) {
        this.purUrl = purUrl == null ? null : purUrl.trim();
    }

    /**
     * 获取0页面 1功能按钮
     *
     * @return PUR_TYPE - 0页面 1功能按钮
     */
    public Boolean getPurType() {
        return purType;
    }

    /**
     * 设置0页面 1功能按钮
     *
     * @param purType 0页面 1功能按钮
     */
    public void setPurType(Boolean purType) {
        this.purType = purType;
    }

    /**
     * 获取父级权限点
     *
     * @return PARENT_PUR_ID - 父级权限点
     */
    public Long getParentPurId() {
        return parentPurId;
    }

    /**
     * 设置父级权限点
     *
     * @param parentPurId 父级权限点
     */
    public void setParentPurId(Long parentPurId) {
        this.parentPurId = parentPurId;
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
     * 获取1表示删除，0标识正常
     *
     * @return DELETE_STATE - 1表示删除，0标识正常
     */
    public Boolean getDeleteState() {
        return deleteState;
    }

    /**
     * 设置1表示删除，0标识正常
     *
     * @param deleteState 1表示删除，0标识正常
     */
    public void setDeleteState(Boolean deleteState) {
        this.deleteState = deleteState;
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