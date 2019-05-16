package com.fh.common.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 资源文件读取工具类
 * 
 * @author xujun
 *
 */
public class PropertiesReader {

	private static PropertiesReader reader = null;

	private Properties propsCode = null;

	public static final String DEFAULT_PROPERTIES_FILE = "/fh-web.properties";

	private static Map<String, PropertiesReader> phoenixCloudMap = new HashMap<String, PropertiesReader>();

	/**
	 * 获得一个PropertiesReader实例 默认读取根目录下"/fh-web.properties"配置
	 * 
	 * @return
	 */
	public static PropertiesReader getInstance() {
		if (phoenixCloudMap.containsKey(DEFAULT_PROPERTIES_FILE) && null != phoenixCloudMap.get(DEFAULT_PROPERTIES_FILE)) {
			reader = phoenixCloudMap.get(DEFAULT_PROPERTIES_FILE);
		} else {
			reader = new PropertiesReader("");
			phoenixCloudMap.put(DEFAULT_PROPERTIES_FILE, reader);
		}
		return reader;
	}

	/**
	 * 获得一个PropertiesReader实例
	 * 
	 * @param confFilePath
	 *            自定义全路径</br> 例:"/phoenixCloud.properties"
	 * @return
	 */
	public static PropertiesReader getInstance(String confFilePath) {
		if (phoenixCloudMap.containsKey(confFilePath) && null != phoenixCloudMap.get(confFilePath)) {
			reader = phoenixCloudMap.get(confFilePath);
		} else {
			reader = new PropertiesReader(confFilePath);
			phoenixCloudMap.put(confFilePath, reader);
		}
		return reader;
	}

	/**
	 * 根据路径创建properties
	 * 
	 * @param path
	 * @return
	 */
	public PropertiesReader(String fileFullName) {
		propsCode = new Properties();
		InputStream is = null;
		try {
			if (StringUtil.isNull(fileFullName)) {
				is = getClass().getResourceAsStream(DEFAULT_PROPERTIES_FILE);
			} else {
				is = getClass().getResourceAsStream(fileFullName);
			}

			if (is != null) {
				BufferedReader bf = new BufferedReader(new InputStreamReader(is));
				propsCode.load(bf);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null) {
					is.close();
					is = null;
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	/**
	 * 根据key读取value
	 * 
	 * @param key
	 * @return
	 */
	public String getValue(Object key) {
		String value = "";
		try {
			if (key != null && !StringUtil.isFullNull(propsCode.getProperty(key.toString()))) {
				value = propsCode.getProperty(key.toString());
			}
			return value;
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("phoenixCloudInfoError" + e.toString());
			return null;
		}
	}

	public String getValue(Object key, Object del) {
		String value = getValue(key);
		if (null == value || value.isEmpty()) {
			value = getValue(del);
		}
		return value;
	}
}
