package by.academy.homework.hw3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//Создать объект класса Date, используя вложенные классы Год, Месяц, День. 
//Методы: задать дату, вывести на консоль день недели по заданной дате. 
//День недели представить в виде перечисления. 
//Рассчитать количество дней, в заданном временном промежутке.
//Один из конструкторов - строка в формате dd-mm-yyyy, добавить валидацию для этой строки. 
//После валидации в конструкторе создаем объекты класса Year, Month, Day.
//Добавить метод, который проверяет высокосный ли год или нет.

public class Date {

	public String date1;
	public String secondDate;

	Date(String date1) {
		super();
		this.date1 = date1;
	}

	Date() {
		super();
	}

	// выводим день недели красиво
	public String printDayOfWeek() throws ParseException {

		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date dayWeek = null;
		dayWeek = format.parse(date1);
		System.out.println(new SimpleDateFormat("EEEE").format(dayWeek));
		return (new SimpleDateFormat("EEEE").format(dayWeek));

	}

	// выводим день недели используя собственоручный enum
	public void dayOfWeek() throws ParseException {
		DaysWeek currentDay = DaysWeek.valueOf(printDayOfWeek());
		switch (currentDay) {
		case Monday:
			System.out.println("Сегодня понедельник");
			break;
		case Tuesday:
			System.out.println("Сегодня вторник");
			break;
		case Wednesday:
			System.out.println("Сегодня среда");
			break;
		case Thursday:
			System.out.println("Сегодня четверг");
			break;
		case Friday:
			System.out.println("Пятница развратница");
			break;
		case Saturday:
			System.out.println("Сегодня суббота");
			break;
		case Sunday:
			System.out.println("Сегодня воскресенье");
			break;
		default:
			System.out.println("Ты пьян");
		}
	}

	
	//рассчет между двумя датами
	public void rasschetDneiVPromezhutke(String date1, String date2) throws ParseException {

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		LocalDate firstDay = LocalDate.parse(date1, dateTimeFormatter);
		LocalDate secondDay = LocalDate.parse(date2, dateTimeFormatter);

		Period period = Period.between(firstDay, secondDay);

		System.out.println(period.getDays());

	}

	public String getDate() {
		return date1;
	}

	public void setDate(String date1) {
		this.date1 = date1;
	}

	public String getSecondDate() {
		return secondDate;
	}

	public void setSecondDate(String secondDate) {
		this.secondDate = secondDate;
	}

	public class Year {

	}

	public class Month {

	}

	public class Day {

	}

}
