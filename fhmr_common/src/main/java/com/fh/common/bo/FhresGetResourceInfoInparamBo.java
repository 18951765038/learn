package com.fh.common.bo;

import java.util.Date;

import com.alibaba.fastjson.JSON;
import com.fh.common.util.DateTimeUtils;

public class FhresGetResourceInfoInparamBo {
	 //资源id
    protected Integer resId;
    //资源创建系统
    protected String sysCode;
    //请求时间
    protected String time;
    //错误信息
    protected  String errorMsg;
    //状态码
    protected  String state12;

    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public Date getTimeByDate()  {
        return DateTimeUtils.parseDatetime(time);
    }

    public void setTimeByDate(Date time) {
        this.time=DateTimeUtils.formatDatetime(time);
    }
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String toJson(){
        return  JSON.toJSONString(this);
    }
    @Override
    public String toString() {
        return toJson().toString();
    }

}
