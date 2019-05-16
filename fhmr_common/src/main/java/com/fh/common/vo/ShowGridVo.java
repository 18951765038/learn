package com.fh.common.vo;

import java.util.ArrayList;
import java.util.List;
/**
 * easyUi前台返回对象
 * @author xujun
 *
 */
public class ShowGridVo {
	/** 总条数 */
	private Integer total = 0;
	/** 封装表格数据 */
	private List<?> rows = new ArrayList<>();
	/** 封装底部信息 */
	private List<?> footer = new ArrayList<>();
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	public List<?> getFooter() {
		return footer;
	}
	public void setFooter(List<?> footer) {
		this.footer = footer;
	}
}
