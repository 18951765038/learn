package com.fh.common.util;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.fh.common.vo.ResultVo;
/**
 * 通用结果类
 * @author renchuan
 *
 */
public class ResultUtil {
	 /**
     * 获取对象信息
     */
    public static ResultVo getResultVo(boolean success, String msg) {
    	String time= DateTimeUtils.formatDatetime(new Date());
    	ResultVo resultVo = new ResultVo();
    	resultVo.setSuccess(success);
    	resultVo.setTime(time);
    	resultVo.setMsg(msg);
		return resultVo;
    }
    /**
     * 获取Map集合 信息
     */
    public static Map<String, Object> getResultMap(boolean success, String msg) {
    	String time= DateTimeUtils.formatDatetime(new Date());
    	Map<String, Object> resultMap = new HashMap<>();
    	resultMap.put("success", success);
    	resultMap.put("time", time);
    	resultMap.put("msg", msg);
    	return resultMap;
    }
//  http://10.2.176.130:8080/mnt/data/200/27/6/201/origin/170536/图片1.jpg
	public static String getResIdIpAddr(String url,String url2) {
		String[]  arry0 = url.split("\\//");
		String[]  arry1 = arry0[1].split("\\:");				
		String arry2 = arry1[1];
		int beginIndex = arry2.indexOf("/");
		String news = arry2.substring(beginIndex, arry2.length());
        String m = "https://"+url2+news;
		return m;
	}
}
