package com.fh.common.dto;

import java.util.Date;
import javax.persistence.*;

@Table(name = "md_press")
public class MdPressDto {
    @Id
    @Column(name = "PRESS_ID")
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private Integer pressId;

    @Column(name = "PRESS_NAME")
    private String pressName;

    @Column(name = "CODE")
    private String code;

    @Column(name = "BC_ID")
    private Integer bcId;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "NOTES")
    private String notes;

    /**
     * @return PRESS_ID
     */
    public Integer getPressId() {
        return pressId;
    }

    /**
     * @param pressId
     */
    public void setPressId(Integer pressId) {
        this.pressId = pressId;
    }

    /**
     * @return PRESS_NAME
     */
    public String getPressName() {
        return pressName;
    }

    /**
     * @param pressName
     */
    public void setPressName(String pressName) {
        this.pressName = pressName == null ? null : pressName.trim();
    }

    /**
     * @return CODE
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * @return BC_ID
     */
    public Integer getBcId() {
        return bcId;
    }

    /**
     * @param bcId
     */
    public void setBcId(Integer bcId) {
        this.bcId = bcId;
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
}