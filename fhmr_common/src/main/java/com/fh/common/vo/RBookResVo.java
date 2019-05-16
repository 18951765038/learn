package com.fh.common.vo;

import com.fh.common.dto.RBookResDto;

/**
 * 书籍资源返回前台对象
 * @author xujun
 *
 */
public class RBookResVo extends RBookResDto{
	/**
	 * 资源格式名称
	 */
	private String formatName;
	
	public String getFormatName() {
		return formatName;
	}
	public void setFormatName(String formatName) {
		this.formatName = formatName;
	}
}
