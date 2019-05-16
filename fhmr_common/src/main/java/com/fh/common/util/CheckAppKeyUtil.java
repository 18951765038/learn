package com.fh.common.util;
/**
 * 通用结果类
 * @author renchuan
 *
 */
public class CheckAppKeyUtil {
    /**
	 * 验证参数是否合法
	 * @author renchuan
	 */
	public static boolean checkAppKey(String appKey) throws Exception {
		if(appKey==null||(!"FH_MR".equals(appKey))){
			return true;
		}else{
			return false;
		}
	}
}
