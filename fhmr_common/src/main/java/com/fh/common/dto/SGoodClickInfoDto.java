package com.fh.common.dto;

import java.util.Date;
import javax.persistence.*;

@Table(name = "s_goods_click_info")
public class SGoodClickInfoDto {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户唯一性标识
     */
    @Column(name = "OPEN_ID")
    private String openId;

    /**
     * 商品id
     */
    @Column(name = "GOODS_ID")
    private Long goodsId;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * @return ID
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户唯一性标识
     *
     * @return OPEN_ID - 用户唯一性标识
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 设置用户唯一性标识
     *
     * @param openId 用户唯一性标识
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * 获取商品id
     *
     * @return GOODS_ID - 商品id
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * 设置商品id
     *
     * @param goodsId 商品id
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
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
}