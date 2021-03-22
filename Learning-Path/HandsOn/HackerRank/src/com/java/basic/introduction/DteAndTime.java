package com.java.basic.introduction;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;

/*
 if you are given the date August 14th 2017, the method should return Monday as the day on that date. 
Output Format

Output the correct day in capital letters.

Sample Input

08 05 2015

Sample Output

WEDNESDAY

 */

public class DteAndTime {

	public static void main(String[] args) {

		//int month = 07; //only valid till 07 and later 08 will be considered as octal and throw error The literal 08 of type int is out of range 
		
		String m="08";
		
		int month=Integer.valueOf(m);

		int day = 06;

		int year = 2025;

		LocalDate localDate = LocalDate.of(year, month, day);

		System.out.println(localDate.getDayOfWeek().name());
		
		String week=localDate.getDayOfWeek().name();
		
		System.out.println(week);
		
//*****************************************************************************************************************************************************
		//other way
		
		Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month-1); //works fine if month-1 (reason yet to know)
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.YEAR, year);
        System.out.println(cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase());
        

	}

}
