package com.wangruidan.common.utils;

import java.util.Date;

public class DateUtil {

	/*
	* 方法1：(10分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src){
		
		//设置天
		src.setDate(1);
		src.setHours(0);//时
		src.setMinutes(0);//分
		src.setSeconds(0);//秒
		return src;
	}
	/*
	* 方法2：(10分)
	* 给任意一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
		
		//验证是否为2月
		if (src.getMonth() == 2) {
		 //判断是否为闰年
		if (src.getYear() % 4 == 0 && src.getYear() % 100 != 0) {
		 src.setDate(28);
		 } else {
		 src.setDate(29);
		 }
		 //判断是否为小月
		} else if (src.getMonth() == 4 || src.getMonth() == 6 || src.getMonth() == 9 || src.getMonth() == 11) {
		 src.setDate(30);
		 //条件都不满足则为大月
		} else {
		 src.setDate(31);
		 }
		 //设置小时
		src.setHours(23);
		 //设置分
		src.setMinutes(59);
		 //设置秒
		src.setSeconds(59);
		return src;
	}
}
