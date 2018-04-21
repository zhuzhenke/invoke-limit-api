package com.amazon.util;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Calendar;
import java.util.Date;

/**
 * @author zhuzhenke
 * @date 2018/03/26
 */
public class AmzDateUtil {

//    /**
//     * 获取本周一时间 返回时间如:2017-03-13 00:00:00
//     */
//    public static Date getThisWeekMonday() {
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(new Date());
//        cal.add(Calendar.DAY_OF_MONTH, -1); //解决周日会出现 并到下一周的情况
//        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
//
//        return DateUtils.truncate(cal.getTime(), Calendar.DATE);
//    }
//
//    /**
//     * 获取上周一时间 返回时间如:2017-03-06 00:00:00
//     */
//    public static Date getLastWeekMonday() {
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(DateUtils.addDays(new Date(), -1));
//        cal.add(Calendar.WEEK_OF_YEAR, -1);// 一周
//        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
//
//        return DateUtils.truncate(cal.getTime(), Calendar.DATE);
//    }

    /**
     * 获取指定日期最后一秒时刻
     */
    public static Date getEndOfDay(Date date) {
        if (date == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DATE);
        calendar.set(year, month, day, 23, 59, 59);
        return calendar.getTime();
    }

    /**
     * 获取指定日期最后一秒时刻
     */
    public static Date getStartOfDay(Date date) {
        if (date == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DATE);
        calendar.set(year, month, day, 0, 0, 0);
        return calendar.getTime();
    }

    /**
     * 将Date类转换为XMLGregorianCalendar
     */
    public static XMLGregorianCalendar dateToXmlDate(Date date) {
        try {
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            DatatypeFactory dtf = DatatypeFactory.newInstance();
            XMLGregorianCalendar dateType = dtf.newXMLGregorianCalendar();
            dateType.setYear(cal.get(Calendar.YEAR));
            //由于Calendar.MONTH取值范围为0~11,需要加1
            dateType.setMonth(cal.get(Calendar.MONTH) + 1);
            dateType.setDay(cal.get(Calendar.DAY_OF_MONTH));
            dateType.setHour(cal.get(Calendar.HOUR_OF_DAY));
            dateType.setMinute(cal.get(Calendar.MINUTE));
            dateType.setSecond(cal.get(Calendar.SECOND));
            return dateType;
        } catch (DatatypeConfigurationException e) {
            return XMLGregorianCalendarImpl.parse("2017-01-01");
        }
    }

    /**
     * 将XMLGregorianCalendar转换为Date
     */
    public static Date xmlDate2Date(XMLGregorianCalendar cal) {
        return cal.toGregorianCalendar().getTime();
    }

//    public static void main(String[] args) throws Exception {
//        System.out.println(DateUtil.getDateTime(xmlDate2Date(dateToXmlDate(DateUtil.parseDateTime("2015-05-25 00:09:09")))));
//    }

}
