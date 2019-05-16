package com.fh.common.util;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 *  处理日期格式化问题的帮助类
 * @作者 renchuan
 * @version [版本号, 2016-6-11]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class DateTimeUtils
{
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
    private static final SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    
    private static final SimpleDateFormat sdf3 = new SimpleDateFormat("HH:mm:ss");
    
    private static final SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
    
    private static final SimpleDateFormat sdf5 = new SimpleDateFormat("yyyyMMddHHmm");
    
    private static final SimpleDateFormat sdf6 = new SimpleDateFormat("yyyyMMddHHmmss");
    
    private static final SimpleDateFormat sdf7 = new SimpleDateFormat("yyMMdd");
    
    private static final SimpleDateFormat sdf8 = new SimpleDateFormat("yyyy.MM.dd");
    
    private static final SimpleDateFormat sdf9 = new SimpleDateFormat("yyyy");
    
    private static final SimpleDateFormat sdfDateHourMinute = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    
    private static final SimpleDateFormat sdfMonthAndDay = new SimpleDateFormat("MM-dd");
    
  
    
    private DateTimeUtils()
    {
    }
  
    /**
     * 将形如yyyy-MM-dd HH:mm:ss字符串转化为日期形式
     * @params datetime
     * @return Date
     * @time 2013-7-2 上午10:08:47
     * @author wzj
     * */
    public synchronized static Date parseDatetime(String datetime)
    {
        try
        {
            if (datetime == null)
                return null;
            Date date = sdf.parse(datetime.replace("T", " "));
            return date;
        }
        catch (ParseException e)
        {
            return null;
        }
    }
    
    /**
     * 将形如yyyy-MM-dd字符串转化为日期形式
     * @params date
     * @return Date
     * @time 2013-7-2 上午10:08:47
     * @author wzj
     * */
    public synchronized static Date parseDate(String date)
    {
        try
        {
            return sdf2.parse(date);
        }
        catch (ParseException e)
        {
            return null;
        }
    }
    
    /**
     * 将形如yyyy-MM-dd字符串转化为日期形式
     * @params date
     * @return Date
     * @time 2013-7-2 上午10:08:47
     * @author wzj
     * */
    public synchronized static Date parseYearMonth(String date)
    {
        try
        {
            return sdf4.parse(date);
        }
        catch (ParseException e)
        {
            return null;
        }
    }
    
    /**
     * 将形如HH:mm:ss字符串转化为日期形式
     * @params time
     * @return Date
     * @time 2013-7-2 上午10:08:47
     * @author wzj
     * @throws ParseException 
     * */
    public synchronized static Date parseTime(String time) throws ParseException
    {

            return sdf3.parse(time);

    }
    
    /**
     * 将形如yyyy-MM-dd HH:mm字符串转化为日期形式
     * @params time
     * @return Date
     * @time 2013-7-2 上午10:08:47
     * @author wzj
     * @throws ParseException 
     * */
    public synchronized static Date parseDateHourMinute(String dateHourMinute) throws ParseException
    {

            return sdfDateHourMinute.parse(dateHourMinute.replace("T", " "));
 
    }
    
    public synchronized static Date parseDHM(String dateHourMinute) throws ParseException
    {

            return sdf5.parse(dateHourMinute);

    }
    
    public synchronized static Date parseDHMS(String dateHourMinute) throws ParseException
    {

            return sdf6.parse(dateHourMinute);
    }
    
    /**
     * 将形如MM-dd字符串转化为日期格式
     * @param [参数1]     [参数1说明]
     * @param [参数2]     [参数2说明]
     * @return [返回类型说明]
     * @throws ParseException 
     * @exception/throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public synchronized static Date parseMonthAndDay(String monthAndDay) throws ParseException
    {

            return sdfMonthAndDay.parse(monthAndDay);
  
    }
    
    /**
     * 将日期转化为形如yyyy-MM-dd HH:mm:ss格式的字符串
     * @param [参数1]     [参数1说明]
     * @param [参数2]     [参数2说明]
     * @return [返回类型说明]
     * @exception/throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public synchronized static String formatDatetime(Date date)
    {
        return date == null ? "" : sdf.format(date);
    }
    /**
     * 将日期转化为形如yyyyMMddHHmmss格式的字符串
     * @param [参数1]     [参数1说明]
     * @param [参数2]     [参数2说明]
     * @return [返回类型说明]
     * @exception/throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public synchronized static String formatDatetimeM(Date date)
    {
        return date == null ? "" : sdf6.format(date);
    }
    /**
     * 将日期转化为形如yyyy-MM-dd格式的字符串
     * @param [参数1]     [参数1说明]
     * @param [参数2]     [参数2说明]
     * @return [返回类型说明]
     * @exception/throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public synchronized static String formatDate(Date date)
    {
        return date == null ? "" : sdf2.format(date);
    }
    /**
     * 将日期转化为形如yyyy-MM-dd格式的字符串
     * @param [参数1]     [参数1说明]
     * @param [参数2]     [参数2说明]
     * @return [返回类型说明]
     * @exception/throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public synchronized static String formatDate8(Date date)
    {
        return date == null ? "" : sdf8.format(date);
    }
    
    /**
     * 将日期转化为形如yyyy-MM格式的字符串
     * @param [参数1]     [参数1说明]
     * @param [参数2]     [参数2说明]
     * @return [返回类型说明]
     * @exception/throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public synchronized static String formatYearMonth(Date date)
    {
        return date == null ? "" : sdf4.format(date);
    }
    /**
     * 将日期转化为形如yyyy格式的字符串
     * @param [参数1]     [参数1说明]
     * @param [参数2]     [参数2说明]
     * @return [返回类型说明]
     * @exception/throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public synchronized static String formatYear(Date date)
    {
    	return date == null ? "" : sdf9.format(date);
    }
    
    /**
     * 将日期转化为形如HH:mm:ss格式的字符串
     * @param [参数1]     [参数1说明]
     * @param [参数2]     [参数2说明]
     * @return [返回类型说明]
     * @exception/throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public synchronized static String formatTime(Date date)
    {
        return date == null ? "" : sdf3.format(date);
    }
    
    /**
     * 将日期转化为形如yyyy-MM-dd HH:mm格式的字符串
     * 
     * @params date
     * @return String
     * @time 2013-7-2 上午10:11:05
     * @author wzj
     * */
    public synchronized static String formatDateHourMinute(Date dateHourMinute)
    {
        return dateHourMinute == null ? "" : sdfDateHourMinute.format(dateHourMinute);
    }
    
    /**
     * 将日期转化成形如MM-dd格式的字符串
     * 
     * @param date
     * @return String
     * */
    public synchronized static String formatMonthAndDay(Date monthAndDay)
    {
        return monthAndDay == null ? "" : sdfMonthAndDay.format(monthAndDay);
    }
    /** 
     * 两个时间相差距离多少分
     * @param str1 时间参数 1 格式：1990-01-01 12:00:00 
     * @param str2 时间参数 2 格式：2009-01-01 12:00:00 
     * @return Long 返回值为：xx
     */  
    public static Long getDistanceTime(String str1, String str2) {   
        Date one;  
        Date two;  
        long day = 0;  
        long hour = 0;  
        long min = 0;   
        try {  
            one = sdf.parse(str1);  
            two = sdf.parse(str2);  
            long time1 = one.getTime();  
            long time2 = two.getTime();  
            long diff ;  
            if(time1<time2) {  
                diff = time2 - time1;  
            } else {  
                diff = time1 - time2;  
            }  
            min = ((diff / (60 * 1000)) - day * 24 * 60 - hour * 60);  
        } catch (ParseException e) {  
            e.printStackTrace();  
        }  
        return min;  
    }  
    
    /**
     * 将日期转化为形如yyMMdd格式的字符串
     * @param [参数1]     [参数1说明]
     * @param [参数2]     [参数2说明]
     * @return [返回类型说明]
     * @exception/throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public synchronized static String formatYearMonDay(Date date)
    {
        return date == null ? "" : sdf7.format(date);
    }
    /**
     * 离线登陆有效期，形如：yyyy-MM-dd
     * @return [返回类型说明]
     */
    public synchronized static String getOfflineDate() {
    	Calendar calendar2 = Calendar.getInstance();
		calendar2.add(Calendar.MONTH, 3);
		String three_days_after = sdf2.format(calendar2.getTime());
		return three_days_after;
    }
    
}
