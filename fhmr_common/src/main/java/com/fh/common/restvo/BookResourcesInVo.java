package com.fh.common.restvo;
/**
 * 书和资源接收参数
 * @author renchuan
 *
 */
public class BookResourcesInVo {
	/**
	 * 系统key
	 */
	private String appKey;
	/**
	 * 书id
	 */
	private Integer bookId;
	/**
	 * 书目录id
	 */
	private Integer catalogId;
	/**
	 * 资源Id
	 */
	private Integer resId ;
	/**
	 * 资源库Id
	 */
	private Integer mdResId ;
	/**
	 * 调用时间
	 */
	private String time ;
	public String getAppKey() {
		return appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public Integer getCatalogId() {
		return catalogId;
	}
	public void setCatalogId(Integer catalogId) {
		this.catalogId = catalogId;
	}
	public Integer getResId() {
		return resId;
	}
	public void setResId(Integer resId) {
		this.resId = resId;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Integer getMdResId() {
		return mdResId;
	}
	public void setMdResId(Integer mdResId) {
		this.mdResId = mdResId;
	}
	

}
