package com.fh.common.dto;

import java.util.Date;
import javax.persistence.*;

@Table(name = "r_book_rela_book")
public class RBookRelaBookDto {
    @Id
    @Column(name = "ID")
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     * 书籍id
     */
    @Column(name = "BOOK_ID")
    private Integer bookId;

    /**
     * 关联书籍id
     */
    @Column(name = "RELA_BOOK_ID")
    private Integer relaBookId;

    /**
     * 操做人id
     */
    @Column(name = "STAFF_ID")
    private Long staffId;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "NOTES")
    private String notes;

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取书籍id
     *
     * @return BOOK_ID - 书籍id
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * 设置书籍id
     *
     * @param bookId 书籍id
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    /**
     * 获取关联书籍id
     *
     * @return RELA_BOOK_ID - 关联书籍id
     */
    public Integer getRelaBookId() {
        return relaBookId;
    }

    /**
     * 设置关联书籍id
     *
     * @param relaBookId 关联书籍id
     */
    public void setRelaBookId(Integer relaBookId) {
        this.relaBookId = relaBookId;
    }

    /**
     * 获取操做人id
     *
     * @return STAFF_ID - 操做人id
     */
    public Long getStaffId() {
        return staffId;
    }

    /**
     * 设置操做人id
     *
     * @param staffId 操做人id
     */
    public void setStaffId(Long staffId) {
        this.staffId = staffId;
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