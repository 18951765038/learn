package com.fh.common.bo;

/**
 * 分页数据
 * 
 * @author xujun
 *
 */
public class PageFilterBo {
	/** 当前页数 */
	private int page;
	/** 一页显示的行数 */
	private int rows;
	/** 排序列 */
	private String sort;
	/** 排序方式 */
	private String order;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}
}
