package com.fh.common.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fh.common.constants.Constants;
import com.fh.common.dto.SysPurviewDto;
import com.fh.common.dto.SysStaffDto;
import com.fh.common.vo.JsonTreeData;
import com.fh.common.vo.ResultVo;

/**
 * 
 * @author xujun 登录方法处理
 *
 */
public class LoginHandle {
	/**
	 * 校验用户信息 add by xujun
	 * 
	 * @param userCode
	 * @param password
	 * @param staff
	 * @return
	 * @throws Exception
	 */
	public static ResultVo verifyUser(String userCode, String password, SysStaffDto staff) throws Exception {
		// 创建返回对象
		ResultVo result = new ResultVo();
		// 成功状态
		boolean success = false;
		// 返回消息
		String msg = null;
		do {
			// 校验用户是否存在
			if (null == staff) {
				msg = "用户不存在！";
				break;
			}
			// 校验用户状态是否正常
			Integer deleteState = staff.getDeleteState();
			if (!Constants.NOT_DELETE.equals(deleteState)) {
				msg = "用户已注销！";
				break;
			}
			// 校验用户密码
			String userPass = staff.getPassword();
			if (!password.equals(userPass)) {
				msg = "密码错误，请重新输入！";
				break;
			}
			// 校验有效期
			Long validTimes = staff.getValidDate().getTime();
			Long nowTimes = new Date().getTime();
			if (nowTimes > validTimes) {
				// 已过期
				msg = "用户已过期！";
				break;
			}
			// 验证成功
			success = true;
		} while (false);
		// 封装返回信息
		result.setSuccess(success);
		result.setMsg(msg);
		return result;
	}

	/**
	 * 处理权限点树形数据 add by xujun
	 * 
	 * @param purList
	 * @return
	 * @throws Exception
	 */
	public static List<JsonTreeData> handleTreeData(List<SysPurviewDto> purList) throws Exception {
		List<JsonTreeData> list = null;
		if (null != purList) {
			// 实例化对象
			list = new ArrayList<JsonTreeData>();
			// 循环处理信息
			for (SysPurviewDto pur : purList) {
				// 创建单个树形节点对象
				JsonTreeData tree = new JsonTreeData();
				tree.setId(pur.getPurId().toString());
				tree.setPid(pur.getParentPurId().toString());
				tree.setText(pur.getName());
				tree.setUrl(pur.getPurUrl());
				list.add(tree);
			}
		}
		return list;
	}
}
