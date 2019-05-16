package com.fh.common.dto;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pub_ddv")
public class PubDdvDto {
    @Id
    @Column(name = "DDV_ID")
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private Long ddvId;

    @Column(name = "DDV_CODE")
    private String ddvCode;

    @Column(name = "TABLE_NAME")
    private String tableName;

    @Column(name = "FIELD_NAME")
    private String fieldName;

    @Column(name = "VALUE")
    private String value;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * 1表示删除，0标识正常
     */
    @Column(name = "DELETE_STATE")
    private Boolean deleteState;

    @Column(name = "NOTES")
    private String notes;

    /**
     * @return DDV_ID
     */
    public Long getDdvId() {
        return ddvId;
    }

    /**
     * @param ddvId
     */
    public void setDdvId(Long ddvId) {
        this.ddvId = ddvId;
    }

    /**
     * @return DDV_CODE
     */
    public String getDdvCode() {
        return ddvCode;
    }

    /**
     * @param ddvCode
     */
    public void setDdvCode(String ddvCode) {
        this.ddvCode = ddvCode == null ? null : ddvCode.trim();
    }

    /**
     * @return TABLE_NAME
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * @return FIELD_NAME
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * @param fieldName
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName == null ? null : fieldName.trim();
    }

    /**
     * @return VALUE
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
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
}