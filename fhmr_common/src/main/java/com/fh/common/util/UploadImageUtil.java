package com.fh.common.util;

import java.io.IOException;

import net.coobird.thumbnailator.Thumbnails;

import org.springframework.web.multipart.MultipartFile;

/**
 * 上传图片工具类
 * 
 * @author wwy add 2018703
 *
 */
public class UploadImageUtil {

	/**
	 * 生成缩略图
	 * 
	 * @param resFile
	 *            文件
	 * @param width
	 *            宽
	 * @param height
	 *            高
	 * @param realUploadPath
	 *            缩略图实际存储路径
	 * @throws IOException
	 */
	public static void thumbnailUploadImage(MultipartFile resFile, int width, int height, String realUploadPath) throws Exception {
		Thumbnails.of(resFile.getInputStream()).size(width, height).toFile(realUploadPath);
	}

}
