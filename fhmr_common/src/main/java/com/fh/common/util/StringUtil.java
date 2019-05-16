package com.fh.common.util;

import java.io.UnsupportedEncodingException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字符串工具类
 * 
 * @author YuBin
 *
 */
public class StringUtil {
	
	public static final String arrTest[] ={"[br]","[/b]","[/i]","[/u]","[/size]","[/color]","[/align]","[/url]","[/email]","[/img]"};
	public static final String arrParam[]={"\\[br\\]","\\[b\\](.+?)\\[/b\\]",
						"\\[i\\](.+?)\\[/i\\]",
						"\\[u\\](.+?)\\[/u\\]",
						"\\[size=(.+?)\\](.+?)\\[/size\\]",
						"\\[color=(.+?)\\](.+?)\\[/color\\]",
						"\\[align=(.+?)\\](.+?)\\[/align\\]",
						"\\[url=(.+?)\\](.+?)\\[/url\\]",
						"\\[email=(.+?)\\](.+?)\\[/email\\]," +
						"\\[img=(.+?)\\](.+?)\\[/img\\]"};
	public static final String arrCode[]={"<br>","<b>$1</b>","<i>$1</i>","<u>$1</u>",
						"<font size=\"$1\">$2</font>",
						"<font color=\"$1\">$2</font>",
						"<div align=\"$1\">$2</div>",
						"<a href=\"$1\" target=\"_blank\">$2</a>",
						"<a href=\"email:$1\">$2</a>",
						"<img src=\"$1\" border=0>$2</img>"};
	
	
	
	public static int getInt(String content) {
		int intContent;
    	try{
    		intContent = Integer.parseInt(content);
    	}catch(Exception e){
    		intContent = 0;
    	}
    	return intContent;
	}
	
	public static long getLong(String content) {
		long lngContent;
    	try{
    		lngContent = Long.parseLong(content);
    	}catch(Exception e){
    		lngContent = 0L;
    	}
    	return lngContent;
	}
	
	/**
	 * 将指定的对象转换为String类型
	 * 
	 * @param curObject
	 *            传入对象参数
	 * @return String
	 */
	public static String getString(Object curObject) {
		if (null == curObject) {
			throw new NullPointerException("The input object is null.");
		} else {
			return curObject.toString();
		}
	}
	
    /**
     * 转换字符,用于替换提交的数据中存在非法数据:"'"
     * @param Content
     * @return
     */
    public static String replaceChar(String content) {
        String newstr = "";
        newstr = content.replaceAll("\'", "''");
        return newstr;
    }
    
    /**
     * 对标题""转换为中文“”采用对应转换
     * @param Content
     * @return
     */
    public static  String replaceSymbol(String content){
        int intPlaceNum=0;
        int Num=0;
        String strContent =content;
        while(true){
            //判断是否还存在"
            intPlaceNum=strContent.indexOf("\"");
            if(intPlaceNum<0){
                break;
            }else{
              if(Num%2==0){strContent=strContent.replaceFirst("\"","“");
              }else{strContent=strContent.replaceFirst("\"","”");}
              Num=Num+1;
            }
        }
        return strContent;
    }
	
    /**
     * 替换HTML标记
     * @param Content
     * @return
     */
    public static  String replaceCharToHtml(String content){
         String strContent =content;
         strContent = strContent.replaceAll("<", "&lt;");
         strContent = strContent.replaceAll(">", "&gt;");
         strContent = strContent.replaceAll("\"", "&quot;");
         return strContent;
    }
    
    public static  String replaceHtmlToChar(String content){
        String strContent =content;
        strContent = strContent.replaceAll("&lt;", "<");
        strContent = strContent.replaceAll("&gt;", ">");
        strContent = strContent.replaceAll("&quot;", "\"");
        return strContent;
   }
    
    //数据库替换
    public static String replaceCharToSql (String content){
        String strContent =content;
        strContent = strContent.replaceAll("%", "\\\\%");
        return strContent;
   }
    
    public static String toHtmlValue(String value)
    {
        if (null == value)
        {
            return null;
        }
        char a = 0;
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < value.length(); i++)
        {
            a = value.charAt(i);
            switch (a)
            {
            // 双引号
            case 34:
                buf.append("&#034;");
                break;
                // &号
            case 38:
                buf.append("&amp;");
                break;
                // 单引号
            case 39:
                buf.append("&#039;");
                break;
                // 小于号
            case 60:
                buf.append("&lt;");
                break;
                // 大于号
            case 62:
                buf.append("&gt;");
                break;
            default:
                buf.append(a);
                break;
            }
        }
        return buf.toString();
    }
    
    
    
    
    /**
     * 标题中含有特殊字符替换 如:●▲@◎※ 主要在标题中使用
     * @param Content
     * @return
     */
    public static String replaceSign(String content){
          String strContent="";
          strContent = content.replaceAll("\\*", "");
          strContent = strContent.replaceAll("\\$", "");
          strContent = strContent.replaceAll("\\+", "");
          String arrStr[]={":", "：", "●", "▲", "■", "@", "＠", 
        		  "◎", "★", "※", "＃", "〓", "＼", "§", "☆", 
        		  "○", "◇", "◆", "□", "△", "＆", "＾", "￣", 
        		  "＿","♂","♀","Ю","┭","①","「","」","≮","§",
        		  "￡","∑","『","』","⊙","∷","Θ","の","↓","↑",
        		  "Ф","~","Ⅱ","∈","┣","┫","╋","┇","┋","→",
        		  "←","!","Ж","#"};
          for (int i = 0; i<arrStr.length; i++) {
               if((strContent.indexOf(arrStr[i]))>=0){
                   strContent = strContent.replaceAll(arrStr[i], "");
               }
           }
          
       return strContent;
     }
	
    /**
     * 替换所有英文字母
     * @param Content
     * @return
     */
    public static  String replaceLetter(String content){
        String strMark="[^[A-Za-z]+$]";
        String strContent="";
        strContent = content.replaceAll(strMark, "");
        return strContent;
   }

   /**
    * 替换所有数字
    * @param Content
    * @return
    */
   public static  String replaceNumber(String content){
       String strMark="[^[0-9]+$]";
       String strContent="";
       strContent = content.replaceAll(strMark, "");
       return strContent;
  }

  /**
   * 将/n转换成为回车<br> ,空格转为&nbsp;
   * @param Content
   * @return
   */
   public static  String replaceBr(String content){
	   if(content==null){return "";}
	   String strContent = "";
	   
	  // String strMark ="[/\n\r\t]";
	  
	   //strContent = content.replaceAll(strMark,"<br>");
	   
	   strContent = content.replaceAll("\n\r\t", "<br>");
	   strContent = strContent.replaceAll("\n\r", "<br>");
	   strContent = strContent.replaceAll("\r\n", "<br>");
	   strContent = strContent.replaceAll("\n", "<br>");
	   strContent = strContent.replaceAll("\r", "<br>");
	   strContent = strContent.replaceAll(" ", "&nbsp;");
       return strContent;
   }

   /**
    * 清除所有<>标记符号 主要在搜索中显示文字内容 而不显示样式
    * @param Content
    * @return
    */
   public static String replaceMark(String content) {
      String strContent = "";
      String strMark="<\\s*[^>]*>";
      strContent=content.trim();
      strContent = strContent.replaceAll("\"", "");
      strContent = strContent.replaceAll("\'", "");
      //删除所有<>标记
      strContent = strContent.replaceAll(strMark, "");
      strContent = strContent.replaceAll("&nbsp;", "");
      strContent = strContent.replaceAll(" ", "");
      strContent = strContent.replaceAll("　", "");
      strContent = strContent.replaceAll("\r", "");
      strContent = strContent.replaceAll("\n", "");
      strContent = strContent.replaceAll("\r\n", "");
      return strContent;
   } 
   
   /**
    * 清楚Word垃圾代码
    * @param Content
    * @return
    */
   public static String clearWord(String content) {
      String strContent = "";
      strContent=content.trim();
      strContent = strContent.replaceAll("x:str", "");
      //Remove Style attributes
      strContent = strContent.replaceAll("<(\\w[^>]*) style=\"([^\"]*)\"",  "<$1");
      //Remove all SPAN  tags
      strContent = strContent.replaceAll("<\\/?SPAN[^>]*>", "");
      //Remove Lang attributes
      strContent = strContent.replaceAll("<(\\w[^>]*) lang=([^ |>]*)([^>]*)","<$1$3");
      //Remove Class attributes
      strContent = strContent.replaceAll("<(\\w[^>]*) class=([^ |>]*)([^>]*)", "<$1$3");
      //Remove XML elements and declarations
      strContent = strContent.replaceAll("<\\\\?\\?xml[^>]*>", "") ;
      //Remove Tags with XML namespace declarations: <o:p></o:p>
      strContent = strContent.replaceAll("<\\/?\\w+:[^>]*>", "");
      return strContent;
   }
   
   /**
    * 对组ID信息进行处理 转换为标准ID组 并过滤重复的信息
    * @param teamId
    * @return
    */
   public static String checkTeamId(String teamId) {
         String strTeamId = "";
         String strTempId = "";
         String strTemp = "";
         String[] arrTeamId = teamId.split(",");
         for(int num=0; num<arrTeamId.length; num++){
             strTemp=arrTeamId[num].trim();
             if((!strTemp.equals(""))&&(!strTemp.equals("0"))){
                 if ((strTempId.indexOf("," + strTemp + ",")) >= 0) { //表示已经保存过了
                 }else {
                     if(strTeamId.equals("")){
                        strTeamId=strTemp;
                        strTempId=strTempId+","+strTemp+",";;
                     }else{
                        strTeamId=strTeamId+","+strTemp;
                        strTempId=strTempId+strTemp+",";
                    }
                 }
             }
         }
         return strTeamId;
     }
   
   
   
   public static String replaceUbb(String content) { 
	   String strContent = content;
       try{
           for (int num=0; num<arrTest.length ;num++ ){
               if ((strContent.indexOf(arrTest[num]))>= 0){
                   try{strContent = strContent.replaceAll(arrParam[num],arrCode[num]);}catch(Exception ex) {}
               }
           }
       }catch(Exception e) {
    	  //System.out.println("UBB CODE 错误"+e);
       }
	   return strContent;
   }
   
   /**
    * 判定是否为数字
    * @param source
    * @return
    */
   public static boolean isNumeric(String source){
	   Pattern pattern = Pattern.compile("[0-9]*");
	   Matcher isNum = pattern.matcher(source);
	   
	   if(source == null) return false;
	   if("".equals(source)) return false;
	   
	   if(!isNum.matches())
	   {
		   return false;
	   }
	   return true;
   }
   
 
	/**
	 * 判断传入的字符串如果为null则返回"",否则返回其本身
	 * 
	 * @param string
	 * @param instant
	 * @return String
	 */
	public static String convertNull(String string, String instant) {
		return isNull(string) ? instant : string;
	}

	/**
	 * {@link #convertNull(String, String)}
	 * 
	 * @param string
	 * @return String
	 */
	public static String convertNull(String string) {
		return convertNull(string, "");
	}
	
	public static String convertNull(Object obj,String instant){
		return (isNull(obj))?instant:String.valueOf(obj);
	}
   
	/**
	 * 判断对象是否为空
	 * 
	 * @param obj
	 *            Object
	 * @return boolean 空返回true,非空返回false
	 */
	public static boolean isNull(Object obj) {
		return (null == obj) ? true : false;
	}
	/**
     * Description:判断字段空null <br>
     *
     * @param s
     * @return boolean
     */
    public static boolean isNull(String s)
    {
        if (s == null || "".equals(s.trim()))
        {
            return true;
        }
        
        return false;
    }
    
    public static boolean isFullNull(String s){
        if (s == null || "".equals(s.trim()) || "null".equals(s))
        {
            return true;
        }
        
        return false;
    }
    
	/**
	 * list的各项用指定分隔符连接成一个字符串
	 * 
	 * @param join  分隔符
	 * @param listStr  要拼接的list
	 * @return
	 */
	public static String join(String join, List<Object> listStr) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0, len = listStr.size(); i < len; i++) {
			if (i == (len - 1)) {
				sb.append(listStr.get(i));
			} else {
				sb.append(listStr.get(i)).append(join);
			}
		}
		return sb.toString();
	}
    
	/** 
     * 获取百分比
     * 
     *  @param  p1
     *  @param  p2
     *  @return 
     */ 
    public static String percent( double  p1,  double  p2){
    	if(p2 == 0)
    	{
    		return "0.00%";
    	}
        String str;
        double  p3  =  p1  /  p2;
        NumberFormat nf  =  NumberFormat.getPercentInstance();
        nf.setMinimumFractionDigits(2);
        str  =  nf.format(p3);
        return  str;
    }
    
    /**
     * 产生随机数
     * @param n：随机数位数
     * @return 返回随机数字符串
     */
    public static String generateRandomNum(int n){
    	String randomNum = "";
    	Random rand = new Random();
    	for(int i = 0;i < n;i++){
    		randomNum += rand.nextInt(10);
    	}
    	return randomNum;
    }
    
	/**
	 * 获取字符串的长度，如果有中文，则每个中文字符计为2位
	 * 
	 * @param value
	 *            指定的字符串
	 * @return 字符串的长度
	 * @author wwy add 20180713
	 * @throws UnsupportedEncodingException
	 */
	public static int length(String value) throws UnsupportedEncodingException {
		int valueLength = value.getBytes("GBK").length;

		/*String chinese = "[\u0391-\uFFE5]";

		 获取字段值的长度，如果含中文字符，则每个中文字符长度为2，否则为1 
		for (int i = 0; i < value.length(); i++) {
			 获取一个字符 
			String temp = value.substring(i, i + 1);

			 判断是否为中文字符 
			if (temp.matches(chinese)) {
				 中文字符长度为2 
				valueLength += 2;
			} else {
				 其他字符长度为1 
				valueLength += 1;
			}
		}*/

		return valueLength;
	}
	
	/**
	 * 截取含有汉字的字符串
	 * 
	 * @param str
	 *            需要截取的字符串
	 * @param subSLength
	 *            截取字符串长度
	 * @return 截取后字符串
	 * @throws UnsupportedEncodingException
	 */
	public static String subStr(String str, int subSLength) throws UnsupportedEncodingException {
		if (null == str || str.length() == 0) {
			return "";
		}

		int tempSubLength = subSLength;// 截取字节数
		String subStr = str.substring(0, str.length() < subSLength ? str.length() : subSLength);// 截取的子串
		int subStrByetsL = subStr.getBytes("GBK").length;// 截取子串的字节长度
		// int subStrByetsL = subStr.getBytes().length;//截取子串的字节长度
		// 说明截取的字符串中包含有汉字
		while (subStrByetsL > tempSubLength) {
			int subSLengthTemp = --subSLength;
			subStr = str.substring(0, subSLengthTemp > str.length() ? str.length() : subSLengthTemp);
			subStrByetsL = subStr.getBytes("GBK").length;
			// subStrByetsL = subStr.getBytes().length;
		}
		return subStr;
	}
    
    public static void main(String[] args) {
    	try {
    		String str = "我123是中国人1234";
			System.out.println(StringUtil.length(str));
			
			System.out.println(StringUtil.subStr(str, 12));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
    	
//		System.out.println(StringUtil.isNumeric("123"));
//		System.out.println(StringUtil.percent(10, 100));
//		System.out.println(StringUtil.generateRandomNum(6));
	}
   
}
