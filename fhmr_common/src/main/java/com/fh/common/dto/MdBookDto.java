package com.fh.common.dto;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "md_book")
public class MdBookDto {
    @Id
    @Column(name = "BOOK_ID")
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private Integer bookId;

    @Column(name = "BOOK_NO")
    private String bookNo;

    @Column(name = "PRODUCER")
    private Integer producer;

    @Column(name = "BOOK_NAME")
    private String bookName;

    @Column(name = "BOOK_SYNC")
    private String bookSync;

    @Column(name = "PRESS_ID")
    private Integer pressId;

    @Column(name = "SEG_ID")
    private Integer segId;

    @Column(name = "CLASS_ID")
    private Long classId;

    /**
     * 册别id
     */
    @Column(name = "KIND_ID")
    private Integer kindId;

    @Column(name = "VERSION")
    private String version;

    @Column(name = "SUBJECT_ID")
    private Long subjectId;

    @Column(name = "BC_ID")
    private Integer bcId;

    @Column(name = "DELETE_STATE")
    private String deleteState;

    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "RES_LEVEL")
    private Integer resLevel;

    @Column(name = "AUTHOR")
    private String author;

    @Column(name = "LICENSE_INFO")
    private String licenseInfo;

    @Column(name = "LICENSE_PRICE")
    private BigDecimal licensePrice;

    @Column(name = "LICENSE_START_TIME")
    private Date licenseStartTime;

    @Column(name = "LICENSE_END_TIME")
    private Date licenseEndTime;

    @Column(name = "NOTES")
    private String notes;

    @Column(name = "COVER_URL")
    private String coverUrl;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "ORG_ID")
    private Long orgId;

    @Column(name = "PAGE_NUM")
    private Integer pageNum;

    @Column(name = "IP_ADDR")
    private String ipAddr;

    @Column(name = "IS_UPLOAD")
    private Boolean isUpload;

    @Column(name = "BOOK_SIZE")
    private Integer bookSize;

    @Column(name = "IS_AUDIT")
    private Boolean isAudit;

    @Column(name = "COVER_CONT_TYPE")
    private String coverContType;

    @Column(name = "NB_TYPE")
    private String nbType;

    /**
     * 审核状态 ：Y 审核   N 未审核
     */
    @Column(name = "CHECK_STATE")
    private String checkState;

    @Column(name = "ALL_ADDR_IN_NET")
    private String allAddrInNet;

    @Column(name = "ALL_ADDR_OUT_NET")
    private String allAddrOutNet;

    @Column(name = "COVER_URL_IN_NET")
    private String coverUrlInNet;

    @Column(name = "COVER_URL_OUT_NET")
    private String coverUrlOutNet;

    @Column(name = "COVER_IMG")
    private byte[] coverImg;
    
    private Integer upStatus;
    
    public Integer getUpStatus() {
		return upStatus;
	}

	public void setUpStatus(Integer upStatus) {
		this.upStatus = upStatus;
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
     * @return BOOK_NO
     */
    public String getBookNo() {
        return bookNo;
    }

    /**
     * @param bookNo
     */
    public void setBookNo(String bookNo) {
        this.bookNo = bookNo == null ? null : bookNo.trim();
    }

    /**
     * @return PRODUCER
     */
    public Integer getProducer() {
        return producer;
    }

    /**
     * @param producer
     */
    public void setProducer(Integer producer) {
        this.producer = producer;
    }

    /**
     * @return BOOK_NAME
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * @param bookName
     */
    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    /**
     * @return BOOK_SYNC
     */
    public String getBookSync() {
        return bookSync;
    }

    /**
     * @param bookSync
     */
    public void setBookSync(String bookSync) {
        this.bookSync = bookSync == null ? null : bookSync.trim();
    }

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
     * @return SEG_ID
     */
    public Integer getSegId() {
        return segId;
    }

    /**
     * @param segId
     */
    public void setSegId(Integer segId) {
        this.segId = segId;
    }

    /**
     * @return CLASS_ID
     */
    public Long getClassId() {
        return classId;
    }

    /**
     * @param classId
     */
    public void setClassId(Long classId) {
        this.classId = classId;
    }

    /**
     * 获取册别id
     *
     * @return KIND_ID - 册别id
     */
    public Integer getKindId() {
        return kindId;
    }

    /**
     * 设置册别id
     *
     * @param kindId 册别id
     */
    public void setKindId(Integer kindId) {
        this.kindId = kindId;
    }

    /**
     * @return VERSION
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

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
     * @return RES_LEVEL
     */
    public Integer getResLevel() {
        return resLevel;
    }

    /**
     * @param resLevel
     */
    public void setResLevel(Integer resLevel) {
        this.resLevel = resLevel;
    }

    /**
     * @return AUTHOR
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * @return LICENSE_INFO
     */
    public String getLicenseInfo() {
        return licenseInfo;
    }

    /**
     * @param licenseInfo
     */
    public void setLicenseInfo(String licenseInfo) {
        this.licenseInfo = licenseInfo == null ? null : licenseInfo.trim();
    }

    /**
     * @return LICENSE_PRICE
     */
    public BigDecimal getLicensePrice() {
        return licensePrice;
    }

    /**
     * @param licensePrice
     */
    public void setLicensePrice(BigDecimal licensePrice) {
        this.licensePrice = licensePrice;
    }

    /**
     * @return LICENSE_START_TIME
     */
    public Date getLicenseStartTime() {
        return licenseStartTime;
    }

    /**
     * @param licenseStartTime
     */
    public void setLicenseStartTime(Date licenseStartTime) {
        this.licenseStartTime = licenseStartTime;
    }

    /**
     * @return LICENSE_END_TIME
     */
    public Date getLicenseEndTime() {
        return licenseEndTime;
    }

    /**
     * @param licenseEndTime
     */
    public void setLicenseEndTime(Date licenseEndTime) {
        this.licenseEndTime = licenseEndTime;
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
     * @return COVER_URL
     */
    public String getCoverUrl() {
        return coverUrl;
    }

    /**
     * @param coverUrl
     */
    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl == null ? null : coverUrl.trim();
    }

    /**
     * @return TYPE
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return ORG_ID
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * @param orgId
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * @return PAGE_NUM
     */
    public Integer getPageNum() {
        return pageNum;
    }

    /**
     * @param pageNum
     */
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    /**
     * @return IP_ADDR
     */
    public String getIpAddr() {
        return ipAddr;
    }

    /**
     * @param ipAddr
     */
    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr == null ? null : ipAddr.trim();
    }

    /**
     * @return IS_UPLOAD
     */
    public Boolean getIsUpload() {
        return isUpload;
    }

    /**
     * @param isUpload
     */
    public void setIsUpload(Boolean isUpload) {
        this.isUpload = isUpload;
    }

    /**
     * @return BOOK_SIZE
     */
    public Integer getBookSize() {
        return bookSize;
    }

    /**
     * @param bookSize
     */
    public void setBookSize(Integer bookSize) {
        this.bookSize = bookSize;
    }

    /**
     * @return IS_AUDIT
     */
    public Boolean getIsAudit() {
        return isAudit;
    }

    /**
     * @param isAudit
     */
    public void setIsAudit(Boolean isAudit) {
        this.isAudit = isAudit;
    }

    /**
     * @return COVER_CONT_TYPE
     */
    public String getCoverContType() {
        return coverContType;
    }

    /**
     * @param coverContType
     */
    public void setCoverContType(String coverContType) {
        this.coverContType = coverContType == null ? null : coverContType.trim();
    }

    /**
     * @return NB_TYPE
     */
    public String getNbType() {
        return nbType;
    }

    /**
     * @param nbType
     */
    public void setNbType(String nbType) {
        this.nbType = nbType == null ? null : nbType.trim();
    }

    /**
     * 获取审核状态 ：Y 审核   N 未审核
     *
     * @return CHECK_STATE - 审核状态 ：Y 审核   N 未审核
     */
    public String getCheckState() {
        return checkState;
    }

    /**
     * 设置审核状态 ：Y 审核   N 未审核
     *
     * @param checkState 审核状态 ：Y 审核   N 未审核
     */
    public void setCheckState(String checkState) {
        this.checkState = checkState == null ? null : checkState.trim();
    }

    /**
     * @return ALL_ADDR_IN_NET
     */
    public String getAllAddrInNet() {
        return allAddrInNet;
    }

    /**
     * @param allAddrInNet
     */
    public void setAllAddrInNet(String allAddrInNet) {
        this.allAddrInNet = allAddrInNet == null ? null : allAddrInNet.trim();
    }

    /**
     * @return ALL_ADDR_OUT_NET
     */
    public String getAllAddrOutNet() {
        return allAddrOutNet;
    }

    /**
     * @param allAddrOutNet
     */
    public void setAllAddrOutNet(String allAddrOutNet) {
        this.allAddrOutNet = allAddrOutNet == null ? null : allAddrOutNet.trim();
    }

    /**
     * @return COVER_URL_IN_NET
     */
    public String getCoverUrlInNet() {
        return coverUrlInNet;
    }

    /**
     * @param coverUrlInNet
     */
    public void setCoverUrlInNet(String coverUrlInNet) {
        this.coverUrlInNet = coverUrlInNet == null ? null : coverUrlInNet.trim();
    }

    /**
     * @return COVER_URL_OUT_NET
     */
    public String getCoverUrlOutNet() {
        return coverUrlOutNet;
    }

    /**
     * @param coverUrlOutNet
     */
    public void setCoverUrlOutNet(String coverUrlOutNet) {
        this.coverUrlOutNet = coverUrlOutNet == null ? null : coverUrlOutNet.trim();
    }

    /**
     * @return COVER_IMG
     */
    public byte[] getCoverImg() {
        return coverImg;
    }

    /**
     * @param coverImg
     */
    public void setCoverImg(byte[] coverImg) {
        this.coverImg = coverImg;
    }
}