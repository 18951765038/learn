package com.fh.common.vo;

import com.fh.common.dto.SysRoleDto;

/**
 * 角色信息
 * 
 * @author xujun
 *
 */
public class SysRoleVo extends SysRoleDto {
	/**
	 * 角色类型名称
	 */
	private String roleTypeName;

	public String getRoleTypeName() {
		return roleTypeName;
	}

	public void setRoleTypeName(String roleTypeName) {
		this.roleTypeName = roleTypeName;
	}
}
