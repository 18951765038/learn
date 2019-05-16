package com.fh.common.dto;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pub_grade")
public class PubGradeDto {
    @Column(name = "GRADE_ID")
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private Long gradeId;

    @Column(name = "GRADE_NAME")
    private String gradeName;

    @Column(name = "GRADE_CODE")
    private String gradeCode;

    @Column(name = "CREATE_USER_ID")
    private Long createUserId;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "NOTES")
    private String notes;

    @Column(name = "DELETE_STATE")
    private Boolean deleteState;

    @Column(name = "VISIBLE")
    private Boolean visible;

    /**
     * @return GRADE_ID
     */
    public Long getGradeId() {
        return gradeId;
    }

    /**
     * @param gradeId
     */
    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    /**
     * @return GRADE_NAME
     */
    public String getGradeName() {
        return gradeName;
    }

    /**
     * @param gradeName
     */
    public void setGradeName(String gradeName) {
        this.gradeName = gradeName == null ? null : gradeName.trim();
    }

    /**
     * @return GRADE_CODE
     */
    public String getGradeCode() {
        return gradeCode;
    }

    /**
     * @param gradeCode
     */
    public void setGradeCode(String gradeCode) {
        this.gradeCode = gradeCode == null ? null : gradeCode.trim();
    }

    /**
     * @return CREATE_USER_ID
     */
    public Long getCreateUserId() {
        return createUserId;
    }

    /**
     * @param createUserId
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
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

    /**
     * @return UPDATE_TIME
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
     * @return VISIBLE
     */
    public Boolean getVisible() {
        return visible;
    }

    /**
     * @param visible
     */
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }
}