package com.fh.common.dto;

import java.util.Date;
import javax.persistence.*;

@Table(name = "md_res_format")
public class MdResFormatDto {
    @Id
    @Column(name = "FORMAT_ID")
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private Integer formatId;

    @Column(name = "FORMAT_NAME")
    private String formatName;

    /**
     * 父资源类型id
     */
    @Column(name = "P_FORMAT_ID")
    private Integer pFormatId;

    @Column(name = "SIGN")
    private String sign;

    /**
     * 1标示正常，0标示删除
     */
    @Column(name = "DELETE_STATE")
    private String deleteState;

    @Column(name = "USER_ID")
    private Integer userId;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "NOTES")
    private String notes;

    @Column(name = "SUFFIX_NAME")
    private String suffixName;

    /**
     * mime类型用于浏览器预览
     */
    @Column(name = "MIME_TYPE")
    private String mimeType;

    /**
     * @return FORMAT_ID
     */
    public Integer getFormatId() {
        return formatId;
    }

    /**
     * @param formatId
     */
    public void setFormatId(Integer formatId) {
        this.formatId = formatId;
    }

    /**
     * @return FORMAT_NAME
     */
    public String getFormatName() {
        return formatName;
    }

    /**
     * @param formatName
     */
    public void setFormatName(String formatName) {
        this.formatName = formatName == null ? null : formatName.trim();
    }

    /**
     * 获取父资源类型id
     *
     * @return P_FORMAT_ID - 父资源类型id
     */
    public Integer getpFormatId() {
        return pFormatId;
    }

    /**
     * 设置父资源类型id
     *
     * @param pFormatId 父资源类型id
     */
    public void setpFormatId(Integer pFormatId) {
        this.pFormatId = pFormatId;
    }

    /**
     * @return SIGN
     */
    public String getSign() {
        return sign;
    }

    /**
     * @param sign
     */
    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    /**
     * 获取1标示正常，0标示删除
     *
     * @return DELETE_STATE - 1标示正常，0标示删除
     */
    public String getDeleteState() {
        return deleteState;
    }

    /**
     * 设置1标示正常，0标示删除
     *
     * @param deleteState 1标示正常，0标示删除
     */
    public void setDeleteState(String deleteState) {
        this.deleteState = deleteState == null ? null : deleteState.trim();
    }

    /**
     * @return USER_ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
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
     * @return SUFFIX_NAME
     */
    public String getSuffixName() {
        return suffixName;
    }

    /**
     * @param suffixName
     */
    public void setSuffixName(String suffixName) {
        this.suffixName = suffixName == null ? null : suffixName.trim();
    }

    /**
     * 获取mime类型用于浏览器预览
     *
     * @return MIME_TYPE - mime类型用于浏览器预览
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * 设置mime类型用于浏览器预览
     *
     * @param mimeType mime类型用于浏览器预览
     */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType == null ? null : mimeType.trim();
    }
}