package com.fh.common.bo;
import com.fh.common.dto.RBookResDto;

/**
 * 资源BO
 * @author renchaun
 *
 */
public class RBookResBo extends RBookResDto{
    /**
     * 资源格式
     */
    private String resFormat1;
    /**
     * 资源的业务类型 
     */
    private String resType;
   
    /**
     * 调用资源库时间
     */
    private String hadeTimeStr;
    /**
     * 资源库处理完回调时间
     */
    private String backCallTimeStr;
    /**
     * 创建时间
     */
    private String createTimeStr;
    /**
     * 更新时间
     */
    private String updateTimeStr;
	public String getResFormat() {
		return resFormat;
	}
	public void setResFormat(String resFormat) {
		this.resFormat = resFormat;
	}
	public String getResType() {
		return resType;
	}
	public void setResType(String resType) {
		this.resType = resType;
	}
	public String getHadeTimeStr() {
		return hadeTimeStr;
	}
	public void setHadeTimeStr(String hadeTimeStr) {
		this.hadeTimeStr = hadeTimeStr;
	}
	public String getBackCallTimeStr() {
		return backCallTimeStr;
	}
	public void setBackCallTimeStr(String backCallTimeStr) {
		this.backCallTimeStr = backCallTimeStr;
	}
	public String getCreateTimeStr() {
		return createTimeStr;
	}
	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}
	public String getUpdateTimeStr() {
		return updateTimeStr;
	}
	public void setUpdateTimeStr(String updateTimeStr) {
		this.updateTimeStr = updateTimeStr;
	}
    
}