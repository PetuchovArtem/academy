package by.academy.classwork.lesson10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class PrintDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WeekDays currentDay = WeekDays.SUBBOTA;
//
//		WeekDays[] currentDay2 = WeekDays.values();
//
//		switch (currentDay) {
//		case PONEDELNIK:
//			System.out.println("Сегодня понедельник");
//			break;
//		case VTORNIK:
//			System.out.println("Сегодня вторник");
//			break;
//		case SREDA:
//			System.out.println("Сегодня среда");
//			break;
//		case CHETVERG:
//			System.out.println("Сегодня четверг");
//			break;
//		case PIATNIZZA:
//			System.out.println("Сегодня пятница");
//			break;
//		case SUBBOTA:
//			System.out.println("Сегодня суббота");
//			break;
//		case VOSKRESENIE:
//			System.out.println("Сегодня воскресенье");
//			break;
//		default:
//			System.out.println("Ты пьян");
//		}
//
//		for (WeekDays a : WeekDays.values()) {
//			System.out.println(a + " " + a.ordinal());
//		}
//
//		System.out.print(Arrays.toString(currentDay2));
//
//		DateTimeFormatter date = DateTimeFormatter.ofPattern("yyy-MM-dd");
//		LocalDate date1 = LocalDate.of(1970, 1, 1);
//
//		System.out.println(date1);
//		date1 = date1.plusYears(30);
//		System.out.println(date1);
//		date1 = date1.minusDays(3);
//		System.out.println(date1);
//		date1 = date1.plusMonths(3);
//		System.out.println(date1);

		
		Box<Cat> b1 = new Box<Cat>();
		System.out.print(b1.toString());		
	}

}
