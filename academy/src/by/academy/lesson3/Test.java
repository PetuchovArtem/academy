//window_>preference

package by.academy.lesson3;

import java.util.Scanner;
import java.util.concurrent.TimeUnit ;


public class Test {

	public static void main(String[] args) {

		int s = 370_000;
		int sec;
		int m;
		int min;
		int h;
		int hour;
		int d;
		int dnei;
		int w;
		int week;

		sec = s % 60;
		m = (s - sec) / 60;
		min = m % 60;
		h = (m - min) / 60;
		hour = h % 24;
		d = (h - hour) / 24;
		dnei = d % 7;
		w = (d - dnei) / 7;
		week = w % 7;

		
//		int day = (int) TimeUnit.SECONDS.toDays(s);
//	    long hours = TimeUnit.SECONDS.toHours(s) -
//	                 TimeUnit.DAYS.toHours(day);
//	    long minute = TimeUnit.SECONDS.toMinutes(s) -
//	                  TimeUnit.HOURS.toMinutes(TimeUnit.SECONDS.toHours(s));
//	    long second = TimeUnit.SECONDS.toSeconds(s) -
//	                  TimeUnit.MINUTES.toSeconds(TimeUnit.SECONDS.toMinutes(s));
//	    System.out.println("Дней " + day + " Часов " + hours + " Минут " + minute + " Секунд " + second);

	        
	        
		System.out.println(week + " Недель " + dnei + " Дней " + hour + " Часов " + min + " Минут " + sec + " Секунд");
	}

}
