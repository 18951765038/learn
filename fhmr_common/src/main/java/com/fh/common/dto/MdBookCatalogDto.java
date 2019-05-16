package com.fh.common.dto;

import java.util.Date;
import javax.persistence.*;

@Table(name = "md_book_catalog")
public class MdBookCatalogDto {
    @Id
    @Column(name = "CATALOG_ID")
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private Integer catalogId;

    @Column(name = "BOOK_ID")
    private Integer bookId;

    @Column(name = "CATALOG_NAME")
    private String catalogName;

    @Column(name = "P_CATALOG_ID")
    private Integer pCatalogId;

    @Column(name = "CATALOG_LEVEL")
    private Integer catalogLevel;

    /**
     * 0:封面 ； 1:目录； 2:正文； 3:后目录； 4;封底
     */
    @Column(name = "TYPE")
    private String type;

    @Column(name = "START_PAGE")
    private Integer startPage;

    @Column(name = "END_PAGE")
    private Integer endPage;

    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "NOTES")
    private String notes;

    @Column(name = "CATALOG_RELA_ID")
    private Integer catalogRelaId;

    @Column(name = "CATALOG_TYPE_ID")
    private Integer catalogTypeId;

    @Column(name = "ORDER_NO")
    private Integer orderNo;

    @Column(name = "DELETE_STATE")
    private String deleteState;

    @Column(name = "SEQ_NO")
    private Integer seqNo;

    @Column(name = "PAGE_OFFSET")
    private Integer pageOffset;

    /**
     * @return CATALOG_ID
     */
    public Integer getCatalogId() {
        return catalogId;
    }

    /**
     * @param catalogId
     */
    public void setCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * @return BOOK_ID
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * @param bookId
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    /**
     * @return CATALOG_NAME
     */
    public String getCatalogName() {
        return catalogName;
    }

    /**
     * @param catalogName
     */
    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName == null ? null : catalogName.trim();
    }

    /**
     * @return P_CATALOG_ID
     */
    public Integer getpCatalogId() {
        return pCatalogId;
    }

    /**
     * @param pCatalogId
     */
    public void setpCatalogId(Integer pCatalogId) {
        this.pCatalogId = pCatalogId;
    }

    /**
     * @return CATALOG_LEVEL
     */
    public Integer getCatalogLevel() {
        return catalogLevel;
    }

    /**
     * @param catalogLevel
     */
    public void setCatalogLevel(Integer catalogLevel) {
        this.catalogLevel = catalogLevel;
    }

    /**
     * 获取0:封面 ； 1:目录； 2:正文； 3:后目录； 4;封底
     *
     * @return TYPE - 0:封面 ； 1:目录； 2:正文； 3:后目录； 4;封底
     */
    public String getType() {
        return type;
    }

    /**
     * 设置0:封面 ； 1:目录； 2:正文； 3:后目录； 4;封底
     *
     * @param type 0:封面 ； 1:目录； 2:正文； 3:后目录； 4;封底
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return START_PAGE
     */
    public Integer getStartPage() {
        return startPage;
    }

    /**
     * @param startPage
     */
    public void setStartPage(Integer startPage) {
        this.startPage = startPage;
    }

    /**
     * @return END_PAGE
     */
    public Integer getEndPage() {
        return endPage;
    }

    /**
     * @param endPage
     */
    public void setEndPage(Integer endPage) {
        this.endPage = endPage;
    }

    /**
     * @return USER_ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
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
     * @return CATALOG_RELA_ID
     */
    public Integer getCatalogRelaId() {
        return catalogRelaId;
    }

    /**
     * @param catalogRelaId
     */
    public void setCatalogRelaId(Integer catalogRelaId) {
        this.catalogRelaId = catalogRelaId;
    }

    /**
     * @return CATALOG_TYPE_ID
     */
    public Integer getCatalogTypeId() {
        return catalogTypeId;
    }

    /**
     * @param catalogTypeId
     */
    public void setCatalogTypeId(Integer catalogTypeId) {
        this.catalogTypeId = catalogTypeId;
    }

    /**
     * @return ORDER_NO
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /**
     * @param orderNo
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * @return DELETE_STATE
     */
    public String getDeleteState() {
        return deleteState;
    }

    /**
     * @param deleteState
     */
    public void setDeleteState(String deleteState) {
        this.deleteState = deleteState == null ? null : deleteState.trim();
    }

    /**
     * @return SEQ_NO
     */
    public Integer getSeqNo() {
        return seqNo;
    }

    /**
     * @param seqNo
     */
    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    /**
     * @return PAGE_OFFSET
     */
    public Integer getPageOffset() {
        return pageOffset;
    }

    /**
     * @param pageOffset
     */
    public void setPageOffset(Integer pageOffset) {
        this.pageOffset = pageOffset;
    }
}