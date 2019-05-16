package com.fh.common.vo;

import com.fh.common.dto.SysStaffDto;

/**
 * 用户查询参数信息
 * 
 * @author wwy 20180605
 *
 */
public class SysStaffInVo extends SysStaffDto {

	/**
	 * 用户角色类型
	 */
	private String roleType;

	/**
	 * 字符串类型有效期
	 */
	private String validDateStr;

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getValidDateStr() {
		return validDateStr;
	}

	public void setValidDateStr(String validDateStr) {
		this.validDateStr = validDateStr;
	}

}
