package com.fh.common.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class HttptoPost {
	/**
	 * 发送Http post请求 创建文件
	 * 
	 * @param params
	 *            请求参数
	 * @param URL
	 *            请求url
	 * @return 返回信息
	 */

	public static JSONObject postToServer(Map<String, Object> params, String url) throws Exception {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		CloseableHttpResponse response = null;
		JSONObject jsonObject = null;
		HttpPost httppost = new HttpPost(url);
		List<NameValuePair> nameValuePairList = new ArrayList<NameValuePair>();
		String inParamStr = JSON.toJSONString(params);
		nameValuePairList.add(new BasicNameValuePair("inParam", inParamStr));
		UrlEncodedFormEntity reqEntity = new UrlEncodedFormEntity(nameValuePairList, "utf-8");
		httppost.setEntity(reqEntity); // 参数写入httppost
		response = httpclient.execute(httppost);
		if (response.getStatusLine().getStatusCode() == 200) {
			HttpEntity resEntity = response.getEntity();
			String jsonStr = EntityUtils.toString(resEntity);
			System.out.println(jsonStr);
			if (jsonStr != null) {
			}
			jsonObject = JSONObject.parseObject(jsonStr);
			String state = jsonObject.getString("state");
			if (!"S".equals(state)) {
				String time = jsonObject.getString("time");
				String errorMsg = jsonObject.getString("errorMsg");
				throw new Exception("请求失败！！请求时间：" + time + " 返回错误信息：" + errorMsg);
			} else {
			}
		} else {
		}
		return jsonObject;
	}

	/**
	 * 发送 文件 post 请求 上传文件
	 * 
	 * @throws Exception
	 */
	public static String postFile(String url, String resId, String time, File file, String codeFormate) throws Exception {
		String result = "";
		CloseableHttpClient httpclient = HttpClients.createDefault();
		CloseableHttpResponse response = null;
		try {
			// 创建默认的httpClient实例.
			// 创建httppost
			HttpPost httppost = new HttpPost(url);
			FileBody resFileBody = new FileBody(file);
			HttpEntity reqEntity = MultipartEntityBuilder.create().addPart("resFile", resFileBody).addTextBody("resId", resId).addTextBody("sysCode", codeFormate).addTextBody("time", time).build();
			httppost.setEntity(reqEntity); // 文件写入httppost body

			response = httpclient.execute(httppost);
			HttpEntity resEntity = response.getEntity();
			result = EntityUtils.toString(resEntity, "UTF-8");
			EntityUtils.consumeQuietly(resEntity);
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if (null != response) {
					response.close();
				}
				httpclient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}
