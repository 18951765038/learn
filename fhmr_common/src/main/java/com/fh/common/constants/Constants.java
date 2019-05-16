package com.fh.common.constants;

import java.text.SimpleDateFormat;

/**
 * 
 * @author xujun
 *
 */
public class Constants {
	/**
	 * 成功失败状态
	 */
	public final static String SUCCESS = "success";
	public final static String FAIL = "fail";

	public final static String YES = "Y";
	public final static String NO = "N";

	/**
	 * 默认视频主业务id
	 */
	public final static Integer VIDEO = 300;
	/**
	 * 默认图片主业务id
	 */
	public final static Integer IMAGE = 200;
	
	/**
	 * 用户操作日志类型 1 = 资源上传  2 = 资源删除  3 = 资源上架  4 = 资源下架
	 */
	public final static Integer RES_UPLOAD_LOG = 1;
	public final static Integer RES_DEL_LOG = 2;
	public final static Integer RES_UP_SHELF_LOG = 3;
	public final static Integer RES_DOWN_SHELF_LOG = 4;

	/**
	 * 上传状态 0 未上传 ，1已上传，2上传处理中 3 上传失败
	 */
	public final static Integer IS_UPLOAD_NO = 0;
	public final static Integer IS_UPLOAD_YES = 1;
	public final static Integer IS_UPLOAD_DOING = 2;
	public final static Integer IS_UPLOAD_FAIL = 3;

	/**
	 * 审核状态，'-1未审核，1审核通过，0审核不通过'
	 */
	public final static Integer IS_AUDIT_NONE = -1;
	public final static Integer IS_AUDIT_YES = 1;
	public final static Integer IS_AUDIT_NO = 0;

	/**
	 * 上架状态，0 ：上架、1：下架' 2：未上架
	 */
	public final static Integer UP_STATUS_UP = 0;
	public final static Integer UP_STATUS_DOWN = 1;
	public final static Integer UP_STATUS_NO = 2;

	/**
	 * 调用接口返回状态
	 */
	public final static String SERVER_SUCCESS = "S";
	public final static String SERVER_FAIL = "F";

	/**
	 * 资源库返回资源尺寸大小(L(小),M（中）,B（大）)，默认L适用于手机
	 */
	public final static String VIDEO_SIZE_L = "L";
	public final static String VIDEO_SIZE_M = "M";
	public final static String VIDEO_SIZE_B = "B";

	/**
	 * 删除状态 0：未删除 1：删除
	 */
	public final static Integer NOT_DELETE = 0;
	public final static Integer DELETE = 1;
	/**
	 * 日常日期格式
	 */
	public final static SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd");
	public final static SimpleDateFormat DATEFORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	/**
	 * 常用数字状态
	 */
	public final static Integer ZERO = 0;
	public final static Integer ONE = 1;
	public final static Integer TWO = 2;
	public final static Integer THREE = 3;
	public final static Integer FOUR = 4;
	public final static Integer FIVE = 5;
	public final static Integer SIX = 6;

	/**
	 * 用户类型(字典表标识)
	 */
	public final static String STAFF_TYPE_ID = "STAFF_TYPE_ID";
	/**
	 * 学段类型(字典表标识)
	 */
	public final static String STU_SEG_ID = "STU_SEG_ID";
	/**
	 * 学段类型对应表名
	 */
	public final static String STU_SEG_ID_TABLE = "r_book";
	/**
	 * 册别类型(字典表标识)
	 */
	public final static String KIND_ID = "KIND_ID";
	/**
	 * 册别类型对应表名
	 */
	public final static String KIND_ID_TABLE = "r_book";
	/**
	 * 学科字典值(字典表标识)
	 */
	public final static String SUBJECT_ID = "SUBJECT_ID";
	/**
	 * 年级字典值(字典表标识)
	 */
	public final static String CLASS_ID = "CLASS_ID";
	/**
	 * 出版社标识
	 */
	public final static String PRESS_ID = "PRESS_ID";

	/**
	 * 默认中国机构id
	 */
	public final static String CHINA_ORG = "100000";

	/**
	 * 内外网类型标识
	 */
	public final static String IN_NET = "IN_NET";

	public final static String OUT_INT = "OUT_INT";

	/**
	 * 外网系统标识
	 */
	public final static String OUT_CONFIG = "book_down_out_dn";
	
	//用户信息默认值 用户采集
	public final static String NICK_NAME = "凤凰";
	public final static String GENDER = "0";
	public final static String CITY = "南京";
	public final static String PROVINCE = "江苏";
	public final static String COUNTRY = "中国";
	public final static String OPENID = "0";
	
}
