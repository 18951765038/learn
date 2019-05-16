package com.fh.common.dto;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pub_subject")
public class PubSubjectDto {
    @Id
    @Column(name = "SUBJECT_ID")
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private Long subjectId;

    /**
     * 科目名称
     */
    @Column(name = "SUBJECT_NAME")
    private String subjectName;

    @Column(name = "SUBJECT_CODE")
    private String subjectCode;

    /**
     * 创建用户编码
     */
    @Column(name = "CR_STAFF_ID")
    private Long crStaffId;

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
     * 备注
     */
    @Column(name = "NOTES")
    private String notes;

    /**
     * 1显示 0不显示
     */
    @Column(name = "VISIBLE")
    private Boolean visible;

    @Column(name = "DELETE_STATE")
    private Boolean deleteState;

    /**
     * 排序
     */
    @Column(name = "SORT_INDEX")
    private Long sortIndex;

    /**
     * @return SUBJECT_ID
     */
    public Long getSubjectId() {
        return subjectId;
    }

    /**
     * @param subjectId
     */
    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * 获取科目名称
     *
     * @return SUBJECT_NAME - 科目名称
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * 设置科目名称
     *
     * @param subjectName 科目名称
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    /**
     * @return SUBJECT_CODE
     */
    public String getSubjectCode() {
        return subjectCode;
    }

    /**
     * @param subjectCode
     */
    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode == null ? null : subjectCode.trim();
    }

    /**
     * 获取创建用户编码
     *
     * @return CR_STAFF_ID - 创建用户编码
     */
    public Long getCrStaffId() {
        return crStaffId;
    }

    /**
     * 设置创建用户编码
     *
     * @param crStaffId 创建用户编码
     */
    public void setCrStaffId(Long crStaffId) {
        this.crStaffId = crStaffId;
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

    /**
     * 获取1显示 0不显示
     *
     * @return VISIBLE - 1显示 0不显示
     */
    public Boolean getVisible() {
        return visible;
    }

    /**
     * 设置1显示 0不显示
     *
     * @param visible 1显示 0不显示
     */
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    /**
     * @return DELETE_STATE
     */
    public Boolean getDeleteState() {
        return deleteState;
    }

    /**
     * @param deleteState
     */
    public void setDeleteState(Boolean deleteState) {
        this.deleteState = deleteState;
    }

    /**
     * 获取排序
     *
     * @return SORT_INDEX - 排序
     */
    public Long getSortIndex() {
        return sortIndex;
    }

    /**
     * 设置排序
     *
     * @param sortIndex 排序
     */
    public void setSortIndex(Long sortIndex) {
        this.sortIndex = sortIndex;
    }
}