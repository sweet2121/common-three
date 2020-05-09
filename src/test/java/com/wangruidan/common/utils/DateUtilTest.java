package com.wangruidan.common.utils;



import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	//月初
		@Test
		public void testDateByInitMonth(){
			/*例如一个Date对象的值是2019-05-18 11:37:22
			* 则返回的结果为2019-05-01 00:00:00*/
			Date date = DateUtil.getDateByInitMonth(new Date());
			SimpleDateFormat dFormat=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
			System.out.println("DateByInitMonth---"+dFormat.format(date));
		}
		//月末
		@Test
		public void testDateByFullMonth(){
			//例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
			
			Date date = DateUtil.getDateByFullMonth(new Date());
			SimpleDateFormat dFormat=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
			System.out.println("DateByFullMonth==="+dFormat.format(date));
		}

}
