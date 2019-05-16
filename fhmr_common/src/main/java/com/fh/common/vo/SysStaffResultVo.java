package com.fh.common.vo;

import com.fh.common.dto.SysStaffDto;

/**
 * 用户信息
 * 
 * @author wwy 20180605
 *
 */
public class SysStaffResultVo extends SysStaffDto {
	/**
	 * 账户类型名称
	 */
	private String staffTypeName;

	/**
	 * 用户角色id
	 */
	private Long roleId;

	/**
	 * 用户角色类型
	 */
	private String roleType;

	/**
	 * 用户角色名称
	 */
	private String roleName;

	/**
	 * 用户角色类型名称
	 */
	private String roleTypeName;

	public String getStaffTypeName() {
		return staffTypeName;
	}

	public void setStaffTypeName(String staffTypeName) {
		this.staffTypeName = staffTypeName;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleTypeName() {
		return roleTypeName;
	}

	public void setRoleTypeName(String roleTypeName) {
		this.roleTypeName = roleTypeName;
	}

}
