package cn.edu.guet.coursetable.util;

import android.util.Log;


import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

import cn.edu.guet.coursetable.model.Account;
import cn.edu.guet.coursetable.model.TermInfo;


/**
 * 时间工具类，主要用于计算当前周数
 */
public class DateUtil {


	static Account account2;

	public static String getDay(int day) {
		switch (day) {
			case 1:
				return "星期一";
			case 2:
				return "星期二";
			case 3:
				return "星期三";
			case 4:
				return "星期四";
			case 5:
				return "星期五";
			case 6:
				return "星期六";
			case 7:
				return "星期日";
			default:
				return "错误的日期";
		}
	}

	public static long getStartTime(int week){
		long now=System.currentTimeMillis();
		long weekDay=1000*60*60*24*7;
		return now-weekDay*week;
	}
	public static Long getMonday(){
		Calendar cal = Calendar.getInstance();
		// 设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
		cal.setFirstDayOfWeek(Calendar.MONDAY);
		// 获得当前日期是一个星期的第几天
		int dayWeek = cal.get(Calendar.DAY_OF_WEEK);
		Log.d("TAG", "first:dayWeek "+dayWeek);
		if(dayWeek==1){
			dayWeek = 8;
		}
		int a=cal.getFirstDayOfWeek() - dayWeek;
		Log.d("TAG", "getMonday:a "+a);
		Log.d("TAG", "dayweek:dayWeek "+dayWeek);
		Log.d("TAG", "firstDay:dayWeek "+cal.getFirstDayOfWeek());
		cal.add(Calendar.DATE, a);// 根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
		return cal.getTimeInMillis();
	}
	public static long getStartDate(int offsetWeek){
		long offsetWeeks=(long) offsetWeek;
		LocalDate localDate =LocalDate.now();
		LocalDate monday=LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
		monday=monday.plusWeeks(-offsetWeeks);
		return monday.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
	}



	public static long getCurrentWeek(long date){
		LocalDate localDate=LocalDateTime.ofInstant(Instant.ofEpochMilli(date), ZoneId.systemDefault()).toLocalDate();
		LocalDate dateNow=LocalDate.now();
		long weekOffset=ChronoUnit.WEEKS.between(localDate,dateNow);
//		System.out.println("weekOffset"+weekOffset);
		return Math.abs(weekOffset)+1;
	}
	public static long getCurrentWeek(){

		LocalDate localDate;
		if (account2==null){
			localDate = LocalDate.now();
		}else{
			localDate = LocalDateTime.ofInstant(Instant.ofEpochMilli(account2.getWeek()), ZoneId.systemDefault()).toLocalDate();
		}
		LocalDate dateNow=LocalDate.now();
		long weekOffset=ChronoUnit.WEEKS.between(localDate,dateNow);
//		System.out.println("weekOffset"+weekOffset);
		return Math.abs(weekOffset)+1;
	}
	public static long getCurrentWeek(LocalDate localDate){
		LocalDate dateNow=LocalDate.now();
		long weekOffset=ChronoUnit.WEEKS.between(localDate,dateNow);
		return Math.abs(weekOffset)+1;
	}




//	public static long dateOffset(long week){
//		return 1000*60*60*24*7*(week-1);
//	}
//	public static long getCurrentWeek(long week){
//		long monday=getMonday();
//		long temp=monday-week;
//		return temp/(1000*60*60*24*7)+1;
//	}
	public static Date getMondayOfThisWeek() {
		Calendar cal = Calendar.getInstance();
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		return cal.getTime();

	}
}
