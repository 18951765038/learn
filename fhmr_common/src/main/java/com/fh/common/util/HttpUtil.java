package com.fh.common.util;

import com.alibaba.fastjson.JSON;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 用于发送http请求
 *
 * @author liuchengkuan
 */
public class HttpUtil {

    private final static Logger LOGGER = LoggerFactory.getLogger(HttpUtil.class);

    public final static String TYPE_POST = "post";
    public final static String TYPE_GET = "get";

    /**
     * @param method 如果有get 是get请求  否则就是post
     * @param url    请求地址
     * @param params 请求参数
     * @return json格式字符串
     * @throws Exception
     * @author liuchengkuan
     */
    public static String httpMessageMothod(String method, String url, Map<String, Object> params) throws Exception {
        LOGGER.debug("准备发送请求，\n请求类型：{}, \nURL：{}, \n参数：{}",
                new Object[]{method, url, JSON.toJSONString(params)});
        String jsonStr = "";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        List<NameValuePair> nameValuePairList = new ArrayList<NameValuePair>();
        Set<String> setStr = params.keySet();
        for (String str : setStr) {
        	if(params.get(str)==null){
        		nameValuePairList.add(new BasicNameValuePair(str, null));
        	}else{
        		 nameValuePairList.add(new BasicNameValuePair(str, params.get(str).toString()));
        	}
           
        }
        UrlEncodedFormEntity reqEntity = new UrlEncodedFormEntity(nameValuePairList, "utf-8");
        if ("get".equals(method)) {
            String strEntity = EntityUtils.toString(reqEntity, "utf-8");
            HttpGet httpget = new HttpGet(url + "?" + strEntity);
            response = httpclient.execute(httpget);
        } else {
            // 构造http post请求
            HttpPost httppost = new HttpPost(url);
            httppost.setEntity(reqEntity); // 参数写入httppost
            response = httpclient.execute(httppost);
        }
        if (response.getStatusLine().getStatusCode() == 200) {
            HttpEntity resEntity = response.getEntity();
            jsonStr = EntityUtils.toString(resEntity);
        } else {
            throw new Exception(JSON.toJSONString(params) + "请求第三方接口失败！！");
        }
        //关闭和释放链接和资源
        EntityUtils.consume(reqEntity);
        if (response != null) {
           response.close();
        }
        if (httpclient != null) {
            httpclient.close();
        }
        return jsonStr;
    }
}
