package com.fh.common.dto;

import java.util.Date;
import javax.persistence.*;

@Table(name = "md_book_special")
public class MdBookSpecialDto {
    @Id
    @Column(name = "BOOK_ID")
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private Integer bookId;

    /**
     * 书籍定价
     */
    @Column(name = "BOOK_PRICE")
    private String bookPrice;

    /**
     * 上佳状态 0：上架  1：下架
     */
    @Column(name = "UP_STATUS")
    private String upStatus;

    /**
     * 上架、下架时间
     */
    @Column(name = "OPERA_TIME")
    private Date operaTime;

    /**
     * 书籍封面名称
     */
    @Column(name = "COVER_IMG_NAME")
    private String coverImgName;

    /**
     * 书籍封面地址
     */
    @Column(name = "COVER_IMG_URL")
    private String coverImgUrl;

    /**
     * 上下架人id
     */
    @Column(name = "OPERA_STAFF")
    private Long operaStaff;

    /**
     * 书籍描述信息
     */
    @Column(name = "BOOK_DESC")
    private String bookDesc;

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
     * 获取书籍定价
     *
     * @return BOOK_PRICE - 书籍定价
     */
    public String getBookPrice() {
        return bookPrice;
    }

    /**
     * 设置书籍定价
     *
     * @param bookPrice 书籍定价
     */
    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice == null ? null : bookPrice.trim();
    }

    /**
     * 获取上佳状态 0：上架  1：下架
     *
     * @return UP_STATUS - 上佳状态 0：上架  1：下架
     */
    public String getUpStatus() {
        return upStatus;
    }

    /**
     * 设置上佳状态 0：上架  1：下架
     *
     * @param upStatus 上佳状态 0：上架  1：下架
     */
    public void setUpStatus(String upStatus) {
        this.upStatus = upStatus == null ? null : upStatus.trim();
    }

    /**
     * 获取上架、下架时间
     *
     * @return OPERA_TIME - 上架、下架时间
     */
    public Date getOperaTime() {
        return operaTime;
    }

    /**
     * 设置上架、下架时间
     *
     * @param operaTime 上架、下架时间
     */
    public void setOperaTime(Date operaTime) {
        this.operaTime = operaTime;
    }

    /**
     * 获取书籍封面名称
     *
     * @return COVER_IMG_NAME - 书籍封面名称
     */
    public String getCoverImgName() {
        return coverImgName;
    }

    /**
     * 设置书籍封面名称
     *
     * @param coverImgName 书籍封面名称
     */
    public void setCoverImgName(String coverImgName) {
        this.coverImgName = coverImgName == null ? null : coverImgName.trim();
    }

    /**
     * 获取书籍封面地址
     *
     * @return COVER_IMG_URL - 书籍封面地址
     */
    public String getCoverImgUrl() {
        return coverImgUrl;
    }

    /**
     * 设置书籍封面地址
     *
     * @param coverImgUrl 书籍封面地址
     */
    public void setCoverImgUrl(String coverImgUrl) {
        this.coverImgUrl = coverImgUrl == null ? null : coverImgUrl.trim();
    }

    /**
     * 获取上下架人id
     *
     * @return OPERA_STAFF - 上下架人id
     */
    public Long getOperaStaff() {
        return operaStaff;
    }

    /**
     * 设置上下架人id
     *
     * @param operaStaff 上下架人id
     */
    public void setOperaStaff(Long operaStaff) {
        this.operaStaff = operaStaff;
    }

    /**
     * 获取书籍描述信息
     *
     * @return BOOK_DESC - 书籍描述信息
     */
    public String getBookDesc() {
        return bookDesc;
    }

    /**
     * 设置书籍描述信息
     *
     * @param bookDesc 书籍描述信息
     */
    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc == null ? null : bookDesc.trim();
    }
}